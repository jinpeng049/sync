package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by wangwei on 2016年10月19日.
 */
public class FlightPo {
	
	private Long id; 
	private String orderNo;
	private Long flightId;
	private String airlineNumber;
	private Integer flightSegment;
	private String deptCity;
	private String arrCity;
	private String deptCode;
	private String arrCode;
	private Integer intervalDay;
	private Date deptDate;
	private String deptTime;
	private String arrTime;
	private String cabin;
	private String deptTerminal;
	private String arrTerminal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getAirlineNumber() {
		return airlineNumber;
	}
	public void setAirlineNumber(String airlineNumber) {
		this.airlineNumber = airlineNumber;
	}
	public Integer getFlightSegment() {
		return flightSegment;
	}
	public void setFlightSegment(Integer flightSegment) {
		this.flightSegment = flightSegment;
	}
	public String getDeptCity() {
		return deptCity;
	}
	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getArrCode() {
		return arrCode;
	}
	public void setArrCode(String arrCode) {
		this.arrCode = arrCode;
	}
	public Integer getIntervalDay() {
		return intervalDay;
	}
	public void setIntervalDay(Integer intervalDay) {
		this.intervalDay = intervalDay;
	}
	@JSONField(format = "yyyy-MM-dd")
	public Date getDeptDate() {
		return deptDate;
	}
	public void setDeptDate(Date deptDate) {
		this.deptDate = deptDate;
	}
	public String getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getDeptTerminal() {
		return deptTerminal;
	}
	public void setDeptTerminal(String deptTerminal) {
		this.deptTerminal = deptTerminal;
	}
	public String getArrTerminal() {
		return arrTerminal;
	}
	public void setArrTerminal(String arrTerminal) {
		this.arrTerminal = arrTerminal;
	}
}
