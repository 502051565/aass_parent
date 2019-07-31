package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:14
 * @desc
 */
public class LoginResultDto implements Serializable {

    private String userName;
    private String userId;
    private Long shortId;
    private String type;
    private String upk;
    private String sign;
    private String openId;
    private String nickName;
    private String token;
    private String mobile;
    private long failCnt;
    private long maxFailCnt;
    private String deviceId;

    public LoginResultDto() {
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getShortId() {
        return this.shortId;
    }

    public void setShortId(Long shortId) {
        this.shortId = shortId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpk() {
        return this.upk;
    }

    public void setUpk(String upk) {
        this.upk = upk;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public long getFailCnt() {
        return this.failCnt;
    }

    public void setFailCnt(long failCnt) {
        this.failCnt = failCnt;
    }

    public long getMaxFailCnt() {
        return this.maxFailCnt;
    }

    public void setMaxFailCnt(long maxFailCnt) {
        this.maxFailCnt = maxFailCnt;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String toString() {
        return "LoginResultDto{userName='" + this.userName + '\'' + ", userId='" + this.userId + '\'' + ", shortId=" + this.shortId + ", type='" + this.type + '\'' + ", upk='" + this.upk + '\'' + ", sign='" + this.sign + '\'' + ", openId='" + this.openId + '\'' + ", nickName='" + this.nickName + '\'' + ", token='" + this.token + '\'' + ", mobile='" + this.mobile + '\'' + ", failCnt=" + this.failCnt + ", maxFailCnt=" + this.maxFailCnt + ", deviceId=" + this.deviceId + '}';
    }
}
