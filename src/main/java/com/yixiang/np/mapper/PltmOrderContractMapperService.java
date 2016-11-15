package com.yixiang.np.mapper;

import com.yixiang.np.model.po.PltmOrderContract;
import com.yixiang.np.model.vo.MessageRecord;

import java.util.List;

/**
 * Created by pengpeng on 16-10-12.
 */
public interface PltmOrderContractMapperService {
    PltmOrderContract selectByPssContractNo(String pssContractNo);

    /**
     * 查询需要取消得合同
     *
     * @return
     */
    List<PltmOrderContract> selectByPayOverTime();

    PltmOrderContract selectByContractNo(String contractNo);

    Integer updateStatusAndTimeByContractNo(PltmOrderContract pltmOrderContract);

    Integer selectCountByExample(MessageRecord messageRecord);
}
