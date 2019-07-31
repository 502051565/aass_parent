package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:35
 * @desc
 */
public class RebateTypeDto implements Serializable {
    private Long userId;
    private Integer rebateType;

    public RebateTypeDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRebateType() {
        return this.rebateType;
    }

    public void setRebateType(Integer rebateType) {
        this.rebateType = rebateType;
    }

    public String toString() {
        return "RebateTypeDto{userId=" + this.userId + ", rebateType=" + this.rebateType + '}';
    }
}
