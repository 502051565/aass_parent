package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:19
 * @desc
 */
public class LoginAndUserInfoDto implements Serializable {

    private UserDto user;
    private String upk;

    public LoginAndUserInfoDto() {
    }

    public UserDto getUser() {
        return this.user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getUpk() {
        return this.upk;
    }

    public void setUpk(String upk) {
        this.upk = upk;
    }

    public String toString() {
        return "LoginAndUserInfoDto [user=" + this.user + ", upk=" + this.upk + "]";
    }
}
