package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:23
 * @desc
 */
public class FindPwdDto extends AppBaseDto implements Serializable {
    private String ume;
    private String token;
    private String mobileCode;
    private String newPwd;
    private Integer source;
    private String operator;

    public FindPwdDto() {
    }

    public String getUme() {
        return this.ume;
    }

    public void setUme(String ume) {
        this.ume = ume;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMobileCode() {
        return this.mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getNewPwd() {
        return this.newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public Integer getSource() {
        return this.source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String toString() {
        return "FindPwdDto{ume='" + this.ume + '\'' + ", token='" + this.token + '\'' + ", mobileCode='" + this.mobileCode + '\'' + ", newPwd='" + this.newPwd + '\'' + ", source=" + this.source + ", operator='" + this.operator + '\'' + '}';
    }
}
