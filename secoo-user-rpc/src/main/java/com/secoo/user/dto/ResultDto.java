package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:13
 * @desc
 */
public class ResultDto<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer recode;
    private String errMsg = "";
    private T object;

    public ResultDto() {
    }

    public Integer getRecode() {
        return this.recode;
    }

    public void setRecode(Integer recode) {
        this.recode = recode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String toString() {
        return "ResultDto{recode=" + this.recode + ", errMsg='" + this.errMsg + '\'' + ", object=" + this.object + '}';
    }
}
