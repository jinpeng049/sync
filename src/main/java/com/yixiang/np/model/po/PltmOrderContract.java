package com.yixiang.np.model.po;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "pltm_order_contract")
public class PltmOrderContract implements Serializable {
    private static final long serialVersionUID = 1L;

    /***/
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 合同编号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * PSS合同编号
     */
    @Column(name = "pss_contract_no")
    private String pssContractNo;

    /**
     * 航线ID
     */
    @Column(name = "route_id")
    private Long routeId;

    /**
     * 出发航班号
     */
    @Column(name = "dept_flight")
    private String deptFlight;

    /**
     * 回程航班号
     */
    @Column(name = "arr_flight")
    private String arrFlight;

    /**
     * 切位方式1硬切 2软切
     */
    @Column(name = "charter_type")
    private String charterType;

    /**
     * 座位类型
     */
    @Column(name = "seat_class")
    private String seatClass;

    /**
     * 出发机场
     */
    @Column(name = "dept_airport")
    private String deptAirport;

    /**
     * 回程机场
     */
    @Column(name = "arr_airport")
    private String arrAirport;

    /**
     * 出发机场三字码
     */
    @Column(name = "dept_airportcode")
    private String deptAirportcode;

    /**
     * 回程机场三字码
     */
    @Column(name = "arr_airportcode")
    private String arrAirportcode;

    /**
     * 出发起飞时刻
     */
    @Column(name = "dept_starttime")
    private String deptStarttime;

    /**
     * 出发到达时刻
     */
    @Column(name = "dept_endtime")
    private String deptEndtime;

    /**
     * 回程起飞时刻
     */
    @Column(name = "arr_starttime")
    private String arrStarttime;

    /**
     * 回程到达时刻
     */
    @Column(name = "arr_endtime")
    private String arrEndtime;

    /**
     * 出发间隔天数
     */
    @Column(name = "dept_intervalday")
    private Integer deptIntervalday;

    /**
     * 回程间隔天数
     */
    @Column(name = "arr_intervalday")
    private Integer arrIntervalday;

    /**
     * 座位数
     */
    @Column(name = "seat_count")
    private Integer seatCount;

    /**
     * 航班数
     */
    @Column(name = "flight_count")
    private Integer flightCount;

    /**
     * 总价
     */
    @Column(name = "total_price")
    private Double totalPrice;

    /**
     * 押金
     */
    @Column(name = "deposit")
    private Double deposit;

    /**
     * 支付到期时间
     */
    @Column(name = "pay_overtime")
    private Date payOvertime;

    /**
     * 出票到期时间
     */
    @Column(name = "ticket_overtime")
    private Date ticketOvertime;

    /**
     * 合同订单状态1.待审核2.待支付3.押金已收4.合同中止5.合同完成6.合同退回7.合同取消
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 采购商ID
     */
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 采购商名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /***/
    @Column(name = "create_userid")
    private Integer createUserid;

    /***/
    @Column(name = "create_time")
    private Date createTime;

    /***/
    @Column(name = "last_modifytime")
    private Date lastModifytime;

    @Column(name = "supplier_id")
    private Integer supplierId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getPssContractNo() {
        return pssContractNo;
    }

    public void setPssContractNo(String pssContractNo) {
        this.pssContractNo = pssContractNo;
    }

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getDeptFlight() {
        return deptFlight;
    }

    public void setDeptFlight(String deptFlight) {
        this.deptFlight = deptFlight;
    }

    public String getArrFlight() {
        return arrFlight;
    }

    public void setArrFlight(String arrFlight) {
        this.arrFlight = arrFlight;
    }

    public String getCharterType() {
        return charterType;
    }

    public void setCharterType(String charterType) {
        this.charterType = charterType;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getDeptAirport() {
        return deptAirport;
    }

    public void setDeptAirport(String deptAirport) {
        this.deptAirport = deptAirport;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getDeptAirportcode() {
        return deptAirportcode;
    }

    public void setDeptAirportcode(String deptAirportcode) {
        this.deptAirportcode = deptAirportcode;
    }

    public String getArrAirportcode() {
        return arrAirportcode;
    }

    public void setArrAirportcode(String arrAirportcode) {
        this.arrAirportcode = arrAirportcode;
    }

    public String getDeptStarttime() {
        return deptStarttime;
    }

    public void setDeptStarttime(String deptStarttime) {
        this.deptStarttime = deptStarttime;
    }

    public String getDeptEndtime() {
        return deptEndtime;
    }

    public void setDeptEndtime(String deptEndtime) {
        this.deptEndtime = deptEndtime;
    }

    public String getArrStarttime() {
        return arrStarttime;
    }

    public void setArrStarttime(String arrStarttime) {
        this.arrStarttime = arrStarttime;
    }

    public String getArrEndtime() {
        return arrEndtime;
    }

    public void setArrEndtime(String arrEndtime) {
        this.arrEndtime = arrEndtime;
    }

    public Integer getDeptIntervalday() {
        return deptIntervalday;
    }

    public void setDeptIntervalday(Integer deptIntervalday) {
        this.deptIntervalday = deptIntervalday;
    }

    public Integer getArrIntervalday() {
        return arrIntervalday;
    }

    public void setArrIntervalday(Integer arrIntervalday) {
        this.arrIntervalday = arrIntervalday;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Integer getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Date getPayOvertime() {
        return payOvertime;
    }

    public void setPayOvertime(Date payOvertime) {
        this.payOvertime = payOvertime;
    }

    public Date getTicketOvertime() {
        return ticketOvertime;
    }

    public void setTicketOvertime(Date ticketOvertime) {
        this.ticketOvertime = ticketOvertime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifytime() {
        return lastModifytime;
    }

    public void setLastModifytime(Date lastModifytime) {
        this.lastModifytime = lastModifytime;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public PltmOrderContract() {
    }


    public PltmOrderContract(String contractNo, Integer status) {
        this.contractNo = contractNo;
        this.status = status;
    }

    public PltmOrderContract(String contractNo, Date payOvertime, Integer status, Double deposit) {
        this.contractNo = contractNo;
        this.payOvertime = payOvertime;
        this.status = status;
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmOrderContract{");
        sb.append("id=").append(id);
        sb.append(", contractNo='").append(contractNo).append('\'');
        sb.append(", pssContractNo='").append(pssContractNo).append('\'');
        sb.append(", routeId=").append(routeId);
        sb.append(", deptFlight='").append(deptFlight).append('\'');
        sb.append(", arrFlight='").append(arrFlight).append('\'');
        sb.append(", charterType='").append(charterType).append('\'');
        sb.append(", seatClass='").append(seatClass).append('\'');
        sb.append(", deptAirport='").append(deptAirport).append('\'');
        sb.append(", arrAirport='").append(arrAirport).append('\'');
        sb.append(", deptAirportcode='").append(deptAirportcode).append('\'');
        sb.append(", arrAirportcode='").append(arrAirportcode).append('\'');
        sb.append(", deptStarttime='").append(deptStarttime).append('\'');
        sb.append(", deptEndtime='").append(deptEndtime).append('\'');
        sb.append(", arrStarttime='").append(arrStarttime).append('\'');
        sb.append(", arrEndtime='").append(arrEndtime).append('\'');
        sb.append(", deptIntervalday=").append(deptIntervalday);
        sb.append(", arrIntervalday=").append(arrIntervalday);
        sb.append(", seatCount=").append(seatCount);
        sb.append(", flightCount=").append(flightCount);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", deposit=").append(deposit);
        sb.append(", payOvertime=").append(payOvertime);
        sb.append(", ticketOvertime=").append(ticketOvertime);
        sb.append(", status=").append(status);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", createUserid=").append(createUserid);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifytime=").append(lastModifytime);
        sb.append(", supplierId=").append(supplierId);
        sb.append('}');
        return sb.toString();
    }


}