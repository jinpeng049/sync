package com.yixiang.np.dao;


import com.yixiang.np.model.po.PltmAccount;
import org.apache.ibatis.annotations.Param;

public interface PltmAccountDao {
    //    int countByExample(Criteria example);
//
//    int deleteByExample(Criteria example);
//
//    int deleteByPrimaryKey(Long id);
//
    Integer create(PltmAccount pltmAccount);

    //
//    int insertSelective(PltmAccount record);
//
//    List<PltmAccount> selectByExample(Criteria example);
//
    PltmAccount selectBySupplierId(@Param("organizationId") Integer organizationId);

    //
//    int updateByExampleSelective(@Param("record") PltmAccount record, @Param("example") Criteria example);
//
//    int updateByExample(@Param("record") PltmAccount record, @Param("example") Criteria example);
//
    Integer updateByPrimaryKeySelective(PltmAccount pltmAccount);
//
//    int updateByPrimaryKey(PltmAccount record);
}