package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:21
 * @desc
 */
public class PwdUptDto implements Serializable {
    private Long uid;
    private String oriLoginPwd;
    private String newLoginPwd;
    private Integer source;
    private String operator;
    private String remark;

    public PwdUptDto() {
    }

    public Long getUid() {
        return this.uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getOriLoginPwd() {
        return this.oriLoginPwd;
    }

    public void setOriLoginPwd(String oriLoginPwd) {
        this.oriLoginPwd = oriLoginPwd;
    }

    public String getNewLoginPwd() {
        return this.newLoginPwd;
    }

    public void setNewLoginPwd(String newLoginPwd) {
        this.newLoginPwd = newLoginPwd;
    }

    public Integer getSource() {
        return this.source;
    }

    public void setSource(Integer source) {
        this.source = source;
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
        return "PwdUptDto{uid=" + this.uid + ", oriLoginPwd='" + this.oriLoginPwd + '\'' + ", newLoginPwd='" + this.newLoginPwd + '\'' + ", source=" + this.source + ", operator='" + this.operator + '\'' + ", remark='" + this.remark + '\'' + '}';
    }
}
