package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "pltm_order_log")
public class OrderLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /***/
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 操作人
     */
    @Column(name = "operate_userid")
    private Integer operateUserid;

    /**
     * 操作角色
     */
    @Column(name = "operate_role")
    private String operateRole;

    /**
     * 操作时间
     */
    @Column(name = "operate_time")
    private Date operateTime;

    /**
     * 操作类型
     */
    @Column(name = "operate_state")
    private String operateState;

    /**
     * 备注
     */
    @Column(name = "remarks")
    private String remarks;

    @Column(name = "operate_name")
    private String operateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOperateUserid() {
        return operateUserid;
    }

    public void setOperateUserid(Integer operateUserid) {
        this.operateUserid = operateUserid;
    }

    public String getOperateRole() {
        return operateRole;
    }

    public void setOperateRole(String operateRole) {
        this.operateRole = operateRole;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateState() {
        return operateState;
    }

    public void setOperateState(String operateState) {
        this.operateState = operateState;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderLog{");
        sb.append("id=").append(id);
        sb.append(", orderNo='").append(orderNo).append('\'');
        sb.append(", operateUserid=").append(operateUserid);
        sb.append(", operateRole='").append(operateRole).append('\'');
        sb.append(", operateTime=").append(operateTime);
        sb.append(", operateState='").append(operateState).append('\'');
        sb.append(", remarks='").append(remarks).append('\'');
        sb.append(", operateName='").append(operateName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}