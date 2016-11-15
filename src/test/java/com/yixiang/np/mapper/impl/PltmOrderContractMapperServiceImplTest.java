package com.yixiang.np.mapper.impl;

import com.yixiang.np.BaseTest;
import com.yixiang.np.mapper.PltmOrderContractMapperService;
import com.yixiang.np.model.po.PltmOrderContract;
import com.yixiang.np.model.vo.MessageRecord;
import com.yixiang.np.model.vo.PltmContractVo;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/15.
 */
public class PltmOrderContractMapperServiceImplTest extends BaseTest {

    @Resource(name = "pltmOrderContractMapperService")
    private PltmOrderContractMapperService pltmOrderContractMapperService;

    @Test
    public void selectByPssContractNo() {
        System.err.println(pltmOrderContractMapperService.selectByPssContractNo("C2016101213384500016971"));
    }

    @Test
    public void selectByPayOverTime() {
        System.err.println(pltmOrderContractMapperService.selectByPayOverTime());
    }

    @Test
    public void selectByContractNo() {
        System.err.println(pltmOrderContractMapperService.selectByContractNo("CP201610121338401879"));
    }

    @Test
    public void updateByExampleSelective() {
        PltmOrderContract pltmOrderContract = new PltmOrderContract();
        pltmOrderContract.setContractNo("CP201610121338401879");
        pltmOrderContract.setStatus(PltmContractVo.COLUMN_CONSTRACTSTATUS_PAY);
        pltmOrderContract.setPayOvertime(new Date());

        System.err.println(pltmOrderContractMapperService.updateStatusAndTimeByContractNo(pltmOrderContract));

    }

    @Test
    public void selectCountByExample() {
        MessageRecord messageRecord = new MessageRecord();

        messageRecord.setCount(pltmOrderContractMapperService.selectCountByExample(messageRecord));
        messageRecord.setStatus(PltmContractVo.COLUMN_CONSTRACTSTATUS_CANCLE.toString());
        messageRecord.setType(MessageRecord.DEPOSIT);
        System.err.println(pltmOrderContractMapperService.selectCountByExample(messageRecord));

    }
}