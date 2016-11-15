package com.yixiang.np.mapper.impl;

import com.yixiang.np.BaseTest;
import com.yixiang.np.mapper.PltmTradeListDBServiceI;
import com.yixiang.np.model.po.PltmTradeList;
import com.yixiang.np.model.vo.MessageRecord;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmTradeListDBServiceImplTest extends BaseTest {

    @Resource(name = "pltmTradeListDBServiceI")
    PltmTradeListDBServiceI pltmTradeListDBServiceI;

    @Test
    public void listByCondition() {
        System.err.println(pltmTradeListDBServiceI.listByCondition());
    }

    @Test
    public void create() {
        PltmTradeList pltmTradeList = new PltmTradeList();
        pltmTradeList.setAccountBalance(1d);
//        pltmTradeList.setCost(1f);
        pltmTradeList.setCreateTime(new Date());
        pltmTradeList.setCreateUser(1);
//        pltmTradeList.setIncome(1f);
        pltmTradeList.setLastModifyPerson(2);
        pltmTradeList.setLastModifyTime(new Date());
        pltmTradeList.setPayOrderNumber("123123");
        pltmTradeList.setPayType(PltmTradeList.COLUMN_PAYTYPE_VALUE_OFFLINE);
        pltmTradeList.setRemark("test");
        pltmTradeList.setTradeType(PltmTradeList.COLUMN_TRADETYPE_VALUE_DEPOSIT);
        pltmTradeList.setStatus(PltmTradeList.COLUMN_STATUS_VALUE_PENDING);

        pltmTradeList.setAccountName("test");
        pltmTradeList.setAccountNumber("123124124");
        pltmTradeList.setOrganizationId(6l);
        System.err.println(pltmTradeListDBServiceI.create(pltmTradeList));
    }

    @Test
    public void selectCountByExample() {
        MessageRecord messageRecord = new MessageRecord();
        messageRecord.setTradeType(PltmTradeList.COLUMN_TRADETYPE_VALUE_RECHARGE);
        messageRecord.setStatus(PltmTradeList.COLUMN_STATUS_VALUE_FAIL + "," + PltmTradeList.COLUMN_STATUS_VALUE_TRUE);
        System.err.println(pltmTradeListDBServiceI.selectCountByExample(messageRecord));
    }

}