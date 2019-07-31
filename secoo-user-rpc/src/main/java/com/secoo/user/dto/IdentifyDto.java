package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:34
 * @desc
 */
public class IdentifyDto implements Serializable {
    private Long userId;
    private String realName;
    private String idNo;

    public IdentifyDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNo() {
        return this.idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String toString() {
        return "IdVerifyDto{userId=" + this.userId + ", realName='" + this.realName + '\'' + ", idNo='" + this.idNo + '\'' + '}';
    }
}
