package com.yixiang.np.mapper;

import com.yixiang.np.model.po.PltmOrder;
import com.yixiang.np.model.vo.MessageRecord;

import java.util.List;

/**
 * Created by pengpeng on 16-10-12.
 */
public interface PltmOrderMapperService {

    List<PltmOrder> queryOrderByExample(PltmOrder pltmOrder);

    PltmOrder queryOrderByOrderId(String orderId);

    Integer selectCountByExample(MessageRecord messageRecord);

    List<PltmOrder> queryPayOverTimeOrder();

    Integer updateOrderStatus(PltmOrder pltmOrder);

}
