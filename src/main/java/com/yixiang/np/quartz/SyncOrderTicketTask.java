package com.yixiang.np.quartz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yixiang.np.constant.GlobalConstant;
import com.yixiang.np.dao.*;
import com.yixiang.np.mapper.OrganizationMapperService;
import com.yixiang.np.mapper.PltmAccountMapperService;
import com.yixiang.np.mapper.PltmOrderContractMapperService;
import com.yixiang.np.mapper.PltmTradeListDBServiceI;
import com.yixiang.np.model.SessionInfo;
import com.yixiang.np.model.po.*;
import com.yixiang.np.model.vo.*;
import com.yixiang.np.service.CommonService;
import com.yixiang.np.service.EmailService;
import com.yixiang.np.service.OrderServiceI;
import com.yixiang.np.utils.OrderUtil;
import org.apache.commons.lang.StringUtils;
import org.quartz.DisallowConcurrentExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by pengpeng on 16-9-12.
 */
@Component("syncOrderTicket")
@DisallowConcurrentExecution
public class SyncOrderTicketTask {

    private static final Logger LOG = LoggerFactory.getLogger(SyncOrderTicketTask.class);

    @Autowired
    PltmOrderDao pltmOrderDao;
    @Autowired
    private OrderServiceI orderService;
    @Autowired
    PltmOrderFlightDao pltmOrderFlightDao;
    @Autowired
    PltmPaymentOrderDao pltmPaymentOrderDao;
    @Autowired
    PltmAccountDao pltmAccountDao;
    @Resource
    private PltmAccountMapperService pltmAccountMapperService;
    @Autowired
    private EmailService emailService;
    @Autowired
    PltmOrderPassengerDao pltmOrderPassengerDao;
    @Autowired
    SimpleClientHttpRequestFactory simpleClientHttpRequestFactory;
    @Resource
    private PltmOrderContractDao pltmOrderContractDao;
    @Resource
    private PltmOrderContractMapperService pltmOrderContractMapperService;
    @Resource(name = "pltmTradeListDBServiceI")
    private PltmTradeListDBServiceI pltmTradeListDBServiceI;
    @Autowired
    UserDao userDao;
    @Autowired
    private PltmOrderLogDao orderLogDao;
    @Value("${order.pss.ticksync.sync.url}")
    private String ticksyncUrl;
    @Resource
    private CommonService commonService;
    @Autowired
    private OrganizationMapperService organizationMapperService;

    @Scheduled(fixedDelayString = "${order.pss.ticksync.fixed.delay}", initialDelayString = "${order.pss.ticksync.init.delay}")
    public void sync() {
        Map<String, PltmOrder> pltmOrderMap = pltmOrderDao.queryPltmOrderByStatus();
        if (pltmOrderMap != null && pltmOrderMap.size() > 0) {
            // 向pss平台发送请求
            String pssResp = sendRequest(pltmOrderMap);

            //判断相应信息
            boolean flag = checkResp(pssResp);
            if (!flag) {
                return;
            }

            //获取同步的票号信息
            String data = JSONObject.parseObject(pssResp).get("data").toString();
            List<SyncTicket> syncTickets = JSONObject.parseArray(data, SyncTicket.class);
            if (syncTickets == null || syncTickets.size() == 0) {
                return;
            }

            //整合pss data 将相同pss订单号得订单分组，提交数据库
            Map<String, List<SyncTicket>> mapSyncTicketLists = mergePssData(syncTickets);
            Set<String> pssOrderNumberSet = mapSyncTicketLists.keySet();
            for (String str : pssOrderNumberSet) {
                List<SyncTicket> syncTicketList = mapSyncTicketLists.get(str);
                //验证返回值为空得情况
                Boolean checkSyncTicket = false;
                for (SyncTicket syncTicket : syncTicketList) {
                    if (StringUtils.isEmpty(syncTicket.getTicketNumber()) || StringUtils.isEmpty(syncTicket.getCertificateNumber()) || syncTicket.getCertificateType() == null) {
                        checkSyncTicket = true;
                    }
                }
                if (checkSyncTicket) {
                    continue;
                }
                Long id = pltmOrderMap.get(str).getId();
                List<Map<Object, Object>> maps = new ArrayList<Map<Object, Object>>();
                String _orderNumber = pltmOrderMap.get(syncTicketList.get(0).getOrderId()).getOrderNumber();
                syncTicketList.forEach(syncTicket -> {
                    String orderNumber = pltmOrderMap.get(syncTicket.getOrderId()).getOrderNumber();
                    Map<Object, Object> map = new HashMap<Object, Object>();
                    map.put("ticketNumber", syncTicket.getTicketNumber());
                    map.put("orderNumber", orderNumber);
                    map.put("docType", syncTicket.getCertificateType());
                    map.put("docId", syncTicket.getCertificateNumber());
                    maps.add(map);
                });
                //添加订单日志
                PltmOrderLogVo log = new PltmOrderLogVo();
                log.setOperateUserid(null);
                log.setOrderNo(_orderNumber);
                log.setOperateState("出票完成");
                log.setOperateRole("供应商");
                log.setRemarks("订单号：" + _orderNumber);
                LOG.debug("订单出票添加日志 PltmOrderLogVo:{};", log);
                orderLogDao.saveOrderLog(log);
                try {
                    updateOrderAndPassenger(id, maps);
                    //修改合同状态
                    updateContractStatus(pltmOrderMap.get(syncTicketList.get(0).getOrderId()));
                    //创建完订单后发送待支付邮件
                    sendEmail(pltmOrderMap, str);
                    //出票成功修改供应商账户，增加应收金额，并且在支付记录表中添加记录
                    receivable(pltmOrderMap.get(str));
                    //T+0 供应商应收记录减款，供应商待提现记录增款
                    tradeNotes(pltmOrderMap.get(str));
                } catch (Exception e) {
                    LOG.error("exception; params id:" + id + "; maps:" + maps, e);
                }
            }

        } else {
            LOG.info("暂无需同步票号得数据");
        }
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    private void updateContractStatus(PltmOrder order) throws Exception {
        LOG.debug("updateContractStatus");
        if (order.getOrderType() != null && order.getOrderType().equals(PltmOrder.ORDER_TYPE_CUT)) {
            String contractNo = order.getContractNo();
            Integer count = pltmOrderDao.countByContrNoAndOrderStatus(order.getContractNo(), PltmOrder.COLUMN_ORDERSTATUS_TICKETING_SUCCESS);
            if (count != null && count.equals(0)) {
                LOG.debug("同步票号更新合同状态 contractNo:{}; status:{};", contractNo, PltmContractVo.COLUMN_CONSTRACTSSTATUS_COMPLETE);
                Integer result = pltmOrderContractDao.updateStatusByContractNo(contractNo, PltmContractVo.COLUMN_CONSTRACTSSTATUS_COMPLETE);
                LOG.debug("同步票号更新合同状态 result:{}; ", result);
                PltmOrderContract pltmOrderContract = pltmOrderContractMapperService.selectByContractNo(contractNo);
                Double deposit = pltmOrderContract.getDeposit();
                //添加tradeList记录
                PltmAccount pltmAccount = pltmAccountMapperService.accountTrade(PltmTradeListVo.UNFREEZE, new SessionInfo(Long.valueOf(order.getPurchase())), deposit);
                SessionInfo info = new SessionInfo(Long.valueOf(order.getPurchase()));
                info.setId(-1l);//-1代表系统
                info.setOrgId(order.getSupplier().longValue()); //订单supid
                info.setOrgName(organizationMapperService.read(order.getSupplier().longValue()).getName()); //订单supname
                PltmTradeList pltmTradeList = getTradeList(pltmAccount, deposit, info, pltmOrderContract.getContractNo());
                LOG.debug("pltmTradeList create:{}; ", pltmTradeList);
                pltmTradeListDBServiceI.create(pltmTradeList);
                commonService.createOrderLog(null, GlobalConstant.LOG_CONTRACT_COMPLETE, contractNo);
            }
        }
    }

    private PltmTradeList getTradeList(PltmAccount pltmAccount, Double payTic, SessionInfo info, String contractNO) {
        PltmTradeList pltmTradeList = new PltmTradeList();
        pltmTradeList.setAccountBalance(pltmAccount.getAvailableBalance());
        pltmTradeList.setCost(payTic);
        pltmTradeList.setCreateTime(new Date());
        pltmTradeList.setCreateUser(info.getId().intValue());
        pltmTradeList.setLastModifyPerson(info.getId().intValue());
        pltmTradeList.setLastModifyTime(new Date());
        pltmTradeList.setPayOrderNumber(OrderUtil.getTradeListNo());
        pltmTradeList.setPayType(PltmTradeList.COLUMN_PAYTYPE_VALUE_OFFLINE);
        pltmTradeList.setTradeType(PltmTradeList.COLUMN_TRADETYPE_VALUE_UNFREEZE);
        pltmTradeList.setStatus(PltmTradeList.COLUMN_STATUS_VALUE_PENDING);
        pltmTradeList.setOrganizationId(info.getOrgId());
        pltmTradeList.setOrganizationName(info.getOrgName());
        pltmTradeList.setFreezeAmount(pltmAccount.getFreezeAmount());
        pltmTradeList.setMoney(pltmAccount.getMoney());
        pltmTradeList.setContractNo(contractNO);
        return pltmTradeList;
    }

    //T+0 供应商应收记录减款，供应商待提现记录增款
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    private void tradeNotes(PltmOrder order) {
        Integer supplier = order.getSupplier(); //收款id
        Double payPrice = order.getUnitPrice() * order.getPurchQuantity() - (order.getUnitPrice() * order.getPurchQuantity() * order.getCharges());//支付金额(单价乘以人数-单价乘以人数×佣金)

        //修改供应商账户
        PltmAccount pltmAccount = pltmAccountDao.selectBySupplierId(supplier);
        if (pltmAccount != null && pltmAccount.getId() != null) {
            Double alreadyMentioned = pltmAccount.getAlreadyMentioned() == null ? 0d : pltmAccount.getAlreadyMentioned();
            Double stayPresent = pltmAccount.getStayPresent() == null ? 0d : pltmAccount.getStayPresent();
            Double receivable = pltmAccount.getReceivable() == null ? 0d : pltmAccount.getReceivable();
            receivable -= payPrice;
            stayPresent += payPrice;

            PltmAccount _pltmAccount = new PltmAccount();
            _pltmAccount.setId(pltmAccount.getId());
            _pltmAccount.setLastModifyTime(new Date());
            _pltmAccount.setLastModifyPerson(order.getLastModifyPerson());
            _pltmAccount.setReceivable(receivable);
            _pltmAccount.setStayPresent(stayPresent);
            _pltmAccount.setMoney(alreadyMentioned + stayPresent + receivable);
            pltmAccountDao.updateByPrimaryKeySelective(_pltmAccount);
        }


    }

    //出票成功修改供应商账户，增加应收金额，并且在支付记录表中添加记录
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    private void receivable(PltmOrder order) {
        Integer supplier = order.getSupplier(); //收款id
        Double payPrice = order.getUnitPrice() * order.getPurchQuantity() - (order.getUnitPrice() * order.getPurchQuantity() * order.getCharges());//支付金额(单价乘以人数-单价乘以人数×佣金)
        //供应商账户为空时，添加记录
        PltmAccount pltmAccount = pltmAccountDao.selectBySupplierId(supplier);
        //供应商账户不为空，直接修改
        if (pltmAccount != null && pltmAccount.getId() != null) {
            Double alreadyMentioned = pltmAccount.getAlreadyMentioned() == null ? 0d : pltmAccount.getAlreadyMentioned();
            Double stayPresent = pltmAccount.getStayPresent() == null ? 0d : pltmAccount.getStayPresent();
            Double receivable = pltmAccount.getReceivable() == null ? 0d : pltmAccount.getReceivable();
            receivable += payPrice;

            PltmAccount _pltmAccount = new PltmAccount();
            _pltmAccount.setId(pltmAccount.getId());
            _pltmAccount.setLastModifyTime(new Date());
            _pltmAccount.setLastModifyPerson(order.getLastModifyPerson());
            _pltmAccount.setReceivable(receivable);
            _pltmAccount.setMoney(alreadyMentioned + stayPresent + receivable);
            pltmAccountDao.updateByPrimaryKeySelective(_pltmAccount);
        } else {
            PltmAccount _pltmAccount = new PltmAccount();
            _pltmAccount.setLastModifyTime(new Date());
            _pltmAccount.setLastModifyPerson(supplier);
            _pltmAccount.setMoney(payPrice);
            _pltmAccount.setAccountName(order.getPayName());
            _pltmAccount.setAccountNumber(order.getPayAccount());
            _pltmAccount.setAlreadyMentioned(0d);
            _pltmAccount.setCreateTime(new Date());
            _pltmAccount.setCreateUser(supplier);
            _pltmAccount.setOrganizationId(supplier);
            _pltmAccount.setOrganizationName(order.getSupplierName());
            _pltmAccount.setReceivable(payPrice);
            _pltmAccount.setStayPresent(0d);
            _pltmAccount.setType(PltmAccount.COLUMN_TYPE_VALUE_SUPPLIER);
            pltmAccountDao.create(_pltmAccount);
        }
    }

    // 发送邮件
    private void sendEmail(Map<String, PltmOrder> pltmOrderMap, String pssOrderNumber) {
        LOG.debug("pltmOrderMap:{}; pssOrderNumber:{};", pltmOrderMap, pssOrderNumber);
        //创建完订单后发送待支付邮件
        EmailVo email = orderService.queryEmailData(pltmOrderMap.get(pssOrderNumber).getOrderNumber());
        Integer userID = pltmOrderMap.get(pssOrderNumber).getCreateUser();
        User user = userDao.get(Long.valueOf(userID));
        email.setEmailTo(user.getEmail());
        email.setSubject(pltmOrderMap.get(pssOrderNumber).getOrderNumber() + "--出票已完成请确认");
        email.setTemplate("order3.html");
        LOG.debug("email:{}; ", email);
        emailService.sendEmail(email);
        LOG.debug("发送邮件成功_________");
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    private void updateOrderAndPassenger(Long id, List<Map<Object, Object>> maps) {
        for (Map<Object, Object> map : maps) {
            pltmOrderPassengerDao.updatePassengerTicketNum(map);
        }
        pltmOrderDao.updateOrderStatus(id, PltmOrder.COLUMN_ORDERSTATUS_TICKETING_SUCCESS, 3, new Date());
    }

    //向pss平台发送请求
    private String sendRequest(Map<String, PltmOrder> pltmOrderMap) {
        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory);
        //发送请求
        LOG.debug("请求pss ticksync url:{}; pltmOrderMap:{}", ticksyncUrl, pltmOrderMap);
        String pssResp = null;
        try {
            pssResp = restTemplate.getForObject(ticksyncUrl + setToString(pltmOrderMap.keySet(), ','), String.class);
            LOG.debug("响应pss ticksync pssResp:{}", pssResp == null ? null : JSON.toJSONString(pssResp));
        } catch (Exception e) {
            LOG.error("请求pss ticksync exception", e);
        }
        return pssResp;
    }

    public static boolean checkResp(String pssResp) {
        boolean flag = false;

        if (StringUtils.isNotEmpty(pssResp)) {
            JSONObject pssJson = JSONObject.parseObject(pssResp);
            if (pssJson != null) {
                if (pssJson.get("status") != null && pssJson.get("status").toString().equals(GlobalConstant.PSS_ORDER_CREATE_OK)) {
                    if (pssJson.get("data") != null) {
                        flag = true;
                    }
                }
            } else {
                LOG.info("响应pss ticksync pssResp.status error:{};", pssJson == null ? null : pssJson.get("status"));
            }
        } else {
            LOG.info("响应pss ticksync pssResp:null;");
        }
        return flag;
    }

    private String setToString(Set<String> set, char separator) {
        StringBuilder sb = new StringBuilder();
        for (String string : set) {
            sb.append(string);
            sb.append(separator);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    //将pss 返回得data进行合并
    private Map<String, List<SyncTicket>> mergePssData(List<SyncTicket> syncTickets) {
        Map<String, List<SyncTicket>> listMapSyncTicket = new HashMap<String, List<SyncTicket>>();
        for (SyncTicket syncTicket : syncTickets) {
            String pssOrderId = syncTicket.getOrderId();
            List<SyncTicket> listSync = listMapSyncTicket.get(pssOrderId);
            if (listSync == null || listSync.size() == 0) {
                List<SyncTicket> _listSync = new ArrayList<SyncTicket>();
                _listSync.add(syncTicket);
                listMapSyncTicket.put(pssOrderId, _listSync);
            } else {
                listMapSyncTicket.get(pssOrderId).add(syncTicket);
            }
        }
        return listMapSyncTicket;
    }

}
