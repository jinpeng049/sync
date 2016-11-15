package com.yixiang.np.service.impl;

import com.yixiang.np.dao.OrganizationDao;
import com.yixiang.np.mapper.OrderLogMapperService;
import com.yixiang.np.model.SessionInfo;
import com.yixiang.np.model.po.OrderLog;
import com.yixiang.np.model.po.Organization;
import com.yixiang.np.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by pengpeng on 16-10-24.
 */
@Service("commonService")
public class CommonServiceImpl implements CommonService {

    @Autowired
    private OrganizationDao organ_dao;
    @Resource(name = "orderLogMapperService")
    private OrderLogMapperService orderLogMapperService;

    @Override
    public void createOrderLog(SessionInfo info, String statues, String orderNo) {
        OrderLog record = new OrderLog();
        //获取组织信息
        if (info != null) {
            Organization org = organ_dao.get(info.getOrgId());
            if (org.getOrgType().equals(Organization.SUPPLIER)) {//供应商
                record.setOperateRole("供应商");
            } else if (org.getOrgType().equals(Organization.PURCHASE)) {//采购商
                record.setOperateRole("采购商");
            } else if (org.getOrgType().equals(Organization.NP)) {
                record.setOperateRole("平台");
            }
            record.setOperateUserid(info.getId().intValue());
            record.setOperateName(info.getOrgName());
        } else {
            record.setOperateRole("系统");
            record.setOperateName("系统");
        }
        record.setOrderNo(orderNo);
        record.setOperateState(statues);
        record.setOperateTime(new Date());

        record.setRemarks("合同号:" + orderNo);
        orderLogMapperService.create(record);

    }
}
