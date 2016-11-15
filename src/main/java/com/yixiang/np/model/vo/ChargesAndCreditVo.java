package com.yixiang.np.model.vo;
/**
 * Created by wangwei on 2016年10月24日.
 */
public class ChargesAndCreditVo {
	private Long id;
	private String supplierName; //供应商名称
	private Double rate; //佣金比例
	private Integer orderTime;//订单非工作日保留时长
	private Integer orderTimeForWork;//订单工作日保留时长
	private Integer contractTime;//合同非工作日保留时长
	private Integer contractTimeForWork;//合同工作日保留时长
	private String creditOrver; //账期结点
	private Integer creditTime; //账期时长
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getCreditOrver() {
		return creditOrver;
	}
	public void setCreditOrver(String creditOrver) {
		this.creditOrver = creditOrver;
	}
	public Integer getCreditTime() {
		return creditTime;
	}
	public void setCreditTime(Integer creditTime) {
		this.creditTime = creditTime;
	}
	public Integer getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Integer orderTime) {
		this.orderTime = orderTime;
	}

	public Integer getOrderTimeForWork() {
		return orderTimeForWork;
	}

	public void setOrderTimeForWork(Integer orderTimeForWork) {
		this.orderTimeForWork = orderTimeForWork;
	}

	public Integer getContractTime() {
		return contractTime;
	}

	public void setContractTime(Integer contractTime) {
		this.contractTime = contractTime;
	}

	public Integer getContractTimeForWork() {
		return contractTimeForWork;
	}

	public void setContractTimeForWork(Integer contractTimeForWork) {
		this.contractTimeForWork = contractTimeForWork;
	}
}
