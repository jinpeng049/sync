package com.yixiang.np.model.po;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "pltm_notice")
public class PltmNotice implements Serializable {
    private static final long serialVersionUID = 1L;

    /***/
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标题
     */
    @Column(name = "title")
    private String title;

    /**
     * 状态(0-下线,1-上线)
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 排序优先级
     */
    @Column(name = "priority")
    private Integer priority;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private Integer createUser;

    /**
     * 创建人
     */
    @Column(name = "create_name")
    private String createName;

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
     * 内容
     */
    @Column(name = "content")
    private String content;

    public PltmNotice() {
    }

    public PltmNotice(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PltmNotice{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", status=").append(status);
        sb.append(", priority=").append(priority);
        sb.append(", createUser=").append(createUser);
        sb.append(", createName=").append(createName);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastModifyPerson=").append(lastModifyPerson);
        sb.append(", content='").append(content).append('\'');
        sb.append('}');
        return sb.toString();
    }
}