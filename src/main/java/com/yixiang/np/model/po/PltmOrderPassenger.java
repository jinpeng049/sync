package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Table(name = "pltm_order_passenger")
public class PltmOrderPassenger implements Serializable {
    private static final long serialVersionUID = 1L;


    /***/
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单号
     */
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 票号
     */
    @Column(name = "ticket_number")
    private String ticketNumber;

    /**
     * 英文姓
     */
    @Column(name = "last_name_en")
    private String lastName_en;

    /**
     * 英文名
     */
    @Column(name = "first_name_en")
    private String firstName_en;

    /**
     * 中文姓
     */
    @Column(name = "last_name_cn")
    private String lastName_cn;

    /**
     * 中文名
     */
    @Column(name = "first_name_cn")
    private String firstName_cn;

    /**
     * 性别(1-男,2-女)
     */
    @Column(name = "sex")
    private Integer sex;

    /**
     * 旅客类型(1-成人,2-儿童,3-婴儿)
     */
    @Column(name = "passage_type")
    private Integer passageType;

    /**
     * 证件类型(1-身份证,2-护照)
     */
    @Column(name = "doc_type")
    private Integer docType;

    /**
     * 证件号
     */
    @Column(name = "doc_id")
    private String docId;

    /**
     * 证件有效期
     */
    @Column(name = "doc_expire_date")
    private Date docExpireDate;

    /**
     * 出生日期
     */
    @Column(name = "birth_date")
    private Date birthDate;

    /**
     * 手机号
     */
    @Column(name = "mobile")
    private String mobile;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "last_modify_time")
    private Date lastModifyTime;

    /**
     * 最后修改人
     */
    @Column(name = "last_modify_person")
    private Integer lastModifyPerson;

    /**
     *国籍
     */
    @Column(name = "nationality")
    private String nationality;

    /**
     * 签发国
     */
    @Column(name = "issue_country")
	private String issueCountry;

    /**
     * 酒店
     */
    @Column(name = "grogshop")
	private String grogshop;

    /**
     * 联运
     */
    @Column(name = "through_traffic")
	private String throughTraffic;
    
    @Column(name = "remark")
	private String remark;
    /**
     * 旅客姓名
     */
    @Transient
    private String name;

    /**
     * 中文姓名
     */
    @Transient
    private String nameCn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

	public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getPassageType() {
        return passageType;
    }

    public void setPassageType(Integer passageType) {
        this.passageType = passageType;
    }

    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    @JSONField(format = "yyyy-MM-dd")
    public Date getDocExpireDate() {
        return docExpireDate;
    }

    public void setDocExpireDate(Date docExpireDate) {
        this.docExpireDate = docExpireDate;
    }

    @JSONField(format = "yyyy-MM-dd")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getLastModifyPerson() {
        return lastModifyPerson;
    }

    public void setLastModifyPerson(Integer lastModifyPerson) {
        this.lastModifyPerson = lastModifyPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
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


	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmOrderPassenger{");
        sb.append("id=").append(id);
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", ticketNumber='").append(ticketNumber).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", nameCn='").append(nameCn).append('\'');
        sb.append(", sex=").append(sex);
        sb.append(", passageType=").append(passageType);
        sb.append(", docType=").append(docType);
        sb.append(", docId='").append(docId).append('\'');
        sb.append(", docExpireDate=").append(docExpireDate);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append(", lastNameEn='").append(lastName_en).append('\'');
        sb.append(", firstNameEn='").append(firstName_en).append('\'');
        sb.append(", lastNameCn='").append(lastName_cn).append('\'');
        sb.append(", firstNameCn='").append(firstName_cn).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public PltmOrderPassenger() {
    }

    public PltmOrderPassenger(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}