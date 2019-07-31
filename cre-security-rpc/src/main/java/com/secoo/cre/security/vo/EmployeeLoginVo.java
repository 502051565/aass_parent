package com.secoo.cre.security.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:06
 * @desc
 */
public class EmployeeLoginVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private int state;
    private String xlslid;
    private boolean needModifyPass;
    private List<String> urls;

    public EmployeeLoginVo() {
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

    public boolean isNeedModifyPass() {
        return this.needModifyPass;
    }

    public void setNeedModifyPass(boolean needModifyPass) {
        this.needModifyPass = needModifyPass;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public String toString() {
        return "EmployeeLoginVo [state=" + this.state + ", xlslid=" + this.xlslid + ", needModifyPass=" + this.needModifyPass + ", urls=" + this.urls + "]";
    }
}
