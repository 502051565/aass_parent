package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:18
 * @desc
 */
public class UpkCheckDto implements Serializable {
    private String upk;
    private Integer clientId;
    private String userIp;
    private String deviceId;
    private Boolean retUserInfo;
    private Boolean retExpandInfo;

    public UpkCheckDto() {
    }

    public UpkCheckDto(String upk) {
        this.upk = upk;
    }

    public String getUpk() {
        return this.upk;
    }

    public void setUpk(String upk) {
        this.upk = upk;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getUserIp() {
        return this.userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Boolean getRetUserInfo() {
        return this.retUserInfo;
    }

    public void setRetUserInfo(Boolean retUserInfo) {
        this.retUserInfo = retUserInfo;
    }

    public Boolean getRetExpandInfo() {
        return this.retExpandInfo;
    }

    public void setRetExpandInfo(Boolean retExpandInfo) {
        this.retExpandInfo = retExpandInfo;
    }

    public String toString() {
        return "UpkCheckDto{upk='" + this.upk + '\'' + ", clientId=" + this.clientId + ", userIp='" + this.userIp + '\'' + ", deviceId='" + this.deviceId + '\'' + ", retUserInfo=" + this.retUserInfo + ", retExpandInfo=" + this.retExpandInfo + '}';
    }
}
