package com.yixiang.np.model.po;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_organization")
public class Organization implements java.io.Serializable {

	public static final Integer NP = 1;//平台
	public static final Integer PURCHASE = 2;//采购商
	public static final Integer SUPPLIER = 3;//供应商
	/**
     * '散客保留时长'
     */
	public static final Integer KEEPTIMESINGLE = 48;
	/**
     * '切位保留时长'
     */
	public static final Integer KEEPTIMECHARTER = 24;
    /**
     * 账期节点
     */ 
	public static final String CREDITOVER = "出票完成";
    /**
     * 账期时长
     */ 
	public static final Integer CREDITTIME = 0;
    /**
     * 佣金比例
     */ 
	public static final Double CHARGES = 0d;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /***/
    @Column(name = "createdatetime")
    private Date createdatetime;
    /***/
    @Column(name = "name")
    private String name;
    /***/
    @Column(name = "address")
    private String address;
    /***/
    @Column(name = "code")
    private String code;
    @Transient
    private String iconCls;
    /***/
    @Column(name = "icon")
    private String icon;
    /***/
    @Column(name = "seq")
    private Integer seq;
    /***/
    @Column(name = "pid")
    private Long pid;
    @Transient
    private String pname;
    /**
     * 银行名称
     */
    @Column(name = "bankName")
    private String bankName;
    /**
     * 银行卡号
     */
    @Column(name = "bankCard")
    private String bankCard;
    /**
     * 持卡人
     */
    @Column(name = "bankUser")
    private String bankUser;
    /**
     * 省份
     */
    @Column(name = "prov")
    private String prov;
    /**
     * 城市
     */
    @Column(name = "city")
    private String city;
    /**
     * 联系人
     */
    @Column(name = "contact")
    private String contact;
    /**
     * 手机
     */
    @Column(name = "mobile")
    private String mobile;
    /**
     * 电话
     */
    @Column(name = "telphone")
    private String telphone;
    /**
     * 域名地址
     */
    @Column(name = "domain")
    private String domain;
    /**
     * 类型 1平台2采购商3供应商
     */
    @Column(name = "orgType")
    private Integer orgType;
    /**
     * '散客保留时长'
     */
    @Column(name = "keep_time_single")
    private Integer keepTimeSingle;
    /**
     * 切位保留时长
     */
    @Column(name = "keep_time_charter")
    private Integer keepTimeCharter;
    /**
     * 账期节点
     */
    @Column(name = "credit_over")
    private String creditOver;
    /**
     * 账期时长
     */
    @Column(name = "credit_time")
    private Integer creditTime;
    /**
     * 佣金比例
     */
    @Column(name = "charges")
    private Double charges;
    /**
     * 资质文件地址
     */
    @Column(name = "zz_path")
    private String zzPath;
    public Organization() {
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

	public Integer getKeepTimeSingle() {
		return keepTimeSingle;
	}

	public void setKeepTimeSingle(Integer keepTimeSingle) {
		this.keepTimeSingle = keepTimeSingle;
	}

	public Integer getKeepTimeCharter() {
		return keepTimeCharter;
	}

	public void setKeepTimeCharter(Integer keepTimeCharter) {
		this.keepTimeCharter = keepTimeCharter;
	}

	public String getCreditOver() {
		return creditOver;
	}

	public void setCreditOver(String creditOver) {
		this.creditOver = creditOver;
	}

	public Integer getCreditTime() {
		return creditTime;
	}

	public void setCreditTime(Integer creditTime) {
		this.creditTime = creditTime;
	}

	public Double getCharges() {
		return charges;
	}

	public void setCharges(Double charges) {
		this.charges = charges;
	}

	public String getZzPath() {
		return zzPath;
	}

	public void setZzPath(String zzPath) {
		this.zzPath = zzPath;
	}

	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Organization{");
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
        sb.append(", orgType='").append(orgType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
