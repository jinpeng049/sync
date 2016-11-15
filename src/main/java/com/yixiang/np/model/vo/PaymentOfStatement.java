package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
* @author zhouxing
* @version 1.0 ----- 创建时间：2016年9月21日
*/

public class PaymentOfStatement {

	private Integer supplierId;
	private String supplier;
	private String username; 
	private Date createTime;
	private String cashMoney;
	private String accountBank;
	private String accountName;
	private String accountCard;
	private String remark;
	
	public Integer getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCashMoney() {
		return cashMoney;
	}
	public void setCashMoney(String cashMoney) {
		this.cashMoney = cashMoney;
	}
	public String getAccountBank() {
		return accountBank;
	}
	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountCard() {
		return accountCard;
	}
	public void setAccountCard(String accountCard) {
		this.accountCard = accountCard;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
