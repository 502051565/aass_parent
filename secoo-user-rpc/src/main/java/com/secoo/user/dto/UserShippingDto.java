package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:31
 * @desc
 */
public class UserShippingDto implements Serializable {

    private Long userId;
    private String receiver;
    private String province;
    private String city;
    private String area;
    private String address;
    private String phone;
    private String mobile;
    private String zipcode;
    private String creator;

    public UserShippingDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String toString() {
        return "UserShippingDto{, userId=" + this.userId + ", receiver='" + this.receiver + '\'' + ", province='" + this.province + '\'' + ", city='" + this.city + '\'' + ", area='" + this.area + '\'' + ", address='" + this.address + '\'' + ", phone='" + this.phone + '\'' + ", mobile='" + this.mobile + '\'' + ", zipcode='" + this.zipcode + '\'' + ", creator='" + this.creator + '\'' + '}';
    }
}
