package com.yixiang.np.mapper.impl;

import com.yixiang.np.BaseTest;
import com.yixiang.np.mapper.PltmOrderMapperService;
import com.yixiang.np.model.po.PltmOrder;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/24.
 */
public class PltmOrderMapperServiceImplTest extends BaseTest {
    @Resource
    private PltmOrderMapperService pltmOrderMapperService;

    @Test
    public void queryPayOverTimeOrder() throws Exception {
        System.err.println(pltmOrderMapperService.queryPayOverTimeOrder());
    }

    @Test
    public void updateOrderStatus() {
        PltmOrder order = new PltmOrder();
        order.setOrderNumber("2016112319005500872311");
        order.setOrderStatus(PltmOrder.COLUMN_ORDERSTATUS_TICKETING_CANCLE);
        System.err.println(pltmOrderMapperService.updateOrderStatus(order));
    }

}