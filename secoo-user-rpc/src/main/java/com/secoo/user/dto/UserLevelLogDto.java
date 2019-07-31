package com.secoo.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:30
 * @desc
 */
public class UserLevelLogDto implements Serializable {
    private Long id;
    private Long userId;
    private Integer type;
    private String typeName;
    private Integer oldLevel;
    private Integer level;
    private String remark;
    private String creator;
    private Date createDate;

    public UserLevelLogDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOldLevel() {
        return this.oldLevel;
    }

    public void setOldLevel(Integer oldLevel) {
        this.oldLevel = oldLevel;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String toString() {
        return "UserLevelLogDto{id=" + this.id + ", userId=" + this.userId + ", type=" + this.type + ", typeName=" + this.typeName + ", oldLevel=" + this.oldLevel + ", level=" + this.level + ", remark='" + this.remark + '\'' + ", creator='" + this.creator + '\'' + ", createDate=" + this.createDate + '}';
    }
}
