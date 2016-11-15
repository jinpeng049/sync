package com.yixiang.np.model.vo;

import java.util.List;

/**
 * Created by lishu on 2016/9/9.
 */
public class PssContract {
	private String platformContractId;//PSS合同编号
	private Integer status;//2:审核通过 3：审核不通过
	private Double deposit;//押金金额
	private List<PssOrder> orders; //订单数组
	 
	public String getPlatformContractId() {
		return platformContractId;
	}
	public void setPlatformContractId(String platformContractId) {
		this.platformContractId = platformContractId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public List<PssOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<PssOrder> orders) {
		this.orders = orders;
	}
	
}

  
