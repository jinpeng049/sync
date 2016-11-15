package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class PltmTradeListVo implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Integer RECHAGE = 0;// 充值前
    public static final Integer RECHAGE_SUCCESS = 1;// 充值通过
    public static final Integer RECHAGE_FAIL = 2;// 充值不通过
    public static final Integer WITHDRAW = 3;// 提现申请
    public static final Integer WITHDRAW_SUCCESS = 4;// 提现通过
    public static final Integer WITHDRAW_FAIL = 5;// 提现不通过
    public static final Integer PIAOKUAN = 6;// 票款
    public static final Integer DESPOSIT = 7;// 押金
    public static final Integer UNFREEZE = 8;// 押金解冻

    /***/
    private Long id;

    /**
     * 支付单号
     */
    private String payOrderNumber;

    /**
     * 交易类型（0-票款,1-押金,2-提现,3-充值）
     */
    private Integer tradeType;

    /**
     * 收入
     */
    private Double income;

    /**
     * 支出
     */
    private Double cost;

    /**
     * 账户余额
     */
    private Double accountBalance;

    /**
     * 支付方式（0-线下支付）
     */
    private Integer payType;

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

    /***/
    private String remark;

    /**
     * 账号
     */
    private String accountNumber;

    /**
     * 账户名称
     **/
    private String accountName;

    private Long organizationId;

    /**
     * 冻结金额
     */
    private Double freezeAmount;

    /**
     * 可用余额
     */
    private Double availableBalance;

    /**
     * 账户金额
     */
    private Double money;

    /**
     * 审核状态（0-未通过,1-通过）
     */

    private Integer status;

    /**
     * 商户名称
     */
    private String organizationName;

    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行卡号
     */
    private String bankCard;
    /**
     * 持卡人
     */
    private String bankUser;

    /**
     * 合同号
     */
    private String contractNo;

    /**
     * 出发机场
     */
    private String deptAirPort;

    /**
     * 产品列表（产品日期段拼接的字符串）
     */
    private String productList;

    /**
     * 到达机场
     */
    private String arrAirport;

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

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
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

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getDeptAirPort() {
        return deptAirPort;
    }

    public void setDeptAirPort(String deptAirPort) {
        this.deptAirPort = deptAirPort;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmTradeListVo{");
        sb.append("id=").append(id);
        sb.append(", payOrderNumber='").append(payOrderNumber).append('\'');
        sb.append(", tradeType=").append(tradeType);
        sb.append(", income=").append(income);
        sb.append(", cost=").append(cost);
        sb.append(", accountBalance=").append(accountBalance);
        sb.append(", payType=").append(payType);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", accountName='").append(accountName).append('\'');
        sb.append(", organizationId=").append(organizationId);
        sb.append(", freezeAmount=").append(freezeAmount);
        sb.append(", availableBalance=").append(availableBalance);
        sb.append(", money=").append(money);
        sb.append(", status=").append(status);
        sb.append(", organizationName='").append(organizationName).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append(", bankCard='").append(bankCard).append('\'');
        sb.append(", bankUser='").append(bankUser).append('\'');
        sb.append(", contractNo='").append(contractNo).append('\'');
        sb.append(", deptAirPort='").append(deptAirPort).append('\'');
        sb.append(", productList='").append(productList).append('\'');
        sb.append(", arrAirport='").append(arrAirport).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
