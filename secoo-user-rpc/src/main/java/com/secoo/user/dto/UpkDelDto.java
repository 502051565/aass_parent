package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:18
 * @desc
 */
public class UpkDelDto implements Serializable {

    private String upk;
    private Integer clientId;
    private String userIp;
    private String deviceId;

    public UpkDelDto() {
    }

    public UpkDelDto(String upk) {
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

    public String toString() {
        return "UpkCheckDto{upk='" + this.upk + '\'' + ", clientId=" + this.clientId + ", userIp='" + this.userIp + '\'' + ", deviceId='" + this.deviceId + '\'' + '}';
    }
}
