package com.secoo.user.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:30
 * @desc
 */
public class QueryUserDto implements Serializable {
    private String userName;
    private String nickName;
    private String mobilePhone;
    private Integer userLevel;
    private String identifyType;
    private String regStartTime;
    private String regEndTime;
    private Integer isFreeze;
    private List<String> cids;
    private Integer page;
    private Integer pageSize;

    public QueryUserDto() {
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

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getUserLevel() {
        return this.userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public String getIdentifyType() {
        return this.identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getRegStartTime() {
        return this.regStartTime;
    }

    public void setRegStartTime(String regStartTime) {
        this.regStartTime = regStartTime;
    }

    public String getRegEndTime() {
        return this.regEndTime;
    }

    public void setRegEndTime(String regEndTime) {
        this.regEndTime = regEndTime;
    }

    public Integer getIsFreeze() {
        return this.isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    public List<String> getCids() {
        return this.cids;
    }

    public void setCids(List<String> cids) {
        this.cids = cids;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String toString() {
        return "QueryUserDto{userName='" + this.userName + '\'' + ", nickName='" + this.nickName + '\'' + ", mobilePhone='" + this.mobilePhone + '\'' + ", userLevel=" + this.userLevel + ", identifyType='" + this.identifyType + '\'' + ", regStartTime='" + this.regStartTime + '\'' + ", regEndTime='" + this.regEndTime + '\'' + ", isFreeze=" + this.isFreeze + ", cids=" + this.cids + ", page=" + this.page + ", pageSize=" + this.pageSize + '}';
    }
}
