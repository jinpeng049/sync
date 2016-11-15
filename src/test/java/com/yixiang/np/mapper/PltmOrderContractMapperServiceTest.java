package com.yixiang.np.mapper;

import com.yixiang.np.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/14.
 */
public class PltmOrderContractMapperServiceTest extends BaseTest {
    @Resource
    private  PltmOrderContractMapperService pltmOrderContractMapperService;
    @Test
    public void selectByPssContractNo() throws Exception {

    }

    @Test
    public void selectByPayOverTime() throws Exception {
        System.err.println(pltmOrderContractMapperService.selectByPayOverTime());
    }

    @Test
    public void selectByContractNo() throws Exception {

    }

    @Test
    public void updateStatusAndTimeByContractNo() throws Exception {

    }

    @Test
    public void selectCountByExample() throws Exception {

    }

}