package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by wangwei on 2016年10月11日.
 */
public class TradeRecordVo {

    private Long id;
    private Date createTime;
    private Integer status;
    private String payOrderNumber;
    private String remark;
    private String name;
    private Double cost;
    private Double income;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayOrderNumber() {
        return payOrderNumber;
    }

    public void setPayOrderNumber(String payOrderNumber) {
        this.payOrderNumber = payOrderNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TradeRecordVo{");
        sb.append("id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", payOrderNumber='").append(payOrderNumber).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", income=").append(income);
        sb.append('}');
        return sb.toString();
    }
}
