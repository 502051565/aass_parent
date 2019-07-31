package com.secoo.cre.security.entity.config;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:32
 * @desc
 */
public class ConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String type;
    private String configkey;
    private int orderid;
    private String configvalue;
    private Date addtime;
    private String des;

    private int canEdit;

    public ConfigEntity() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConfigkey() {
        return this.configkey;
    }

    public void setConfigkey(String configkey) {
        this.configkey = configkey;
    }

    public int getOrderid() {
        return this.orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getConfigvalue() {
        return this.configvalue;
    }

    public void setConfigvalue(String configvalue) {
        this.configvalue = configvalue;
    }

    public Date getAddtime() {
        return this.addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getDes() {
        return this.des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getCanEdit() {
        return this.canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public String toString() {
        return "ConfigEntity [id=" + this.id + ", type=" + this.type + ", configkey=" + this.configkey + ", orderid=" + this.orderid + ", configvalue=" + this.configvalue + ", addtime=" + this.addtime + ", des=" + this.des + ", canEdit=" + this.canEdit + "]";
    }
}
