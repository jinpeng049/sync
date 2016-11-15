package com.yixiang.np.dao;

import com.yixiang.np.BaseTest;
import com.yixiang.np.model.po.PltmAccount;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmAccountDaoTest extends BaseTest {
    @Autowired
    private PltmAccountDao pltmAccountDao;

    @Test
    public void create() {
        PltmAccount _pltmAccount = new PltmAccount();
        _pltmAccount.setLastModifyTime(new Date());
        _pltmAccount.setLastModifyPerson(123);
        _pltmAccount.setMoney(0d);
        _pltmAccount.setAccountName("test");
        _pltmAccount.setAccountNumber("123123");
        _pltmAccount.setAlreadyMentioned(0d);
        _pltmAccount.setCreateTime(new Date());
        _pltmAccount.setCreateUser(123123);
        _pltmAccount.setOrganizationId(123123);
        _pltmAccount.setOrganizationName("test");
        _pltmAccount.setReceivable(2d);
        _pltmAccount.setStayPresent(0d);
        _pltmAccount.setType(PltmAccount.COLUMN_TYPE_VALUE_SUPPLIER);
        Integer i = pltmAccountDao.create(_pltmAccount);
        System.err.println("_pltmAccount:" + _pltmAccount);
        System.err.println(i);
    }

    @Test
    public void selectBySupplierId() {
        PltmAccount pltmAccount = pltmAccountDao.selectBySupplierId(6);
        System.err.println("pltmAccount:" + pltmAccount);
    }
}