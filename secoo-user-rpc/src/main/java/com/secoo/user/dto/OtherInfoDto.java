package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:27
 * @desc
 */
public class OtherInfoDto implements Serializable {
    private Integer businessId;
    private Integer sourceId;
    private Integer clientId;
    private String openId;
    private String unionId;
    private String authCode;
    private String accessToken;
    private String bindToken;

    public OtherInfoDto() {
    }

    public Integer getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getBindToken() {
        return this.bindToken;
    }

    public void setBindToken(String bindToken) {
        this.bindToken = bindToken;
    }

    public String toString() {
        return "OtherInfoDto{businessId=" + this.businessId + ", sourceId=" + this.sourceId + ", clientId=" + this.clientId + ", openId='" + this.openId + '\'' + ", unionId='" + this.unionId + '\'' + ", authCode='" + this.authCode + '\'' + ", accessToken='" + this.accessToken + '\'' + ", bindToken='" + this.bindToken + '\'' + '}';
    }
}
