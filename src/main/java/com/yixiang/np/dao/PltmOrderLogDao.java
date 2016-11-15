package com.yixiang.np.dao;

import java.util.List;
import java.util.Map;

import com.yixiang.np.model.po.Log;
import com.yixiang.np.model.vo.PltmOrderLogVo;

public interface PltmOrderLogDao {

	public void saveOrderLog(PltmOrderLogVo log);
}
