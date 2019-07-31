package com.secoo.user.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:12
 * @desc
 */
public class UserDto implements Serializable {
    private static final long serialVersionUID = -1771554627060943154L;
    private String userId;
    private String userName;
    private String loginPassword;
    private String mobilePhone;
    private String email;
    private Integer boundPhone;
    private Integer boundEmail;
    private Integer activate;
    private String regIp;
    private Date regtime;
    private String identifyType;
    private String identifyUid;
    private String identifyFrom;
    private String inviter;
    private String realName;
    private Long shortUid;
    private Integer gender;
    private String birthday;
    private String location;
    private String address;
    private String nickName;
    private Integer userType;
    private Long totalPoint;
    private Integer userLevel;
    private BigDecimal discount;
    private String leaveRecord;
    private String RegisterStartTime;
    private String RegisterEndTime;
    private String companyName;
    private String companyAddress;
    private String qqCode;
    private String telephone;
    private String inviteCode;
    private Date updateTime;
    private String companyId;
    private String[] cids;
    private Date boundEmailTime;
    private Integer isFreeze;
    private String headImage;
    private Integer blacklistType;
    private Integer isNewUser;

    public UserDto() {
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

    public String getLoginPassword() {
        return this.loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBoundPhone() {
        return this.boundPhone;
    }

    public void setBoundPhone(Integer boundPhone) {
        this.boundPhone = boundPhone;
    }

    public Integer getBoundEmail() {
        return this.boundEmail;
    }

    public void setBoundEmail(Integer boundEmail) {
        this.boundEmail = boundEmail;
    }

    public Integer getActivate() {
        return this.activate;
    }

    public void setActivate(Integer activate) {
        this.activate = activate;
    }

    public String getRegIp() {
        return this.regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Date getRegtime() {
        return this.regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getIdentifyType() {
        return this.identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getIdentifyUid() {
        return this.identifyUid;
    }

    public void setIdentifyUid(String identifyUid) {
        this.identifyUid = identifyUid;
    }

    public String getIdentifyFrom() {
        return this.identifyFrom;
    }

    public void setIdentifyFrom(String identifyFrom) {
        this.identifyFrom = identifyFrom;
    }

    public String getInviter() {
        return this.inviter;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Long getShortUid() {
        return this.shortUid;
    }

    public void setShortUid(Long shortUid) {
        this.shortUid = shortUid;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Long getTotalPoint() {
        return this.totalPoint;
    }

    public void setTotalPoint(Long totalPoint) {
        this.totalPoint = totalPoint;
    }

    public Integer getUserLevel() {
        return this.userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getLeaveRecord() {
        return this.leaveRecord;
    }

    public void setLeaveRecord(String leaveRecord) {
        this.leaveRecord = leaveRecord;
    }

    public String getRegisterStartTime() {
        return this.RegisterStartTime;
    }

    public void setRegisterStartTime(String registerStartTime) {
        this.RegisterStartTime = registerStartTime;
    }

    public String getRegisterEndTime() {
        return this.RegisterEndTime;
    }

    public void setRegisterEndTime(String registerEndTime) {
        this.RegisterEndTime = registerEndTime;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getQqCode() {
        return this.qqCode;
    }

    public void setQqCode(String qqCode) {
        this.qqCode = qqCode;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String[] getCids() {
        return this.cids;
    }

    public void setCids(String[] cids) {
        this.cids = cids;
    }

    public Date getBoundEmailTime() {
        return this.boundEmailTime;
    }

    public void setBoundEmailTime(Date boundEmailTime) {
        this.boundEmailTime = boundEmailTime;
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

    public Integer getBlacklistType() {
        return this.blacklistType;
    }

    public void setBlacklistType(Integer blacklistType) {
        this.blacklistType = blacklistType;
    }

    public Integer getIsNewUser() {
        return this.isNewUser;
    }

    public void setIsNewUser(Integer isNewUser) {
        this.isNewUser = isNewUser;
    }

    public String toString() {
        return "UserDto{userId='" + this.userId + '\'' + ", userName='" + this.userName + '\'' + ", loginPassword='" + this.loginPassword + '\'' + ", mobilePhone='" + this.mobilePhone + '\'' + ", email='" + this.email + '\'' + ", boundPhone=" + this.boundPhone + ", boundEmail=" + this.boundEmail + ", activate=" + this.activate + ", regIp='" + this.regIp + '\'' + ", regtime=" + this.regtime + ", identifyType='" + this.identifyType + '\'' + ", identifyUid='" + this.identifyUid + '\'' + ", identifyFrom='" + this.identifyFrom + '\'' + ", inviter='" + this.inviter + '\'' + ", realName='" + this.realName + '\'' + ", shortUid=" + this.shortUid + ", gender=" + this.gender + ", birthday='" + this.birthday + '\'' + ", location='" + this.location + '\'' + ", address='" + this.address + '\'' + ", nickName='" + this.nickName + '\'' + ", userType=" + this.userType + ", totalPoint=" + this.totalPoint + ", userLevel=" + this.userLevel + ", discount=" + this.discount + ", leaveRecord='" + this.leaveRecord + '\'' + ", RegisterStartTime='" + this.RegisterStartTime + '\'' + ", RegisterEndTime='" + this.RegisterEndTime + '\'' + ", companyName='" + this.companyName + '\'' + ", companyAddress='" + this.companyAddress + '\'' + ", qqCode='" + this.qqCode + '\'' + ", telephone='" + this.telephone + '\'' + ", inviteCode='" + this.inviteCode + '\'' + ", updateTime=" + this.updateTime + ", companyId='" + this.companyId + '\'' + ", cids=" + Arrays.toString(this.cids) + ", boundEmailTime=" + this.boundEmailTime + ", isFreeze=" + this.isFreeze + ", headImage='" + this.headImage + '\'' + ", blacklistType=" + this.blacklistType + ", isNewUser=" + this.isNewUser + '}';
    }

}
