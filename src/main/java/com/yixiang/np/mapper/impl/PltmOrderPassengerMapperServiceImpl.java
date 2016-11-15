package com.yixiang.np.mapper.impl;

import com.yixiang.np.mapper.PltmOrderPassengerMapperService;
import com.yixiang.np.mapper.inter.PltmOrderPassengerMapper;
import com.yixiang.np.model.po.PltmOrderPassenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pengpeng on 16-10-12.
 */
@Service("pltmOrderPassengerMapperService")
public class PltmOrderPassengerMapperServiceImpl implements PltmOrderPassengerMapperService {

    @Autowired
    private PltmOrderPassengerMapper mapper;

    @Override
    public Integer selectCountByOrderId(String orderId) {
        return mapper.selectCount(new PltmOrderPassenger(orderId));
    }

    public Integer create(PltmOrderPassenger pltmOrderPassenger) {
        return mapper.insertSelective(pltmOrderPassenger);
    }
}
