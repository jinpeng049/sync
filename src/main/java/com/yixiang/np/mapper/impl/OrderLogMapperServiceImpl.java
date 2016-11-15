package com.yixiang.np.mapper.impl;

import com.yixiang.np.mapper.OrderLogMapperService;
import com.yixiang.np.mapper.inter.OrderLogMapper;
import com.yixiang.np.model.po.OrderLog;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service("orderLogMapperService")
public class OrderLogMapperServiceImpl implements OrderLogMapperService {

    @Autowired
    private OrderLogMapper orderLogMapper;

    //    public int countByExample(Criteria example) {
//        int count = this.orderLogMapper.countByExample(example);
//        logger.debug("count: {}", count);
//        return count;
//    }
//
//    public OrderLog selectByPrimaryKey(Integer id) {
//        return this.orderLogMapper.selectByPrimaryKey(id);
//    }
//
    public List<OrderLog> listByCondition(OrderLog orderLog) {
        Example example = new Example(OrderLog.class);
        Example.Criteria criteria = example.createCriteria();
        if (orderLog != null && StringUtils.isNotEmpty(orderLog.getOrderNo())) {
            criteria.andEqualTo("orderNo", orderLog.getOrderNo());
        }
        return orderLogMapper.selectByExample(example);
    }
//
//    public int deleteByPrimaryKey(Integer id) {
//        return this.orderLogMapper.deleteByPrimaryKey(id);
//    }
//
//    public int updateByPrimaryKeySelective(OrderLog record) {
//        return this.orderLogMapper.updateByPrimaryKeySelective(record);
//    }
//
//    public int updateByPrimaryKey(OrderLog record) {
//        return this.orderLogMapper.updateByPrimaryKey(record);
//    }
//
//    public int deleteByExample(Criteria example) {
//        return this.orderLogMapper.deleteByExample(example);
//    }
//
//    public int updateByExampleSelective(OrderLog record, Criteria example) {
//        return this.orderLogMapper.updateByExampleSelective(record, example);
//    }
//
//    public int updateByExample(OrderLog record, Criteria example) {
//        return this.orderLogMapper.updateByExample(record, example);
//    }

    public Integer create(OrderLog record) {
        return orderLogMapper.insertSelective(record);
    }

//    public int insertSelective(OrderLog record) {
//        return this.orderLogMapper.insertSelective(record);
//    }
}