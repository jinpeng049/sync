package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.yixiang.np.model.po.FlightPo;
import com.yixiang.np.utils.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangwei on 2016年10月19日.
 */
public class NewOrderVo {
	
	 private Long id; //订单ID

	    private String orderNumber; //订单编号
	    
	    private String conNo; //合同编号
	    
	    private String pssConNo; //PSS合同编号
	    
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
	    
	    private Date payOverTime; //支付截止日期
	    
	    private Integer ticketLimitTime; //出票时限
	    
	    private Date orderCreateTime; //订单创建时间
	    
		private Date ticketingDeadline; //最晚出票时限

	    private String toStartAirportCode; //去程 --起飞机场三字码

	    private String toEndAirportCode; //去程 -- 降落机场三字码
	    
	    private Date toStartDate; //去程 -- 出发日期
	    
	    private Double sum; //总价
	    
	    private Integer toIntervalDay;//去程间隔天数  （0 -- 当天 ）
	    
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

		private boolean dayFlay = false; // 起飞日期距当前系统时间 是否大于7天

		private Long seconds = 0L ; //支付截止时间毫秒数
	    
	    List<FlightPo> list = new ArrayList<>();

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

		public String getConNo() {
			return conNo;
		}

		public void setConNo(String conNo) {
			this.conNo = conNo;
		}

		public String getPssConNo() {
			return pssConNo;
		}

		public void setPssConNo(String pssConNo) {
			this.pssConNo = pssConNo;
		}

		public String getPssOrderNumber() {
			return pssOrderNumber;
		}

		public void setPssOrderNumber(String pssOrderNumber) {
			this.pssOrderNumber = pssOrderNumber;
		}

		public Integer getPurchQuantity() {
			return purchQuantity;
		}

		public void setPurchQuantity(Integer purchQuantity) {
			this.purchQuantity = purchQuantity;
		}

		public Integer getOldPurchQuantity() {
			return oldPurchQuantity;
		}

		public void setOldPurchQuantity(Integer oldPurchQuantity) {
			this.oldPurchQuantity = oldPurchQuantity;
		}

		public Integer getActualTicketedCount() {
			return actualTicketedCount;
		}

		public void setActualTicketedCount(Integer actualTicketedCount) {
			this.actualTicketedCount = actualTicketedCount;
		}

		public Double getSellingPrice() {
			return sellingPrice;
		}

		public void setSellingPrice(Double sellingPrice) {
			this.sellingPrice = sellingPrice;
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

		public Short getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(Short orderStatus) {
			this.orderStatus = orderStatus;
		}

		//计算 --- 支付截止时间   创建订单时间 +（默认24h）
		@JSONField(format = "yyyy-MM-dd HH:mm:ss")
		public Date getPayOverTime() {
			return payOverTime;
		}

		public void setPayOverTime(Date payOverTime) {
			this.payOverTime = payOverTime;
		}
		
		@JSONField(format = "yyyy-MM-dd HH:mm:ss")
		public Integer getTicketLimitTime() {
			return ticketLimitTime;
		}

		public void setTicketLimitTime(Integer ticketLimitTime) {
			this.ticketLimitTime = ticketLimitTime;
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
		
		@JSONField(format = "yyyy-MM-dd")
		public Date getToStartDate() {
			return toStartDate;
		}

		public void setToStartDate(Date toStartDate) {
			this.toStartDate = toStartDate;
		}

		public Double getSum() {
			return sum;
		}

		public void setSum(Double sum) {
			this.sum = sum;
		}

		public Integer getToIntervalDay() {
			return toIntervalDay;
		}

		public void setToIntervalDay(Integer toIntervalDay) {
			this.toIntervalDay = toIntervalDay;
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

		public Integer getPayTimeout() {
			return payTimeout;
		}

		public void setPayTimeout(Integer payTimeout) {
			this.payTimeout = payTimeout;
		}

		public List<FlightPo> getList() {
			return list;
		}

		public void setList(List<FlightPo> list) {
			this.list = list;
		}

		public boolean isDayFlay() {
			return dayFlay;
		}
		public void setDayFlay(boolean dayFlay) {
			this.dayFlay = dayFlay;
		}
		public Long getSeconds() {
			if(this.getPayOverTime() != null){
				seconds = this.getPayOverTime().getTime();
			}
			return seconds;
		}

		public void setSeconds(Long seconds) {
			this.seconds = seconds;
		}
}
