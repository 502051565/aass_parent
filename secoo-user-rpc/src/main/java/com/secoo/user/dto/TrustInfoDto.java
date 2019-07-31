package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:38
 * @desc
 */
public class TrustInfoDto implements Serializable {
    private Long userId;
    private String userName;
    private Integer clientId;
    private String clientIp;
    private String platform;
    private String platformVer;
    private String deviceId;
    private String channel;
    private String appId;
    private String appVer;
    private String sysVer;
    private String geocoding;

    public TrustInfoDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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
        return "TrustInfoDto{userId='" + this.userId + '\'' + "userName='" + this.userName + '\'' + ", clientId=" + this.clientId + ", clientIp='" + this.clientIp + '\'' + ", platform='" + this.platform + '\'' + ", platformVer='" + this.platformVer + '\'' + ", deviceId='" + this.deviceId + '\'' + ", channel='" + this.channel + '\'' + ", appId='" + this.appId + '\'' + ", appVer='" + this.appVer + '\'' + ", sysVer='" + this.sysVer + '\'' + ", geocoding='" + this.geocoding + '\'' + '}';
    }
}
