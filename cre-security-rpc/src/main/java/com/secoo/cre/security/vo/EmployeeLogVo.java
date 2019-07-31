package com.secoo.cre.security.vo;

import com.secoo.cre.security.entity.EmployeeBusiness;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:05
 * @desc
 */
public class EmployeeLogVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private int employeeId;
    private String userName;
    private String phone;
    private Date loginTime;
    private Date lastTime;
    private int employeeType;
    private long businessId;
    private String businessName;
    private String ip;
    private long lifeBusinessId;
    private List<EmployeeBusiness> business;

    public EmployeeLogVo() {
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastTime() {
        return this.lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public int getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public long getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(long businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return this.businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<EmployeeBusiness> getBusiness() {
        return this.business;
    }

    public void setBusiness(List<EmployeeBusiness> business) {
        this.business = business;
    }

    public long getLifeBusinessId() {
        return this.lifeBusinessId;
    }

    public void setLifeBusinessId(long lifeBusinessId) {
        this.lifeBusinessId = lifeBusinessId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "EmployeeLogVo [employeeId=" + this.employeeId + ", userName=" + this.userName + ", phone=" + this.phone + ", loginTime=" + this.loginTime + ", lastTime=" + this.lastTime + ", employeeType=" + this.employeeType + ", businessId=" + this.businessId + ", businessName=" + this.businessName + ", ip=" + this.ip + ", lifeBusinessId=" + this.lifeBusinessId + ", business=" + this.business + "]";
    }
}
