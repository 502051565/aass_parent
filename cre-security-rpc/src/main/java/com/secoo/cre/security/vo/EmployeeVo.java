package com.secoo.cre.security.vo;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:09
 * @desc
 */
public class EmployeeVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private int employeeId;
    private int businessId;
    private String name;
    private String intro;
    private String logo;
    private String detailUrl;

    public EmployeeVo() {
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String toString() {
        return "EmployeeVo [employeeId=" + this.employeeId + ", businessId=" + this.businessId + ", name=" + this.name + ", intro=" + this.intro + ", logo=" + this.logo + ", detailUrl=" + this.detailUrl + "]";
    }
}
