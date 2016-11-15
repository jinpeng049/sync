package com.yixiang.np.model.vo;
/**
* @author zhouxing
* @version 1.0 ----- 创建时间：2016年9月20日
*/
public class OrderOfStatement {
	
	private String orderNumber;
	
	private String pssOrderNumber;
	
	private String buyer;
	
	private String saler;

	private Double unitPrice;
	
	private Integer purchQuantity;
	
	private Double sum;
	
	private String payDate;
	
	private String orderStatus;
	
	private String financeStatus;

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

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getSaler() {
		return saler;
	}

	public void setSaler(String saler) {
		this.saler = saler;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getPurchQuantity() {
		return purchQuantity;
	}

	public void setPurchQuantity(Integer purchQuantity) {
		this.purchQuantity = purchQuantity;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
	}

	
}
