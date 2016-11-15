package com.yixiang.np.dao;

import com.yixiang.np.model.po.PltmPaymentOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by pengpeng on 16-9-8.
 */
public interface PltmPaymentOrderDao {

    //	int countByExample(Criteria example);
//
//	int deleteByExample(Criteria example);
//
//	int deleteByPrimaryKey(Long id);
//
    Integer create(PltmPaymentOrder pltmPaymentOrder);

    List<String> queryOrderNoList(@Param("orderNo") String orderNo);
//
//	int insertSelective(PltmPaymentOrder record);
//
//	List<PltmPaymentOrder> selectByExample(Criteria example);
//
//	PltmPaymentOrder selectByPrimaryKey(Long id);
//
//	int updateByExampleSelective(@Param("record") PltmPaymentOrder record, @Param("example") Criteria example);
//
//	int updateByExample(@Param("record") PltmPaymentOrder record, @Param("example") Criteria example);
//
//	int updateByPrimaryKeySelective(PltmPaymentOrder record);
//
//	int updateByPrimaryKey(PltmPaymentOrder record);


}
