package com.yixiang.np.model.vo;

import java.util.Date;

/**
 * Created by wangwei on 2016年10月9日.
 * 合同订单 映射实体
 */

public class PltmContractVo {

	    public static final Integer COLUMN_CONSTRACTSTATUS_AUDIT = 1;//待审核：未经【供应商】审核的合同。支持合同取消。
	
	    public static final Integer COLUMN_CONSTRACTSTATUS_PAY = 2;//待支付：合同审核通过完成，支持合同取消，【支付押金】
	
	    public static final Integer COLUMN_CONSTRACTSSTATUS_DESPOSIT = 3;//押金已收（原销售押金）：已收押金的合同下面的订单进入待出票状态。
	
	    public static final Integer COLUMN_CONSTRACTSTATUS_STOP = 4;//合同中止：由【供应商】从某一班开始关闭合同（含开始日期）对应合同的订单取消归还库存。
	
	    public static final Integer COLUMN_CONSTRACTSSTATUS_COMPLETE = 5;//合同完成：所有航班完成出票。
	
	    public static final Integer COLUMN_CONSTRACTSTATUS_BACK = 6;//合同退回：经【供应商】审核不通过。
	    
	    public static final Integer COLUMN_CONSTRACTSTATUS_CANCLE = 7;//合同取消：由【供应商】自行取消的合同，与合同关联的所有订单取消归还库存。

		private Integer id;
		private String contractNo;// '合同编号',
		private Integer routeId;//航线ID
		private String deptFlight;// '出发航班号',
		private String arrFlight;// '回程航班号',
		private Integer charterType;// '切位方式1硬切 2软切',
		private String seatClass;// '座位类型',
		private String deptAirport;// '出发机场',
		private String arrAirport;// '回程机场',
		private String deptAirportcode;// '出发机场三字码',
		private String arrAirportcode;// '回程机场三字码',
		private String deptStarttime;// '出发起飞时刻',
		private String deptEndtime;// '出发到达时刻',
		private String arrStarttime;// '回程起飞时刻',
		private String arrEndtime;// '回程到达时刻',
		private Integer deptIntervalday;
		private Integer arrIntervalday;
		private Integer seatCount;// '座位数',
		private Integer flightCount;// '航班数',
		private Double totalPrice;// '总价',
		private Double deposit;// '押金',
		private Date payOvertime;// '支付到期时间',
		private Date ticketOvertime;// '出票到期时间',
		private Integer status;// '合同订单状态',
		private Integer customerId;// '采购商ID',
		private String customerName; // '采购商名称',
		private Double ticketLoss;//票损
		private Double ticketRate;//出票率
		private Integer createUserid;
		private Date createTime;
		private Date lastModifytime;
		
		private String productList;//产品名称
		private Integer supplierId;//供应商ID
		private String supplierName;//供应商名称
		private Double oldDeposit;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getContractNo() {
			return contractNo;
		}
		public void setContractNo(String contractNo) {
			this.contractNo = contractNo;
		}
		public Integer getRouteId() {
			return routeId;
		}
		public void setRouteId(Integer routeId) {
			this.routeId = routeId;
		}
		public String getDeptFlight() {
			return deptFlight;
		}
		public void setDeptFlight(String deptFlight) {
			this.deptFlight = deptFlight;
		}
		public String getArrFlight() {
			return arrFlight;
		}
		public void setArrFlight(String arrFlight) {
			this.arrFlight = arrFlight;
		}
		public Integer getCharterType() {
			return charterType;
		}
		public void setCharterType(Integer charterType) {
			this.charterType = charterType;
		}
		public String getSeatClass() {
			return seatClass;
		}
		public void setSeatClass(String seatClass) {
			this.seatClass = seatClass;
		}
		public String getDeptAirport() {
			return deptAirport;
		}
		public void setDeptAirport(String deptAirport) {
			this.deptAirport = deptAirport;
		}
		public String getArrAirport() {
			return arrAirport;
		}
		public void setArrAirport(String arrAirport) {
			this.arrAirport = arrAirport;
		}
		public String getDeptAirportcode() {
			return deptAirportcode;
		}
		public void setDeptAirportcode(String deptAirportcode) {
			this.deptAirportcode = deptAirportcode;
		}
		public String getArrAirportcode() {
			return arrAirportcode;
		}
		public void setArrAirportcode(String arrAirportcode) {
			this.arrAirportcode = arrAirportcode;
		}
		public String getDeptStarttime() {
			return deptStarttime;
		}
		public void setDeptStarttime(String deptStarttime) {
			this.deptStarttime = deptStarttime;
		}
		public String getDeptEndtime() {
			return deptEndtime;
		}
		public void setDeptEndtime(String deptEndtime) {
			this.deptEndtime = deptEndtime;
		}
		public String getArrStarttime() {
			return arrStarttime;
		}
		public void setArrStarttime(String arrStarttime) {
			this.arrStarttime = arrStarttime;
		}
		public String getArrEndtime() {
			return arrEndtime;
		}
		public void setArrEndtime(String arrEndtime) {
			this.arrEndtime = arrEndtime;
		}
		public Integer getSeatCount() {
			return seatCount;
		}
		public void setSeatCount(Integer seatCount) {
			this.seatCount = seatCount;
		}
		public Integer getFlightCount() {
			return flightCount;
		}
		public void setFlightCount(Integer flightCount) {
			this.flightCount = flightCount;
		}
		public Double getTotalPrice() {
			return totalPrice;
		}
		public void setTotalPrice(Double totalPrice) {
			this.totalPrice = totalPrice;
		}
		public Double getDeposit() {
			return deposit;
		}
		public void setDeposit(Double deposit) {
			this.deposit = deposit;
		}
		public Date getPayOvertime() {
			return payOvertime;
		}
		public void setPayOvertime(Date payOvertime) {
			this.payOvertime = payOvertime;
		}
		public Date getTicketOvertime() {
			return ticketOvertime;
		}
		public void setTicketOvertime(Date ticketOvertime) {
			this.ticketOvertime = ticketOvertime;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getCustomerId() {
			return customerId;
		}
		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public Integer getCreateUserid() {
			return createUserid;
		}
		public void setCreateUserid(Integer createUserid) {
			this.createUserid = createUserid;
		}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
		public Integer getDeptIntervalday() {
			return deptIntervalday;
		}
		public void setDeptIntervalday(Integer deptIntervalday) {
			this.deptIntervalday = deptIntervalday;
		}
		public Integer getArrIntervalday() {
			return arrIntervalday;
		}
		public void setArrIntervalday(Integer arrIntervalday) {
			this.arrIntervalday = arrIntervalday;
		}
		public Double getTicketLoss() {
			return ticketLoss;
		}
		public void setTicketLoss(Double ticketLoss) {
			this.ticketLoss = ticketLoss;
		}
		public Double getTicketRate() {
			return ticketRate;
		}
		public void setTicketRate(Double ticketRate) {
			this.ticketRate = ticketRate;
		}
		public Date getLastModifytime() {
			return lastModifytime;
		}
		public void setLastModifytime(Date lastModifytime) {
			this.lastModifytime = lastModifytime;
		}
		public String getProductList() {
			return productList;
		}
		public void setProductList(String productList) {
			this.productList = productList;
		}
		public Integer getSupplierId() {
			return supplierId;
		}
		public void setSupplierId(Integer supplierId) {
			this.supplierId = supplierId;
		}
		public String getSupplierName() {
			return supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public Double getOldDeposit() {
			return oldDeposit;
		}
		public void setOldDeposit(Double oldDeposit) {
			this.oldDeposit = oldDeposit;
		}
		 
		
}
