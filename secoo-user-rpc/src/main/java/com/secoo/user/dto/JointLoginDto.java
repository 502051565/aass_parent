package com.secoo.user.dto;

import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:26
 * @desc
 */
public class JointLoginDto extends AppBaseDto {
    private Long id;
    private Long shortUid;
    private String userId;
    private Integer businessId;
    private Integer sourceId;
    private Integer clientId;
    private String openId;
    private String unionId;
    private String clientIp;
    private String nickName;
    private String headImage;
    private String location;
    private Integer gender;
    private Date createDate;
    private Integer isDel;
    private String authCode;
    private String accessToken;
    private Boolean isOriUpk;

    public JointLoginDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public Boolean getIsOriUpk() {
        return this.isOriUpk;
    }

    public void setIsOriUpk(Boolean isOriUpk) {
        this.isOriUpk = isOriUpk;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getClientId() {
        return this.clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String toString() {
        return "JointLoginDto{id=" + this.id + "shortUid=" + this.shortUid + ", userId='" + this.userId + '\'' + ", businessId='" + this.businessId + '\'' + ", sourceId=" + this.sourceId + ", clientId=" + this.clientId + ", openId='" + this.openId + '\'' + ", unionId='" + this.unionId + '\'' + ", createDate=" + this.createDate + ", isDel=" + this.isDel + ", clientIp=" + this.clientIp + ", nickName=" + this.nickName + ", headImage=" + this.headImage + ", location=" + this.location + ", gender=" + this.gender + ", authCode=" + this.authCode + ", accessToken=" + this.accessToken + ", isOriUpk=" + this.isOriUpk + '}';
    }
}
