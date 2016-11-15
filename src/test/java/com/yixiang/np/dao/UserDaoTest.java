package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/15.
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private  UserDao userDao;

    @Test
    public void test(){
        System.err.println(userDao.selectInfoById(1));
    }

}