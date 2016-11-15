package com.yixiang.np.dao;

import com.yixiang.np.model.po.User;
import com.yixiang.np.model.vo.RegVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by LiZhengYong on 2016/6/16.
 */
public interface UserDao {

	public List<User> findAll(Map<String, Object> params);
	
	public List<User> findByRole(Map<String, Object> params);
	
	public List<String> getRoles(Long id);
	
	public Long count(Map<String, Object> params);
	
	public Long add(User user);
	
	public void addUserRole(Map<String, Object> params);

	public void delete(Long id);
	
	public void deleteUserRole(Long id);

	public void edit(User user);

	public User get(Long id);

	public User login(User user);

	public List<String> resourceList(Map<String, Object> params);

	public boolean editUserPwd(Map<String, Object> params);
	
	public boolean resetPwd(@Param(value = "id")String id,@Param(value = "password")String password);

	public User getByLoginName(String loginname);
	
	public int getOperatorCountByOrg(Long orgId);
	
	public List<User> getUserByOrgid(@Param(value = "orgId")Long orgId);

	List<RegVo> selectNoAudit(@Param(value = "username") String username,
							  @Param(value = "nickname") String nickname,
							  @Param(value = "company") String company,
							  @Param(value = "contact") String contact,
							  @Param(value = "state") Integer state,
							  @Param(value = "ownerId") Integer ownerId);

	void auditSucess(@Param(value = "id") Integer id,
                     @Param(value = "state")Integer state,
                     @Param(value = "remark") String remark);

	RegVo selectInfoById(@Param(value = "id") Integer id);
}
