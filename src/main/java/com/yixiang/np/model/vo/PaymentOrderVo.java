package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by lishu on 2016/9/8.
 */
public class PaymentOrderVo {
	private Integer id;
	private String buyer;
	private String financeStatus;
	private String orderNumber;
	private String orderStatus;
	private Date payDate;
	private String pssOrderNumber;
	private String purchQuantity;
	private String saler;
	private Double sum;
	private String unitPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getFinanceStatus() {
		return financeStatus;
	}
	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getPssOrderNumber() {
		return pssOrderNumber;
	}
	public void setPssOrderNumber(String pssOrderNumber) {
		this.pssOrderNumber = pssOrderNumber;
	}
	public String getPurchQuantity() {
		return purchQuantity;
	}
	public void setPurchQuantity(String purchQuantity) {
		this.purchQuantity = purchQuantity;
	}
	public String getSaler() {
		return saler;
	}
	public void setSaler(String saler) {
		this.saler = saler;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}

  
