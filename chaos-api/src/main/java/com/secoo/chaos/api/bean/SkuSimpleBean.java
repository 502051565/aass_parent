package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 11:48
 * @desc
 */
public class SkuSimpleBean implements Serializable {

    private Long id;
    private Integer categoryId;
    private String orgCode;
    private Integer brandId;
    private String name;
    private String mainImgUri;
    private Long spuId;
    private Long vendorId;
    private Integer source;
    private Integer sendType;
    private Integer areaType;
    private String specValue;
    private Integer saleMode;

    public Long getId() {
        return this.id;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public String getName() {
        return this.name;
    }

    public String getMainImgUri() {
        return this.mainImgUri;
    }

    public Long getSpuId() {
        return this.spuId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public Integer getSource() {
        return this.source;
    }

    public Integer getSendType() {
        return this.sendType;
    }

    public Integer getAreaType() {
        return this.areaType;
    }

    public String getSpecValue() {
        return this.specValue;
    }

    public Integer getSaleMode() {
        return this.saleMode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMainImgUri(String mainImgUri) {
        this.mainImgUri = mainImgUri;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue;
    }

    public void setSaleMode(Integer saleMode) {
        this.saleMode = saleMode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SkuSimpleBean)) {
            return false;
        } else {
            SkuSimpleBean other = (SkuSimpleBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label167: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label167;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label167;
                    }

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

                label153: {
                    Object this$orgCode = this.getOrgCode();
                    Object other$orgCode = other.getOrgCode();
                    if (this$orgCode == null) {
                        if (other$orgCode == null) {
                            break label153;
                        }
                    } else if (this$orgCode.equals(other$orgCode)) {
                        break label153;
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

                label139: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label139;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label139;
                    }

                    return false;
                }

                Object this$mainImgUri = this.getMainImgUri();
                Object other$mainImgUri = other.getMainImgUri();
                if (this$mainImgUri == null) {
                    if (other$mainImgUri != null) {
                        return false;
                    }
                } else if (!this$mainImgUri.equals(other$mainImgUri)) {
                    return false;
                }

                label125: {
                    Object this$spuId = this.getSpuId();
                    Object other$spuId = other.getSpuId();
                    if (this$spuId == null) {
                        if (other$spuId == null) {
                            break label125;
                        }
                    } else if (this$spuId.equals(other$spuId)) {
                        break label125;
                    }

                    return false;
                }

                label118: {
                    Object this$vendorId = this.getVendorId();
                    Object other$vendorId = other.getVendorId();
                    if (this$vendorId == null) {
                        if (other$vendorId == null) {
                            break label118;
                        }
                    } else if (this$vendorId.equals(other$vendorId)) {
                        break label118;
                    }

                    return false;
                }

                Object this$source = this.getSource();
                Object other$source = other.getSource();
                if (this$source == null) {
                    if (other$source != null) {
                        return false;
                    }
                } else if (!this$source.equals(other$source)) {
                    return false;
                }

                label104: {
                    Object this$sendType = this.getSendType();
                    Object other$sendType = other.getSendType();
                    if (this$sendType == null) {
                        if (other$sendType == null) {
                            break label104;
                        }
                    } else if (this$sendType.equals(other$sendType)) {
                        break label104;
                    }

                    return false;
                }

                label97: {
                    Object this$areaType = this.getAreaType();
                    Object other$areaType = other.getAreaType();
                    if (this$areaType == null) {
                        if (other$areaType == null) {
                            break label97;
                        }
                    } else if (this$areaType.equals(other$areaType)) {
                        break label97;
                    }

                    return false;
                }

                Object this$specValue = this.getSpecValue();
                Object other$specValue = other.getSpecValue();
                if (this$specValue == null) {
                    if (other$specValue != null) {
                        return false;
                    }
                } else if (!this$specValue.equals(other$specValue)) {
                    return false;
                }

                Object this$saleMode = this.getSaleMode();
                Object other$saleMode = other.getSaleMode();
                if (this$saleMode == null) {
                    if (other$saleMode != null) {
                        return false;
                    }
                } else if (!this$saleMode.equals(other$saleMode)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuSimpleBean;
    }


    public String toString() {
        return "SkuSimpleBean(id=" + this.getId() + ", categoryId=" + this.getCategoryId() + ", orgCode=" + this.getOrgCode() + ", brandId=" + this.getBrandId() + ", name=" + this.getName() + ", mainImgUri=" + this.getMainImgUri() + ", spuId=" + this.getSpuId() + ", vendorId=" + this.getVendorId() + ", source=" + this.getSource() + ", sendType=" + this.getSendType() + ", areaType=" + this.getAreaType() + ", specValue=" + this.getSpecValue() + ", saleMode=" + this.getSaleMode() + ")";
    }

    public SkuSimpleBean() {
    }
}
