package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:14
 * @desc
 */
public class LoginDto extends BaseDto implements Serializable {
    private String userName;
    private String password;
    private Integer clientId;
    private String clientIp;
    private String verifyCode;
    private String cck;
    private int isAutoLogin;
    private int isRemember;
    private String sign;
    private String type;
    private String loginType;
    private Boolean isOriUpk;
    private String platform;
    private String platformVer;
    private String deviceId;
    private String channel;
    private String appId;
    private String appVer;
    private String sysVer;
    private String geocoding;

    public LoginDto() {
    }

    public LoginDto(String userName, String password, Integer clientId) {
        this.userName = userName;
        this.password = password;
        this.clientId = clientId;
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

    public String getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getVerifyCode() {
        return this.verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public int getIsAutoLogin() {
        return this.isAutoLogin;
    }

    public void setIsAutoLogin(int isAutoLogin) {
        this.isAutoLogin = isAutoLogin;
    }

    public int getIsRemember() {
        return this.isRemember;
    }

    public void setIsRemember(int isRemember) {
        this.isRemember = isRemember;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCck() {
        return this.cck;
    }

    public void setCck(String cck) {
        this.cck = cck;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLoginType() {
        return this.loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Boolean getIsOriUpk() {
        return this.isOriUpk;
    }

    public void setIsOriUpk(Boolean isOriUpk) {
        this.isOriUpk = isOriUpk;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformVer() {
        return this.platformVer;
    }

    public void setPlatformVer(String platformVer) {
        this.platformVer = platformVer;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public String getSysVer() {
        return this.sysVer;
    }

    public void setSysVer(String sysVer) {
        this.sysVer = sysVer;
    }

    public String getGeocoding() {
        return this.geocoding;
    }

    public void setGeocoding(String geocoding) {
        this.geocoding = geocoding;
    }

    public String toString() {
        return "LoginDto{userName='" + this.userName + '\'' + ", password='" + this.password + '\'' + ", clientId=" + this.clientId + ", clientIp='" + this.clientIp + '\'' + ", verifyCode='" + this.verifyCode + '\'' + ", cck='" + this.cck + '\'' + ", isAutoLogin=" + this.isAutoLogin + ", isRemember=" + this.isRemember + ", sign='" + this.sign + '\'' + ", type='" + this.type + '\'' + ", loginType='" + this.loginType + '\'' + ", isOriUpk=" + this.isOriUpk + ", platform='" + this.platform + '\'' + ", platformVer='" + this.platformVer + '\'' + ", deviceId='" + this.deviceId + '\'' + ", channel='" + this.channel + '\'' + ", appId='" + this.appId + '\'' + ", appVer='" + this.appVer + '\'' + ", sysVer='" + this.sysVer + '\'' + ", geocoding='" + this.geocoding + '\'' + '}';
    }

}
