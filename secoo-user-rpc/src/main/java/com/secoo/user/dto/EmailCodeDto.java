package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:23
 * @desc
 */
public class EmailCodeDto implements Serializable {
    private Integer bid;
    private Long userId;
    private String email;
    private String userName;

    public EmailCodeDto() {
    }

    public Integer getBid() {
        return this.bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString() {
        return "EmailCodeDto{bid=" + this.bid + ", userId=" + this.userId + ", email='" + this.email + '\'' + ", userName='" + this.userName + '\'' + '}';
    }
}
