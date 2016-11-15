package com.yixiang.np.model.po;

import java.io.Serializable;
import java.util.Date;

public class PltmCash implements Serializable {

    private static final long serialVersionUID = 1L;

    /***/
    private Integer id;

    /**支付单号*/
    private String cashNo;

    /**支付金额*/
    private Double cashMoney;

    /**支付时间*/
    private Date cashTime;

    /**提现数量（订单人数总和）*/
    private Integer cashCount;

    /**开户行*/
    private String accountBank;

    /**户名*/
    private String accountName;

    /**卡号*/
    private String accountCard;

    /**提现申请人*/
    private Integer cashUserid;

    /**提现审核人*/
    private Integer auditUserid;

    /**审核时间*/
    private Date auditDate;

    /**审核意见*/
    private String auditRemarks;

    /**财务状态（提现待审核 - 4  提现待支付 -5  关闭状态 - 3  已付款 -6*/
    private Integer status;

    /**创建用户*/
    private Integer createUserid;

    /**创建时间*/
    private Date createTime;

    /**支付类型*/
    private Integer paymentType;

    /**银行*/
    private String paymentBank;

    /**单号*/
    private String paymentNo;

    /**支付时间*/
    private Date paymentTime;

    /**支付备注*/
    private String paymentRemarks;

    /**最后修改人*/
    private Integer lastUpdateUserid;

    /**最后修改时间*/
    private Date lastUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCashNo() {
        return cashNo;
    }

    public void setCashNo(String cashNo) {
        this.cashNo = cashNo;
    }

    public Double getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(Double cashMoney) {
        this.cashMoney = cashMoney;
    }

    public Date getCashTime() {
        return cashTime;
    }

    public void setCashTime(Date cashTime) {
        this.cashTime = cashTime;
    }

    public Integer getCashCount() {
        return cashCount;
    }

    public void setCashCount(Integer cashCount) {
        this.cashCount = cashCount;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountCard() {
        return accountCard;
    }

    public void setAccountCard(String accountCard) {
        this.accountCard = accountCard;
    }

    public Integer getCashUserid() {
        return cashUserid;
    }

    public void setCashUserid(Integer cashUserid) {
        this.cashUserid = cashUserid;
    }

    public Integer getAuditUserid() {
        return auditUserid;
    }

    public void setAuditUserid(Integer auditUserid) {
        this.auditUserid = auditUserid;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditRemarks() {
        return auditRemarks;
    }

    public void setAuditRemarks(String auditRemarks) {
        this.auditRemarks = auditRemarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentBank() {
        return paymentBank;
    }

    public void setPaymentBank(String paymentBank) {
        this.paymentBank = paymentBank;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentRemarks() {
        return paymentRemarks;
    }

    public void setPaymentRemarks(String paymentRemarks) {
        this.paymentRemarks = paymentRemarks;
    }

    public Integer getLastUpdateUserid() {
        return lastUpdateUserid;
    }

    public void setLastUpdateUserid(Integer lastUpdateUserid) {
        this.lastUpdateUserid = lastUpdateUserid;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

}