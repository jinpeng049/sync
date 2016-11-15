package com.yixiang.np.model.vo;

/**
 * Created by lishu on 2016/9/9.
 */
public class PssOrder {
	private String platformOrderId;//PSS订单号
	private Integer passengerTotal;//订单数量
	private Double price;// 价格
	private Double ticketRate;// 出票率
	private Double ticketLoss;// 票损
	 
	public String getPlatformOrderId() {
		return platformOrderId;
	}
	public void setPlatformOrderId(String platformOrderId) {
		this.platformOrderId = platformOrderId;
	}
	public Integer getPassengerTotal() {
		return passengerTotal;
	}
	public void setPassengerTotal(Integer passengerTotal) {
		this.passengerTotal = passengerTotal;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getTicketRate() {
		return ticketRate;
	}
	public void setTicketRate(Double ticketRate) {
		this.ticketRate = ticketRate;
	}
	public Double getTicketLoss() {
		return ticketLoss;
	}
	public void setTicketLoss(Double ticketLoss) {
		this.ticketLoss = ticketLoss;
	}
	
	
}

  
