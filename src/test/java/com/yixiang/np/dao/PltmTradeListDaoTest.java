package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import com.yixiang.np.model.vo.PltmTradeListVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmTradeListDaoTest extends BaseTest {
    @Autowired
    private PltmTradeListDao pltmTradeListDao;

    @Test
    public void listByCondition() {
        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("startDate", new Date());
//        map.put("endDate", new Date());
//        map.put("payType", 1);
//        map.put("organizationName", "test");

//        map.put("startDate", StringUtils.isNotEmpty(startDate) ? DateUtil.StringToDate(startDate.trim() + " 00:00:00", "yyyy-MM-dd HH:mm:ss") : null);
//        map.put("endDate", StringUtils.isNotEmpty(endDate) ? DateUtil.StringToDate(endDate.trim() + " 23:59:59", "yyyy-MM-dd HH:mm:ss") : null);
//        map.put("tradeType", tradeType);
//        map.put("orderBy", "pltmTradeList.create_time desc");
        map.put("organizationId", 14l);
//        map.put("payOrderNumber", "PM20161010114");
//        map.put("status", status);
        List<PltmTradeListVo> list = pltmTradeListDao.listByCondition(map);
        list.forEach(e -> {
            System.err.println("e:" + e);
        });
    }

    @Test
    public void listDespositByCondition() {
        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("startDate", new Date());
//        map.put("endDate", new Date());
//        map.put("payType", 1);
//        map.put("organizationName", "test");

//        map.put("startDate", StringUtils.isNotEmpty(startDate) ? DateUtil.StringToDate(startDate.trim() + " 00:00:00", "yyyy-MM-dd HH:mm:ss") : null);
//        map.put("endDate", StringUtils.isNotEmpty(endDate) ? DateUtil.StringToDate(endDate.trim() + " 23:59:59", "yyyy-MM-dd HH:mm:ss") : null);
//        map.put("tradeType", tradeType);
//        map.put("orderBy", "pltmTradeList.create_time desc");
//        map.put("organizationId", sessionInfo.getOrgId());
//        map.put("payOrderNumber", "PM20161010114");
//        map.put("status", status);
        List<PltmTradeListVo> list = pltmTradeListDao.listDespositByCondition(map);
        list.forEach(e -> {
            System.err.println("e:" + e);
        });
    }

}