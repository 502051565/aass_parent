package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:23
 * @desc
 */
public class MsgCodeVerifyDto implements Serializable {
    private Integer bid;
    private String mobile;
    private String verifyCode;

    public MsgCodeVerifyDto() {
    }

    public Integer getBid() {
        return this.bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String toString() {
        return "MsgCodeVerifyDto{bid=" + this.bid + ", mobile='" + this.mobile + '\'' + ", verifyCode='" + this.verifyCode + '\'' + '}';
    }
}
