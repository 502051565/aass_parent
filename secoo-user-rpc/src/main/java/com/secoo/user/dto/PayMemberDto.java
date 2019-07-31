package com.secoo.user.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:33
 * @desc
 */
public class PayMemberDto implements Serializable {
    private Long userId;
    private Integer level;
    private Long orderId;
    private BigDecimal amount;
    private Long startDate;
    private Long expirationDate;
    private Long referrer;
    private String operator;
    private String remark;

    public PayMemberDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getReferrer() {
        return this.referrer;
    }

    public void setReferrer(Long referrer) {
        this.referrer = referrer;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String toString() {
        return "PayMemberDto{userId=" + this.userId + ", level=" + this.level + ", orderId=" + this.orderId + ", amount=" + this.amount + ", startDate=" + this.startDate + ", expirationDate=" + this.expirationDate + ", operator='" + this.operator + '\'' + ", remark='" + this.remark + '\'' + ", referrer='" + this.referrer + '\'' + '}';
    }
}
