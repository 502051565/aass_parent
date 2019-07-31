package com.secoo.user.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 16:14
 * @desc
 */
public class BaseDto implements Serializable {
    protected String ip;

    public BaseDto() {
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("BaseDto{");
        sb.append("ip='").append(this.ip).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
