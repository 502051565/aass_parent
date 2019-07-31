package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:17
 * @desc
 */
public class LoginVerifyDto implements Serializable {

    private Integer clientId;
    private String token;
    private String verifyCode;
    private String mobile;

    public LoginVerifyDto() {
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String toString() {
        return "LoginVerifyDto{clientId=" + this.clientId + ", token='" + this.token + '\'' + ", verifyCode='" + this.verifyCode + '\'' + ", mobile='" + this.mobile + '\'' + '}';
    }
}
