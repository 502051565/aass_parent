package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:17
 * @desc
 */
public class UpkCheckResultDto implements Serializable {

    private String upk;
    private Long shortUid;
    private String userId;
    private UserDto userDto;
    private UserExpandDto userExpandDto;

    public UpkCheckResultDto() {
    }

    public String getUpk() {
        return this.upk;
    }

    public void setUpk(String upk) {
        this.upk = upk;
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

    public UserDto getUserDto() {
        return this.userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public UserExpandDto getUserExpandDto() {
        return this.userExpandDto;
    }

    public void setUserExpandDto(UserExpandDto userExpandDto) {
        this.userExpandDto = userExpandDto;
    }

    public String toString() {
        return "UpkCheckResultDto{upk='" + this.upk + '\'' + ", shortUid=" + this.shortUid + ", userId='" + this.userId + '\'' + ", userDto=" + this.userDto + ", userExpandDto=" + this.userExpandDto + '}';
    }
}
