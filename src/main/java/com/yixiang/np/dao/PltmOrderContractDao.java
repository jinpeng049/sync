package com.yixiang.np.dao;

import com.yixiang.np.model.vo.PltmContractVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by pengpeng on 16-9-8.
 */
public interface PltmOrderContractDao {

    /**
     * 创建合同
     *
     * @param
     * @return
     */
    Integer create(PltmContractVo contract);

    Integer deleteByContractNumber(@Param(value = "contractNo") String contractNo);

    Integer updatePssContractNo(@Param(value = "contractNo") String contractNo, @Param(value = "pssContractNo") String pssContractNo);

    List<String> queryPssContractNoByStatus(@Param("status") Integer status);

    Integer updateStatusAndTimeByContractNo(@Param("contractNo") String contractNo, @Param("status") Integer status, @Param("payOverTime") Date payOverTime);

    Integer updateStatusByContractNo(@Param("contractNo") String contractNo, @Param("status") Integer status);

}
