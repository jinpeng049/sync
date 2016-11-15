package com.yixiang.np.model.vo;

import java.util.Date;

/**
 * Created by lishu on 2016/9/8.
 */
public class PltmPaymentOrderVo {
	private String payNo;
	private Double payMoney;
	private String payAccount;
	private String payName;
	private Date payTime;
	private Double actualMoney;
	private String purchase;
	public String getPayNo() {
		return payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	public Double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(Double payMoney) {
		this.payMoney = payMoney;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Double getActualMoney() {
		return actualMoney;
	}
	public void setActualMoney(Double actualMoney) {
		this.actualMoney = actualMoney;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public String getPurchase() {
		return purchase;
	}
	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}
	
	
}

  
