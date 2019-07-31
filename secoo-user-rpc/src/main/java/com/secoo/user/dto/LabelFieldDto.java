package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:37
 * @desc
 */
public class LabelFieldDto implements Serializable {
    private String field;
    private String value;

    public LabelFieldDto() {
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

    public String toString() {
        return "UserLabelDto{field=" + this.field + ", value='" + this.value + '\'' + ", value='" + this.value + '\'' + '}';
    }
}
