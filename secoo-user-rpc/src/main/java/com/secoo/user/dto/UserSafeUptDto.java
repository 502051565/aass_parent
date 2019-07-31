package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:28
 * @desc
 */
public class UserSafeUptDto implements Serializable {
    private Long shortUid;
    private Integer type;
    private Integer source;
    private String operator;
    private String userName;
    private String mobilePhone;
    private String email;
    private Integer boundPhone;
    private Integer boundEmail;
    private String verifyCode;
    private String oldLoginPwd;
    private String newLoginPwd;
    private String oldPayPwd;
    private String newPayPwd;
    private String remark;
    private String ip;

    public UserSafeUptDto() {
    }

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBoundPhone() {
        return this.boundPhone;
    }

    public void setBoundPhone(Integer boundPhone) {
        this.boundPhone = boundPhone;
    }

    public Integer getBoundEmail() {
        return this.boundEmail;
    }

    public void setBoundEmail(Integer boundEmail) {
        this.boundEmail = boundEmail;
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

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOldLoginPwd() {
        return this.oldLoginPwd;
    }

    public void setOldLoginPwd(String oldLoginPwd) {
        this.oldLoginPwd = oldLoginPwd;
    }

    public String getNewLoginPwd() {
        return this.newLoginPwd;
    }

    public void setNewLoginPwd(String newLoginPwd) {
        this.newLoginPwd = newLoginPwd;
    }

    public String getOldPayPwd() {
        return this.oldPayPwd;
    }

    public void setOldPayPwd(String oldPayPwd) {
        this.oldPayPwd = oldPayPwd;
    }

    public String getNewPayPwd() {
        return this.newPayPwd;
    }

    public void setNewPayPwd(String newPayPwd) {
        this.newPayPwd = newPayPwd;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("UserSafeUptDto{");
        sb.append("shortUid=").append(this.shortUid);
        sb.append(", type=").append(this.type);
        sb.append(", source=").append(this.source);
        sb.append(", operator='").append(this.operator).append('\'');
        sb.append(", userName='").append(this.userName).append('\'');
        sb.append(", mobilePhone='").append(this.mobilePhone).append('\'');
        sb.append(", email='").append(this.email).append('\'');
        sb.append(", boundPhone=").append(this.boundPhone);
        sb.append(", boundEmail=").append(this.boundEmail);
        sb.append(", verifyCode='").append(this.verifyCode).append('\'');
        sb.append(", oldLoginPwd='").append(this.oldLoginPwd).append('\'');
        sb.append(", newLoginPwd='").append(this.newLoginPwd).append('\'');
        sb.append(", oldPayPwd='").append(this.oldPayPwd).append('\'');
        sb.append(", newPayPwd='").append(this.newPayPwd).append('\'');
        sb.append(", remark='").append(this.remark).append('\'');
        sb.append(", ip='").append(this.ip).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
