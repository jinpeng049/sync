package com.yixiang.np.model.vo;
/**
 * Created by wangwei on 2016年10月18日.
 */
public class ContractQueryVo {
	
	private long id;
	private String conNo; //平台合同号
	private String pssConNo; //PSS合同号
	private String deptAirportCode; //出发机场三字码
	private String arrAirportCode; //到达机场三字码
	private Integer conStatus; //合同状态
	private String msgTime; //
	private String msgStatus;//
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getDeptAirportCode() {
		return deptAirportCode;
	}
	public void setDeptAirportCode(String deptAirportCode) {
		this.deptAirportCode = deptAirportCode;
	}
	public String getArrAirportCode() {
		return arrAirportCode;
	}
	public void setArrAirportCode(String arrAirportCode) {
		this.arrAirportCode = arrAirportCode;
	}
	public Integer getConStatus() {
		return conStatus;
	}
	public String getMsgTime() {
		return msgTime;
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
	public void setConStatus(Integer conStatus) {
		this.conStatus = conStatus;
	}
	
	

}
