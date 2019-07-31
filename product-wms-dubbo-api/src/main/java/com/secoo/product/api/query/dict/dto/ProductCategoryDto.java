package com.secoo.product.api.query.dict.dto;

import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:47
 * @desc
 */
public class ProductCategoryDto extends SimpleCategoryDto {

    private static final long serialVersionUID = -7805595047992447711L;
    private Long id;
    private Long productTypeId;
    private String orgCode;
    private String name;
    private String ename;
    private Long parentId;
    private Integer enabled;
    private Long priority;
    private Integer isDel;
    private Date createDate;
    private String creator;
    private Date modifyDate;
    private String modify;
    private Long version;

    public ProductCategoryDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductTypeId() {
        return this.productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return this.ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Long getPriority() {
        return this.priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModify() {
        return this.modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
