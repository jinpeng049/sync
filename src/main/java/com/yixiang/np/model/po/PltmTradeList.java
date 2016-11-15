package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "pltm_trade_list")
public class PltmTradeList implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Integer COLUMN_TRADETYPE_VALUE_FARE = 0;//交易类型 票款

    public static final Integer COLUMN_TRADETYPE_VALUE_DEPOSIT = 1;//交易类型 押金

    public static final Integer COLUMN_TRADETYPE_VALUE_WITHDRAWALS = 2;//交易类型 提现

    public static final Integer COLUMN_TRADETYPE_VALUE_RECHARGE = 3;//交易类型 充值

    public static final Integer COLUMN_TRADETYPE_VALUE_UNFREEZE = 4;//交易类型 押金解冻

    public static final Integer COLUMN_PAYTYPE_VALUE_OFFLINE = 0;//支付方式 线下支付

    public static final Integer COLUMN_STATUS_VALUE_FAIL = -1;//审核状态 未通过

    public static final Integer COLUMN_STATUS_VALUE_PENDING = 0;//审核状态 待审核

    public static final Integer COLUMN_STATUS_VALUE_TRUE = 1;//审核状态 已充值/待支付

    public static final Integer COLUMN_STATUS_VALUE_ALREADYPAID = 2;//审核状态 已付款


    /***/
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 支付单号
     */
    @Column(name = "pay_order_number")
    private String payOrderNumber;

    /**
     * 交易类型（0-票款,1-押金,2-提现,3-充值）
     */
    @Column(name = "trade_type")
    private Integer tradeType;

    /**
     * 收入
     */
    @Column(name = "income")
    private Double income;

    /**
     * 支出
     */
    @Column(name = "cost")
    private Double cost;

    /**
     * 账户余额
     */
    @Column(name = "account_balance")
    private Double accountBalance;

    /**
     * 账号
     */
    @Column(name = "account_number")
    private String accountNumber;

    /**
     * 账户名称
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 合同号
     */
    @Column(name = "contract_no")
    private String contractNo;

    /**
     * 支付方式（0-线下支付）
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 审核状态（-1-未通过,0-待审核,1-已充值/待支付,2-已付款）
     */
    @Column(name = "status")
    private Integer status;

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

    /***/
    @Column(name = "remark")
    private String remark;

    /**
     * 组织id
     */
    @Column(name = "organization_id")
    private Long organizationId;

    /***/
    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "money")
    private Double money;

    @Column(name = "freeze_amount")
    private Double freezeAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
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

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Double freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmTradeList{");
        sb.append("id=").append(id);
        sb.append(", payOrderNumber='").append(payOrderNumber).append('\'');
        sb.append(", tradeType=").append(tradeType);
        sb.append(", income=").append(income);
        sb.append(", cost=").append(cost);
        sb.append(", accountBalance=").append(accountBalance);
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", accountName='").append(accountName).append('\'');
        sb.append(", contractNo='").append(contractNo).append('\'');
        sb.append(", payType=").append(payType);
        sb.append(", status=").append(status);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", organizationId=").append(organizationId);
        sb.append(", organizationName='").append(organizationName).append('\'');
        sb.append(", money=").append(money);
        sb.append(", freezeAmount=").append(freezeAmount);
        sb.append('}');
        return sb.toString();
    }
}