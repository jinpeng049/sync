package com.yixiang.np.dao;

import com.yixiang.np.model.po.PltmOrderFlight;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by pengpeng on 16-9-8.
 */
public interface PltmOrderFlightDao {

    /**
     * 创建订单
     * @param pltmOrderFlight
     * @return
     */
    Integer create(PltmOrderFlight pltmOrderFlight);
    void createBatch(@Param(value = "list") List<PltmOrderFlight> list);

    /**
     * 通过订单number删除flight几率
     * @param orderNumber
     * @return
     */
    Integer deleteByOrderNumber(@Param(value = "orderNumber") String orderNumber);
    
    Integer deleteByContractNumber(@Param(value = "contractNo") String contractNo);

    /**
     * 更新订单
     * @param pltmOrderFlightPo
     * @return
     */
    //Integer update(PltmOrderFlightPo pltmOrderFlightPo);

    /**
     * 查询订单
     * @param airlineId
     * @return
     */
    //PltmOrderFlightPo read(Long airlineId);

    /**
     * 删除订单
     * @param airlineId
     * @return
     */
    //Integer delete(Long airlineId);
}
