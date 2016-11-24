package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "pltm_order")
public class PltmOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final Integer COLUMN_ORDERSTATUS_TOBE_PAY = -1;//无状态  合同未支付

    public static final Integer COLUMN_ORDERSTATUS_TOBE_PAID = 0;//待支付

    //public static final Integer COLUMN_ORDERSTATUS_TOBE_CHECK = 1;//待审核

    public static final Integer COLUMN_ORDERSTATUS_TOBE_TICKETING = 2;//待出票

    //public static final Integer COLUMN_ORDERSTATUS_IS_TICKETING = 3;//出票中

    public static final Integer COLUMN_ORDERSTATUS_TICKETING_SUCCESS = 4;//出票完成

    public static final Integer COLUMN_ORDERSTATUS_TICKETING_CANCLE = 5;//取消

    public static final Integer COLUMN_PAYTIMEOUT_VALUE_FALSE = 0;//是否支付超时（0-未超时,1-超时）

    public static final Integer COLUMN_PAYTIMEOUT_VALUE_TRUE = 1;//是否支付超时（0-未超时,1-超时）


    public static final Integer ORDER_TYPE_FIT = 0;//0：散客
    public static final Integer ORDER_TYPE_CUT = 1;//:1：切位

    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * PSS订单号
     */
    @Column(name = "pss_order_number")
    private String pssOrderNumber;

    /**
     * PSS中运价ID
     */
    @Column(name = "pss_routing_fare_id")
    private Integer pssRoutingFareId;

    /**
     * 采购人数
     */
    @Column(name = "purch_quantity")
    private Integer purchQuantity;

    /**
     * 行程天数
     */
    @Column(name = "travel_days")
    private String travelDays;

    /**
     * 单价
     */
    @Column(name = "unit_price")
    private Double unitPrice;

    /**
     * 行李信息
     */
    @Column(name = "luggage_info")
    private String luggageInfo;

    /**
     * 出票时限
     */
    @Column(name = "ticket_limit_time")
    private Integer ticketLimitTime;

    /**
     * 支付金额
     */
    @Column(name = "pay_price")
    private Double payPrice;

    /**
     * 支付账户
     */
    @Column(name = "pay_name")
    private String payName;

    /**
     * 支付账号
     */
    @Column(name = "pay_account")
    private String payAccount;

    /***/
    @Column(name = "pay_user_id")
    private Integer payUserId;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 是否支付超时（0-未超时,1-超时）
     */
    @Column(name = "pay_time_out")
    private Integer payTimeOut;

    /**
     * 订单状态(0-待支付,1-待审核,2-待出票,3-出票中,4-出票成功,5-取消)
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "last_modify_time")
    private Date lastModifyTime;

    /**
     * 最后修改人
     */
    @Column(name = "last_modify_person")
    private Integer lastModifyPerson;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 去程--出发机场-（三字码）
     */
    @Column(name = "to_start_airport")
    private String toStartAirport;

    /**
     * 去程 --到达机场 --（三字码）
     */
    @Column(name = "to_end_airport")
    private String toEndAirport;

    /**
     * 去程起飞日期
     */
    @Column(name = "to_start_date")
    private Date toStartDate;

    /**
     * 名单上传时间
     */
    @Column(name = "passenger_uptime")
    private Date passengerUptime;

    /**
     * 出票时间
     */
    @Column(name = "ticket_outtime")
    private Date ticketOuttime;

    /**
     * 佣金比例
     */
    @Column(name = "charges")
    private Double charges;

    /**
     * 取消备注
     */
    @Column(name = "cancel_remarks")
    private String cancelRemarks;

    /**
     * 财务状态(1-收款待审核,2-已收款,3-待提现,4-提现待审核,5-提现待支付,6-已付款)
     */
    @Column(name = "finance_status")
    private Integer financeStatus;

    /**
     * 供应商ID
     */
    @Column(name = "supplier")
    private Integer supplier;

    /**
     * 供应商名称
     */
    @Column(name = "supplier_name")
    private String supplierName;

    /**
     * 采购商ID
     */
    @Column(name = "purchase")
    private Integer purchase;

    /**
     * 采购商名称
     */
    @Column(name = "purchase_name")
    private String purchaseName;

    /**
     * 合同编号（切位）
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 票损
     */
    @Column(name = "ticket_loss")
    private Double ticketLoss;

    /**
     * 出票率
     */
    @Column(name = "ticket_rate")
    private Double ticketRate;

    /**
     * 订单类型(0散客订单 1切位订单)
     */
    @Column(name = "order_type")
    private Integer orderType;
    /**
     * 上架产品ID
     */
    @Column(name = "product_id")
    private Integer productId;
    /**
     * 原始购买数量
     */
    @Column(name = "old_purch_quantity")
    private Integer oldPurchQuantity;
    /**
     * 原始单价
     */
    @Column(name = "old_unit_price")
    private Double oldUnitPrice;
    /**
     * 原始票损
     */
    @Column(name = "old_ticket_loss")
    private Double oldTicketLoss;
    /**
     * 原始出票率
     */
    @Column(name = "old_ticket_rate")
    private Double oldTicketRate;
    /**
     * 行程类型
     */
    @Column(name = "routing_type")
    private String routingType;

    /**
     * 支付超时时间
     *
     * @return
     */
    @Column(name = "pay_over_time")
    private Date payOverTime;

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

    public String getPssOrderNumber() {
        return pssOrderNumber;
    }

    public void setPssOrderNumber(String pssOrderNumber) {
        this.pssOrderNumber = pssOrderNumber;
    }

    public Integer getPssRoutingFareId() {
        return pssRoutingFareId;
    }

    public void setPssRoutingFareId(Integer pssRoutingFareId) {
        this.pssRoutingFareId = pssRoutingFareId;
    }

    public Integer getPurchQuantity() {
        return purchQuantity;
    }

    public void setPurchQuantity(Integer purchQuantity) {
        this.purchQuantity = purchQuantity;
    }

    public String getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(String travelDays) {
        this.travelDays = travelDays;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getLuggageInfo() {
        return luggageInfo;
    }

    public void setLuggageInfo(String luggageInfo) {
        this.luggageInfo = luggageInfo;
    }

    public Integer getTicketLimitTime() {
        return ticketLimitTime;
    }

    public void setTicketLimitTime(Integer ticketLimitTime) {
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

    public Integer getPayUserId() {
        return payUserId;
    }

    public void setPayUserId(Integer payUserId) {
        this.payUserId = payUserId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayTimeOut() {
        return payTimeOut;
    }

    public void setPayTimeOut(Integer payTimeOut) {
        this.payTimeOut = payTimeOut;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getLastModifyPerson() {
        return lastModifyPerson;
    }

    public void setLastModifyPerson(Integer lastModifyPerson) {
        this.lastModifyPerson = lastModifyPerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Date getToStartDate() {
        return toStartDate;
    }

    @JSONField(format = "yyyy-MM-dd")
    public void setToStartDate(Date toStartDate) {
        this.toStartDate = toStartDate;
    }

    public Date getPassengerUptime() {
        return passengerUptime;
    }

    public void setPassengerUptime(Date passengerUptime) {
        this.passengerUptime = passengerUptime;
    }

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

    public String getCancelRemarks() {
        return cancelRemarks;
    }

    public void setCancelRemarks(String cancelRemarks) {
        this.cancelRemarks = cancelRemarks;
    }

    public Integer getFinanceStatus() {
        return financeStatus;
    }

    public void setFinanceStatus(Integer financeStatus) {
        this.financeStatus = financeStatus;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
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


    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public PltmOrder() {
    }

    public PltmOrder(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getOldPurchQuantity() {
        return oldPurchQuantity;
    }

    public void setOldPurchQuantity(Integer oldPurchQuantity) {
        this.oldPurchQuantity = oldPurchQuantity;
    }

    public Double getOldUnitPrice() {
        return oldUnitPrice;
    }

    public void setOldUnitPrice(Double oldUnitPrice) {
        this.oldUnitPrice = oldUnitPrice;
    }

    public Double getOldTicketLoss() {
        return oldTicketLoss;
    }

    public void setOldTicketLoss(Double oldTicketLoss) {
        this.oldTicketLoss = oldTicketLoss;
    }

    public Double getOldTicketRate() {
        return oldTicketRate;
    }

    public void setOldTicketRate(Double oldTicketRate) {
        this.oldTicketRate = oldTicketRate;
    }


    public String getRoutingType() {
        return routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public Date getPayOverTime() {
        return payOverTime;
    }

    public void setPayOverTime(Date payOverTime) {
        this.payOverTime = payOverTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmOrder{");
        sb.append("id=").append(id);
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", pssOrderNumber='").append(pssOrderNumber).append('\'');
        sb.append(", pssRoutingFareId=").append(pssRoutingFareId);
        sb.append(", purchQuantity=").append(purchQuantity);
        sb.append(", travelDays='").append(travelDays).append('\'');
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", luggageInfo='").append(luggageInfo).append('\'');
        sb.append(", ticketLimitTime=").append(ticketLimitTime);
        sb.append(", payPrice=").append(payPrice);
        sb.append(", payName='").append(payName).append('\'');
        sb.append(", payAccount='").append(payAccount).append('\'');
        sb.append(", payUserId=").append(payUserId);
        sb.append(", payTime=").append(payTime);
        sb.append(", payTimeOut=").append(payTimeOut);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", toStartAirport='").append(toStartAirport).append('\'');
        sb.append(", toEndAirport='").append(toEndAirport).append('\'');
        sb.append(", toStartDate=").append(toStartDate);
        sb.append(", passengerUptime=").append(passengerUptime);
        sb.append(", ticketOuttime=").append(ticketOuttime);
        sb.append(", charges=").append(charges);
        sb.append(", cancelRemarks='").append(cancelRemarks).append('\'');
        sb.append(", financeStatus=").append(financeStatus);
        sb.append(", supplier=").append(supplier);
        sb.append(", supplierName='").append(supplierName).append('\'');
        sb.append(", purchase=").append(purchase);
        sb.append(", purchaseName='").append(purchaseName).append('\'');
        sb.append(", contractNo='").append(contractNo).append('\'');
        sb.append(", ticketLoss=").append(ticketLoss);
        sb.append(", ticketRate=").append(ticketRate);
        sb.append(", orderType=").append(orderType);
        sb.append(", productId=").append(productId);
        sb.append(", oldPurchQuantity=").append(oldPurchQuantity);
        sb.append(", oldUnitPrice=").append(oldUnitPrice);
        sb.append(", oldTicketLoss=").append(oldTicketLoss);
        sb.append(", oldTicketRate=").append(oldTicketRate);
        sb.append(", routingType='").append(routingType).append('\'');
        sb.append(", payOverTime=").append(payOverTime);
        sb.append('}');
        return sb.toString();
    }
}