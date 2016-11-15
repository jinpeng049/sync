package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by wangwei on 2016年9月27日.
 */
public class StatementVo {
	
	private String receiveAccount; //收款账户
	private String receiveBank; //收款银行
	private String paymentBank; //付款银行
	private String paymentAccount; //支付账户
	private Integer paymentType; //支付方式
	private String paymentNo; //支付单号
	private Double paymentMoney; //支付金额
	private Date paymentTime; //支付时间
	
	
	
	public String getReceiveAccount() {
		return receiveAccount;
	}
	public void setReceiveAccount(String receiveAccount) {
		this.receiveAccount = receiveAccount;
	}
	public String getReceiveBank() {
		return receiveBank;
	}
	public void setReceiveBank(String receiveBank) {
		this.receiveBank = receiveBank;
	}
	public String getPaymentBank() {
		return paymentBank;
	}
	public void setPaymentBank(String paymentBank) {
		this.paymentBank = paymentBank;
	}
	public String getPaymentAccount() {
		return paymentAccount;
	}
	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public Integer getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Double getPaymentMoney() {
		return paymentMoney;
	}
	public void setPaymentMoney(Double paymentMoney) {
		this.paymentMoney = paymentMoney;
	}
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	
	
	

}
