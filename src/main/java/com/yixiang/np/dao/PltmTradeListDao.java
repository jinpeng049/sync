package com.yixiang.np.dao;

import com.yixiang.np.model.po.PltmTradeList;
import com.yixiang.np.model.vo.PltmTradeListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PltmTradeListDao {

//    int countByExample(Criteria example);
//
//    int deleteByExample(Criteria example);
//
//    int deleteByPrimaryKey(Long id);

    Integer create(PltmTradeList pltmTradeList);

    //    int insertSelective(PltmTradeList record);

    List<PltmTradeListVo> listByCondition(@Param("condition") Map<String, Object> map);

    List<PltmTradeListVo> listDespositByCondition(@Param("condition") Map<String, Object> map);

    PltmTradeListVo selectByPtlId(@Param("id") Long id);

//    PltmTradeList selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") PltmTradeList record, @Param("example") Criteria example);
//
//    int updateByExample(@Param("record") PltmTradeList record, @Param("example") Criteria example);
//
//    int updateByPrimaryKeySelective(PltmTradeList record);
//
//    int updateByPrimaryKey(PltmTradeList record);
}