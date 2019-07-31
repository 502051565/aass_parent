package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:33
 * @desc
 */
public class UserBenefitsDto implements Serializable {
    private Long userId;
    private Integer type;
    private Integer initCount;
    private Integer availCount;
    private Long startDate;
    private Long expirationDate;

    public UserBenefitsDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAvailCount() {
        return this.availCount;
    }

    public void setAvailCount(Integer availCount) {
        this.availCount = availCount;
    }

    public Long getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Long expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getInitCount() {
        return this.initCount;
    }

    public void setInitCount(Integer initCount) {
        this.initCount = initCount;
    }

    public String toString() {
        return "UserBenefitsDto{, userId=" + this.userId + ", type=" + this.type + ", initCount=" + this.initCount + ", availCount=" + this.availCount + ", startDate=" + this.startDate + ", expirationDate=" + this.expirationDate + '}';
    }
}
