package com.yixiang.np.model.vo;

import com.yixiang.np.model.po.PaymentDetail;

import java.io.Serializable;
import java.util.List;

/**
 * Created by pengpeng on 16-9-20.
 */
public class PaymentDetailVo implements Serializable {

    private List<PaymentDetail> paymentDetails;

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
     * 审核备注
     */
    private String auditRemarks;

    /**
     * 收款结算单号
     */
    private String payNo;

    /**
     * 收款核算id
     */
    private Long pltmPaymentId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PaymentDetailVo{");
        sb.append("paymentDetails=").append(paymentDetails);
        sb.append(", payName='").append(payName).append('\'');
        sb.append(", payAccount='").append(payAccount).append('\'');
        sb.append(", payMoney=").append(payMoney);
        sb.append(", auditRemarks='").append(auditRemarks).append('\'');
        sb.append(", payNo='").append(payNo).append('\'');
        sb.append(", pltmPaymentId=").append(pltmPaymentId);
        sb.append('}');
        return sb.toString();
    }

    public List<PaymentDetail> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaymentDetail> paymentDetails) {
        this.paymentDetails = paymentDetails;
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

    public String getAuditRemarks() {
        return auditRemarks;
    }

    public void setAuditRemarks(String auditRemarks) {
        this.auditRemarks = auditRemarks;
    }

    public Long getPltmPaymentId() {
        return pltmPaymentId;
    }

    public void setPltmPaymentId(Long pltmPaymentId) {
        this.pltmPaymentId = pltmPaymentId;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }
}
