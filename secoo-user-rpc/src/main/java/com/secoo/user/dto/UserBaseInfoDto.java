package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:26
 * @desc
 */
public class UserBaseInfoDto extends AppBaseDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long shortUid;
    private String userId;
    private String userName;
    private String nickName;
    private String headImage;
    private String location;
    private Integer gender;
    private Integer isFreeze;
    private String mobilePhone;
    private Integer boundPhone;

    public UserBaseInfoDto() {
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

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
    }

    public Integer getIsFreeze() {
        return this.isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    public String getHeadImage() {
        return this.headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
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
        return "UserBaseInfoDto{shortUid=" + this.shortUid + ", userId='" + this.userId + '\'' + ", userName='" + this.userName + '\'' + ", nickName='" + this.nickName + '\'' + ", headImage='" + this.headImage + '\'' + ", location='" + this.location + '\'' + ", gender=" + this.gender + ", isFreeze=" + this.isFreeze + ", mobilePhone='" + this.mobilePhone + '\'' + ", boundPhone=" + this.boundPhone + '}';
    }
}
