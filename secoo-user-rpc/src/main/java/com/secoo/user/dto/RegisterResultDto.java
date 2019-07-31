package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:19
 * @desc
 */
public class RegisterResultDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long shortUid;
    private String userId;
    private String userName;
    private String password;
    private String upk;
    private String deviceId;
    private String mobilePhone;
    private Integer boundPhone;

    public RegisterResultDto() {
    }

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpk() {
        return this.upk;
    }

    public void setUpk(String upk) {
        this.upk = upk;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getBoundPhone() {
        return this.boundPhone;
    }

    public void setBoundPhone(Integer boundPhone) {
        this.boundPhone = boundPhone;
    }

    public String toString() {
        return "RegisterResultDto{shortUid=" + this.shortUid + ", userId='" + this.userId + '\'' + ", userName='" + this.userName + '\'' + ", password='" + this.password + '\'' + ", upk='" + this.upk + '\'' + ", deviceId='" + this.deviceId + '\'' + ", mobilePhone='" + this.mobilePhone + '\'' + ", boundPhone=" + this.boundPhone + '}';
    }
}
