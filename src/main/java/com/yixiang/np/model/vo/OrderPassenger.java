package com.yixiang.np.model.vo;

import java.util.Date;

/**
 * Created by lishu on 2016/9/9.
 */
public class OrderPassenger {
	private Integer id;
	private String orderNumber;//'订单号',
	private String ticketNumber;//'票号',
	private String lastName_en;//'英文姓',
	private String firstName_en;//'英文名',
	private String lastName_cn;//'中文姓',
	private String firstName_cn;//'中文名',
	private String sex;//'性别(0-女,1-男,2-预留)',
	private String passageType;//'旅客类型(0-婴儿,1-儿童,2-成人)',
	private String docType;//'证件类型',
	private String docId;//'证件号',
	private String docExpireDate;//'证件有效期',
	private String birthDate;//'出生日期',
	private String mobile;//'手机号'
	private String createUser;
	private Date createTime;
	private Date lastModifyTime;
	private String lastModifyPerson;
	private String nationality;
	private String issueCountry;
	private String grogshop;
	private String throughTraffic;
	private String remark;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getLastName_en() {
		return lastName_en;
	}
	public void setLastName_en(String lastName_en) {
		this.lastName_en = lastName_en;
	}
	public String getFirstName_en() {
		return firstName_en;
	}
	public void setFirstName_en(String firstName_en) {
		this.firstName_en = firstName_en;
	}
	public String getLastName_cn() {
		return lastName_cn;
	}
	public void setLastName_cn(String lastName_cn) {
		this.lastName_cn = lastName_cn;
	}
	public String getFirstName_cn() {
		return firstName_cn;
	}
	public void setFirstName_cn(String firstName_cn) {
		this.firstName_cn = firstName_cn;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassageType() {
		return passageType;
	}
	public void setPassageType(String passageType) {
		this.passageType = passageType;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocExpireDate() {
		return docExpireDate;
	}
	public void setDocExpireDate(String docExpireDate) {
		this.docExpireDate = docExpireDate;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public String getLastModifyPerson() {
		return lastModifyPerson;
	}
	public void setLastModifyPerson(String lastModifyPerson) {
		this.lastModifyPerson = lastModifyPerson;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIssueCountry() {
		return issueCountry;
	}
	public void setIssueCountry(String issueCountry) {
		this.issueCountry = issueCountry;
	}
	public String getGrogshop() {
		return grogshop;
	}
	public void setGrogshop(String grogshop) {
		this.grogshop = grogshop;
	}
	public String getThroughTraffic() {
		return throughTraffic;
	}
	public void setThroughTraffic(String throughTraffic) {
		this.throughTraffic = throughTraffic;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}

  
