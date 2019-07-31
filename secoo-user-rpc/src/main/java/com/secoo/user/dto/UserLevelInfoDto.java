package com.secoo.user.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:31
 * @desc
 */
public class UserLevelInfoDto implements Serializable {
    private Integer currLevel;
    private String currLevelName;
    private Long startDate;
    private Long expirationDate;
    private BigDecimal currDiscount;
    private BigDecimal currentValue;
    private Integer isCharge;

    public UserLevelInfoDto() {
    }

    public Integer getCurrLevel() {
        return this.currLevel;
    }

    public void setCurrLevel(Integer currLevel) {
        this.currLevel = currLevel;
    }

    public String getCurrLevelName() {
        return this.currLevelName;
    }

    public void setCurrLevelName(String currLevelName) {
        this.currLevelName = currLevelName;
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

    public BigDecimal getCurrDiscount() {
        return this.currDiscount;
    }

    public void setCurrDiscount(BigDecimal currDiscount) {
        this.currDiscount = currDiscount;
    }

    public BigDecimal getCurrentValue() {
        return this.currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public Integer getIsCharge() {
        return this.isCharge;
    }

    public void setIsCharge(Integer isCharge) {
        this.isCharge = isCharge;
    }

    public String toString() {
        return "UserLevelInfoDto{currLevel=" + this.currLevel + ", currLevelName='" + this.currLevelName + '\'' + ", startDate=" + this.startDate + ", expirationDate=" + this.expirationDate + ", currDiscount=" + this.currDiscount + ", currentValue=" + this.currentValue + ", isCharge=" + this.isCharge + '}';
    }
}
