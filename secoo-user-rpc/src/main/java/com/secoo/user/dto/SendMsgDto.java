package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:22
 * @desc
 */
public class SendMsgDto implements Serializable {
    private static final long serialVersionUID = -8362238810497763156L;
    private Integer bid;
    private String mobile;
    private String extData;

    public SendMsgDto() {
    }

    public Integer getBid() {
        return this.bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getExtData() {
        return this.extData;
    }

    public void setExtData(String extData) {
        this.extData = extData;
    }

    public String toString() {
        return "SendMsgDto{bid=" + this.bid + ", mobile='" + this.mobile + '\'' + ", extData='" + this.extData + '\'' + '}';
    }
}
