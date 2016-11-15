package com.yixiang.np.model.vo;

/**
 * Created by wangwei on 2016/9/8.
 */
public class EmailVo {
    private String emailTo;
    private String subject;
    private String template;

    private String orderNumber;
    private String payDate;
    private String ticketDate;
    private String deptAirlineNo;
    private String deptSeatClass;
    private String deptAirPort;
    private String deptArrAirPort;
    private String deptAirportCode;
    private String deptArrAirportCode;
    private String deptDate;
    private String deptTime;
    private String deptArrTime;
    private String deptIntervalDay;

    private String arrAirlineNo;
    private String arrSeatClass;
    private String arrAirPort;
    private String arrArrAirPort;
    private String arrAirportCode;
    private String arrArrAirportCode;
    private String arrDate;
    private String arrTime;
    private String arrArrTime;
    private String arrIntervalDay;

    private String unitPrice;
    private String purchQuantity;
    private String totalPrice;
    private String goDepartureTerminal;
    private String goArrivalTerminal;

    private String backDepartureTerminal;
    private String backArrivalTerminal;

    private Boolean isReturn = false;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getDeptAirlineNo() {
        return deptAirlineNo;
    }

    public void setDeptAirlineNo(String deptAirlineNo) {
        this.deptAirlineNo = deptAirlineNo;
    }

    public String getDeptSeatClass() {
        return deptSeatClass;
    }

    public void setDeptSeatClass(String deptSeatClass) {
        this.deptSeatClass = deptSeatClass;
    }

    public String getDeptDate() {
        return deptDate;
    }

    public void setDeptDate(String deptDate) {
        this.deptDate = deptDate;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(String deptTime) {
        this.deptTime = deptTime;
    }

    public String getDeptArrTime() {
        return deptArrTime;
    }

    public void setDeptArrTime(String deptArrTime) {
        this.deptArrTime = deptArrTime;
    }

    public String getArrAirlineNo() {
        return arrAirlineNo;
    }

    public void setArrAirlineNo(String arrAirlineNo) {
        this.arrAirlineNo = arrAirlineNo;
    }

    public String getArrSeatClass() {
        return arrSeatClass;
    }

    public void setArrSeatClass(String arrSeatClass) {
        this.arrSeatClass = arrSeatClass;
    }

    public String getArrDate() {
        return arrDate;
    }

    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getArrArrTime() {
        return arrArrTime;
    }

    public void setArrArrTime(String arrArrTime) {
        this.arrArrTime = arrArrTime;
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

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTemplate() {
        return template;
    }

    public Boolean getReturn() {
        return isReturn;
    }

    public void setReturn(Boolean aReturn) {
        isReturn = aReturn;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDeptArrAirportCode() {
        return deptArrAirportCode;
    }

    public void setDeptArrAirportCode(String deptArrAirportCode) {
        this.deptArrAirportCode = deptArrAirportCode;
    }

    public String getArrArrAirportCode() {
        return arrArrAirportCode;
    }

    public void setArrArrAirportCode(String arrArrAirportCode) {
        this.arrArrAirportCode = arrArrAirportCode;
    }

    public String getDeptAirPort() {
        return deptAirPort;
    }

    public void setDeptAirPort(String deptAirPort) {
        this.deptAirPort = deptAirPort;
    }

    public String getDeptArrAirPort() {
        return deptArrAirPort;
    }

    public void setDeptArrAirPort(String deptArrAirPort) {
        this.deptArrAirPort = deptArrAirPort;
    }

    public String getDeptAirportCode() {
        return deptAirportCode;
    }

    public void setDeptAirportCode(String deptAirportCode) {
        this.deptAirportCode = deptAirportCode;
    }

    public String getArrAirPort() {
        return arrAirPort;
    }

    public void setArrAirPort(String arrAirPort) {
        this.arrAirPort = arrAirPort;
    }

    public String getArrArrAirPort() {
        return arrArrAirPort;
    }

    public void setArrArrAirPort(String arrArrAirPort) {
        this.arrArrAirPort = arrArrAirPort;
    }

    public String getArrAirportCode() {
        return arrAirportCode;
    }

    public void setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
    }

    public String getDeptIntervalDay() {
        return deptIntervalDay;
    }

    public void setDeptIntervalDay(String deptIntervalDay) {
        this.deptIntervalDay = deptIntervalDay;
    }

    public String getArrIntervalDay() {
        return arrIntervalDay;
    }

    public void setArrIntervalDay(String arrIntervalDay) {
        this.arrIntervalDay = arrIntervalDay;
    }

    public String getGoDepartureTerminal() {
        return goDepartureTerminal;
    }

    public void setGoDepartureTerminal(String goDepartureTerminal) {
        this.goDepartureTerminal = goDepartureTerminal;
    }

    public String getGoArrivalTerminal() {
        return goArrivalTerminal;
    }

    public void setGoArrivalTerminal(String goArrivalTerminal) {
        this.goArrivalTerminal = goArrivalTerminal;
    }

    public String getBackDepartureTerminal() {
        return backDepartureTerminal;
    }

    public void setBackDepartureTerminal(String backDepartureTerminal) {
        this.backDepartureTerminal = backDepartureTerminal;
    }

    public String getBackArrivalTerminal() {
        return backArrivalTerminal;
    }

    public void setBackArrivalTerminal(String backArrivalTerminal) {
        this.backArrivalTerminal = backArrivalTerminal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EmailVo{");
        sb.append("emailTo='").append(emailTo).append('\'');
        sb.append(", subject='").append(subject).append('\'');
        sb.append(", template='").append(template).append('\'');
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", payDate='").append(payDate).append('\'');
        sb.append(", ticketDate='").append(ticketDate).append('\'');
        sb.append(", deptAirlineNo='").append(deptAirlineNo).append('\'');
        sb.append(", deptSeatClass='").append(deptSeatClass).append('\'');
        sb.append(", deptAirPort='").append(deptAirPort).append('\'');
        sb.append(", deptArrAirPort='").append(deptArrAirPort).append('\'');
        sb.append(", deptAirportCode='").append(deptAirportCode).append('\'');
        sb.append(", deptArrAirportCode='").append(deptArrAirportCode).append('\'');
        sb.append(", deptDate='").append(deptDate).append('\'');
        sb.append(", deptTime='").append(deptTime).append('\'');
        sb.append(", deptArrTime='").append(deptArrTime).append('\'');
        sb.append(", deptIntervalDay='").append(deptIntervalDay).append('\'');
        sb.append(", arrAirlineNo='").append(arrAirlineNo).append('\'');
        sb.append(", arrSeatClass='").append(arrSeatClass).append('\'');
        sb.append(", arrAirPort='").append(arrAirPort).append('\'');
        sb.append(", arrArrAirPort='").append(arrArrAirPort).append('\'');
        sb.append(", arrAirportCode='").append(arrAirportCode).append('\'');
        sb.append(", arrArrAirportCode='").append(arrArrAirportCode).append('\'');
        sb.append(", arrDate='").append(arrDate).append('\'');
        sb.append(", arrTime='").append(arrTime).append('\'');
        sb.append(", arrArrTime='").append(arrArrTime).append('\'');
        sb.append(", arrIntervalDay='").append(arrIntervalDay).append('\'');
        sb.append(", unitPrice='").append(unitPrice).append('\'');
        sb.append(", purchQuantity='").append(purchQuantity).append('\'');
        sb.append(", totalPrice='").append(totalPrice).append('\'');
        sb.append(", goDepartureTerminal='").append(goDepartureTerminal).append('\'');
        sb.append(", goArrivalTerminal='").append(goArrivalTerminal).append('\'');
        sb.append(", backDepartureTerminal='").append(backDepartureTerminal).append('\'');
        sb.append(", backArrivalTerminal='").append(backArrivalTerminal).append('\'');
        sb.append(", isReturn=").append(isReturn);
        sb.append('}');
        return sb.toString();
    }
}

  
