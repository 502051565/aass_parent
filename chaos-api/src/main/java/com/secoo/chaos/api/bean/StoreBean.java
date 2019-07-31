package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:42
 * @desc
 */
public class StoreBean implements Serializable {

    private static final long serialVersionUID = -1L;
    private Long vendorId;
    private String vendorCode;
    private Integer storeType;
    private Integer storeModel;
    private String storeName;
    private String storeCode;
    private String storeLogo;
    private String storeSummary;
    private Long storeId;

    public StoreBean() {
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public String getVendorCode() {
        return this.vendorCode;
    }

    public Integer getStoreType() {
        return this.storeType;
    }

    public Integer getStoreModel() {
        return this.storeModel;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getStoreLogo() {
        return this.storeLogo;
    }

    public String getStoreSummary() {
        return this.storeSummary;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public void setStoreModel(Integer storeModel) {
        this.storeModel = storeModel;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    public void setStoreSummary(String storeSummary) {
        this.storeSummary = storeSummary;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof StoreBean)) {
            return false;
        } else {
            StoreBean other = (StoreBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label119: {
                    Object this$vendorId = this.getVendorId();
                    Object other$vendorId = other.getVendorId();
                    if (this$vendorId == null) {
                        if (other$vendorId == null) {
                            break label119;
                        }
                    } else if (this$vendorId.equals(other$vendorId)) {
                        break label119;
                    }

                    return false;
                }

                Object this$vendorCode = this.getVendorCode();
                Object other$vendorCode = other.getVendorCode();
                if (this$vendorCode == null) {
                    if (other$vendorCode != null) {
                        return false;
                    }
                } else if (!this$vendorCode.equals(other$vendorCode)) {
                    return false;
                }

                label105: {
                    Object this$storeType = this.getStoreType();
                    Object other$storeType = other.getStoreType();
                    if (this$storeType == null) {
                        if (other$storeType == null) {
                            break label105;
                        }
                    } else if (this$storeType.equals(other$storeType)) {
                        break label105;
                    }

                    return false;
                }

                Object this$storeModel = this.getStoreModel();
                Object other$storeModel = other.getStoreModel();
                if (this$storeModel == null) {
                    if (other$storeModel != null) {
                        return false;
                    }
                } else if (!this$storeModel.equals(other$storeModel)) {
                    return false;
                }

                label91: {
                    Object this$storeName = this.getStoreName();
                    Object other$storeName = other.getStoreName();
                    if (this$storeName == null) {
                        if (other$storeName == null) {
                            break label91;
                        }
                    } else if (this$storeName.equals(other$storeName)) {
                        break label91;
                    }

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

                label77: {
                    Object this$storeLogo = this.getStoreLogo();
                    Object other$storeLogo = other.getStoreLogo();
                    if (this$storeLogo == null) {
                        if (other$storeLogo == null) {
                            break label77;
                        }
                    } else if (this$storeLogo.equals(other$storeLogo)) {
                        break label77;
                    }

                    return false;
                }

                label70: {
                    Object this$storeSummary = this.getStoreSummary();
                    Object other$storeSummary = other.getStoreSummary();
                    if (this$storeSummary == null) {
                        if (other$storeSummary == null) {
                            break label70;
                        }
                    } else if (this$storeSummary.equals(other$storeSummary)) {
                        break label70;
                    }

                    return false;
                }

                Object this$storeId = this.getStoreId();
                Object other$storeId = other.getStoreId();
                if (this$storeId == null) {
                    if (other$storeId != null) {
                        return false;
                    }
                } else if (!this$storeId.equals(other$storeId)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof StoreBean;
    }



    public String toString() {
        return "StoreBean(vendorId=" + this.getVendorId() + ", vendorCode=" + this.getVendorCode() + ", storeType=" + this.getStoreType() + ", storeModel=" + this.getStoreModel() + ", storeName=" + this.getStoreName() + ", storeCode=" + this.getStoreCode() + ", storeLogo=" + this.getStoreLogo() + ", storeSummary=" + this.getStoreSummary() + ", storeId=" + this.getStoreId() + ")";
    }
}
