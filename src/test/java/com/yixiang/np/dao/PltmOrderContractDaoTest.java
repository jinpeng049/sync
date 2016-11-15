package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import com.yixiang.np.mapper.PltmOrderContractMapperService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmOrderContractDaoTest extends BaseTest {
    @Resource
    private PltmOrderContractDao pltmOrderContractDao;
    @Resource
    private PltmOrderContractMapperService pltmOrderContractMapperService;

    @Test
    public void queryContractNoByStatus() {
        System.err.println(pltmOrderContractDao.queryPssContractNoByStatus(1));

    }

    @Test
    public void updateStatusAndTimeByContractNo() {
        System.err.println(pltmOrderContractDao.updateStatusAndTimeByContractNo("CP201610131032411462", 2, new Date()));
    }

    @Test
    public void updateStatusByContractNo() {
        System.err.println(pltmOrderContractDao.updateStatusByContractNo("CP201610131032411462", 2));
    }

}