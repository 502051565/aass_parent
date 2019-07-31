package com.secoo.cre.security.entity;

import com.secoo.cre.security.enums.EmployeeType;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:57
 * @desc
 */

public class EmployeeEntity implements Serializable {

    private static final long serialVersionUID = 1023490941445560065L;

    private int id;

    private long userId;
    private int type;

    private String typeName;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;
    private String summary;
    private boolean visible = true;

    private Date addTime;

    private Date modifyPassTime;

    private long businessId;

    private String openid;

    private String businessName;

    private long lifeBusinessId;

    private List<AuthorityEntity> authorities = new LinkedList();

    private List<AuthorityGroupEntity> authorityGroups = new LinkedList();

    public EmployeeEntity() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<AuthorityEntity> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(List<AuthorityEntity> authorities) {
        this.authorities = authorities;
    }

    public List<AuthorityGroupEntity> getAuthorityGroups() {
        return this.authorityGroups;
    }

    public void setAuthorityGroups(List<AuthorityGroupEntity> authorityGroups) {
        this.authorityGroups = authorityGroups;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Date getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeName() {
        return EmployeeType.name(this.type);
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getModifyPassTime() {
        return this.modifyPassTime;
    }

    public void setModifyPassTime(Date modifyPassTime) {
        this.modifyPassTime = modifyPassTime;
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

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public long getLifeBusinessId() {
        return this.lifeBusinessId;
    }

    public void setLifeBusinessId(long lifeBusinessId) {
        this.lifeBusinessId = lifeBusinessId;
    }

    public String toString() {
        return "EmployeeEntity [id=" + this.id + ", userId=" + this.userId + ", type=" + this.type + ", typeName=" + this.typeName + ", username=" + this.username + ", password=" + this.password + ", name=" + this.name + ", phone=" + this.phone + ", email=" + this.email + ", summary=" + this.summary + ", visible=" + this.visible + ", addTime=" + this.addTime + ", modifyPassTime=" + this.modifyPassTime + ", businessId=" + this.businessId + ", openid=" + this.openid + ", businessName=" + this.businessName + ", lifeBusinessId=" + this.lifeBusinessId + ", authorities=" + this.authorities + ", authorityGroups=" + this.authorityGroups + "]";
    }
}
