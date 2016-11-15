package com.yixiang.np.model;

import java.util.List;

public class SessionInfo implements java.io.Serializable {

    private Long id;// 用户ID
    private String loginname;// 登录名
    private String name;// 姓名
    private String ip;// 用户IP
    private String mobile;
    private String email;
    private Long orgId;
    private String orgName;
    private Integer usertype;
    private Integer orgType;
    private Integer state;
    private String remark;

    private List<String> resourceList;// 用户可以访问的资源地址列表

    private List<String> resourceAllList;

    public List<String> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<String> resourceList) {
        this.resourceList = resourceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public List<String> getResourceAllList() {
        return resourceAllList;
    }

    public void setResourceAllList(List<String> resourceAllList) {
        this.resourceAllList = resourceAllList;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public SessionInfo() {
    }

    public SessionInfo(Long orgId) {
        this.orgId = orgId;
    }

    public Integer getOrgType() {
		return orgType;
	}

	public void setOrgType(Integer orgType) {
		this.orgType = orgType;
	}

	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SessionInfo{");
        sb.append("id=").append(id);
        sb.append(", loginname='").append(loginname).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", ip='").append(ip).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", orgId=").append(orgId);
        sb.append(", orgName='").append(orgName).append('\'');
        sb.append(", usertype=").append(usertype);
        sb.append(", resourceList=").append(resourceList);
        sb.append(", resourceAllList=").append(resourceAllList);
        sb.append('}');
        return sb.toString();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
