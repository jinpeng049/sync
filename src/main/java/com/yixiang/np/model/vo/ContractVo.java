package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangwei on 2016年10月9日.
 * 合同订单 映射实体
 */

public class ContractVo {

	private long id;
	private String conNo; //合同编号
	private String pssConNo; //pss订单号
	private Integer seatCount; //座位总数
	private Integer flightCount; //航班总数
	private Double deposit; //押金
	private Double oldDeposit; //原押金
	private Date payOverTime; //支付截止时间
	private Long seconds = 0L; //支付截止时间毫秒数
	private short conStatus; //合同状态
	private String deptAirport;
	private String arrAirport;
	private String deptAirportCode;
	private String arrAirportCode;
	private String supplierName;
	private String buyerName;
	private String mobile;
	private String contact;
	private String productList;
	private List<NewOrderVo> orderList = new ArrayList<>(); //封装小订单信息
	public String getPssConNo() {
		return pssConNo;
	}

	public void setPssConNo(String pssConNo) {
		this.pssConNo = pssConNo;
	}

	public Double getOldDeposit() {
		return oldDeposit;
	}

	public void setOldDeposit(Double oldDeposit) {
		this.oldDeposit = oldDeposit;
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

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getProductList() {
		return productList;
	}

	public Long getSeconds() {
		if(this.payOverTime != null){
			seconds = this.getPayOverTime().getTime();
		}
		return seconds;
	}

	public void setSeconds(Long seconds) {
		this.seconds = seconds;
	}

	public void setProductList(String productList) {
		this.productList = productList;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getConNo() {
		return conNo;
	}
	public void setConNo(String conNo) {
		this.conNo = conNo;
	}
	public Integer getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}
	public Integer getFlightCount() {
		return flightCount;
	}
	public void setFlightCount(Integer flightCount) {
		this.flightCount = flightCount;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPayOverTime() {
		return payOverTime;
	}
	public void setPayOverTime(Date payOverTime) {
		this.payOverTime = payOverTime;
	}
	public short getConStatus() {
		return conStatus;
	}
	public void setConStatus(short conStatus) {
		this.conStatus = conStatus;
	}
	public List<NewOrderVo> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<NewOrderVo> orderList) {
		this.orderList = orderList;
	}
	
	
	
	

}
