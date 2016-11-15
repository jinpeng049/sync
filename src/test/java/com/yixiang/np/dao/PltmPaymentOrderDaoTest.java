package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmPaymentOrderDaoTest extends BaseTest {

    @Resource
    private PltmPaymentOrderDao pltmPaymentOrderDao;

    @Test
    public void queryOrderNoList(){
        System.err.println(pltmPaymentOrderDao.queryOrderNoList("2016092110335000014871"));
    }

}