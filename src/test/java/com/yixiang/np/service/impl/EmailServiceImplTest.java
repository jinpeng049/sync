package com.yixiang.np.service.impl;

import com.yixiang.np.BaseTest;
import com.yixiang.np.model.vo.EmailVo;
import com.yixiang.np.service.EmailService;
import com.yixiang.np.service.OrderServiceI;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/11/11.
 */
public class EmailServiceImplTest extends BaseTest {
    @Resource
    private EmailService emailService;
    @Resource
    private OrderServiceI orderService;

    @Test
    public void sendEmail() {
        EmailVo email = orderService.queryEmailData("2016111114160300622793");
        email.setEmailTo("zhangjing@yixiangyunda.com");
        email.setSubject("2016111114160300622793订单--xx");
        email.setTemplate("order3.html");
        emailService.sendEmail(email);
        Assert.assertTrue(1 == 1);

    }

}