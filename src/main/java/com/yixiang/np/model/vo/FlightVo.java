package com.yixiang.np.model.vo;

import java.util.Date;

/**
 * Created by wangwei on 2016年10月19日.
 */
public class FlightVo {
	
	private long id;
	
	private long flightId; //航班ID
	
	private String orderNo; //订单编号
	
	private Integer flightSegment; //航段标识
	
	private String cabin; //舱位等级
	
	private String toAirlineNumber; //去程航班编号
    
    private String backAirlineNumber; //回程航班编号

    private String toStartAirportCode; //去程 --起飞机场三字码

    private String toEndAirportCode; //去程 -- 降落机场三字码
    
    private String backStartAirportCode;//回程 -- 起飞机场三字码
    
    private String backEndAirportCode;//回程 -- 降落机场三字码
    
    private String toStartAirportName; //去程 --起飞机场名称
    
    private String toEndAirportName; //去程 --降落机场名称
    
    private String backStartAirportName; //回程 -- 起飞机场名称
    
    private String backEndAirportName; //回程 -- 降落机场名称
    
    private Date toStartDate; //去程 -- 出发日期
    
    private Date backStartDate; //回程 -- 出发日期
    
    private String toStartTime; //去程 -- 出发时刻
    
    private String toEndTime; //去程 -- 到达时刻
    
    private String backStartTime; //回程 -- 出发时刻
    
    private String backEndTime; //回程 -- 到达时刻

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getFlightId() {
		return flightId;
	}

	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getFlightSegment() {
		return flightSegment;
	}

	public void setFlightSegment(Integer flightSegment) {
		this.flightSegment = flightSegment;
	}

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getToAirlineNumber() {
		return toAirlineNumber;
	}

	public void setToAirlineNumber(String toAirlineNumber) {
		this.toAirlineNumber = toAirlineNumber;
	}

	public String getBackAirlineNumber() {
		return backAirlineNumber;
	}

	public void setBackAirlineNumber(String backAirlineNumber) {
		this.backAirlineNumber = backAirlineNumber;
	}

	public String getToStartAirportCode() {
		return toStartAirportCode;
	}

	public void setToStartAirportCode(String toStartAirportCode) {
		this.toStartAirportCode = toStartAirportCode;
	}

	public String getToEndAirportCode() {
		return toEndAirportCode;
	}

	public void setToEndAirportCode(String toEndAirportCode) {
		this.toEndAirportCode = toEndAirportCode;
	}

	public String getBackStartAirportCode() {
		return backStartAirportCode;
	}

	public void setBackStartAirportCode(String backStartAirportCode) {
		this.backStartAirportCode = backStartAirportCode;
	}

	public String getBackEndAirportCode() {
		return backEndAirportCode;
	}

	public void setBackEndAirportCode(String backEndAirportCode) {
		this.backEndAirportCode = backEndAirportCode;
	}

	public String getToStartAirportName() {
		return toStartAirportName;
	}

	public void setToStartAirportName(String toStartAirportName) {
		this.toStartAirportName = toStartAirportName;
	}

	public String getToEndAirportName() {
		return toEndAirportName;
	}

	public void setToEndAirportName(String toEndAirportName) {
		this.toEndAirportName = toEndAirportName;
	}

	public String getBackStartAirportName() {
		return backStartAirportName;
	}

	public void setBackStartAirportName(String backStartAirportName) {
		this.backStartAirportName = backStartAirportName;
	}

	public String getBackEndAirportName() {
		return backEndAirportName;
	}

	public void setBackEndAirportName(String backEndAirportName) {
		this.backEndAirportName = backEndAirportName;
	}

	public Date getToStartDate() {
		return toStartDate;
	}

	public void setToStartDate(Date toStartDate) {
		this.toStartDate = toStartDate;
	}

	public Date getBackStartDate() {
		return backStartDate;
	}

	public void setBackStartDate(Date backStartDate) {
		this.backStartDate = backStartDate;
	}

	public String getToStartTime() {
		return toStartTime;
	}

	public void setToStartTime(String toStartTime) {
		this.toStartTime = toStartTime;
	}

	public String getToEndTime() {
		return toEndTime;
	}

	public void setToEndTime(String toEndTime) {
		this.toEndTime = toEndTime;
	}

	public String getBackStartTime() {
		return backStartTime;
	}

	public void setBackStartTime(String backStartTime) {
		this.backStartTime = backStartTime;
	}

	public String getBackEndTime() {
		return backEndTime;
	}

	public void setBackEndTime(String backEndTime) {
		this.backEndTime = backEndTime;
	}
    
    
    
}
