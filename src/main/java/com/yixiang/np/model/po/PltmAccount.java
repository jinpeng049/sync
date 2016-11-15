package com.yixiang.np.model.po;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "pltm_account")
public class PltmAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Integer COLUMN_TYPE_VALUE_SUPPLIER = 0; //0-供应商
    public static final Integer COLUMN_TYPE_VALUE_PLATFORM = 1; //1-平台账户
    public static final Integer COLUMN_TYPE_VALUE_PURCHASER = 2; //2-采购商

    /***/
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户类型（0-供应商,1-平台账户,2-采购商）
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 账户
     */
    @Column(name = "account_number")
    private String accountNumber;

    /**
     * 名称
     */
    @Column(name = "account_name")
    private String accountName;

    /**
     * 金额
     */
    @Column(name = "money")
    private Double money;

    /**
     * 应收金额
     */
    @Column(name = "receivable")
    private Double receivable;

    /**
     * 待提现金额
     */
    @Column(name = "stay_present")
    private Double stayPresent;

    /**
     * 已提现金额
     */
    @Column(name = "already_mentioned")
    private Double alreadyMentioned;

    /**
     * 商户id
     */
    @Column(name = "organization_id")
    private Integer organizationId;

    /**
     * 商户名称
     */
    @Column(name = "organization_name")
    private String organizationName;

    /**
     * 冻结金额
     */
    @Column(name = "freeze_amount")
    private Double freezeAmount;

    /**
     * 可用余额
     */
    @Column(name = "available_balance")
    private Double availableBalance;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getReceivable() {
        return receivable;
    }

    public void setReceivable(Double receivable) {
        this.receivable = receivable;
    }

    public Double getStayPresent() {
        return stayPresent;
    }

    public void setStayPresent(Double stayPresent) {
        this.stayPresent = stayPresent;
    }

    public Double getAlreadyMentioned() {
        return alreadyMentioned;
    }

    public void setAlreadyMentioned(Double alreadyMentioned) {
        this.alreadyMentioned = alreadyMentioned;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Double getFreezeAmount() {
        return freezeAmount;
    }

    public void setFreezeAmount(Double freezeAmount) {
        this.freezeAmount = freezeAmount;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
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

    public PltmAccount() {
    }

    public PltmAccount(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmAccount{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", accountName='").append(accountName).append('\'');
        sb.append(", money=").append(money);
        sb.append(", receivable=").append(receivable);
        sb.append(", stayPresent=").append(stayPresent);
        sb.append(", alreadyMentioned=").append(alreadyMentioned);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", organizationName='").append(organizationName).append('\'');
        sb.append(", freezeAmount=").append(freezeAmount);
        sb.append(", availableBalance=").append(availableBalance);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append('}');
        return sb.toString();
    }
}