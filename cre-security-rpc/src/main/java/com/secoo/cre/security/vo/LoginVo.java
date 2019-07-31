package com.secoo.cre.security.vo;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:10
 * @desc
 */
public class LoginVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int state;
    private String xlslid;
    private String openid;

    public LoginVo() {
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getXlslid() {
        return this.xlslid;
    }

    public void setXlslid(String xlslid) {
        this.xlslid = xlslid;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String toString() {
        return "LoginVo [state=" + this.state + ", xlslid=" + this.xlslid + ", openid=" + this.openid + "]";
    }
}
