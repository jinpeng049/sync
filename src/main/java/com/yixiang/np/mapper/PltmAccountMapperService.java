package com.yixiang.np.mapper;

import com.yixiang.np.model.SessionInfo;
import com.yixiang.np.model.po.PltmAccount;

/**
 * Created by pengpeng on 16-10-12.
 */
public interface PltmAccountMapperService {

    //判断账户是否存在
    PltmAccount selectByOrgId(Long orgId);

    /**
     * @param type(0-充值前，1-充值通过，2-充值不通过，3-提现申请，4-提现通过，5-提现不通过，6-票款，7-押金)
     * @return
     */
    PltmAccount accountTrade(Integer type, SessionInfo info, Double money) throws Exception;
}
