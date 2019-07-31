package com.secoo.chaos.api.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:36
 * @desc
 */
public class CategoryBrandBean implements Serializable {

    private Long id;
    private String orgCode;
    private String categoryName;
    List<ProductBrandBean> brands;

    public CategoryBrandBean() {
    }

    public Long getId() {
        return this.id;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public List<ProductBrandBean> getBrands() {
        return this.brands;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setBrands(List<ProductBrandBean> brands) {
        this.brands = brands;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CategoryBrandBean)) {
            return false;
        } else {
            CategoryBrandBean other = (CategoryBrandBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label59;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label59;
                    }

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

                Object this$categoryName = this.getCategoryName();
                Object other$categoryName = other.getCategoryName();
                if (this$categoryName == null) {
                    if (other$categoryName != null) {
                        return false;
                    }
                } else if (!this$categoryName.equals(other$categoryName)) {
                    return false;
                }

                Object this$brands = this.getBrands();
                Object other$brands = other.getBrands();
                if (this$brands == null) {
                    if (other$brands != null) {
                        return false;
                    }
                } else if (!this$brands.equals(other$brands)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof CategoryBrandBean;
    }


    public String toString() {
        return "CategoryBrandBean(id=" + this.getId() + ", orgCode=" + this.getOrgCode() + ", categoryName=" + this.getCategoryName() + ", brands=" + this.getBrands() + ")";
    }
}
