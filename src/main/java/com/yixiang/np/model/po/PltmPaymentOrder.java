package com.yixiang.np.model.po;

import java.io.Serializable;


public class PltmPaymentOrder implements Serializable {
    private static final long serialVersionUID = 1L;

    /***/
    private Long id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 支付编号
     */
    private String payNo;

    /**
     * 备注
     */
    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}