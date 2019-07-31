package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:35
 * @desc
 */
public class UserAndExpandDto implements Serializable {
    private UserDto userDto;
    private UserExpandDto userExpandDto;

    public UserAndExpandDto() {
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
        return "UserAndExpandDto{userDto=" + this.userDto + ", userExpandDto=" + this.userExpandDto + '}';
    }
}
