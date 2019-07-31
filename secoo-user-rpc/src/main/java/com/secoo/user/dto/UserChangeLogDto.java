package com.secoo.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:29
 * @desc
 */
public class UserChangeLogDto implements Serializable {
    private Long id;
    private Long shortUid;
    private Integer type;
    private String typeName;
    private Integer source;
    private Integer field;
    private String fieldName;
    private String sourceName;
    private String oldValue;
    private String newValue;
    private String remark;
    private String creator;
    private Date createDate;

    public UserChangeLogDto() {
    }

    public UserChangeLogDto(Long shortUid, Integer type, Integer source, String oldValue, String newValue, String remark, String creator) {
        this.shortUid = shortUid;
        this.type = type;
        this.source = source;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.remark = remark;
        this.creator = creator;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSource() {
        return this.source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOldValue() {
        return this.oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return this.newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
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

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Integer getField() {
        return this.field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String toString() {
        return "UserChangeLogDto{id=" + this.id + ", shortUid=" + this.shortUid + ", type=" + this.type + ", typeName='" + this.typeName + '\'' + ", field=" + this.field + ", fieldName='" + this.fieldName + '\'' + ", source=" + this.source + ", sourceName='" + this.sourceName + '\'' + ", oldValue='" + this.oldValue + '\'' + ", newValue='" + this.newValue + '\'' + ", remark='" + this.remark + '\'' + ", creator='" + this.creator + '\'' + ", createDate=" + this.createDate + '}';
    }
}
