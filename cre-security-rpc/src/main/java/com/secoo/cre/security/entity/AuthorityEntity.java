package com.secoo.cre.security.entity;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:58
 * @desc
 */
public class AuthorityEntity implements Serializable {
    private static final long serialVersionUID = -8377749660534594969L;


    private int id;
    private String authority;
    private String summary;

    private String urlPattern;
    private String method;

    private String requiresChannel;
    private String filters;
    private int state;
    private String domain;

    public AuthorityEntity() {
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getUrlPattern() {
        return this.urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRequiresChannel() {
        return this.requiresChannel;
    }

    public void setRequiresChannel(String requiresChannel) {
        this.requiresChannel = requiresChannel;
    }

    public String getFilters() {
        return this.filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }





    public String toString() {
        return "AuthorityEntity [id=" + this.id + ", authority=" + this.authority + ", summary=" + this.summary + ", urlPattern=" + this.urlPattern + ", method=" + this.method + ", requiresChannel=" + this.requiresChannel + ", filters=" + this.filters + ", state=" + this.state + ", domain=" + this.domain + "]";
    }

}
