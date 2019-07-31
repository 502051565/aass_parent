package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:52
 * @desc
 */
public class ProductQueryCriteria extends PageCriteria implements Serializable {

    private Long vendorId;
    private Long categoryId;
    private Long brandId;
    private Long storeId;
    private String storeCode;
    private String productName;

    public ProductQueryCriteria() {
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ProductQueryCriteria)) {
            return false;
        } else {
            ProductQueryCriteria other = (ProductQueryCriteria)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$vendorId = this.getVendorId();
                Object other$vendorId = other.getVendorId();
                if (this$vendorId == null) {
                    if (other$vendorId != null) {
                        return false;
                    }
                } else if (!this$vendorId.equals(other$vendorId)) {
                    return false;
                }

                Object this$categoryId = this.getCategoryId();
                Object other$categoryId = other.getCategoryId();
                if (this$categoryId == null) {
                    if (other$categoryId != null) {
                        return false;
                    }
                } else if (!this$categoryId.equals(other$categoryId)) {
                    return false;
                }

                Object this$brandId = this.getBrandId();
                Object other$brandId = other.getBrandId();
                if (this$brandId == null) {
                    if (other$brandId != null) {
                        return false;
                    }
                } else if (!this$brandId.equals(other$brandId)) {
                    return false;
                }

                label62: {
                    Object this$storeId = this.getStoreId();
                    Object other$storeId = other.getStoreId();
                    if (this$storeId == null) {
                        if (other$storeId == null) {
                            break label62;
                        }
                    } else if (this$storeId.equals(other$storeId)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$storeCode = this.getStoreCode();
                    Object other$storeCode = other.getStoreCode();
                    if (this$storeCode == null) {
                        if (other$storeCode == null) {
                            break label55;
                        }
                    } else if (this$storeCode.equals(other$storeCode)) {
                        break label55;
                    }

                    return false;
                }

                Object this$productName = this.getProductName();
                Object other$productName = other.getProductName();
                if (this$productName == null) {
                    if (other$productName != null) {
                        return false;
                    }
                } else if (!this$productName.equals(other$productName)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductQueryCriteria;
    }


    public String toString() {
        return "ProductQueryCriteria(vendorId=" + this.getVendorId() + ", categoryId=" + this.getCategoryId() + ", brandId=" + this.getBrandId() + ", storeId=" + this.getStoreId() + ", storeCode=" + this.getStoreCode() + ", productName=" + this.getProductName() + ")";
    }
}
