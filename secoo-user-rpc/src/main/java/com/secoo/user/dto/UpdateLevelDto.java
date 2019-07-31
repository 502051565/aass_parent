package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:32
 * @desc
 */
public class UpdateLevelDto implements Serializable {
    private Long userId;
    private Integer oldLevel;
    private Integer newLevel;
    private Integer type;
    private Long startDate;
    private Long expirationDate;
    private Long sourceId;
    private String operator;
    private String remark;

    public UpdateLevelDto() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getOldLevel() {
        return this.oldLevel;
    }

    public void setOldLevel(Integer oldLevel) {
        this.oldLevel = oldLevel;
    }

    public Integer getNewLevel() {
        return this.newLevel;
    }

    public void setNewLevel(Integer newLevel) {
        this.newLevel = newLevel;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Long getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public String toString() {
        return "UpdateLevelDto{userId=" + this.userId + ", oldLevel=" + this.oldLevel + ", newLevel=" + this.newLevel + ", type=" + this.type + ", startDate=" + this.startDate + ", expirationDate=" + this.expirationDate + ", sourceId=" + this.sourceId + ", operator='" + this.operator + '\'' + ", remark='" + this.remark + '\'' + '}';
    }
}
