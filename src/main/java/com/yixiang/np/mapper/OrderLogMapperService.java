package com.yixiang.np.mapper;

import com.yixiang.np.model.po.OrderLog;

import java.util.List;

public interface OrderLogMapperService {
//    int countByExample(Criteria example);
//
//    int deleteByExample(Criteria example);
//
//    int deleteByPrimaryKey(Integer id);

    Integer create(OrderLog record);

//    int insertSelective(OrderLog record);
//
    List<OrderLog> listByCondition(OrderLog orderLog);
//
//    OrderLog selectByPrimaryKey(Integer id);
//
//    int updateByExampleSelective(@Param("record") OrderLog record, @Param("example") Criteria example);
//
//    int updateByExample(@Param("record") OrderLog record, @Param("example") Criteria example);
//
//    int updateByPrimaryKeySelective(OrderLog record);
//
//    int updateByPrimaryKey(OrderLog record);
}