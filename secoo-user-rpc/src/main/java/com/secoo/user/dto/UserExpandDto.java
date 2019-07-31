package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:18
 * @desc
 */
public class UserExpandDto implements Serializable {

    private Integer rebateType;
    private Integer isUptUserName;

    public UserExpandDto() {
    }

    public Integer getRebateType() {
        return this.rebateType;
    }

    public void setRebateType(Integer rebateType) {
        this.rebateType = rebateType;
    }

    public Integer getIsUptUserName() {
        return this.isUptUserName;
    }

    public void setIsUptUserName(Integer isUptUserName) {
        this.isUptUserName = isUptUserName;
    }

    public String toString() {
        return "UserExpandDto{rebateType=" + this.rebateType + "isUptUserName=" + this.isUptUserName + '}';
    }
}
