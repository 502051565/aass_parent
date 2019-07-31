package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:24
 * @desc
 */
public class UserRedisDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer type;
    private Long shortUid;
    private String userId;
    private String userName;
    private String pwdTmd5;

    public UserRedisDto() {
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwdTmd5() {
        return this.pwdTmd5;
    }

    public void setPwdTmd5(String pwdTmd5) {
        this.pwdTmd5 = pwdTmd5;
    }
}
