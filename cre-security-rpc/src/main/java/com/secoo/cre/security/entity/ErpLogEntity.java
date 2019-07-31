package com.secoo.cre.security.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:29
 * @desc
 */
public class ErpLogEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String version;
    private String phoneid;
    private int source;

    private int employeeId;
    private String url;
    private String params;

    private Date addTime;

    private int executeTime;
    private String ip;

    public ErpLogEntity() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPhoneid() {
        return this.phoneid;
    }

    public void setPhoneid(String phoneid) {
        this.phoneid = phoneid;
    }

    public int getSource() {
        return this.source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParams() {
        return this.params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Date getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getExecuteTime() {
        return this.executeTime;
    }

    public void setExecuteTime(int executeTime) {
        this.executeTime = executeTime;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String toString() {
        return "ErpLogEntity [id=" + this.id + ", version=" + this.version + ", phoneid=" + this.phoneid + ", source=" + this.source + ", employeeId=" + this.employeeId + ", url=" + this.url + ", params=" + this.params + ", addTime=" + this.addTime + ", executeTime=" + this.executeTime + ", ip=" + this.ip + "]";
    }
}
