package com.yixiang.np.mapper.impl;

import com.yixiang.np.dao.OrganizationDao;
import com.yixiang.np.dao.PltmAccountDao;
import com.yixiang.np.mapper.PltmAccountMapperService;
import com.yixiang.np.mapper.inter.PltmAccountMapper;
import com.yixiang.np.model.SessionInfo;
import com.yixiang.np.model.po.Organization;
import com.yixiang.np.model.po.PltmAccount;
import com.yixiang.np.model.vo.PltmTradeListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by pengpeng on 16-10-10.
 */
@Service("pltmAccountService")
public class PltmAccountMapperServiceImpl implements PltmAccountMapperService {

    @Autowired
    private PltmAccountMapper mapper;

    @Resource
    private OrganizationDao organizationDao;
    @Autowired
    private PltmAccountDao pltmAccountDao;

    //判断账户是否存在
    @Override
    public PltmAccount selectByOrgId(Long orgId) {
        PltmAccount acc = mapper.selectOne(new PltmAccount(orgId.intValue()));
        return acc;
    }

    /**
     * @param type(0-充值前，1-充值通过，2-充值不通过，3-提现申请，4-提现通过，5-提现不通过，6-票款，7-押金,8-押金解冻)
     * @return
     */
    @Override
    public PltmAccount accountTrade(Integer type, SessionInfo info, Double money) throws Exception {
        Long orgId = info.getOrgId();
        PltmAccount acc = selectByOrgId(orgId);
        boolean flag = false;
        if (type != null && acc != null && acc.getId() != null) {//判断账户是否存在
            flag = true;
        }
        if (flag) {
            operate(type, money, acc);
        } else {//创建账户
            createAccountBySessionInfo(info);
            acc = selectByOrgId(orgId);
            operate(type, money, acc);
        }
        return selectByOrgId(orgId);
    }

    private void createAccountBySessionInfo(SessionInfo info) {
        PltmAccount _pltmAccount = new PltmAccount();
        _pltmAccount.setLastModifyTime(new Date());
        _pltmAccount.setLastModifyPerson(info.getId().intValue());
        _pltmAccount.setMoney(0d);
        _pltmAccount.setAlreadyMentioned(0d);
        _pltmAccount.setCreateTime(new Date());
        _pltmAccount.setCreateUser(info.getId().intValue());
        _pltmAccount.setOrganizationId(info.getOrgId().intValue());
        _pltmAccount.setOrganizationName(info.getOrgName());
        _pltmAccount.setReceivable(0d);
        _pltmAccount.setStayPresent(0d);
        _pltmAccount.setFreezeAmount(0d);
        _pltmAccount.setAvailableBalance(0d);
        //获取组织信息
        Organization org = organizationDao.get(info.getOrgId());
        if (org.getOrgType().equals(Organization.SUPPLIER)) {//供应商
            _pltmAccount.setType(PltmAccount.COLUMN_TYPE_VALUE_SUPPLIER);
        } else if (org.getOrgType().equals(Organization.PURCHASE)) {//采购商
            _pltmAccount.setType(PltmAccount.COLUMN_TYPE_VALUE_PURCHASER);
        }
        _pltmAccount.setAccountName(org.getBankUser());
        _pltmAccount.setAccountNumber(org.getBankCard());
        pltmAccountDao.create(_pltmAccount);
    }

    private boolean checkMoneyAvaliable(PltmAccount account, Double money) {
        if (account.getAvailableBalance() != null && account.getAvailableBalance() > money) {//可用余额是否大于money
            return true;
        }
        return false;
    }

    private void operate(Integer type, Double money, PltmAccount account) throws Exception {
        PltmAccount _accAccount = new PltmAccount();
        _accAccount.setId(account.getId());
        if (type.equals(0)) {//充值前
            _accAccount.setFreezeAmount(account.getFreezeAmount() + money);//冻结金额  +
            //_accAccount.setMoney(account.getMoney() + money);//账户余额 ---
        }
        if (type.equals(1)) {//充值通过
            _accAccount.setAvailableBalance(account.getAvailableBalance() + money);//可用余额  +
            _accAccount.setFreezeAmount(account.getFreezeAmount() - money);//冻结金额  -
            _accAccount.setMoney(account.getMoney() + money);//账户余额 +
        }
        if (type.equals(2)) {//充值不通过
            _accAccount.setFreezeAmount(account.getFreezeAmount() - money);//冻结金额  -
            //_accAccount.setMoney(account.getMoney() - money);//账户余额 ---
        }
        if (type.equals(3)) {//提现申请
            if (!checkMoneyAvaliable(account, money)) {
                throw new Exception("账户余额不足！");
            }
            _accAccount.setAvailableBalance(account.getAvailableBalance() - money);//可用余额  -
            _accAccount.setFreezeAmount(account.getFreezeAmount() + money);//冻结金额  +
            //_accAccount.setMoney(account.getMoney() + money);//账户余额 ---
        }
        if (type.equals(4)) {//提现通过
            //_accAccount.setAvailableBalance();//可用余额  ---
            _accAccount.setFreezeAmount(account.getFreezeAmount() - money);//冻结金额  -
            _accAccount.setMoney(account.getMoney() - money);//账户余额 -
        }
        if (type.equals(5)) {//提现不通过
            _accAccount.setAvailableBalance(account.getAvailableBalance() + money);//可用余额  +
            _accAccount.setFreezeAmount(account.getFreezeAmount() - money);//冻结金额  -
            //_accAccount.setMoney(account.getMoney() + money);//账户余额 ---
        }
        if (type.equals(6)) {//票款
            if (!checkMoneyAvaliable(account, money)) {
                throw new Exception("账户余额不足！");
            }
            _accAccount.setAvailableBalance(account.getAvailableBalance() - money);//可用余额  -
            //_accAccount.setFreezeAmount(account.getFreezeAmount() + money);//冻结金额  +
            _accAccount.setMoney(account.getMoney() - money);//账户余额 -
        }
        if (type.equals(7)) {//押金
            if (!checkMoneyAvaliable(account, money)) {
                throw new Exception("账户余额不足！");
            }
            _accAccount.setAvailableBalance(account.getAvailableBalance() - money);//可用余额  -
            _accAccount.setFreezeAmount(account.getFreezeAmount() + money);//冻结金额  +
            _accAccount.setMoney(account.getMoney() - money);//账户余额 -
        }
        if (type.equals(PltmTradeListVo.UNFREEZE)) {//押金解冻
            _accAccount.setAvailableBalance(account.getAvailableBalance() + money);//可用余额  +
            _accAccount.setFreezeAmount(account.getFreezeAmount() - money);//冻结金额  -
            _accAccount.setMoney(account.getMoney() + money);//账户余额 +
        }
        mapper.updateByPrimaryKeySelective(_accAccount);
    }
}

