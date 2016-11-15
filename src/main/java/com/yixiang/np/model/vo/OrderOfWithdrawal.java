package com.yixiang.np.model.vo;

import java.util.List;

/**
* @author zhouxing
* @version 1.0 ----- 创建时间：2016年9月22日
*/
public class OrderOfWithdrawal {
	private String orderNumber;
	private String pssOrderNumber;
	private List<Itinerary> itineraryList;
	private String unitPrice;
	private String purchQuantity;
	private String orderStatus;
	private Double netCash;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getPssOrderNumber() {
		return pssOrderNumber;
	}
	public void setPssOrderNumber(String pssOrderNumber) {
		this.pssOrderNumber = pssOrderNumber;
	}
	public List<Itinerary> getItineraryList() {
		return itineraryList;
	}
	public void setItineraryList(List<Itinerary> itineraryList) {
		this.itineraryList = itineraryList;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getPurchQuantity() {
		return purchQuantity;
	}
	public void setPurchQuantity(String purchQuantity) {
		this.purchQuantity = purchQuantity;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getNetCash() {
		return netCash;
	}
	public void setNetCash(Double netCash) {
		this.netCash = netCash;
	}
	
	
}
