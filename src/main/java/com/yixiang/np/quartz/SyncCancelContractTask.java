package com.yixiang.np.quartz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yixiang.np.constant.GlobalConstant;
import com.yixiang.np.dao.PltmOrderContractDao;
import com.yixiang.np.dao.PltmOrderDao;
import com.yixiang.np.mapper.PltmOrderContractMapperService;
import com.yixiang.np.model.po.PltmOrder;
import com.yixiang.np.model.po.PltmOrderContract;
import com.yixiang.np.model.vo.PltmContractVo;
import org.apache.commons.lang.StringUtils;
import org.quartz.DisallowConcurrentExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pengpeng on 16-10-13.
 */
@Component("SyncCancelContractTask")
@DisallowConcurrentExecution
public class SyncCancelContractTask {

    private static final Logger LOG = LoggerFactory.getLogger(SyncCancelContractTask.class);

    @Resource
    private PltmOrderContractDao pltmOrderContractDao;
    @Resource
    private PltmOrderDao pltmOrderDao;
    @Resource
    private PltmOrderContractMapperService pltmOrderContractMapperService;
    @Resource
    private SimpleClientHttpRequestFactory simpleClientHttpRequestFactory;
    @Value("${order.pss.contrsync.cancel.url}")
    private String cancelUrl;

    @Scheduled(fixedDelayString = "${order.pss.cancelcontr.fixed.delay}", initialDelayString = "${order.pss.cancelcontr.init.delay}")
    public void sync() {
        List<PltmOrderContract> pltmOrderContracts = pltmOrderContractMapperService.selectByPayOverTime();
        LOG.debug("取消合同 pltmOrderContracts:{}; ", pltmOrderContracts);
        if ((pltmOrderContracts != null) && !pltmOrderContracts.isEmpty()) {
            pltmOrderContracts.forEach(e -> {
                try {
                    sendPssReq(e);
                } catch (Exception e1) {
                    LOG.error("调用pss取消合同失败", e1);
                }
            });
        }
    }

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    private void sendPssReq(PltmOrderContract e) throws Exception {
        String pssContractNo = e.getPssContractNo();
        //发送请求
        LOG.debug("请求pss contrsync url:{}; params:{}", cancelUrl, pssContractNo);
        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory);
        String pssResp = null;
        Map<String, String> params = new HashMap<String, String>();
        params.put("pssContractId", pssContractNo);
        pssResp = restTemplate.postForObject(cancelUrl, null, String.class, params);
        LOG.debug("响应pss contrsync pssResp:{}", pssResp == null ? null : JSON.toJSONString(pssResp));
        boolean checkResp = this.checkResp(pssResp);
        if (checkResp) {
            Integer contractResult = pltmOrderContractDao.updateStatusByContractNo(e.getContractNo(), PltmContractVo.COLUMN_CONSTRACTSTATUS_CANCLE);
            Integer orderResult = pltmOrderDao.updateOrderStatusByContractNo(e.getContractNo(), PltmOrder.COLUMN_ORDERSTATUS_TICKETING_CANCLE);
            LOG.debug("取消合同结果 contractResult:{}; orderResult:{}; ", contractResult, orderResult);
        }
    }

    public static boolean checkResp(String pssResp) {
        boolean flag = false;

        if (StringUtils.isNotEmpty(pssResp)) {
            JSONObject pssJson = JSONObject.parseObject(pssResp);
            if (pssJson != null) {
                if (pssJson.get("status") != null && pssJson.get("status").toString().equals(GlobalConstant.PSS_ORDER_CREATE_OK)) {
                    flag = true;
                }
            } else {
                LOG.info("响应pss ticksync pssResp.status error:{};", pssJson == null ? null : pssJson.get("status"));
            }
        } else {
            LOG.info("响应pss ticksync pssResp:null;");
        }
        return flag;
    }
}
