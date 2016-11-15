package com.yixiang.np.mapper;

import com.yixiang.np.model.po.PltmTradeList;
import com.yixiang.np.model.vo.MessageRecord;

import java.util.List;

/**
 * Created by pengpeng on 16-10-10.
 */
public interface PltmTradeListDBServiceI {

    List<PltmTradeList> listByCondition();

    PltmTradeList create(PltmTradeList pltmTradeList);

    Integer selectCountByExample(MessageRecord messageRecord);
}
