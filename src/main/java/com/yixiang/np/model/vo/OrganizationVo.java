package com.yixiang.np.model.vo;

import java.util.Date;

public class OrganizationVo implements java.io.Serializable {

    private Long id;
    /***/
    private Date createdatetime;
    /***/
    private String name;
    /***/
    private String address;
    /***/
    private String code;
    private String iconCls;
    /***/
    private String icon;
    /***/
    private Integer seq;
    /***/
    private Long pid;
    private String pname;
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行卡号
     */
    private String bankCard;
    /**
     * 持卡人
     */
    private String bankUser;
    /**
     * 省份
     */
    private String prov;
    /**
     * 城市
     */
    private String city;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 电话
     */
    private String telphone;
    /**
     * 域名地址
     */
    private String domain;
    /**
     * 类型 1平台2采购商3供应商
     */
    private Integer orgType;

    private Double money;

    private Double availableBalance;

    public OrganizationVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getCreatedatetime() {
        return createdatetime;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setCreatedatetime(Date createdatetime) {
        this.createdatetime = createdatetime;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrganizationVo{");
        sb.append("id=").append(id);
        sb.append(", createdatetime=").append(createdatetime);
        sb.append(", name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", code='").append(code).append('\'');
        sb.append(", iconCls='").append(iconCls).append('\'');
        sb.append(", icon='").append(icon).append('\'');
        sb.append(", seq=").append(seq);
        sb.append(", pid=").append(pid);
        sb.append(", pname='").append(pname).append('\'');
        sb.append(", bankName='").append(bankName).append('\'');
        sb.append(", bankCard='").append(bankCard).append('\'');
        sb.append(", bankUser='").append(bankUser).append('\'');
        sb.append(", prov='").append(prov).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", contact='").append(contact).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", telphone='").append(telphone).append('\'');
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", orgType=").append(orgType);
        sb.append(", money=").append(money);
        sb.append(", availableBalance=").append(availableBalance);
        sb.append('}');
        return sb.toString();
    }
}
