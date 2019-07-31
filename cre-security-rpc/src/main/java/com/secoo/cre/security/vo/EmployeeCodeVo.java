package com.secoo.cre.security.vo;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:07
 * @desc
 */
public class EmployeeCodeVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String code;

    public EmployeeCodeVo() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        return "EmployeeCodeVo [id=" + this.id + ", code=" + this.code + "]";
    }
}
