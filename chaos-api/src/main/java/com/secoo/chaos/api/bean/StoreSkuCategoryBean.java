package com.secoo.chaos.api.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:43
 * @desc
 */
public class StoreSkuCategoryBean implements Serializable {
    private Long storeId;
    private Long skuId;
    private List<Long> storeCategoryIds;

    public StoreSkuCategoryBean() {
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public List<Long> getStoreCategoryIds() {
        return this.storeCategoryIds;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setStoreCategoryIds(List<Long> storeCategoryIds) {
        this.storeCategoryIds = storeCategoryIds;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof StoreSkuCategoryBean)) {
            return false;
        } else {
            StoreSkuCategoryBean other = (StoreSkuCategoryBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$storeId = this.getStoreId();
                    Object other$storeId = other.getStoreId();
                    if (this$storeId == null) {
                        if (other$storeId == null) {
                            break label47;
                        }
                    } else if (this$storeId.equals(other$storeId)) {
                        break label47;
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

                Object this$storeCategoryIds = this.getStoreCategoryIds();
                Object other$storeCategoryIds = other.getStoreCategoryIds();
                if (this$storeCategoryIds == null) {
                    if (other$storeCategoryIds != null) {
                        return false;
                    }
                } else if (!this$storeCategoryIds.equals(other$storeCategoryIds)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof StoreSkuCategoryBean;
    }


    public String toString() {
        return "StoreSkuCategoryBean(storeId=" + this.getStoreId() + ", skuId=" + this.getSkuId() + ", storeCategoryIds=" + this.getStoreCategoryIds() + ")";
    }
}
