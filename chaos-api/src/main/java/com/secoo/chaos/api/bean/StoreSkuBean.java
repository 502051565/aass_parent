package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:42
 * @desc
 */
public class StoreSkuBean implements Serializable {

    private static final long serialVersionUID = -1L;
    private Long Id;
    private Long skuId;
    private Long spuId;
    private Long storeId;
    private Long categoryId;
    private Long brandId;
    private Integer storeType;
    private Integer isMemberDiscount;
    private Integer source;
    private String productName;
    private String storeCode;

    public StoreSkuBean() {
    }

    public Long getId() {
        return this.Id;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public Integer getStoreType() {
        return this.storeType;
    }

    public Integer getIsMemberDiscount() {
        return this.isMemberDiscount;
    }

    public Integer getSource() {
        return this.source;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public void setIsMemberDiscount(Integer isMemberDiscount) {
        this.isMemberDiscount = isMemberDiscount;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof StoreSkuBean)) {
            return false;
        } else {
            StoreSkuBean other = (StoreSkuBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label143: {
                    Object this$Id = this.getId();
                    Object other$Id = other.getId();
                    if (this$Id == null) {
                        if (other$Id == null) {
                            break label143;
                        }
                    } else if (this$Id.equals(other$Id)) {
                        break label143;
                    }

                    return false;
                }

                Object this$skuId = this.getSkuId();
                Object other$skuId = other.getSkuId();
                if (this$skuId == null) {
                    if (other$skuId != null) {
                        return false;
                    }
                } else if (!this$skuId.equals(other$skuId)) {
                    return false;
                }

                Object this$spuId = this.getSpuId();
                Object other$spuId = other.getSpuId();
                if (this$spuId == null) {
                    if (other$spuId != null) {
                        return false;
                    }
                } else if (!this$spuId.equals(other$spuId)) {
                    return false;
                }

                label122: {
                    Object this$storeId = this.getStoreId();
                    Object other$storeId = other.getStoreId();
                    if (this$storeId == null) {
                        if (other$storeId == null) {
                            break label122;
                        }
                    } else if (this$storeId.equals(other$storeId)) {
                        break label122;
                    }

                    return false;
                }

                label115: {
                    Object this$categoryId = this.getCategoryId();
                    Object other$categoryId = other.getCategoryId();
                    if (this$categoryId == null) {
                        if (other$categoryId == null) {
                            break label115;
                        }
                    } else if (this$categoryId.equals(other$categoryId)) {
                        break label115;
                    }

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

                Object this$storeType = this.getStoreType();
                Object other$storeType = other.getStoreType();
                if (this$storeType == null) {
                    if (other$storeType != null) {
                        return false;
                    }
                } else if (!this$storeType.equals(other$storeType)) {
                    return false;
                }

                label94: {
                    Object this$isMemberDiscount = this.getIsMemberDiscount();
                    Object other$isMemberDiscount = other.getIsMemberDiscount();
                    if (this$isMemberDiscount == null) {
                        if (other$isMemberDiscount == null) {
                            break label94;
                        }
                    } else if (this$isMemberDiscount.equals(other$isMemberDiscount)) {
                        break label94;
                    }

                    return false;
                }

                label87: {
                    Object this$source = this.getSource();
                    Object other$source = other.getSource();
                    if (this$source == null) {
                        if (other$source == null) {
                            break label87;
                        }
                    } else if (this$source.equals(other$source)) {
                        break label87;
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

                Object this$storeCode = this.getStoreCode();
                Object other$storeCode = other.getStoreCode();
                if (this$storeCode == null) {
                    if (other$storeCode != null) {
                        return false;
                    }
                } else if (!this$storeCode.equals(other$storeCode)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof StoreSkuBean;
    }



    public String toString() {
        return "StoreSkuBean(Id=" + this.getId() + ", skuId=" + this.getSkuId() + ", spuId=" + this.getSpuId() + ", storeId=" + this.getStoreId() + ", categoryId=" + this.getCategoryId() + ", brandId=" + this.getBrandId() + ", storeType=" + this.getStoreType() + ", isMemberDiscount=" + this.getIsMemberDiscount() + ", source=" + this.getSource() + ", productName=" + this.getProductName() + ", storeCode=" + this.getStoreCode() + ")";
    }
}
