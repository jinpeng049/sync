package com.yixiang.np.mapper;

import com.yixiang.np.model.po.PltmOrderPassenger;

/**
 * Created by pengpeng on 16-10-12.
 */
public interface PltmOrderPassengerMapperService {

    Integer selectCountByOrderId(String orderId);

    Integer create(PltmOrderPassenger pltmOrderPassenger);
}
