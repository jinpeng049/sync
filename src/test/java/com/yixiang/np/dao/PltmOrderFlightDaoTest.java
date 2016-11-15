package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import com.yixiang.np.model.po.PltmOrderFlight;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmOrderFlightDaoTest extends BaseTest {

    @Resource
    PltmOrderFlightDao pltmOrderFlightDao;

    @Test
    public void create() {
        PltmOrderFlight pltmOrderFlight = new PltmOrderFlight();
        pltmOrderFlight.setArrivalCity("PEK");
        pltmOrderFlight.setDepartureTerminal("T1");
        pltmOrderFlight.setArrivalTerminal("T2");
        pltmOrderFlight.setDepartureTime("11:22");
        pltmOrderFlight.setArrivalTime("11:52");
        pltmOrderFlight.setCabin("Y");
        pltmOrderFlight.setDepartureCity("CTU");
        pltmOrderFlight.setDepartureDate(new Date());
        pltmOrderFlight.setFlightId(123);
        pltmOrderFlight.setFlightNumber("3U888");
        pltmOrderFlight.setFlightSegment(1);
        pltmOrderFlight.setIntervalDay(2);
        pltmOrderFlight.setOrderNumber("20160908110312344321");
        pltmOrderFlight.setCreateUser(1231);
        pltmOrderFlight.setCreateTime(new Date());
        pltmOrderFlight.setLastModifyTime(new Date());
        pltmOrderFlight.setLastModifyPerson(123);

        Integer result = pltmOrderFlightDao.create(pltmOrderFlight);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void deleteByOrderNumber() {
        Integer result = pltmOrderFlightDao.deleteByOrderNumber("123456");
        System.err.println(result);
        Assert.assertTrue(result >= 0);
    }

}