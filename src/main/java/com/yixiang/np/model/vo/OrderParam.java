package com.yixiang.np.model.vo;

import java.util.Date;

public class OrderParam {  
	    private String orderNo;
	    private String orderRemark;
	    private Integer status;
	    private Integer lastModifyUser;
	    private Date lastModifyTime;
	    private Integer financeStatus;
	    
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getOrderRemark() {
			return orderRemark;
		}
		public void setOrderRemark(String orderRemark) {
			this.orderRemark = orderRemark;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getLastModifyUser() {
			return lastModifyUser;
		}
		public void setLastModifyUser(Integer lastModifyUser) {
			this.lastModifyUser = lastModifyUser;
		}
		public Date getLastModifyTime() {
			return lastModifyTime;
		}
		public void setLastModifyTime(Date lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}
		public Integer getFinanceStatus() {
			return financeStatus;
		}
		public void setFinanceStatus(Integer financeStatus) {
			this.financeStatus = financeStatus;
		}
		
	}  