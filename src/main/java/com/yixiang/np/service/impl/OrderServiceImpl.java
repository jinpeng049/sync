package com.yixiang.np.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yixiang.np.constant.Constant;
import com.yixiang.np.constant.GlobalConstant;
import com.yixiang.np.dao.PltmOrderDao;
import com.yixiang.np.model.vo.EmailVo;
import com.yixiang.np.model.vo.OrderFlightVo;
import com.yixiang.np.model.vo.PltmOrderVo;
import com.yixiang.np.service.OrderServiceI;
import com.yixiang.np.utils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.List;

import static com.yixiang.np.constant.Constant.SeatClass;

/**
 * Created by LiZhengYong on 2016/7/11.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderServiceI {

    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceImpl.class);


//    @Autowired
//    PltmOrderContractDao contractDao;

    @Autowired
    PltmOrderDao pltmOrderDao;
    //请求PSS路径
    @Value("${order.cancel.pss.url}")
    private String orderCancelPssUrl;

//    @Autowired
//    PltmPaymentDao pltmPaymentDao;
//
//    @Autowired
//    PltmOrderFlightDao pltmOrderFlightDao;
//
//    @Autowired
//    private OrganizationDao organ_dao;
//
//    @Autowired
//    private PltmOrderLogDao orderLogDao;
//
//    @Autowired
//    SimpleClientHttpRequestFactory simpleClientHttpRequestFactory;
//    @Resource
//    private PltmOrderMapperService pltmOrderMapperService;
//    @Resource
//    private PltmOrderPassengerMapperService pltmOrderPassengerMapperService;
//    @Resource
//    private PltmAccountMapperService pltmAccountMapperService;
//    @Resource(name = "pltmTradeListDBServiceI")
//    private PltmTradeListDBServiceI pltmTradeListDBServiceI;
//
//    @Value("${order.pss.create.order.url}")
//    private String pssCreateOrderUrl;
//
//    @Value("${order.pss.contract.create.url}")
//    private String pssCreateQwOrderUrl;
//
//    @Value("${order.pss.ticksync.passenger.url}")
//    private String orderPssengerUrl;
//    //请求PSS路径
//    @Value("${order.cancel.pss.url}")
//    private String orderCancelPssUrl;
//    @Autowired
//    SchedulerFactoryBean schedulerFactoryBean;
//    @Resource
//    private CommonService commonService;
//
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Json createOrderQw(OrderCreateQwPo orderCreateQwPo, SessionInfo sessionInfo) {
//        Json json = new Json();
//        OrderCreateQwPo newOrderCreateQwPo = new OrderCreateQwPo();
//        LOG.debug("orderCreatePo:" + orderCreateQwPo + "; sessionInfo:" + sessionInfo);
//        String contractNo = getContractNo();//合同编号
//        PltmContractVo contract = orderCreateQwPo.getContract();
//        contract.setCreateTime(new Date());
//        contract.setCreateUserid(sessionInfo.getId().intValue());
//        contract.setLastModifytime(new Date());
//        contract.setCustomerId(sessionInfo.getOrgId().intValue());
//        contract.setCustomerName(sessionInfo.getOrgName());
//        contract.setStatus(PltmContractVo.COLUMN_CONSTRACTSTATUS_AUDIT);
//        contract.setContractNo(contractNo);
//        Organization org = organ_dao.get(contract.getSupplierId().longValue());
//        contract.setSupplierName(org.getName());
//        List<OrderCreatePo> orders = orderCreateQwPo.getOrders();
//        List<OrderCreatePo> newOrders = new ArrayList<OrderCreatePo>();
//        //
//        List<PltmOrder> orderList = new ArrayList<PltmOrder>();
//        List<PltmOrderFlight> flightList = new ArrayList<PltmOrderFlight>();
//        for (int i = 0; i < orders.size(); i++) {
//            OrderCreatePo po = orders.get(i);
//            //新对象
//            OrderCreatePo newPo = new OrderCreatePo();
//            List<PltmOrderFlight> newPltmOrderFlights = new ArrayList<PltmOrderFlight>();
//            PltmOrder pltmOrder = po.getPltmOrder();
//            List<PltmOrderFlight> pltmOrderFlights = po.getPltmOrderFlights();
//            pltmOrder.setOrderStatus(PltmOrder.COLUMN_ORDERSTATUS_TOBE_PAY);
//            pltmOrder.setOrderNumber(OrderUtil.getOrderNumber(sessionInfo.getId()));
//            pltmOrder.setContractNo(contractNo);
//            pltmOrder.setTicketLimitTime(2);
//            pltmOrder.setPurchQuantity(contract.getSeatCount());
//            if (sessionInfo != null) {
//                pltmOrder.setCreateUser(sessionInfo.getId().intValue());
//                pltmOrder.setLastModifyPerson(sessionInfo.getId().intValue());
//            }
//            pltmOrder.setLastModifyTime(new Date());
//            pltmOrder.setCreateTime(new Date());
//            pltmOrder.setPurchase(sessionInfo.getOrgId().intValue());
//            pltmOrder.setPurchaseName(sessionInfo.getOrgName());
//            org = organ_dao.get(pltmOrder.getSupplier().longValue());
//            pltmOrder.setSupplierName(org.getName());
//            pltmOrder.setOrderType(PltmOrder.ORDER_TYPE_CUT);
//            pltmOrder.setOldPurchQuantity(contract.getSeatCount());
//            pltmOrder.setOldTicketLoss(pltmOrder.getTicketLoss());
//            pltmOrder.setOldTicketRate(pltmOrder.getTicketRate());
//            pltmOrder.setOldUnitPrice(pltmOrder.getUnitPrice());
//            pltmOrder.setCharges(org.getCharges());//保存佣金比例
////             pltmOrderDao.create(pltmOrder);
//            orderList.add(pltmOrder);
//            newPo.setPltmOrder(pltmOrder);
//
//            //添加订单航班信息
//            for (PltmOrderFlight pltmOrderFlight : pltmOrderFlights) {
//                if (pltmOrderFlight != null) {
//                    pltmOrderFlight.setOrderNumber(pltmOrder.getOrderNumber());
//                    pltmOrderFlight.setCreateUser(sessionInfo.getId().intValue());
//                    pltmOrderFlight.setCreateTime(new Date());
//                    pltmOrderFlight.setLastModifyTime(new Date());
//                    pltmOrderFlight.setLastModifyPerson(sessionInfo.getId().intValue());
////                     pltmOrderFlightDao.create(pltmOrderFlight);
//                    flightList.add(pltmOrderFlight);
//                    newPltmOrderFlights.add(pltmOrderFlight);
//                }
//            }
//            newPo.setPltmOrderFlights(newPltmOrderFlights);
//            newOrders.add(newPo);
//        }
//        //保存本地订单
//        pltmOrderDao.createBatch(orderList);
//        pltmOrderFlightDao.createBatch(flightList);
//        //保存合同
//        contractDao.create(contract);
//        commonService.createOrderLog(sessionInfo, GlobalConstant.LOG_CONTRACT_CREATE_ORDER, contractNo);
//        this.batchInsertOrderLog(orderList, sessionInfo);
//        //向pss 发送请求 封装数据
//        newOrderCreateQwPo.setContract(contract);
//        newOrderCreateQwPo.setOrders(newOrders);
//        String pssReqJson = contactPssQwJson(newOrderCreateQwPo, contractNo, sessionInfo);
//        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory);
//
//        HttpHeaders headers = new HttpHeaders();
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        headers.setContentType(type);
//        HttpEntity<String> formEntity = new HttpEntity<String>(pssReqJson, headers);
//        //发送请求
//        LOG.debug("请求pss order url:" + pssCreateQwOrderUrl + "; HttpEntity:" + formEntity);
//        ResponseEntity<String> pssResp = null;
//        try {
//            pssResp = restTemplate.postForEntity(pssCreateQwOrderUrl, formEntity, String.class);
//        } catch (Exception e) {
//            LOG.error("提交pss 订单异常", e);
//        }
//
//        LOG.debug("响应pss order respString:" + pssResp == null ? null : JSON.toJSONString(pssResp));
//        if (pssResp != null && pssResp.getStatusCode() != null) {//判断http响应
//            HttpStatus httpStatus = pssResp.getStatusCode();
//            if (httpStatus != null && httpStatus.equals(HttpStatus.OK)) {
//                JSONObject pssJson = JSONObject.parseObject(pssResp.getBody());
//                if (pssJson != null) {
//                    if (pssJson.get("status") != null && pssJson.get("status").toString().equals(GlobalConstant.PSS_ORDER_CREATE_OK)) {
//                        JSONObject pssResponse = pssJson.getJSONObject("data");
//                        String pssContractNumber = pssResponse.getString("contractId");//获取合同ID
//                        JSONObject orderIds = pssResponse.getJSONObject("orderIds");
//                        System.out.println("orderIds=" + JSON.toJSONString(orderIds));
//                        Map<String, String> params = new HashMap<String, String>();
//                        for (Map.Entry<String, Object> entry : orderIds.entrySet()) {
//                            params.put(entry.getKey().toString(), entry.getValue().toString());
//                        }
//                        //修改订单的PSS订单号
//                        pltmOrderDao.updatePssQwOrderNumber(params);
//                        //修改订单的PSS合同号
//                        pltmOrderDao.updatePssQwOrder(contractNo, pssContractNumber);
//                        //修改合同的PSS合同号
//                        contractDao.updatePssContractNo(contractNo, pssContractNumber);
//                        try {
//                            // payTimeOutScheduleJob(pltmOrder.getOrderNumber());
//                        } catch (Exception e) {
//                            LOG.error("创建支付超时job exception", e);
//                        }
//                        //添加订单日志
//                        //saveLog(sessionInfo.getId().intValue(), pltmOrder.getOrderNumber());
//                        json.setSuccess(true);
//                        json.setMsg("创建订单成功！<br>合同号：" + contractNo);
//                    } else {
//                        json.setSuccess(false);
//                        json.setMsg("预订失败，请重新检索！");
//                        postQwPssFailed(contractNo);
//                    }
//                } else {
//                    json.setSuccess(false);
//                    json.setMsg("预订失败，请重新检索！");
//                    postQwPssFailed(contractNo);
//                }
//            } else {
//                postQwPssFailed(contractNo);
//            }
//        } else {
//            postQwPssFailed(contractNo);
//        }
//        return json;
//    }
//
//    private void batchInsertOrderLog(List<PltmOrder> orderList, SessionInfo info) {
//        if (orderList != null && !orderList.isEmpty()) {
//            orderList.forEach(e -> {
//                commonService.createOrderLog(info, "下单", e.getOrderNumber());
//            });
//        }
//
//    }
//
//    private void saveLog(Integer userId, String orderNumber) {
//        PltmOrderLogVo log = new PltmOrderLogVo();
//        log.setOperateUserid(userId);
//        log.setOrderNo(orderNumber);
//        log.setOperateState("下单");
//        log.setOperateRole("采购商");
//        log.setRemarks("订单号：" + orderNumber);
//        orderLogDao.saveOrderLog(log);
//    }
//
//
//    //保存本地订单
//    private String saveDeskOrder(PltmOrder pltmOrder, List<PltmOrderFlight> pltmOrderFlights, SessionInfo sessionInfo) {
//        //添加订单信息
//        pltmOrder.setPayPrice(pltmOrder.getPurchQuantity() * pltmOrder.getUnitPrice());
//        pltmOrder.setOrderStatus(PltmOrder.COLUMN_ORDERSTATUS_TOBE_PAID);
//        pltmOrder.setOrderNumber(OrderUtil.getOrderNumber(sessionInfo.getId()));
//        pltmOrder.setTicketLimitTime(2);
//        if (sessionInfo != null) {
//            pltmOrder.setCreateUser(sessionInfo.getId().intValue());
//            pltmOrder.setLastModifyPerson(sessionInfo.getId().intValue());
//        }
//        pltmOrder.setLastModifyTime(new Date());
//        pltmOrder.setCreateTime(new Date());
//        pltmOrder.setPurchase(sessionInfo.getOrgId().intValue());
//        pltmOrder.setPurchaseName(sessionInfo.getOrgName());
//        Organization org = organ_dao.get(pltmOrder.getSupplier().longValue());
//        pltmOrder.setSupplierName(org.getName());
//        pltmOrder.setOrderType(PltmOrder.ORDER_TYPE_FIT);
//        pltmOrder.setOldPurchQuantity(pltmOrder.getPurchQuantity());
//        pltmOrderDao.create(pltmOrder);
//
//        //添加订单航班信息
//        for (PltmOrderFlight pltmOrderFlight : pltmOrderFlights) {
//            if (pltmOrderFlight != null) {
//                pltmOrderFlight.setOrderNumber(pltmOrder.getOrderNumber());
//                pltmOrderFlight.setCreateUser(sessionInfo.getId().intValue());
//                pltmOrderFlight.setCreateTime(new Date());
//                pltmOrderFlight.setLastModifyTime(new Date());
//                pltmOrderFlight.setLastModifyPerson(sessionInfo.getId().intValue());
//                pltmOrderFlightDao.create(pltmOrderFlight);
//            }
//        }
//        return pltmOrder.getOrderNumber();
//    }
//
//    private void postPssFailed(String orderNumber) {
//        postPssFailed(orderNumber, null);
//    }
//
//    //调用本地订单接口删除订单
//    private void postPssFailed(String orderNumber, Json json) {
//        pltmOrderDao.deleteByOrderNumber(orderNumber);
//        pltmOrderFlightDao.deleteByOrderNumber(orderNumber);
//        if (json != null) {
//            json.setSuccess(false);
//            json.setMsg("");
//        }
//    }
//
//    //调用本地订单接口删除订单
//    private void postQwPssFailed(String contractNo) {
//        pltmOrderFlightDao.deleteByContractNumber(contractNo);
//        pltmOrderDao.deleteByContractNumber(contractNo);
//        contractDao.deleteByContractNumber(contractNo);
//    }
//
//    private String contactPssJson(OrderCreatePo orderCreatePo, SessionInfo sessionInfo) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        PltmOrder pltmOrder = orderCreatePo.getPltmOrder();
//        List<PltmOrderFlight> pltmOrderFlights = orderCreatePo.getPltmOrderFlights();
//        JSONObject jsonObj = new JSONObject();
//        jsonObj.put("platformOrderId", pltmOrder.getOrderNumber()); //平台订单号
////        jsonObj.put("blockSeatType", 3); //乘客类型（1：硬切、2：软切、3：散客）
//        jsonObj.put("createUserId", sessionInfo.getId());
//        jsonObj.put("createUserName", sessionInfo.getLoginname());
//        jsonObj.put("passengerTotal", pltmOrder.getPurchQuantity());
//        jsonObj.put("price", pltmOrder.getUnitPrice());
//        jsonObj.put("remark", pltmOrder.getRemark());
//        jsonObj.put("routeId", orderCreatePo.getAirlineId()); //航线id
//        jsonObj.put("strokeType", pltmOrder.getRoutingType()); //TO：去程、BACK：回程、ROUND：往返
//        jsonObj.put("productId", pltmOrder.getProductId()); //
//
//        JSONArray jsonArray = new JSONArray();
//        for (PltmOrderFlight pltmOrderFlight : pltmOrderFlights) {
//            Date addDate = DateUtil.addDay(pltmOrderFlight.getDepartureDate(), pltmOrderFlight.getIntervalDay() == null ? 0 : pltmOrderFlight.getIntervalDay());//计算返程日期
//
//            JSONObject jsonflight = new JSONObject();
//            jsonflight.put("arriveAirport", pltmOrderFlight.getArrivalCity());
//            jsonflight.put("arriveAirportCode", pltmOrderFlight.getArrivalCode());
//            jsonflight.put("arriveAirportDate", format.format(addDate));// 到达日期
//            jsonflight.put("arriveAirportTerminal", pltmOrderFlight.getArrivalTerminal());
//            jsonflight.put("arriveAirportTime", completeTime(pltmOrderFlight.getArrivalTime()));
//            jsonflight.put("departureAirport", pltmOrderFlight.getDepartureCity());
//            jsonflight.put("departureAirportCode", pltmOrderFlight.getDepartureCode());
//            jsonflight.put("departureAirportTerminal", pltmOrderFlight.getDepartureTerminal());
//
//            jsonflight.put("departureDate", format.format(pltmOrderFlight.getDepartureDate()));
//            jsonflight.put("departureTime", completeTime(pltmOrderFlight.getDepartureTime()));
//            jsonflight.put("flightId", pltmOrderFlight.getFlightId());
//            jsonflight.put("flightNumber", pltmOrderFlight.getFlightNumber());
//            jsonflight.put("seatClass", pltmOrderFlight.getCabin());
//            jsonflight.put("pubKey", "");//预留
//            jsonArray.add(jsonflight);
//        }
//        jsonObj.put("itinerys", jsonArray);
//        return jsonObj.toString();
//    }
//
//    //切位json
//    private String contactPssQwJson(OrderCreateQwPo orderCreateQwPo, String contractNo, SessionInfo sessionInfo) {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        PltmContractVo contract = orderCreateQwPo.getContract();
//        List<OrderCreatePo> orders = orderCreateQwPo.getOrders();
//        JSONObject contractObj = new JSONObject();//大订单json
//        contractObj.put("advanceConfirmDays", 2); //平台订单号
//        contractObj.put("arriveAirport", contract.getArrAirport());
//        contractObj.put("blockSeatAmount", contract.getSeatCount());
//        contractObj.put("blockSeatType", contract.getCharterType());
//        contractObj.put("classAmount", contract.getFlightCount());
//        contractObj.put("customerId", sessionInfo.getOrgId());
//        contractObj.put("customerName", sessionInfo.getOrgName());
//        contractObj.put("departureAirport", contract.getDeptAirport()); //
//        contractObj.put("platformContractId", contractNo); //
//        contractObj.put("routeId", contract.getRouteId()); //
//        contractObj.put("seatClass", contract.getSeatClass()); //
//        contractObj.put("ticketLoss", contract.getTicketLoss()); //
//        contractObj.put("ticketRate", contract.getTicketRate()); //
//        contractObj.put("deposit", contract.getDeposit()); //
//
//        JSONArray orderArray = new JSONArray();
//        List<PltmOrder> orderList = new ArrayList<PltmOrder>();
//        List<PltmOrderFlight> flightList = new ArrayList<PltmOrderFlight>();
//        for (int i = 0; i < orders.size(); i++) {
//            OrderCreatePo orderCreatePo = orders.get(i);
//            PltmOrder pltmOrder = orderCreatePo.getPltmOrder();
//            List<PltmOrderFlight> pltmOrderFlights = orderCreatePo.getPltmOrderFlights();
//            JSONObject jsonObj = new JSONObject();
//            jsonObj.put("platformOrderId", pltmOrder.getOrderNumber()); //平台订单号
////            jsonObj.put("blockSeatType", 3); //乘客类型（1：硬切、2：软切、3：散客）
//            jsonObj.put("createUserId", sessionInfo.getId());
//            jsonObj.put("createUserName", sessionInfo.getLoginname());
//            jsonObj.put("passengerTotal", pltmOrder.getPurchQuantity());
//            jsonObj.put("price", pltmOrder.getUnitPrice());
//            jsonObj.put("remark", pltmOrder.getRemark());
////            jsonObj.put("routeId", orderCreatePo.getAirlineId()); //航线id
//            jsonObj.put("routeId", contract.getRouteId()); //航线id
//            jsonObj.put("strokeType", pltmOrder.getRoutingType()); //TO：去程、BACK：回程、ROUND：往返
//            jsonObj.put("productId", pltmOrder.getProductId()); //
//
//            JSONArray jsonArray = new JSONArray();
//            for (PltmOrderFlight pltmOrderFlight : pltmOrderFlights) {
//                Date addDate = DateUtil.addDay(pltmOrderFlight.getDepartureDate(), pltmOrderFlight.getIntervalDay() == null ? 0 : pltmOrderFlight.getIntervalDay());//计算返程日期
//
//                JSONObject jsonflight = new JSONObject();
//                jsonflight.put("arriveAirport", pltmOrderFlight.getArrivalCity());
//                jsonflight.put("arriveAirportCode", pltmOrderFlight.getArrivalCode());
//                jsonflight.put("arriveAirportDate", format.format(addDate));// 到达日期
//                jsonflight.put("arriveAirportTerminal", pltmOrderFlight.getArrivalTerminal());
//                jsonflight.put("arriveAirportTime", completeTime(pltmOrderFlight.getArrivalTime()));
//                jsonflight.put("departureAirport", pltmOrderFlight.getDepartureCity());
//                jsonflight.put("departureAirportCode", pltmOrderFlight.getDepartureCode());
//                jsonflight.put("departureAirportTerminal", pltmOrderFlight.getDepartureTerminal());
//
//                jsonflight.put("departureDate", format.format(pltmOrderFlight.getDepartureDate()));
//                jsonflight.put("departureTime", completeTime(pltmOrderFlight.getDepartureTime()));
//                jsonflight.put("flightId", pltmOrderFlight.getFlightId());
//                jsonflight.put("flightNumber", pltmOrderFlight.getFlightNumber());
//                jsonflight.put("seatClass", pltmOrderFlight.getCabin());
//                jsonflight.put("pubKey", "");//预留
//                jsonArray.add(jsonflight);
//            }
//            jsonObj.put("itinerys", jsonArray);
//            orderArray.add(jsonObj);
//        }
//        contractObj.put("newOrders", orderArray);
//        return contractObj.toString();
//    }
//
//    //补全时刻
//    private String completeTime(String time) {
//        if (StringUtils.isNotEmpty(time)) {
//            String[] strs = time.split(":");
//            if (strs.length > 0) {
//                if (strs[0].length() == 1) {
//                    return "0" + time;
//                }
//            }
//        }
//        return time;
//    }
//
//    //订单查询
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public List<OrderVo> queryOrder(String orderNumber, Integer orderStatus,
//                                    String toStartAirportCode, String toEndAirportCode,
//                                    String toStartDate, String toEndDate, Integer createUserId) {
//        if (toStartDate != null && !("".equals(toStartDate))) {
//            toStartDate = toStartDate + " 00:00:00";
//        }
//        if (toEndDate != null && !("".equals(toEndDate))) {
//            toEndDate = toEndDate + " 23:59:59";
//        }
//        List<OrderVo> list = null;
//        try {
//            list = pltmOrderDao.queryOrder(orderNumber, orderStatus, toStartAirportCode,
//                    toEndAirportCode, toStartDate, toEndDate, createUserId);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        if (list != null && list.size() > 0) {
//            for (int i = 0; i < list.size(); i++) {
//                //计算 --- 支付截止时间   创建订单时间 +（默认24h）
//                list.get(i).setPaymentDeadline(DateUtil.addHour(list.get(i).getOrderCreateTime(), 24));
//                //计算 ---总价
//                list.get(i).setSum((list.get(i).getSellingPrice()) * (list.get(i).getPurchQuantity()));
//                //计算 --- 最晚出票时间  （起飞日期 - 出票时限）
//                list.get(i).setTicketingDeadline(DateUtil.addDay(list.get(i).getToStartDate(), -(list.get(i).getTicketLimitTime())));
//            }
//        }
//        return list;
//    }
//
//    @Override
//    public PltmOrderVo queryOrderDetail(String orderNumber) {
//        LOG.debug("orderNumber:" + orderNumber);
//        PltmOrderVo order = pltmOrderDao.queryOrderDetail(orderNumber);
//        List<OrderFlightVo> flight = pltmOrderDao.queryFlightByOrderid(orderNumber);
//        order.setFlights(flight);
//        LOG.debug("PltmOrderVo:" + order);
//        return order;
//    }
//
//    @Override
//    public NpOrderVo queryNpOrderDetail(String orderNumber) {
//        NpOrderVo order = pltmOrderDao.queryNpOrderDetail(orderNumber);
//        PltmPaymentOrderVo payment = pltmOrderDao.queryOrderPaymentByNo(orderNumber);
//        if (payment != null) {
//            order.setPayAccount(payment.getPayAccount());
//            order.setPayName(payment.getPayName());
//            order.setPayPrice(payment.getPayMoney());
//            order.setActualMoney(payment.getPayMoney());
//            order.setActualPay(payment.getPayMoney());
//
//            order.setPurchase(payment.getPurchase());
//        }
//        if (order != null) {
//            order.setAmountPay(Double.parseDouble(order.getUnitPrice()) * Double.parseDouble(order.getPurchQuantity()));
//            List<OrderFlightVo> flight = pltmOrderDao.queryFlightByOrderid(orderNumber);
//            order.setFlights(flight);
//            List<OrderPassenger> passengers = pltmOrderDao.queryPassenger(orderNumber);
//            order.setPassengers(passengers);
//        }
//        return order;
//    }
//
//
//    @Override
//    public List<OrderPassenger> queryPassenger(String orderNumber) {
//        return pltmOrderDao.queryPassenger(orderNumber);
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public void updatePayInfo(PltmPayment pay) {
//        String orderNumbers = pay.getOrderNumbers();
//        String[] orders = orderNumbers.split(",");
//        pay.setPayNo(OrderUtil.getPayNo());
//        pay.setStatus(PltmPayment.COLUMN_STATUS_VALUE_TOBE_CHECK);
//        //新增支付记录表
//        pltmPaymentDao.create(pay);
//        //新增及支付订单关联表
//        for (String orderNo : orders) {
//            PltmPaymentOrder payOrder = new PltmPaymentOrder();
//            payOrder.setPayNo(pay.getPayNo());
//            payOrder.setOrderNo(orderNo);
//            pltmPaymentDao.createPayOrder(payOrder);
//        }
//        //修改订单状态 为 支付待审核
//        //pay.setStatus(PltmOrder.COLUMN_ORDERSTATUS_TOBE_CHECK);
//        for (String orderNo : orders) {
//            pay.setOrderNumbers(orderNo);
//            pay.setFinanceStatus(Constant.FinanceStatus.SKDSH);
//            pltmOrderDao.updatePayInfo(pay);
//            //添加订单日志
//            PltmOrderLogVo log = new PltmOrderLogVo();
//            log.setOperateUserid(pay.getCreateUserid());
//            log.setOrderNo(orderNo);
//            log.setOperateState("订单支付");
//            log.setOperateRole("采购商");
//            log.setRemarks("订单号：" + orderNo + "；支付单号：" + pay.getPayNo());
//            orderLogDao.saveOrderLog(log);
//        }
//    }
//
//    //取消本地(平台)订单
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Integer orderCancel(String orderNumber) {
//        return pltmOrderDao.orderCancel(orderNumber);
//    }
//
//    //取消PSS订单
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Integer pssOrderCancel(String orderNumber) {
//        String pss_orderNum = queryPssOrderNum(orderNumber);
//        System.out.println(pss_orderNum);
//        if (pss_orderNum == null || "".equals(pss_orderNum)) {
//            LOG.debug("PSS订单取消失败！订单编号 --->" + pss_orderNum + "该订单编号非法，没有相关数据！");
//            return 0;
//        }
//        //给pss 发送请求
//        RestTemplate rt = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        MediaType mType = MediaType.parseMediaType("application/json; charset=UTF-8");
//        headers.setContentType(mType);
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        LOG.debug("开始发送http请求：地址--->" + orderCancelPssUrl + pss_orderNum);
//        ResponseEntity<String> response = rt.exchange(orderCancelPssUrl + pss_orderNum, HttpMethod.PUT, entity, String.class);
//        LOG.debug("http请求响应结果：结果--->" + response.toString());
//
//        if (response != null && response.getStatusCode() == HttpStatus.OK) {
//            JSONObject json = JSONObject.parseObject(response.getBody());
//            String status = json.get("status").toString();
//            System.out.println("李正勇返回result:" + status);
//            if (status != null && status.equals(GlobalConstant.PSS_ORDER_CREATE_OK)) {
//                LOG.debug("PSS订单取消成功！订单编号 --->" + pss_orderNum);
//                return 1;
//            }
//        }
//
//        LOG.debug("PSS订单取消失败！订单编号 --->" + pss_orderNum);
//        return 0;
//
//    }
//
//
//    @Override
//    public String queryPssOrderNum(String orderNumber) {
//        return pltmOrderDao.queryPssOrderNum(orderNumber);
//    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public EmailVo queryEmailData(String orderNumber) {
        EmailVo email = new EmailVo();
        PltmOrderVo order = pltmOrderDao.queryOrderDetail(orderNumber);
        List<OrderFlightVo> flight = pltmOrderDao.queryFlightByOrderid(orderNumber);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        email.setOrderNumber(orderNumber);
        email.setPayDate(sf.format(DateUtil.addDay(order.getCreateTime(), Constant.PAY_LIMIT_TIME)));
        email.setTicketDate(sf.format(DateUtil.addDay(order.getCreateTime(), Constant.TICKET_LIMIT_TIME)));
        email.setUnitPrice(order.getUnitPrice());
        email.setPurchQuantity(order.getPurchQuantity());
//        email.setTotalPrice(String.format("%.2f", Double.parseDouble(order.getUnitPrice()) * Integer.parseInt(order.getPurchQuantity())).toString());
        email.setTotalPrice(String.format("%.2f", order.getPayPrice()));

        if (flight != null && !flight.isEmpty() && flight.size() > 1) {
            email.setReturn(true);
        }

        for (int i = 0; i < flight.size(); i++) {
            OrderFlightVo f = flight.get(i);
            if (i == 0) {
                email.setDeptAirlineNo(f.getFlightNumber());
                email.setDeptSeatClass(SeatClass(f.getCabin()));
                email.setDeptAirPort(f.getDepartureCity());
                email.setDeptArrAirPort(f.getArrivalCity());
                email.setDeptAirportCode(f.getDepartureCode());
                email.setDeptArrAirportCode(f.getArrivalCode());
                email.setDeptDate(DateUtil.DateToString(f.getDepartureDate(), "yyyy-MM-dd"));
                email.setDeptTime(f.getDepartureTime());
                email.setDeptArrTime(f.getArrivalTime());
                email.setDeptIntervalDay(f.getIntervalDay());
                email.setGoDepartureTerminal(f.getDepartureTerminal());
                email.setGoArrivalTerminal(f.getArrivalTerminal());
            } else {
                email.setArrAirlineNo(f.getFlightNumber());
                email.setArrSeatClass(SeatClass(f.getCabin()));
                email.setArrAirPort(f.getDepartureCity());
                email.setArrArrAirPort(f.getArrivalCity());
                email.setArrAirportCode(f.getDepartureCode());
                email.setArrArrAirportCode(f.getArrivalCode());
                email.setArrDate(DateUtil.DateToString(f.getDepartureDate(), "yyyy-MM-dd"));
                email.setArrTime(f.getDepartureTime());
                email.setArrArrTime(f.getArrivalTime());
                email.setArrIntervalDay(f.getIntervalDay());
                email.setBackDepartureTerminal(f.getDepartureTerminal());
                email.setBackArrivalTerminal(f.getArrivalTerminal());
            }

        }
        return email;
    }

    //
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public void passengerAdd(OrderPassenger passenger) {
//        pltmOrderDao.passengerAdd(passenger);
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public void passengerAdd(PltmOrderPassenger passenger) {
//        pltmOrderPassengerMapperService.create(passenger);
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public void passengerEdit(OrderPassenger passenger) {
//        pltmOrderDao.passengerEdit(passenger);
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public void passengerDel(String id) {
//        pltmOrderDao.passengerDel(id);
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public OrderPassenger getpassenger(String id) {
//        return pltmOrderDao.getpassenger(id);
//    }
//
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Integer orderTicket(PltmOrder order, SessionInfo info) throws Exception {
//        Integer _type = 2;
//        //验证账户余额
//        Map<String, Object> verifyMap = verifyAccountBalance(order, info);
//        Boolean verifyResult = Boolean.valueOf(verifyMap.get("flag").toString());
//        Double payTic = Double.valueOf(verifyMap.get("payTic").toString());
//        order.setPayPrice(payTic);
//        order.setPayTime(new Date());
//        if (!verifyResult) {
//            _type = 0;
//            return _type;
//        }
//        //账户扣除票款
//        PltmAccount pltmAccount = pltmAccountMapperService.accountTrade(6, info, payTic);
//        //生成交易记录
//        PltmTradeList pltmTradeList = getTradeList(pltmAccount, payTic, info);
//        pltmTradeList.setCreateUser(info.getId().intValue());
//        pltmTradeList.setCreateTime(new Date());
//        pltmTradeListDBServiceI.create(pltmTradeList);
//
//        //获取订单信息
//        PltmOrderVo orderVo = pltmOrderDao.queryOrderDetail(order.getOrderNumber());
//        //与PSS同步旅客信息
//        List<PssOrderPassenger> passengers = pltmOrderDao.queryPssPassenger(order.getOrderNumber());
//        String pssengerJson = JSONObject.toJSONString(passengers);
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        headers.setContentType(type);
//        HttpEntity<String> formEntity = new HttpEntity<String>(pssengerJson, headers);
//        //发送请求
//        String pssengerUrl = orderPssengerUrl;
//        pssengerUrl = pssengerUrl.replaceAll("orderId", orderVo.getPssOrderNumber());
//        LOG.debug("请求pss order url:" + pssengerUrl + "; HttpEntity:" + formEntity);
//        ResponseEntity<String> pssResp = restTemplate.postForEntity(pssengerUrl, formEntity, String.class);
//        LOG.debug("响应pss order respString:" + pssResp == null ? null : JSON.toJSONString(pssResp));
//        if (pssResp != null && pssResp.getStatusCode() != null) {//判断http响应
//            HttpStatus httpStatus = pssResp.getStatusCode();
//            if (httpStatus != null && httpStatus.equals(HttpStatus.OK)) {
//                JSONObject pssJson = JSONObject.parseObject(pssResp.getBody());
//                if (pssJson != null) {
//                    if (pssJson.get("status") != null && pssJson.get("status").toString().equals(GlobalConstant.PSS_ORDER_CREATE_OK)) {
//                        //修改订单状态 为出票中状态
//                        pltmOrderDao.orderTicket(order);
//                        //添加订单日志
//                        PltmOrderLogVo log = getLog(order);
//                        orderLogDao.saveOrderLog(log);
//                        _type = 1;
//                    }
//                }
//            }
//        }
//        return _type;
//    }
//
//    private ResponseEntity<String> postResp(String Json, String url) {
//        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory);
//
//        HttpHeaders headers = new HttpHeaders();
//        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//        headers.setContentType(type);
//        HttpEntity<String> formEntity = new HttpEntity<>(Json, headers);
//        //发送请求
//        ResponseEntity<String> pssResp = null;
//        pssResp = restTemplate.postForEntity(url, formEntity, String.class);
//        return pssResp;
//    }
//
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    private MapVo createOrder(OrderCreatePo orderCreatePo, PltmOrder pltmOrder, List<PltmOrderFlight> pltmOrderFlights, SessionInfo sessionInfo, MapVo map) {
//        String orderNumber = saveDeskOrder(pltmOrder, pltmOrderFlights, sessionInfo);//保存本地订单
//        map.setNeedKey(orderNumber); //重要一步
//        String pssReqJson = contactPssJson(orderCreatePo, sessionInfo);//向pss 发送请求 封装数据
//        LOG.debug("请求pss order url:" + pssCreateOrderUrl + "; OrderJson:" + pssReqJson);
//        ResponseEntity<String> pssOrderResp = this.postResp(pssReqJson, pssCreateOrderUrl);//发送post请求
//        LOG.debug("响应pss order respString:" + pssOrderResp == null ? null : JSON.toJSONString(pssOrderResp));
//
//        boolean checkRespResult = CheckResp.checkPssPostResp(pssOrderResp);//检验pss 响应
//        if (!checkRespResult) { //同步pss 订单失败
//            map.setNeedValue(2);
//            postPssFailed(orderNumber, null);
//            LOG.info("同步pss order 订单失败");
//            return map;
//        } else {
//            String pssOrderNumber = JSONObject.parseObject(pssOrderResp.getBody()).get("data").toString();
//            pltmOrder.setPssOrderNumber(pssOrderNumber);
//            pltmOrderDao.updatePssOrder(pltmOrder.getId(), pssOrderNumber);//更新pss订单号
//        }
//        //添加订单日志
//        saveLog(sessionInfo.getId().intValue(), pltmOrder.getOrderNumber());
//        return map;
//    }
//
//
//    private PltmTradeList getTradeList(PltmAccount pltmAccount, Double payTic, SessionInfo info) {
//        PltmTradeList pltmTradeList = new PltmTradeList();
//        pltmTradeList.setAccountBalance(pltmAccount.getAvailableBalance());
//        pltmTradeList.setCost(payTic);
//        pltmTradeList.setCreateTime(new Date());
//        pltmTradeList.setCreateUser(info.getId().intValue());
//        pltmTradeList.setLastModifyPerson(info.getId().intValue());
//        pltmTradeList.setLastModifyTime(new Date());
//        pltmTradeList.setPayOrderNumber(OrderUtil.getTradeListNo());
//        pltmTradeList.setPayType(PltmTradeList.COLUMN_PAYTYPE_VALUE_OFFLINE);
//        pltmTradeList.setTradeType(PltmTradeList.COLUMN_TRADETYPE_VALUE_FARE);
//        pltmTradeList.setStatus(PltmTradeList.COLUMN_STATUS_VALUE_PENDING);
//        pltmTradeList.setOrganizationId(info.getOrgId());
//        pltmTradeList.setMoney(pltmAccount.getMoney());
//        pltmTradeList.setFreezeAmount(pltmAccount.getFreezeAmount());
//        return pltmTradeList;
//    }
//
//    private PltmOrderLogVo getLog(PltmOrder order) {
//        PltmOrderLogVo log = new PltmOrderLogVo();
//        log.setOperateUserid(order.getLastModifyPerson());
//        log.setOrderNo(order.getOrderNumber());
//        log.setOperateState("出票申请");
//        log.setOperateRole("采购商");
//        log.setRemarks("");
//        return log;
//    }
//
//    private Map<String, Object> verifyAccountBalance(PltmOrder order, SessionInfo info) {
//        Map<String, Object> map = new HashMap<>();
//
//        boolean flag = false;
//        Double payTic = this.payableTic(order.getOrderNumber());//订单支付金额
//        PltmAccount acc = pltmAccountMapperService.selectByOrgId(info.getOrgId());
//        if (acc != null) {
//            Double balance = acc.getAvailableBalance();//账户余额
//            if (balance != null && balance > payTic) {
//                flag = true;
//            }
//        }
//        map.put("flag", flag);
//        map.put("payTic", payTic);
//        return map;
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Integer queryIsCanceled(String orderNumber) {
//        return pltmOrderDao.queryIsCanceled(orderNumber);
//    }
//
    //订单取消
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public void orderCancelAll(String orderNumber, String remarks) {
        Integer pl_status = 0;
        Integer pss_status = 0;
        Integer order_status = null;
        order_status = queryIsCanceled(orderNumber);
        if (order_status == null) {
            LOG.error("订单取消失败！此订单号不存在！");
        } else if (order_status == 5) {
            LOG.debug("订单取消成功!");
        } else {
            //PSS订单取消
            pss_status = pssOrderCancel(orderNumber);
            if (pss_status == 1) {
                pl_status = orderCancel(orderNumber);
                if (pl_status == 1) {
                    LOG.debug("平台订单取消成功！--->订单编号：" + orderNumber);
                    //插入订单取消备注
                    if (remarks != null && !(remarks.equals(""))) {
                        pltmOrderDao.setRemark(remarks, orderNumber);
                    }

                } else {
                    LOG.debug("平台订单取消失败！--->订单编号：" + orderNumber);
                }
            } else {
                LOG.debug("PSS订单取消失败!");
            }
        }
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public Integer orderCancel(String orderNumber) {
        return pltmOrderDao.orderCancel(orderNumber);
    }

    public String queryPssOrderNum(String orderNumber) {
        return pltmOrderDao.queryPssOrderNum(orderNumber);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public Integer pssOrderCancel(String orderNumber) {
        String pss_orderNum = queryPssOrderNum(orderNumber);
        System.out.println(pss_orderNum);
        if (pss_orderNum == null || "".equals(pss_orderNum)) {
            LOG.debug("PSS订单取消失败！订单编号 --->" + pss_orderNum + "该订单编号非法，没有相关数据！");
            return 0;
        }
        //给pss 发送请求
        RestTemplate rt = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType mType = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(mType);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        LOG.debug("开始发送http请求：地址--->" + orderCancelPssUrl + pss_orderNum);
        ResponseEntity<String> response = rt.exchange(orderCancelPssUrl + pss_orderNum, HttpMethod.POST, entity, String.class);
        LOG.debug("http请求响应结果：结果--->" + response.toString());

        if (response != null && response.getStatusCode() == HttpStatus.OK) {
            JSONObject json = JSONObject.parseObject(response.getBody());
            String status = json.get("status").toString();
            System.out.println("李正勇返回result:" + status);
            if (status != null && status.equals(GlobalConstant.PSS_ORDER_CREATE_OK)) {
                LOG.debug("PSS订单取消成功！订单编号 --->" + pss_orderNum);
                return 1;
            }
        }

        LOG.debug("PSS订单取消失败！订单编号 --->" + pss_orderNum);
        return 0;

    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    private Integer queryIsCanceled(String orderNumber) {
        return pltmOrderDao.queryIsCanceled(orderNumber);
    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Integer pssCancel(String orderNumber) {
//        String pl_orderNum = null;
//        if (orderNumber != null && !(orderNumber.equals(""))) {
//            pl_orderNum = queryPltmOrderNum(orderNumber);
//        } else {
//            return 0;
//        }
//        if (pl_orderNum == null || "".equals(pl_orderNum)) {
//            return 0;
//        } else {
//            if (queryIsCanceled(pl_orderNum) == 5) {
//                return 1;
//            } else {
//                return orderCancel(pl_orderNum);
//            }
//        }
//
//
//    }
//
//    @Override
//    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
//    public Double payableTic(String orderNumber) {
//        Double result = null;
//        PltmOrder order = pltmOrderMapperService.queryOrderByOrderId(orderNumber);
//        String contractNo = order.getContractNo();
//        Integer passCount = pltmOrderPassengerMapperService.selectCountByOrderId(orderNumber);//出票人数
//        Integer contractPassNo = order.getPurchQuantity();//合同人数
//        Double unitPrice = order.getUnitPrice();
//        Double ticketRate = order.getTicketRate();
//        Double ticketLoss = order.getTicketLoss();
//        if (StringUtils.isEmpty(contractNo)) {//非合同订单返回单价×订单人数
//            result = unitPrice * order.getPurchQuantity();
//        } else {
//            LOG.debug("contractPassNo:" + contractPassNo + "; passCount:" + passCount + "; unitPrice:" + unitPrice + "; ticketRate:" + ticketRate + "; ticketLoss:" + ticketLoss);
//            if (contractPassNo != null && passCount != null) {
//                if (passCount.equals(0)) {
//                    result = unitPrice * passCount; //票价 * 出票人数
//                } else if (passCount >= (contractPassNo * ticketRate) / 100) {//出票人数大于等于（合同人数*出票率）
//                    result = unitPrice * passCount; //票价 * 出票人数
//                } else {//出票人数小于
//                    result = (unitPrice * passCount) + (contractPassNo * ticketRate / 100 - passCount) * ticketLoss; //价 * 出票人数 +（合同数量 * 出票率 - 出票人数）*票损；
//                }
//            } else {
//                return null;
//            }
//            if (result != null) {
//                DecimalFormat df = new DecimalFormat("######0.00");
//                result = Double.valueOf(df.format(result));
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public String queryPltmOrderNum(String orderNumber) {
//        return pltmOrderDao.queryPltmOrderNum(orderNumber);
//    }
}
