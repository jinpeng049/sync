package com.yixiang.np.mapper.impl;

import com.yixiang.np.mapper.PltmTradeListDBServiceI;
import com.yixiang.np.mapper.inter.PltmTradeListMapper;
import com.yixiang.np.model.po.PltmTradeList;
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

//import tk.mybatis.mapper.entity.Example;

/**
 * Created by pengpeng on 16-10-10.
 */
@Service("pltmTradeListDBServiceI")
public class PltmTradeListDBServiceImpl implements PltmTradeListDBServiceI {

    @Autowired
    private PltmTradeListMapper mapper;

    public List<PltmTradeList> listByCondition() {
        Example example = new Example(PltmTradeList.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("id", 4);
        return mapper.selectByExample(example);
    }

    public PltmTradeList create(PltmTradeList pltmTradeList) {
        mapper.insert(pltmTradeList);
        return pltmTradeList;
    }

    public Integer selectCountByExample(MessageRecord messageRecord) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if (messageRecord != null) {
            Example example = new Example(PltmTradeList.class);
            Example.Criteria criteria = example.createCriteria();
            String endTime = messageRecord.getEndTime();
            String startTime = messageRecord.getStartTime();
            Integer tradeType = messageRecord.getTradeType();
            String statuss = messageRecord.getStatus();
            Integer createUser = messageRecord.getCreateUser();

            if (createUser != null) {
                criteria.andEqualTo("createUser", createUser);
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
            if (tradeType != null) {
                criteria.andEqualTo("tradeType", tradeType);
            }

            if (StringUtils.isNotEmpty(statuss)) {
                String[] stas = statuss.split(",");
                criteria.andIn("status", Arrays.asList(stas));
            }

            return mapper.selectCountByExample(example);
        }
        return 0;
    }

}
