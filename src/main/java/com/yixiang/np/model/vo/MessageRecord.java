package com.yixiang.np.model.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/10/20.
 */
public class MessageRecord implements Serializable {

    public static final Integer RECHARGE = 1;//充值审核
    public static final Integer WITHDRAWALS = 2;//提现审核
    public static final Integer FARE_PAY = 3;//票款付款
    public static final Integer DEPOSIT = 4;//押金付款
    public static final Integer CONTRACTAUDIT = 5;//合同审核
    public static final Integer CONTRACT_STOP = 6;//合同终止
    public static final Integer CONTRACT_CANCLE = 7;//合同取消
    public static final Integer TICKETING_SUCCESS = 8;//合同出票完成

    /**
     * 操作类型
     */
    private Integer type;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    private Integer tradeType;

    /**
     * 状态
     */
    private String status;

    /**
     * 各种消息的数量
     */
    private Integer count;

    /**
     * 组织id
     */
    private Integer createUser;

    /**
     * 组织id
     */
    private Integer purchase;

    public MessageRecord() {
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MessageRecord{");
        sb.append("type=").append(type);
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", tradeType=").append(tradeType);
        sb.append(", status='").append(status).append('\'');
        sb.append(", count=").append(count);
        sb.append(", createUser=").append(createUser);
        sb.append(", purchase=").append(purchase);
        sb.append('}');
        return sb.toString();
    }
}
