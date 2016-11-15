package com.yixiang.np.model.po;

import java.io.Serializable;
import java.util.Date;


public class PltmTradeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final Integer COLUMN_BUSTYPE_VALUE_RECEIVABLE = 1; //供应商应收记录

    public static final Integer COLUMN_BUSTYPE_VALUE_STAY_PRESENT = 2; //供应商待提现记录

    public static final Integer COLUMN_BUSTYPE_VALUE_ALREADY_MENTIONED = 4; //供应商提现记录

    public static final Integer COLUMN_PAYTYPE_VALUE_AR = 1; //支付类型（应收）
    public static final Integer COLUMN_PAYTYPE_VALUE_AP = -1; //支付类型（应付）


    /***/
    private Long id;

    /**
     * 付款方id
     */
    private Integer payerId;

    /**
     * 付款方名称
     */
    private String payerName;

    /**
     * 收款人id
     */
    private Integer receiverId;

    /**
     * 收款人姓名
     */
    private String receiverName;

    /**
     * 金额
     */
    private Double money;

    /**
     * 操作人
     */
    private Integer operateUser;

    /**
     * 操作时间
     */
    private Date operateTime;

    /**
     * 商户类型（1-供应商应收记录,2-供应商待提现记录,4-供应商提现记录）
     */
    private Integer busType;

    /**
     * 支付类型（1-应收,-1-应付）
     */
    private Integer payType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPayerId() {
        return payerId;
    }

    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(Integer operateUser) {
        this.operateUser = operateUser;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getBusType() {
        return busType;
    }

    public void setBusType(Integer busType) {
        this.busType = busType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmTradeDetail{");
        sb.append("id=").append(id);
        sb.append(", payerId=").append(payerId);
        sb.append(", payerName='").append(payerName).append('\'');
        sb.append(", receiverId=").append(receiverId);
        sb.append(", receiverName='").append(receiverName).append('\'');
        sb.append(", money=").append(money);
        sb.append(", operateUser='").append(operateUser).append('\'');
        sb.append(", operateTime=").append(operateTime);
        sb.append(", busType=").append(busType);
        sb.append(", payType=").append(payType);
        sb.append('}');
        return sb.toString();
    }
}
