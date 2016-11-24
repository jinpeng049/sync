package com.yixiang.np.quartz;

import com.yixiang.np.dao.PltmOrderLogDao;
import com.yixiang.np.mapper.PltmOrderMapperService;
import com.yixiang.np.model.po.PltmOrder;
import com.yixiang.np.model.vo.PltmOrderLogVo;
import com.yixiang.np.service.OrderServiceI;
import org.quartz.DisallowConcurrentExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/24.
 * 订单支付时限
 */

@Component("SyncOrderPayLimitTask")
@DisallowConcurrentExecution
public class SyncOrderPayLimitTask {
    private static final Logger LOG = LoggerFactory.getLogger(SyncOrderPayLimitTask.class);

    @Autowired
    private PltmOrderLogDao orderLogDao;
    @Resource
    private PltmOrderMapperService pltmOrderMapperService;
    @Resource
    private OrderServiceI orderServiceI;

    @Scheduled(fixedDelayString = "${order.pay.limit.fixed.delay}", initialDelayString = "${order.pay.limit.init.delay}")
    public void sync() {
        List<PltmOrder> pltmOrderList = pltmOrderMapperService.queryPayOverTimeOrder();
        LOG.debug("SyncOrderPayLimitTask sync:{}; ", pltmOrderList);

        //取消支付超时的订单
        if (pltmOrderList != null && !pltmOrderList.isEmpty()) {
            pltmOrderList.forEach(pltmOrder -> {
                try {
                    addOrderLog(pltmOrder.getOrderNumber());
                    orderServiceI.orderCancelAll(pltmOrder.getOrderNumber(), "系统取消散客支付超时订单");
                } catch (Exception e) {
                    LOG.error("SyncOrderPayLimitTask exception", e);
                }

            });
        }
    }


    public void addOrderLog(String orderNumber) {
        //添加订单日志
        PltmOrderLogVo log = new PltmOrderLogVo();
        log.setOperateUserid(-1);
        log.setOrderNo(orderNumber);
        log.setOperateState("取消");
        log.setOperateRole("系统");
        log.setRemarks("订单支付超时:" + orderNumber);
        orderLogDao.saveOrderLog(log);
    }
}
