package com.yixiang.np.model.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by lishu on 2016/10/5.
 */
public class RegVo {
    private Integer id; //用户ID
    private Integer orgId; //采购商组ID
    private String username;
    private String nickname;
    private String pwd;
    private String company;
    private String prov;
    private String city;
    private String location;
    private String contacts;
    private String mobile;
    private String telphone;
    private String mail;
    private String verifycode;
    private String bankName;
    private String bankCard;
    private String bankUser;
    private Integer state; //审核状态   1 --待审核  0 --审核通过
    private String zzPath;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getZzPath() {
        return zzPath;
    }

    public void setZzPath(String zzPath) {
        this.zzPath = zzPath;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegVo{");
        sb.append("id=").append(id);
        sb.append(", orgId=").append(orgId);
        sb.append(", username='").append(username).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", pwd='").append(pwd).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", prov='").append(prov).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", location='").append(location).append('\'');
        sb.append(", contacts='").append(contacts).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", telphone='").append(telphone).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", verifycode='").append(verifycode).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append(", bankCard='").append(bankCard).append('\'');
        sb.append(", bankUser='").append(bankUser).append('\'');
        sb.append(", state=").append(state);
        sb.append(", zzPath='").append(zzPath).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append('}');
        return sb.toString();
    }
}

  
