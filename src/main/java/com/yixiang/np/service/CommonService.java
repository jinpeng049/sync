package com.yixiang.np.service;

import com.yixiang.np.model.SessionInfo;

/**
 * Created by pengpeng on 16-10-24.
 */
public interface CommonService {
    void createOrderLog(SessionInfo info, String statues, String orderNo);
}
