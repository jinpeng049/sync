package com.yixiang.np.model.vo;

import java.io.Serializable;

/**
 * Created by pengpeng on 16-9-12.
 */
public class SyncTicket implements Serializable {

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 乘机人证件类型
     */
    private Integer certificateType;

    /**
     * 乘机人证件号码
     */
    private String certificateNumber;

    /**
     * 票号
     */
    private String ticketNumber;

    public SyncTicket() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SyncTicket{");
        sb.append("orderId='").append(orderId).append('\'');
        sb.append(", certificateType=").append(certificateType);
        sb.append(", certificateNumber='").append(certificateNumber).append('\'');
        sb.append(", ticketNumber='").append(ticketNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
