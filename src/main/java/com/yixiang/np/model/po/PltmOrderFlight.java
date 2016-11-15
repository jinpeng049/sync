package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class PltmOrderFlight implements Serializable {

    private static final long serialVersionUID = 1L;

    /***/
    private Long id;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 航班ID
     */
    private Integer flightId;

    /**
     * 航班号
     */
    private String flightNumber;

    /**
     * 第几航段(1-第一航段,2-第二航段,3-第三航段)
     */
    private Integer flightSegment;

    /**
     * 出发城市
     */
    private String departureCity;

    /**
     * 到达城市
     */
    private String arrivalCity;

    /**
     * 间隔天数
     */
    private Integer intervalDay;

    /**
     * 出发日期(yyyy-MM-dd)
     */
    private Date departureDate;

    /**
     * 出发时刻
     */
    private String departureTime;

    /**
     * 到达时刻
     */
    private String arrivalTime;

    /**
     * 舱位
     */
    private String cabin;

    /**
     * 出发航站楼
     */
    private String departureTerminal;

    /**
     * 到达航站楼
     */
    private String arrivalTerminal;

    /**
     * 创建人
     */
    private Integer createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date lastModifyTime;

    /**
     * 最后修改人
     */
    private Integer lastModifyPerson;

    /**
     * 出发机场三字码
     **/
    private String departureCode;

    /**
     * 到达机场三字码
     **/
    private String arrivalCode;
    

    public PltmOrderFlight() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightSegment(Integer flightSegment) {
        this.flightSegment = flightSegment;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setIntervalDay(Integer intervalDay) {
        this.intervalDay = intervalDay;
    }

    @JSONField(format = "yyyy-MM-dd")
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public void setDepartureTerminal(String departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public void setLastModifyPerson(Integer lastModifyPerson) {
        this.lastModifyPerson = lastModifyPerson;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Integer getFlightSegment() {
        return flightSegment;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public Integer getIntervalDay() {
        return intervalDay;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getCabin() {
        return cabin;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }

    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public Integer getLastModifyPerson() {
        return lastModifyPerson;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }
 
	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmOrderFlight{");
        sb.append("id=").append(id);
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", flightId=").append(flightId);
        sb.append(", flightNumber='").append(flightNumber).append('\'');
        sb.append(", flightSegment=").append(flightSegment);
        sb.append(", departureCity='").append(departureCity).append('\'');
        sb.append(", arrivalCity='").append(arrivalCity).append('\'');
        sb.append(", intervalDay=").append(intervalDay);
        sb.append(", departureDate=").append(departureDate);
        sb.append(", departureTime='").append(departureTime).append('\'');
        sb.append(", arrivalTime='").append(arrivalTime).append('\'');
        sb.append(", cabin='").append(cabin).append('\'');
        sb.append(", departureTerminal='").append(departureTerminal).append('\'');
        sb.append(", arrivalTerminal='").append(arrivalTerminal).append('\'');
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append(", departureCode='").append(departureCode).append('\'');
        sb.append(", arrivalCode='").append(arrivalCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

}