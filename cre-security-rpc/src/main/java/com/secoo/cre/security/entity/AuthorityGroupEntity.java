package com.secoo.cre.security.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:00
 * @desc
 */
public class AuthorityGroupEntity implements Serializable {

    private static final long serialVersionUID = -6559348896171516535L;

    private int id;

    private String groupName;
    private String summary;
    private int state;
    private Set<AuthorityEntity> authorities = new HashSet();

    public AuthorityGroupEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Set<AuthorityEntity> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(Set<AuthorityEntity> authorities) {
        this.authorities = authorities;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String toString() {
        return "AuthorityGroupEntity [id=" + this.id + ", groupName=" + this.groupName + ", summary=" + this.summary + ", state=" + this.state + ", authorities=" + this.authorities + "]";
    }
}
