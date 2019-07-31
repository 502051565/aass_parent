package com.secoo.user.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:37
 * @desc
 */
public class UserLabelDto implements Serializable {
    private Long userId;
    private String field;
    private String value;
    private String modify;
    private Date modifyDate;

    public UserLabelDto() {
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getModify() {
        return this.modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String toString() {
        return "UserLabelDto{userId=" + this.userId + ", field='" + this.field + '\'' + ", value='" + this.value + '\'' + ", modify='" + this.modify + '\'' + ", modifyDate=" + this.modifyDate + '}';
    }
}
