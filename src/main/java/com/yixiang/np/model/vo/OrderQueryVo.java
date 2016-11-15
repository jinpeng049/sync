package com.yixiang.np.model.vo;

import java.util.List;

public class OrderQueryVo {
	
	private String orderNumber; //平台订单号
	
	private String pssOrderNumber; //pss订单号
	
	private Integer orderStatus; //订单状态
	
	private Integer financeStatus; //财务状态
	
	private String sellerName; //供应商
	
	private String buyerName; //采购商
	
	private String toStartAirportCode; //去程 -- 出发机场三字码
	
	private String toEndAirportCode; //去程 -- 到达机场三字码
	
	private String toStartDate; //去程 -- 出发日期  -- 第一段
	
	private String toEndDate; //去程 -- 出发日期 -- 第二段
	
	private Integer pageIndex=1; //分页参数 -- 当前页码
	
	private Integer page; //当前页
	
	private Integer rows; //每页显示几条记录
	
	private Integer supplierId; //供应商ID
	
	private Integer createUserId; //创建人ID
	
	private Long orgId;
	
	private String conNo; //平台合同号
	
	private String pssConNo; //PSS合同号
	
	private Integer conStatus; //合同状态
	
	private String msgTime; //消息开始时间
	
	private String  msgStatus; //消息状态
	
    private String sort; //排序字段
    
    private String order; //按什么方式排序
    
    private Integer orderType; //订单类型
	
	private List<String> list;
	
	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public Integer getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getPssOrderNumber() {
		return pssOrderNumber;
	}

	public void setPssOrderNumber(String pssOrderNumber) {
		this.pssOrderNumber = pssOrderNumber;
	}

	public Integer getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(Integer financeStatus) {
		this.financeStatus = financeStatus;
	}

	
	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getToEndDate() {
		if(this.toEndDate != null && !(this.toEndDate.equals(""))){
			return this.toEndDate+" 23:59:59";
		}
		
		return null;
	}

	public void setToEndDate(String toEndDate) {
		this.toEndDate = toEndDate;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getToStartAirportCode() {
		return toStartAirportCode;
	}

	public void setToStartAirportCode(String toStartAirportCode) {
		this.toStartAirportCode = toStartAirportCode;
	}

	public String getToEndAirportCode() {
		return toEndAirportCode;
	}

	public void setToEndAirportCode(String toEndAirportCode) {
		this.toEndAirportCode = toEndAirportCode;
	}

	public String getToStartDate() {
		if(this.toStartDate != null && !(this.toStartDate.equals(""))){
				return this.toStartDate+" 00:00:00";
		}
		
		return null;
	
	}

	public void setToStartDate(String toStartDate) {
		this.toStartDate = toStartDate;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getConNo() {
		return conNo;
	}

	public void setConNo(String conNo) {
		this.conNo = conNo;
	}

	public String getPssConNo() {
		return pssConNo;
	}

	public void setPssConNo(String pssConNo) {
		this.pssConNo = pssConNo;
	}

	public Integer getConStatus() {
		return conStatus;
	}

	public void setConStatus(Integer conStatus) {
		this.conStatus = conStatus;
	}

	public String getMsgTime() {
		if(this.msgTime != null && !(this.msgTime.equals(""))){
			return this.msgTime+" 00:00:00";
		}
		return null;
	}

	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgStatus() {
		return msgStatus;
	}

	public void setMsgStatus(String msgStatus) {
		this.msgStatus = msgStatus;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Integer getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	
	
	

}
