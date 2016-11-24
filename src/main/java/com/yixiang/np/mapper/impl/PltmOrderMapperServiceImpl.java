package com.yixiang.np.mapper.impl;

import com.yixiang.np.mapper.PltmOrderMapperService;
import com.yixiang.np.mapper.inter.PltmOrderMapper;
import com.yixiang.np.model.po.PltmOrder;
import com.yixiang.np.model.vo.MessageRecord;
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
@Service("pltmOrderMapperService")
public class PltmOrderMapperServiceImpl implements PltmOrderMapperService {

    @Autowired
    private PltmOrderMapper mapper;

    @Override
    public List<PltmOrder> queryOrderByExample(PltmOrder pltmOrder) {
        Example example = new Example(PltmOrder.class);
        Example.Criteria criteria = example.createCriteria();
        if (pltmOrder != null) {
            if (StringUtils.isNotEmpty(pltmOrder.getContractNo())) {
                criteria.andEqualTo("contractNo", pltmOrder.getContractNo());
                return mapper.selectByExample(example);
            }
        }
        return null;
    }

    @Override
    public PltmOrder queryOrderByOrderId(String orderId) {
        return mapper.selectOne(new PltmOrder(orderId));
    }

    public Integer selectCountByExample(MessageRecord messageRecord) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Example example = new Example(PltmOrder.class);
        Example.Criteria criteria = example.createCriteria();
        String endTime = messageRecord.getEndTime();
        String startTime = messageRecord.getStartTime();
        String statuss = messageRecord.getStatus();
        Integer createUser = messageRecord.getCreateUser();
        Integer purchase = messageRecord.getPurchase();
        if (createUser != null) {
            criteria.andEqualTo("createUser", createUser);
        }
        if (purchase != null) {
            criteria.andEqualTo("purchase", purchase);
        }

        if (StringUtils.isNotEmpty(endTime)) {
            Date _endTime = null;
            try {
                _endTime = format.parse(endTime);
            } catch (ParseException e) {
            }
            criteria.andLessThanOrEqualTo("createTime", _endTime);
        }
        if (StringUtils.isNotEmpty(startTime)) {
            Date _startTime = null;
            try {
                _startTime = format.parse(startTime);
            } catch (ParseException e) {
            }
            criteria.andGreaterThanOrEqualTo("createTime", _startTime);
        }
        if (StringUtils.isNotEmpty(statuss)) {
            String[] stas = statuss.split(",");
            criteria.andIn("orderStatus", Arrays.asList(stas));
        }
        return mapper.selectCountByExample(example);
    }

    @Override
    public List<PltmOrder> queryPayOverTimeOrder() {
        Example example = new Example(PltmOrder.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLessThan("payOverTime", new Date());
        criteria.andEqualTo("orderStatus", PltmOrder.COLUMN_ORDERSTATUS_TOBE_PAID);
        criteria.andEqualTo("orderType", PltmOrder.ORDER_TYPE_FIT);
        return mapper.selectByExample(example);
    }

    @Override
    public Integer updateOrderStatus(PltmOrder pltmOrder) {
        if (pltmOrder != null && StringUtils.isNotEmpty(pltmOrder.getOrderNumber())) {
            Example example = new Example(PltmOrder.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("orderNumber", pltmOrder.getOrderNumber());
            pltmOrder.setOrderNumber(null);
            return mapper.updateByExampleSelective(pltmOrder, example);
        }
        return null;
    }
}
