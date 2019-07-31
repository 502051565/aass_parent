package com.secoo.user.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:34
 * @desc
 */
public class QuickRefundConditionDto implements Serializable {
    private BigDecimal quickRefundAmt;
    private Integer isIdVerify;
    private Integer quickRefundCnt;

    public QuickRefundConditionDto() {
    }

    public BigDecimal getQuickRefundAmt() {
        return this.quickRefundAmt;
    }

    public void setQuickRefundAmt(BigDecimal quickRefundAmt) {
        this.quickRefundAmt = quickRefundAmt;
    }

    public Integer getIsIdVerify() {
        return this.isIdVerify;
    }

    public void setIsIdVerify(Integer isIdVerify) {
        this.isIdVerify = isIdVerify;
    }

    public Integer getQuickRefundCnt() {
        return this.quickRefundCnt;
    }

    public void setQuickRefundCnt(Integer quickRefundCnt) {
        this.quickRefundCnt = quickRefundCnt;
    }

    public String toString() {
        return "QuickRefundConditionDto{quickRefundAmt=" + this.quickRefundAmt + ", isIdVerify=" + this.isIdVerify + ", quickRefundCnt=" + this.quickRefundCnt + '}';
    }
}
