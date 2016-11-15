package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/*
 * 用于航班预订页面的预订的全部显示的页面信息
 */
public class PltmOrderLogVo {
	private Integer id;
	private String orderNo;
	private Integer operateUserid;
	private String operateUsername;
	private String operateRole;
	private Date operateTime;
	private String operateState;
	private String remarks;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getOperateUserid() {
		return operateUserid;
	}
	public void setOperateUserid(Integer operateUserid) {
		this.operateUserid = operateUserid;
	}
	public String getOperateUsername() {
		return operateUsername;
	}
	public void setOperateUsername(String operateUsername) {
		this.operateUsername = operateUsername;
	}
	public String getOperateRole() {
		return operateRole;
	}
	public void setOperateRole(String operateRole) {
		this.operateRole = operateRole;
	}
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getOperateTime() {
		return operateTime;
	}
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateState() {
		return operateState;
	}
	public void setOperateState(String operateState) {
		this.operateState = operateState;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}

