package com.secoo.user.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:32
 * @desc
 */
public class LevelInfoDto implements Serializable {
    private Integer level;
    private String levelName;
    private BigDecimal discount;
    private Long expireDate;
    private BigDecimal minValue;
    private Integer maintCoupon;
    private Integer freePostage;
    private Integer giftCoupon;
    private BigDecimal birthdayPoints;
    private BigDecimal birthdayKupay;
    private BigDecimal quickRefundAmt;
    private Integer quickRefundCnt;

    public LevelInfoDto() {
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getMinValue() {
        return this.minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    public Integer getFreePostage() {
        return this.freePostage;
    }

    public void setFreePostage(Integer freePostage) {
        this.freePostage = freePostage;
    }

    public Integer getGiftCoupon() {
        return this.giftCoupon;
    }

    public void setGiftCoupon(Integer giftCoupon) {
        this.giftCoupon = giftCoupon;
    }

    public BigDecimal getBirthdayPoints() {
        return this.birthdayPoints;
    }

    public void setBirthdayPoints(BigDecimal birthdayPoints) {
        this.birthdayPoints = birthdayPoints;
    }

    public Long getExpireDate() {
        return this.expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    public String getLevelName() {
        return this.levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public BigDecimal getBirthdayKupay() {
        return this.birthdayKupay;
    }

    public void setBirthdayKupay(BigDecimal birthdayKupay) {
        this.birthdayKupay = birthdayKupay;
    }

    public Integer getMaintCoupon() {
        return this.maintCoupon;
    }

    public void setMaintCoupon(Integer maintCoupon) {
        this.maintCoupon = maintCoupon;
    }

    public BigDecimal getQuickRefundAmt() {
        return this.quickRefundAmt;
    }

    public void setQuickRefundAmt(BigDecimal quickRefundAmt) {
        this.quickRefundAmt = quickRefundAmt;
    }

    public Integer getQuickRefundCnt() {
        return this.quickRefundCnt;
    }

    public void setQuickRefundCnt(Integer quickRefundCnt) {
        this.quickRefundCnt = quickRefundCnt;
    }

    public String toString() {
        return "LevelInfoDto{level=" + this.level + ", levelName='" + this.levelName + '\'' + ", discount=" + this.discount + ", expireDate=" + this.expireDate + ", minValue=" + this.minValue + ", maintCoupon=" + this.maintCoupon + ", freePostage=" + this.freePostage + ", giftCoupon=" + this.giftCoupon + ", birthdayPoints=" + this.birthdayPoints + ", birthdayKupay=" + this.birthdayKupay + ", quickRefundAmt=" + this.quickRefundAmt + ", quickRefundCnt=" + this.quickRefundCnt + '}';
    }
}
