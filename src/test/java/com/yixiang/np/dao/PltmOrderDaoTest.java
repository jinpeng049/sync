package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import com.yixiang.np.model.po.PltmOrder;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmOrderDaoTest  extends BaseTest{
    @Resource
    PltmOrderDao pltmOrderDao;

    @Test
    public void create() {
        PltmOrder pltmOrder = new PltmOrder();
        pltmOrder.setLuggageInfo("2");
        pltmOrder.setPurchQuantity(2);
        pltmOrder.setTravelDays("100天100晚");
        pltmOrder.setUnitPrice(800d);
        pltmOrder.setPayAccount("851387557");
        pltmOrder.setPayName("金鹏123123");
        pltmOrder.setPayPrice(1980d);
        pltmOrder.setRemark("测试");
        pltmOrder.setId(1234l);
        pltmOrder.setPayUserId(123);
        pltmOrder.setPayTime(new Date());
        pltmOrder.setOrderStatus(1);
        pltmOrder.setPssOrderNumber("20160908110312344321PSS");
        pltmOrder.setLastModifyTime(new Date());
        pltmOrder.setOrderNumber("20160908110312344321 10");
        pltmOrder.setTicketLimitTime(2);
        pltmOrder.setCreateTime(new Date());
        pltmOrder.setCreateUser(123);
        pltmOrder.setLastModifyPerson(123);
        pltmOrder.setToStartDate(new Date());
        pltmOrder.setPssRoutingFareId(123);
        Integer result = pltmOrderDao.create(pltmOrder);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void updatePssOrder() {
        Integer result = pltmOrderDao.updatePssOrder(45l, "2016090919540700012554_");
        System.err.println(result);
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void deleteByOrderNumber() {
        Integer result = pltmOrderDao.deleteByOrderNumber("2016090919540700012497");
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void queryPltmOrderByStatus() {
        Map<String, PltmOrder> result = pltmOrderDao.queryPltmOrderByStatus();
        Assert.assertTrue(result != null);
    }

    @Test
    public void updateOrderStatus() {
        Integer result = pltmOrderDao.updateOrderStatus(45l, PltmOrder.COLUMN_ORDERSTATUS_TICKETING_SUCCESS, 3, new Date());
        Assert.assertTrue(result >= 0);
    }

    @Test
    public void queryOrderDetail() {
        System.err.println(pltmOrderDao.queryOrderDetail("2016091316534000014152"));
    }

    @Test
    public void countByContrNoAndOrderStatus() {
        System.err.println(pltmOrderDao.countByContrNoAndOrderStatus("111", 4));
    }

    @Test
    public void querySupplierBalance() {
        System.err.println(pltmOrderDao.querySupplierBalance(6));
    }

}