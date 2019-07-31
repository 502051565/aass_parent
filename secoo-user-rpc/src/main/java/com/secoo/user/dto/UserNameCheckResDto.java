package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:29
 * @desc
 */
public class UserNameCheckResDto implements Serializable {
    private Long shortUid;
    private String userId;
    private String userName;
    private String mobilePhone;
    private Integer boundPhone;
    private String companyId;

    public UserNameCheckResDto() {
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

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        return "UserNameCheckResDto{shortUid=" + this.shortUid + ", userId='" + this.userId + '\'' + ", userName='" + this.userName + '\'' + ", mobilePhone='" + this.mobilePhone + '\'' + ", boundPhone=" + this.boundPhone + ", companyId='" + this.companyId + '\'' + '}';
    }
}
