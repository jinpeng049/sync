package com.yixiang.np.model.vo;

import com.yixiang.np.utils.DateUtil;

import java.util.Date;

/**
 * Created by lishu on 2016/9/9.
 */
public class OrderFlightVo {
	private Integer id;
	private String orderNumber;
	private Integer flightId;
	private String flightNumber;
	private Integer flightSegment;
	private String departureCity;
	private String arrivalCity;
	private String departureCode;
	private String arrivalCode;
	private String intervalDay;
	private Date departureDate;
	private String departureDateStr;
	private String departureTime;
	private String arrivalTime;
	private String cabin;
	private String departureTerminal;
	private String arrivalTerminal;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Integer getFlightSegment() {
		return flightSegment;
	}
	public void setFlightSegment(Integer flightSegment) {
		this.flightSegment = flightSegment;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDepartureCode() {
		return departureCode;
	}
	public void setDepartureCode(String departureCode) {
		this.departureCode = departureCode;
	}
	public String getArrivalCode() {
		return arrivalCode;
	}
	public void setArrivalCode(String arrivalCode) {
		this.arrivalCode = arrivalCode;
	}
	public String getIntervalDay() {
		return intervalDay;
	}
	public void setIntervalDay(String intervalDay) {
		this.intervalDay = intervalDay;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getDepartureTerminal() {
		return departureTerminal;
	}
	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}
	public String getArrivalTerminal() {
		return arrivalTerminal;
	}
	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDepartureDateStr() {
		departureDateStr = DateUtil.DateToString(departureDate, "yyyy-MM-dd");
		return departureDateStr;
	}
	public void setDepartureDateStr(String departureDateStr) {
		this.departureDateStr = departureDateStr;
	}
	
	
}

  
