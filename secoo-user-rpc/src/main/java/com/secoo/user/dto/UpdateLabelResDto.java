package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:36
 * @desc
 */
public class UpdateLabelResDto implements Serializable {
    private String field;
    private String retMsg;

    public UpdateLabelResDto() {
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getRetMsg() {
        return this.retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public String toString() {
        return "UpdateLabelResDto{field='" + this.field + '\'' + ", retMsg='" + this.retMsg + '\'' + '}';
    }
}
