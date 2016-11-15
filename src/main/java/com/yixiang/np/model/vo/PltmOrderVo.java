package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.yixiang.np.constant.Constant;
import com.yixiang.np.utils.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lishu on 2016/9/8.
 */
public class PltmOrderVo {
    private Integer id;
    private String pssOrderNumber;
    private String orderNumber;
    private String purchQuantity;
    private String travelDays;
    private String unitPrice;
    private String luggageInfo;
    private String ticketLimitTime;
    private Double payPrice;
    private String payName;
    private String payAccount;
    private String payTime;
    private String orderStatus;
    private Date createTime;
    private String createTimeStr;
    private String toStartAirport;
    private String toEndAirport;
    private String toStartAirportCode;
    private String toEndAirportCode;
    private String payEndTime;
    private String ticketEndTime;
    @JSONField(format = "yyyy-MM-dd")
    private Date toStartDate;
    private String financeStatus;
    private String supplier;
    private List<OrderFlightVo> flights;
    private Double ticketLoss;
    private Double ticketRate;

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

    public String getPurchQuantity() {
        return purchQuantity;
    }

    public void setPurchQuantity(String purchQuantity) {
        this.purchQuantity = purchQuantity;
    }

    public String getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(String travelDays) {
        this.travelDays = travelDays;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getLuggageInfo() {
        return luggageInfo;
    }

    public void setLuggageInfo(String luggageInfo) {
        this.luggageInfo = luggageInfo;
    }

    public String getTicketLimitTime() {
        return ticketLimitTime;
    }

    public void setTicketLimitTime(String ticketLimitTime) {
        this.ticketLimitTime = ticketLimitTime;
    }

    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getToStartAirport() {
        return toStartAirport;
    }

    public void setToStartAirport(String toStartAirport) {
        this.toStartAirport = toStartAirport;
    }

    public String getToEndAirport() {
        return toEndAirport;
    }

    public void setToEndAirport(String toEndAirport) {
        this.toEndAirport = toEndAirport;
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

    public List<OrderFlightVo> getFlights() {
        return flights;
    }

    public void setFlights(List<OrderFlightVo> flights) {
        this.flights = flights;
    }

    public String getCreateTimeStr() {
        createTimeStr = DateUtil.DateToString(createTime, "yyyy-MM-dd HH:mm:ss");
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getPayEndTime() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        payEndTime = sf.format(DateUtil.addDay(createTime, Constant.PAY_LIMIT_TIME));
        return payEndTime;
    }

    public void setPayEndTime(String payEndTime) {
        this.payEndTime = payEndTime;
    }

    public String getTicketEndTime() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        ticketEndTime = sf.format(DateUtil.addDay(toStartDate, Constant.TICKET_LIMIT_TIME));
        return ticketEndTime;
    }

    public void setTicketEndTime(String ticketEndTime) {
        this.ticketEndTime = ticketEndTime;
    }

    public String getPssOrderNumber() {
        return pssOrderNumber;
    }

    public void setPssOrderNumber(String pssOrderNumber) {
        this.pssOrderNumber = pssOrderNumber;
    }

    public Date getToStartDate() {
        return toStartDate;
    }

    public void setToStartDate(Date toStartDate) {
        this.toStartDate = toStartDate;
    }

    public String getFinanceStatus() {
        return financeStatus;
    }

    public void setFinanceStatus(String financeStatus) {
        this.financeStatus = financeStatus;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Double getTicketLoss() {
        return ticketLoss;
    }

    public void setTicketLoss(Double ticketLoss) {
        this.ticketLoss = ticketLoss;
    }

    public Double getTicketRate() {
        return ticketRate;
    }

    public void setTicketRate(Double ticketRate) {
        this.ticketRate = ticketRate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmOrderVo{");
        sb.append("id=").append(id);
        sb.append(", pssOrderNumber='").append(pssOrderNumber).append('\'');
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", purchQuantity='").append(purchQuantity).append('\'');
        sb.append(", travelDays='").append(travelDays).append('\'');
        sb.append(", unitPrice='").append(unitPrice).append('\'');
        sb.append(", luggageInfo='").append(luggageInfo).append('\'');
        sb.append(", ticketLimitTime='").append(ticketLimitTime).append('\'');
        sb.append(", payPrice=").append(payPrice);
        sb.append(", payName='").append(payName).append('\'');
        sb.append(", payAccount='").append(payAccount).append('\'');
        sb.append(", payTime='").append(payTime).append('\'');
        sb.append(", orderStatus='").append(orderStatus).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", createTimeStr='").append(createTimeStr).append('\'');
        sb.append(", toStartAirport='").append(toStartAirport).append('\'');
        sb.append(", toEndAirport='").append(toEndAirport).append('\'');
        sb.append(", toStartAirportCode='").append(toStartAirportCode).append('\'');
        sb.append(", toEndAirportCode='").append(toEndAirportCode).append('\'');
        sb.append(", payEndTime='").append(payEndTime).append('\'');
        sb.append(", ticketEndTime='").append(ticketEndTime).append('\'');
        sb.append(", toStartDate=").append(toStartDate);
        sb.append(", financeStatus='").append(financeStatus).append('\'');
        sb.append(", supplier='").append(supplier).append('\'');
        sb.append(", flights=").append(flights);
        sb.append(", ticketLoss=").append(ticketLoss);
        sb.append(", ticketRate=").append(ticketRate);
        sb.append('}');
        return sb.toString();
    }
}

  
