package com.yixiang.np.model.po;

import com.yixiang.np.utils.DateUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by pengpeng on 16-9-20.
 */
public class PaymentDetail implements Serializable {

    /**
     * 订单id
     */
    private Long pltmOrderId;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * pss 订单号
     */
    private String pssOrderNumber;

    /**
     * 采购商
     */
    private String buyOrganName;

    /**
     * 供应商
     */
    private String saleOrganName;

    /**
     * 供应商 id
     */
    private Long saleOrganId;

    /**
     * 支付金额
     */
    private Double payPrice;

    /**
     * 采购人数
     */
    private Integer purchQuantity;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 订单状态(0-待支付,1-待审核,2-待出票,3-出票中,4,出票完成)
     */
    private Integer orderStatus;

    /**
     * 财务状态(1-收款待审核,2-已收款,3-待提现,4-提现待审核,5-提现待支付,6-已付款)
     */
    private Integer financeStatus;

    /**
     * 订单描述
     */
    private String orderRemark;


    /**
     * 支付账户
     */
    private String payName;

    /**
     * 支付账号
     */
    private String payAccount;

    /**
     * 支付金额
     */
    private Double payMoney;

    /**
     * 审核备注
     */
    private String auditRemarks;

    /**
     * 收款结算单号
     */
    private String payNo;

    /**
     * 收款核算id
     */
    private Long pltmPaymentId;

    public PaymentDetail() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PaymentDetail{");
        sb.append("pltmOrderId=").append(pltmOrderId);
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", pssOrderNumber='").append(pssOrderNumber).append('\'');
        sb.append(", buyOrganName='").append(buyOrganName).append('\'');
        sb.append(", saleOrganName='").append(saleOrganName).append('\'');
        sb.append(", saleOrganId=").append(saleOrganId);
        sb.append(", payPrice=").append(payPrice);
        sb.append(", purchQuantity=").append(purchQuantity);
        sb.append(", payTime=").append(payTime);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", financeStatus=").append(financeStatus);
        sb.append(", orderRemark='").append(orderRemark).append('\'');
        sb.append(", payName='").append(payName).append('\'');
        sb.append(", payAccount='").append(payAccount).append('\'');
        sb.append(", payMoney=").append(payMoney);
        sb.append(", auditRemarks='").append(auditRemarks).append('\'');
        sb.append(", pltmPaymentId=").append(pltmPaymentId);
        sb.append('}');
        return sb.toString();
    }

    public Long getPltmOrderId() {
        return pltmOrderId;
    }

    public void setPltmOrderId(Long pltmOrderId) {
        this.pltmOrderId = pltmOrderId;
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

    public String getBuyOrganName() {
        return buyOrganName;
    }

    public void setBuyOrganName(String buyOrganName) {
        this.buyOrganName = buyOrganName;
    }

    public String getSaleOrganName() {
        return saleOrganName;
    }

    public void setSaleOrganName(String saleOrganName) {
        this.saleOrganName = saleOrganName;
    }

    public Long getSaleOrganId() {
        return saleOrganId;
    }

    public void setSaleOrganId(Long saleOrganId) {
        this.saleOrganId = saleOrganId;
    }

    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getPurchQuantity() {
        return purchQuantity;
    }

    public void setPurchQuantity(Integer purchQuantity) {
        this.purchQuantity = purchQuantity;
    }

    public String getPayTime() {
        return DateUtil.DateToString(payTime, "yyyy-MM-dd HH:mm:ss");
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getFinanceStatus() {
        return financeStatus;
    }

    public void setFinanceStatus(Integer financeStatus) {
        this.financeStatus = financeStatus;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
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

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getAuditRemarks() {
        return auditRemarks;
    }

    public void setAuditRemarks(String auditRemarks) {
        this.auditRemarks = auditRemarks;
    }

    public Long getPltmPaymentId() {
        return pltmPaymentId;
    }

    public void setPltmPaymentId(Long pltmPaymentId) {
        this.pltmPaymentId = pltmPaymentId;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
}
