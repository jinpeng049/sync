package com.yixiang.np.mapper.impl;

import com.yixiang.np.mapper.OrganizationMapperService;
import com.yixiang.np.mapper.inter.OrganizationMapper;
import com.yixiang.np.model.po.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pengpeng on 16-10-13.
 */
@Service("organizationMapperService")
public class OrganizationMapperServiceImpl  implements OrganizationMapperService {

    @Autowired
    private OrganizationMapper organizationMapper;
    public Organization read(Long id){
        return organizationMapper.selectByPrimaryKey(id);
    }

}
