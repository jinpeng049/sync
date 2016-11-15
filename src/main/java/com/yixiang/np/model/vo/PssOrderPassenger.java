package com.yixiang.np.model.vo;

/**
 * Created by lishu on 2016/9/9.
 */
public class PssOrderPassenger {
	private Integer id;
	private String orderNumber;//'订单号',
	private String ticketNumber;//'票号',
	private String englishSurname;//'英文姓',
	private String englishName;//'英文名',
	private String chineseSurname;//'中文姓',
	private String chineseName;//'中文名',
	private String gender;//'性别(0-女,1-男,2-预留)',
	private String type;//'旅客类型(0-婴儿,1-儿童,2-成人)',
	private String certificateType;//'证件类型',
	private String certificateNumber;//'证件号',
	private String certificateExpireDate;//'证件有效期',
	private String birthDate;//'出生日期',
	private String mobile;//'手机号'
	private String country ;
	private String issuingCountry ;
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
	public String getEnglishSurname() {
		return englishSurname;
	}
	public void setEnglishSurname(String englishSurname) {
		this.englishSurname = englishSurname;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getChineseSurname() {
		return chineseSurname;
	}
	public void setChineseSurname(String chineseSurname) {
		this.chineseSurname = chineseSurname;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCertificateType() {
		return certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}
	public String getCertificateNumber() {
		return certificateNumber;
	}
	public void setCertificateNumber(String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}
	public String getCertificateExpireDate() {
		return certificateExpireDate;
	}
	public void setCertificateExpireDate(String certificateExpireDate) {
		this.certificateExpireDate = certificateExpireDate;
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
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIssuingCountry() {
		return issuingCountry;
	}
	public void setIssuingCountry(String issuingCountry) {
		this.issuingCountry = issuingCountry;
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

  
