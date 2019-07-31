package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:28
 * @desc
 */
public class UserRegDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String mobilePhone;
    private String userName;
    private String realName;
    private String location;
    private String address;
    private int genter;
    private String birthday;
    private String clientIp;
    private String email;

    public UserRegDto() {
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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

    public int getGenter() {
        return this.genter;
    }

    public void setGenter(int genter) {
        this.genter = genter;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "UserRegDto{mobilePhone='" + this.mobilePhone + '\'' + ", userName='" + this.userName + '\'' + ", realName='" + this.realName + '\'' + ", location='" + this.location + '\'' + ", address='" + this.address + '\'' + ", genter=" + this.genter + ", birthday='" + this.birthday + '\'' + ", clientIp='" + this.clientIp + '\'' + ", email='" + this.email + '\'' + '}';
    }
}
