package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by wangwei on 2016年10月18日.
 * 运营商 ----合同列表实体
 */
public class OperatorContractVo {
	private Long id;
	private String conNo; //平台合同号
	private String pssConNo; //PSS合同号
	private String deptAirport; //出发机场
	private String arrAirport; //到达机场
	private String deptAirportCode; //出发机场三字码
	private String arrAirportCode; //到达机场三字码
	private String productList; //产品列表
	private Double oldDeposit; //原押金
	private Double deposit; //押金
	private Integer conStatus; //合同状态
	private String supName; //供应商名称
	private String custName; //采购商名称
	private String contact; //采购商联系人
	private String mobile; //采购商电话
	private Date paymentOverTime; //支付截止时间
	private Long seconds; //支付截止时间毫秒数
	
	
	public Long getSeconds() {
		if(this.paymentOverTime != null){
			return this.paymentOverTime.getTime();
		}else{
			return 0l;
		}
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getConNo() {
		return conNo;
	}
	public void setConNo(String conNo) {
		this.conNo = conNo;
	}
	public String getPssConNo() {
		return pssConNo;
	}
	public void setPssConNo(String pssConNo) {
		this.pssConNo = pssConNo;
	}
	public String getDeptAirport() {
		return deptAirport;
	}
	public void setDeptAirport(String deptAirport) {
		this.deptAirport = deptAirport;
	}
	public String getArrAirport() {
		return arrAirport;
	}
	public void setArrAirport(String arrAirport) {
		this.arrAirport = arrAirport;
	}
	public String getDeptAirportCode() {
		return deptAirportCode;
	}
	public void setDeptAirportCode(String deptAirportCode) {
		this.deptAirportCode = deptAirportCode;
	}
	public String getArrAirportCode() {
		return arrAirportCode;
	}
	public void setArrAirportCode(String arrAirportCode) {
		this.arrAirportCode = arrAirportCode;
	}
	public String getProductList() {
		return productList;
	}
	public void setProductList(String productList) {
		this.productList = productList;
	}
	public Double getOldDeposit() {
		return oldDeposit;
	}
	public void setOldDeposit(Double oldDeposit) {
		this.oldDeposit = oldDeposit;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public Integer getConStatus() {
		return conStatus;
	}
	public void setConStatus(Integer conStatus) {
		this.conStatus = conStatus;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPaymentOverTime() {
		return paymentOverTime;
	}
	public void setPaymentOverTime(Date paymentOverTime) {
		this.paymentOverTime = paymentOverTime;
	}
	

}
