package com.secoo.product.api.query.dict.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:39
 * @desc
 */
public class SimpleBrandDto implements Serializable {

    private static final long serialVersionUID = -2843204052228121380L;
    private Long id;
    private String enName;
    private String chName;

    public SimpleBrandDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getChName() {
        return this.chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String toString() {
        return "ProductBrand [id=" + this.id + ", enName=" + this.enName + ", chName=" + this.chName + "]";
    }
}
