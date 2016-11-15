package com.yixiang.np.model.vo;
/**
* @author zhouxing
* @version 1.0 ----- 创建时间：2016年9月22日
*/
public class Itinerary {
	private String departureDate;
	private String departureCity;
	private String departureCode;
	private String departureTerminal;
	private String arrivalCity;
	private String arrivalCode;
	private String arrivalTerminal;
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getDepartureCode() {
		return departureCode;
	}
	public void setDepartureCode(String departureCode) {
		this.departureCode = departureCode;
	}
	public String getDepartureTerminal() {
		return departureTerminal;
	}
	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getArrivalCode() {
		return arrivalCode;
	}
	public void setArrivalCode(String arrivalCode) {
		this.arrivalCode = arrivalCode;
	}
	public String getArrivalTerminal() {
		return arrivalTerminal;
	}
	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}
}