package com.yixiang.np.dao;

import com.yixiang.np.model.po.Organization;
import com.yixiang.np.model.vo.OrganizationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrganizationDao {
	
	public List<Organization> findAll();

	List<OrganizationVo> findAllVo();
	
	public List<Organization> findByOrgid(@Param("pid") Integer pid);

	public void add(Organization org);

	public void delete(Long id);

	public void update(Organization org);

	public Organization get(Long id);
	
	public List<Organization> findByOrgType(@Param("orgType") Integer orgType);
}
