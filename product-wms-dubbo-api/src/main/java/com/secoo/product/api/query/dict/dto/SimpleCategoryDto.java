package com.secoo.product.api.query.dict.dto;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:47
 * @desc
 */
public class SimpleCategoryDto implements Serializable {

    private static final long serialVersionUID = 6929994762164261652L;
    private Long id;
    private String orgCode;
    private Long productTypeId;
    private Long parentId;
    private String name;

    public SimpleCategoryDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Long getProductTypeId() {
        return this.productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
