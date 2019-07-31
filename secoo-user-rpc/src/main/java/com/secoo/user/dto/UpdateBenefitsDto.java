package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:33
 * @desc
 */
public class UpdateBenefitsDto implements Serializable {
    private Long userId;
    private Integer type;
    private Integer count;
    private Long sourceId;
    private String operator;
    private String remark;

    public UpdateBenefitsDto() {
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

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
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

    public String toString() {
        return "UpdateBenefitsDto{userId=" + this.userId + ", type=" + this.type + ", count=" + this.count + ", sourceId=" + this.sourceId + ", operator='" + this.operator + '\'' + ", remark='" + this.remark + '\'' + '}';
    }
}
