package com.yixiang.np.model.vo;

import java.util.List;

/*
 * 用于航班预订页面的预订的全部显示的页面信息
 */
public class BookingInfo {
	
	private String airlineNumber;
	private String timespanDesc;
    private String fareId;
    private String price;
    private String paymentExpiredTime;
    private String issuingExpiredTime;

    private List<BookingFlightInfo> flights;

	public String getAirlineNumber() {
		return airlineNumber;
	}

	public void setAirlineNumber(String airlineNumber) {
		this.airlineNumber = airlineNumber;
	}

	public String getTimespanDesc() {
		return timespanDesc;
	}

	public void setTimespanDesc(String timespanDesc) {
		this.timespanDesc = timespanDesc;
	}

	public String getFareId() {
		return fareId;
	}

	public void setFareId(String fareId) {
		this.fareId = fareId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPaymentExpiredTime() {
		return paymentExpiredTime;
	}

	public void setPaymentExpiredTime(String paymentExpiredTime) {
		this.paymentExpiredTime = paymentExpiredTime;
	}

	public String getIssuingExpiredTime() {
		return issuingExpiredTime;
	}

	public void setIssuingExpiredTime(String issuingExpiredTime) {
		this.issuingExpiredTime = issuingExpiredTime;
	}

	public List<BookingFlightInfo> getFlights() {
		return flights;
	}

	public void setFlights(List<BookingFlightInfo> flights) {
		this.flights = flights;
	}
    
    
}

