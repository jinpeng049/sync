package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/15.
 */
public class OrganizationDaoTest  extends BaseTest{

    @Autowired
    private OrganizationDao organizationDao;

    @Test
    public void findAll() throws Exception {
        System.err.println(organizationDao.findAll());
    }

    @Test
    public void findAllVo() throws Exception {

    }

    @Test
    public void findByOrgid() throws Exception {
        System.err.println(organizationDao.findByOrgid(6));
    }

    @Test
    public void add() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void findByOrgType() throws Exception {
        System.err.println(organizationDao.findByOrgType(1));
    }

}