package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.yixiang.np.utils.DateUtil;

import java.util.Date;

/**
 * Created by wangwei on 2016/9/8.
 */
public class OrderVo {

    private Long id; //订单ID

    private String orderNumber; //订单编号
    
    private String conNO; //合同编号
    
    private String pssOrderNumber; //pss订单编号
    
    private Integer purchQuantity; //采购人数（数量）
    
    private Integer oldPurchQuantity; //预计采购人数
    
    private Integer actualTicketedCount; //实际出票人数

    private Double sellingPrice; //单价
    
    private Double oldSellingPrice; //原单价
    
    private Double ticketLoss; //票损
    
    private Double oldTicketLoss; //原票损
    
    private Double ticketRate; //出票率
    
    private Double oldTicketRate; //原出票率
    
    private Short orderStatus; //订单状态
    
    private Date paymentDeadline; //支付截止日期
    
    private Integer ticketLimitTime; //出票时限
    
    private Date orderCreateTime; //订单创建时间
    
	private Date ticketingDeadline; //最晚出票时限

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
    
    private Double sum; //总价
    
    private Integer toIntervalDay;//去程间隔天数  （0 -- 当天 ）
    
    private Integer backIntervalDay; //回程间隔天数（0 -- 当天）
    
    private Integer financeStatus; //财务状态
    
    private Date payTime;//支付时间
    
    private Date passengerUptime; //名单上传时间
    
    private Date ticketOuttime; //出票时间
    
    private Double charges; //佣金比例
    
    private String sellerName;//供应商名称
    
    private String buyerName; //采购商名称
    
    private String createuserName; //买家  真实人名
    
    private String mobile; //电话 (联系电话)
    
    private Integer payTimeout; //支付是否超时
    
    
    
    
    
	public String getConNO() {
		return conNO;
	}

	public void setConNO(String conNO) {
		this.conNO = conNO;
	}

	public Integer getPayTimeout() {
		return payTimeout;
	}

	public void setPayTimeout(Integer payTimeout) {
		this.payTimeout = payTimeout;
	}

	public String getPssOrderNumber() {
		return pssOrderNumber;
	}

	public void setPssOrderNumber(String pssOrderNumber) {
		this.pssOrderNumber = pssOrderNumber;
	}

	public Integer getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(Integer financeStatus) {
		this.financeStatus = financeStatus;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPassengerUptime() {
		return passengerUptime;
	}

	public void setPassengerUptime(Date passengerUptime) {
		this.passengerUptime = passengerUptime;
	}
	
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getTicketOuttime() {
		return ticketOuttime;
	}
	
	public void setTicketOuttime(Date ticketOuttime) {
		this.ticketOuttime = ticketOuttime;
	}

	public Double getCharges() {
		return charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getCreateuserName() {
		return createuserName;
	}

	public void setCreateuserName(String createuserName) {
		this.createuserName = createuserName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getToIntervalDay() {
		return toIntervalDay;
	}

	public void setToIntervalDay(Integer toIntervalDay) {
		this.toIntervalDay = toIntervalDay;
	}

	public Integer getBackIntervalDay() {
		return backIntervalDay;
	}

	public void setBackIntervalDay(Integer backIntervalDay) {
		this.backIntervalDay = backIntervalDay;
	}

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getOrderCreateTime() {
    	return orderCreateTime;
    }
    
    public void setOrderCreateTime(Date orderCreateTime) {
    	this.orderCreateTime = orderCreateTime;
    }
    
    //计算 --- 最晚出票时间  （起飞日期 - 出票时限）
    @JSONField(format = "yyyy-MM-dd")
    public Date getTicketingDeadline() {
    	return DateUtil.addDay(this.toStartDate, -ticketLimitTime);
    }
    
    public void setTicketingDeadline(Date ticketingDeadline) {
    	this.ticketingDeadline = ticketingDeadline;
    }

    public Integer getTicketLimitTime() {
    	return ticketLimitTime;
    }
    
    public void setTicketLimitTime(Integer ticketLimitTime) {
    	this.ticketLimitTime = ticketLimitTime;
    }
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getPurchQuantity() {
		return purchQuantity;
	}

	public void setPurchQuantity(Integer purchQuantity) {
		this.purchQuantity = purchQuantity;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	//计算 --- 支付截止时间   创建订单时间 +（默认24h）
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getPaymentDeadline() {
		return DateUtil.addHour(this.orderCreateTime, 24);
	}

	public void setPaymentDeadline(Date paymentDeadline) {
		this.paymentDeadline = paymentDeadline;
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
	
	@JSONField(format = "yyyy-MM-dd")
	public Date getToStartDate() {
		return toStartDate;
	}

	public void setToStartDate(Date toStartDate) {
		this.toStartDate = toStartDate;
	}
	
	@JSONField(format = "yyyy-MM-dd")
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
	
	//计算 ---总价
	public Double getSum() {
		return (getSellingPrice()*getPurchQuantity());
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Integer getOldPurchQuantity() {
		return oldPurchQuantity;
	}

	public void setOldPurchQuantity(Integer oldPurchQuantity) {
		this.oldPurchQuantity = oldPurchQuantity;
	}

	public Double getOldSellingPrice() {
		return oldSellingPrice;
	}

	public void setOldSellingPrice(Double oldSellingPrice) {
		this.oldSellingPrice = oldSellingPrice;
	}

	public Double getTicketLoss() {
		return ticketLoss;
	}

	public void setTicketLoss(Double ticketLoss) {
		this.ticketLoss = ticketLoss;
	}

	public Double getOldTicketLoss() {
		return oldTicketLoss;
	}

	public void setOldTicketLoss(Double oldTicketLoss) {
		this.oldTicketLoss = oldTicketLoss;
	}

	public Double getTicketRate() {
		return ticketRate;
	}

	public void setTicketRate(Double ticketRate) {
		this.ticketRate = ticketRate;
	}

	public Double getOldTicketRate() {
		return oldTicketRate;
	}

	public void setOldTicketRate(Double oldTicketRate) {
		this.oldTicketRate = oldTicketRate;
	}

	public Integer getActualTicketedCount() {
		return actualTicketedCount;
	}

	public void setActualTicketedCount(Integer actualTicketedCount) {
		this.actualTicketedCount = actualTicketedCount;
	}
}

  
