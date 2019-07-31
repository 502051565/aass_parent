package com.secoo.cre.security.entity;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:00
 * @desc
 */
public class AuthorityGroupAuthorityEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private int authorityGroupId;

    private int authorityId;

    public AuthorityGroupAuthorityEntity() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorityGroupId() {
        return this.authorityGroupId;
    }

    public void setAuthorityGroupId(int authorityGroupId) {
        this.authorityGroupId = authorityGroupId;
    }

    public int getAuthorityId() {
        return this.authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public String toString() {
        return "AuthorityGroupAuthorityEntity [id=" + this.id + ", authorityGroupId=" + this.authorityGroupId + ", authorityId=" + this.authorityId + "]";
    }
}
