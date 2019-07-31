package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:39
 * @desc
 */
public class ProductCategoryBean implements Serializable {

    private Long id;
    private Long productTypeId;
    private String orgCode;
    private String name;
    private Long parentId;
    private int leafFlag;

    public ProductCategoryBean() {
    }

    public Long getId() {
        return this.id;
    }

    public Long getProductTypeId() {
        return this.productTypeId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getName() {
        return this.name;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public int getLeafFlag() {
        return this.leafFlag;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setLeafFlag(int leafFlag) {
        this.leafFlag = leafFlag;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ProductCategoryBean)) {
            return false;
        } else {
            ProductCategoryBean other = (ProductCategoryBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label75: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label75;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label75;
                    }

                    return false;
                }

                Object this$productTypeId = this.getProductTypeId();
                Object other$productTypeId = other.getProductTypeId();
                if (this$productTypeId == null) {
                    if (other$productTypeId != null) {
                        return false;
                    }
                } else if (!this$productTypeId.equals(other$productTypeId)) {
                    return false;
                }

                Object this$orgCode = this.getOrgCode();
                Object other$orgCode = other.getOrgCode();
                if (this$orgCode == null) {
                    if (other$orgCode != null) {
                        return false;
                    }
                } else if (!this$orgCode.equals(other$orgCode)) {
                    return false;
                }

                label54: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label54;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label54;
                    }

                    return false;
                }

                label47: {
                    Object this$parentId = this.getParentId();
                    Object other$parentId = other.getParentId();
                    if (this$parentId == null) {
                        if (other$parentId == null) {
                            break label47;
                        }
                    } else if (this$parentId.equals(other$parentId)) {
                        break label47;
                    }

                    return false;
                }

                if (this.getLeafFlag() != other.getLeafFlag()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductCategoryBean;
    }


    public String toString() {
        return "ProductCategoryBean(id=" + this.getId() + ", productTypeId=" + this.getProductTypeId() + ", orgCode=" + this.getOrgCode() + ", name=" + this.getName() + ", parentId=" + this.getParentId() + ", leafFlag=" + this.getLeafFlag() + ")";
    }
}
