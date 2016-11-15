package com.yixiang.np.mapper.inter;

import com.yixiang.np.BaseTest;
import com.yixiang.np.mapper.OrderLogMapperService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/11.
 */
public class NoticeMapperTest extends BaseTest {

    @Autowired
    private OrderLogMapperService orderLogMapperService;

    @Test
    public void test(){
        System.err.println(orderLogMapperService.listByCondition(null));
    }
}