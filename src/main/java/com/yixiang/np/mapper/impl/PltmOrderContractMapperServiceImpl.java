package com.yixiang.np.mapper.impl;

import com.yixiang.np.mapper.PltmOrderContractMapperService;
import com.yixiang.np.mapper.inter.PltmOrderContractMapper;
import com.yixiang.np.model.po.PltmOrderContract;
import com.yixiang.np.model.vo.MessageRecord;
import com.yixiang.np.model.vo.PltmContractVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by pengpeng on 16-10-12.
 */
@Service("pltmOrderContractMapperService")
public class PltmOrderContractMapperServiceImpl implements PltmOrderContractMapperService {

    @Autowired
    private PltmOrderContractMapper mapper;

    @Override
    public PltmOrderContract selectByPssContractNo(String pssContractNo) {
        PltmOrderContract p = new PltmOrderContract();
        p.setPssContractNo(pssContractNo);
        return mapper.selectOne(p);
    }

    @Override
    public PltmOrderContract selectByContractNo(String contractNo) {
        PltmOrderContract p = new PltmOrderContract();
        p.setContractNo(contractNo);
        return mapper.selectOne(p);
    }

    @Override
    public List<PltmOrderContract> selectByPayOverTime() {
        Example e = new Example(PltmOrderContract.class);
        Example.Criteria c = e.createCriteria();
        c.andEqualTo("status", PltmContractVo.COLUMN_CONSTRACTSTATUS_PAY);
        c.andLessThanOrEqualTo("payOvertime", new Date());
        return mapper.selectByExample(e);
    }

    @Override
    public Integer updateStatusAndTimeByContractNo(PltmOrderContract pltmOrderContract) {
        Example e = new Example(PltmOrderContract.class);
        Example.Criteria c = e.createCriteria();
        if (pltmOrderContract != null && StringUtils.isNotEmpty(pltmOrderContract.getContractNo())) {
            c.andEqualTo("contractNo", pltmOrderContract.getContractNo());
            pltmOrderContract.setContractNo(null);
            return mapper.updateByExampleSelective(pltmOrderContract, e);
        }
        return null;
    }

    @Override
    public Integer selectCountByExample(MessageRecord messageRecord) {
        Example example = new Example(PltmOrderContract.class);
        Example.Criteria criteria = example.createCriteria();
        String statuss = messageRecord.getStatus();
        Integer createUser = messageRecord.getCreateUser();
        Integer purchase = messageRecord.getPurchase();
        String startTime = messageRecord.getStartTime();
        if (createUser != null) {
            criteria.andEqualTo("createUserid", createUser);
        }
        if (purchase != null) {
            criteria.andEqualTo("customerId", purchase);
        }
        if (org.apache.commons.lang.StringUtils.isNotEmpty(startTime)) {
            try {
                criteria.andGreaterThanOrEqualTo("createTime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startTime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (StringUtils.isNotEmpty(statuss)) {
            String[] stas = statuss.split(",");
            criteria.andIn("status", Arrays.asList(stas));
        }
        return mapper.selectCountByExample(example);
    }

}
