package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by wangwei on 2016年9月21日.
 * 付款提现  实体类
 */
public class CashVo {
	
	private String cashNo; //提现单号
	private Date applyTime; //提现申请时间
	private Double cashMoney; //提现金额
	private String accountBank; //开户行
	private String accountName; //户名
	private String cardID; //卡号
	private Integer status; //财务状态
	private Integer id; //提现单ID
	private String orgName; //供应商名称
	private String username; //提现人姓名
	private String mobile; //提现人电话
	private Integer paymentType; //付款方式
	private String paymentBank; //付款银行
	private String paymentNo; //结算单号
	private Date paymentTime; //支付时间
	private String paymentRemarks; //支付备注（说明）
	private Long userId; //最后修改人 id
	private String dataToString; 
	
	
	
	
	public String getDataToString() {
		return dataToString;
	}
	public void setDataToString(String dataToString) {
		this.dataToString = dataToString;
	}
	public String getCashNo() {
		return cashNo;
	}
	public void setCashNo(String cashNo) {
		this.cashNo = cashNo;
	}
	@JSONField(format = "yyyy-MM-dd")
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Double getCashMoney() {
		return cashMoney;
	}
	public void setCashMoney(Double cashMoney) {
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
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentBank() {
		return paymentBank;
	}
	public void setPaymentBank(String paymentBank) {
		this.paymentBank = paymentBank;
	}
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	@JSONField(format = "yyyy-MM-dd")
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public String getPaymentRemarks() {
		return paymentRemarks;
	}
	public void setPaymentRemarks(String paymentRemarks) {
		this.paymentRemarks = paymentRemarks;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	
	
	

}
