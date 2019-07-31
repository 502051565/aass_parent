package com.secoo.user.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:38
 * @desc
 */
public class FreezeUpdateDto implements Serializable {
    private Integer isFreeze;
    private List<Long> userIdList;
    private String operator;
    private String remark;

    public FreezeUpdateDto() {
    }

    public Integer getIsFreeze() {
        return this.isFreeze;
    }

    public void setIsFreeze(Integer isFreeze) {
        this.isFreeze = isFreeze;
    }

    public List<Long> getUserIdList() {
        return this.userIdList;
    }

    public void setUserIdList(List<Long> userIdList) {
        this.userIdList = userIdList;
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
        return "FreezeUpdateDto{isFreeze=" + this.isFreeze + ", userIdList=" + this.userIdList + ", operator=" + this.operator + ", remark=" + this.remark + '}';
    }
}
