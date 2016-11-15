package com.yixiang.np.mapper;

import com.yixiang.np.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/11.
 */
public class OrderLogMapperServiceTest extends BaseTest {

    @Resource
    private OrderLogMapperService orderLogMapperService;

    @Test
    public void listByCondition() {
        System.err.println(orderLogMapperService.listByCondition(null));
    }

}