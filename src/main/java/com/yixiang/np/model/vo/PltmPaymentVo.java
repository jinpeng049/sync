package com.yixiang.np.model.vo;

import com.yixiang.np.utils.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by pengpeng on 16-9-20.
 */
public class PltmPaymentVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /***/
    private Long id;

    /**
     * 支付编号
     */
    private String payNo;

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
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付用户
     */
    private Integer payUserid;

    /**
     * 支付方式
     */
    private Integer payType;

    /**
     * 支付备注
     */
    private String payRemarks;

    /**
     * 审核人
     */
    private Integer auditUserid;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核备注
     */
    private String auditRemarks;

    /**
     * 财务状态（0-收款待审核,1-已收款）
     */
    private Integer status;

    /**
     * 创建人
     */
    private Integer createUserid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改人
     */
    private Integer lastUpdateUserid;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

    /**
     * 供应商名称
     */
    private String organizationName;
    
    private List<OrderParam> order;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmPaymentVo{");
        sb.append("id=").append(id);
        sb.append(", payNo='").append(payNo).append('\'');
        sb.append(", payName='").append(payName).append('\'');
        sb.append(", payAccount='").append(payAccount).append('\'');
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payTime=").append(payTime);
        sb.append(", payUserid=").append(payUserid);
        sb.append(", payType=").append(payType);
        sb.append(", payRemarks='").append(payRemarks).append('\'');
        sb.append(", auditUserid=").append(auditUserid);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditRemarks='").append(auditRemarks).append('\'');
        sb.append(", status=").append(status);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateUserid=").append(lastUpdateUserid);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", organizationName='").append(organizationName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
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

    public String getPayTime() {
        return DateUtil.DateToString(payTime, "yyyy-MM-dd HH:mm:ss");
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayUserid() {
        return payUserid;
    }

    public void setPayUserid(Integer payUserid) {
        this.payUserid = payUserid;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayRemarks() {
        return payRemarks;
    }

    public void setPayRemarks(String payRemarks) {
        this.payRemarks = payRemarks;
    }

    public Integer getAuditUserid() {
        return auditUserid;
    }

    public void setAuditUserid(Integer auditUserid) {
        this.auditUserid = auditUserid;
    }

    public String getAuditTime() {
        return DateUtil.DateToString(auditTime, "yyyy-MM-dd HH:mm:ss");
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRemarks() {
        return auditRemarks;
    }

    public void setAuditRemarks(String auditRemarks) {
        this.auditRemarks = auditRemarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    public String getCreateTime() {

        return DateUtil.DateToString(createTime, "yyyy-MM-dd HH:mm:ss");
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLastUpdateUserid() {
        return lastUpdateUserid;
    }

    public void setLastUpdateUserid(Integer lastUpdateUserid) {
        this.lastUpdateUserid = lastUpdateUserid;
    }

    public String getLastUpdateTime() {

        return DateUtil.DateToString(lastUpdateTime, "yyyy-MM-dd HH:mm:ss");
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

	public List<OrderParam> getOrder() {
		return order;
	}

	public void setOrder(List<OrderParam> order) {
		this.order = order;
	}
}

