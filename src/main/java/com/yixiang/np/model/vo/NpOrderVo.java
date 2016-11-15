package com.yixiang.np.model.vo;

import java.util.List;

/**
 * Created by lishu on 2016/9/8.
 */
public class NpOrderVo extends PltmOrderVo {
	private List<OrderPassenger> passengers;
	private String purchase;
	private Double actualMoney;
	private String supplier;
	private Double amountPay;
	private Double actualPay;
	private String payStatus;
	public List<OrderPassenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<OrderPassenger> passengers) {
		this.passengers = passengers;
	}

	public String getPurchase() {
		return purchase;
	}

	public void setPurchase(String purchase) {
		this.purchase = purchase;
	}

	public Double getActualMoney() {
		return actualMoney;
	}

	public void setActualMoney(Double actualMoney) {
		this.actualMoney = actualMoney;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Double getAmountPay() {
		return amountPay;
	}

	public void setAmountPay(Double amountPay) {
		this.amountPay = amountPay;
	}

	public Double getActualPay() {
		return actualPay;
	}

	public void setActualPay(Double actualPay) {
		this.actualPay = actualPay;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	 
}

  
