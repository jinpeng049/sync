package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmOrderPassengerDaoTest extends BaseTest {

    @Resource
    PltmOrderPassengerDao pltmOrderPassengerDao;

    @Test
    public void updatePassengerTicketNum() {
        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("ticketNumber", "123456");
        map.put("orderNumber", "123456");
        map.put("docType", "1");
        map.put("docId", "1");
        Integer a = pltmOrderPassengerDao.updatePassengerTicketNum(map);
        System.err.println(a);
    }

}