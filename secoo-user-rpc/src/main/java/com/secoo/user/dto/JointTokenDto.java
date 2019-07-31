package com.secoo.user.dto;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:27
 * @desc
 */
public class JointTokenDto extends AppBaseDto {
    private Long shortUid;
    private Integer businessId;
    private Integer sourceId;
    private Integer clientId;
    private String token;

    public JointTokenDto() {
    }

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
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

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String toString() {
        return "JointTokenDto{shortUid=" + this.shortUid + ", businessId=" + this.businessId + ", sourceId=" + this.sourceId + ", clientId=" + this.clientId + ", token='" + this.token + '\'' + '}';
    }
}
