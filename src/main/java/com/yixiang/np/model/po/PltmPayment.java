package com.yixiang.np.model.po;

import java.io.Serializable;
import java.util.Date;


public class PltmPayment implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Integer COLUMN_STATUS_VALUE_TOBE_CHECK = 0;//0-收款待审核

    public static final Integer COLUMN_STATUS_VALUE_RECEIVE_MONEY = 1;//1-已收款

    /***/
    private Long id;

    /**
     * 支付编号
     */
    private String payNo;

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
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付用户
     */
    private Integer payUserid;

    /**
     * 支付方式
     */
    private Integer payType;

    /**
     * 支付备注
     */
    private String payRemarks;

    /**
     * 审核人
     */
    private Integer auditUserid;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核备注
     */
    private String auditRemarks;

    /**
     * 财务状态（0-收款待审核,1-已收款）
     */
    private Integer status;

    /**
     * 创建人
     */
    private Integer createUserid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改人
     */
    private Integer lastUpdateUserid;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

    /**
     * 订单编号 多个
     */
    public String orderNumbers;
    
    public Integer financeStatus;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayUserid() {
        return payUserid;
    }

    public void setPayUserid(Integer payUserid) {
        this.payUserid = payUserid;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayRemarks() {
        return payRemarks;
    }

    public void setPayRemarks(String payRemarks) {
        this.payRemarks = payRemarks;
    }

    public Integer getAuditUserid() {
        return auditUserid;
    }

    public void setAuditUserid(Integer auditUserid) {
        this.auditUserid = auditUserid;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
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

	public String getOrderNumbers() {
		return orderNumbers;
	}

	public void setOrderNumbers(String orderNumbers) {
		this.orderNumbers = orderNumbers;
	}

	public Integer getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(Integer financeStatus) {
		this.financeStatus = financeStatus;
	}
    
}