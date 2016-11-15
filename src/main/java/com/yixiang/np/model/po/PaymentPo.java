package com.yixiang.np.model.po;

/**
 * Created by wangwei on 2016年9月22日.
 */
public class PaymentPo {
	
	private	Integer auditorId; //审核人ID
	
	private String remarks; //审核备注
	
	private Integer auditStatus; //状态
	
	private String orderNumber; //订单号
	
	

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getAuditorId() {
		return auditorId;
	}

	public void setAuditorId(Integer auditorId) {
		this.auditorId = auditorId;
	}


	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	
	
	

}
