package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:20
 * @desc
 */
public class RegisterDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    private Integer regType;
    private String mobilePhone;
    private String email;
    private String verifyCode;
    private String smsCode;
    private Integer clientId;
    private String clientIp;
    private String deviceId;
    private String identifyType;
    private String cck;
    private String inviteCode;
    private Boolean isOriUpk;
    private String realName;
    private String location;
    private String address;
    private Integer gender;
    private String birthday;

    public RegisterDto() {
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

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getSmsCode() {
        return this.smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public Integer getRegType() {
        return this.regType;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getIdentifyType() {
        return this.identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getCck() {
        return this.cck;
    }

    public void setCck(String cck) {
        this.cck = cck;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsOriUpk() {
        return this.isOriUpk;
    }

    public void setIsOriUpk(Boolean isOriUpk) {
        this.isOriUpk = isOriUpk;
    }

    public String toString() {
        return "RegisterDto{userName='" + this.userName + '\'' + ", password='" + this.password + '\'' + ", mobilePhone='" + this.mobilePhone + '\'' + ", verifyCode='" + this.verifyCode + '\'' + ", smsCode='" + this.smsCode + '\'' + ", regType=" + this.regType + ", clientId=" + this.clientId + ", clientIp='" + this.clientIp + '\'' + ", deviceId='" + this.deviceId + '\'' + ", identifyType='" + this.identifyType + '\'' + ", cck='" + this.cck + '\'' + ", inviteCode='" + this.inviteCode + '\'' + ", isOriUpk=" + this.isOriUpk + ", realName='" + this.realName + '\'' + ", location='" + this.location + '\'' + ", address='" + this.address + '\'' + ", gender=" + this.gender + ", birthday='" + this.birthday + '\'' + ", email='" + this.email + '\'' + '}';
    }
}
