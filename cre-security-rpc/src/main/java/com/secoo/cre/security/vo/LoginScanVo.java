package com.secoo.cre.security.vo;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:09
 * @desc
 */
public class LoginScanVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String url;

    public LoginScanVo() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return "LoginScanVo [id=" + this.id + ", url=" + this.url + "]";
    }
}
