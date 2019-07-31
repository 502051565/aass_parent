package com.secoo.chaos.api.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:39
 * @desc
 */
public class ProductLogisticsAttrBean implements Serializable {

    private Long productId;
    private Integer isFlightBan;
    private Integer transportWay;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private BigDecimal weight;

    public ProductLogisticsAttrBean() {
    }

    public Long getProductId() {
        return this.productId;
    }

    public Integer getIsFlightBan() {
        return this.isFlightBan;
    }

    public Integer getTransportWay() {
        return this.transportWay;
    }

    public BigDecimal getLength() {
        return this.length;
    }

    public BigDecimal getWidth() {
        return this.width;
    }

    public BigDecimal getHeight() {
        return this.height;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setIsFlightBan(Integer isFlightBan) {
        this.isFlightBan = isFlightBan;
    }

    public void setTransportWay(Integer transportWay) {
        this.transportWay = transportWay;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ProductLogisticsAttrBean)) {
            return false;
        } else {
            ProductLogisticsAttrBean other = (ProductLogisticsAttrBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label95: {
                    Object this$productId = this.getProductId();
                    Object other$productId = other.getProductId();
                    if (this$productId == null) {
                        if (other$productId == null) {
                            break label95;
                        }
                    } else if (this$productId.equals(other$productId)) {
                        break label95;
                    }

                    return false;
                }

                Object this$isFlightBan = this.getIsFlightBan();
                Object other$isFlightBan = other.getIsFlightBan();
                if (this$isFlightBan == null) {
                    if (other$isFlightBan != null) {
                        return false;
                    }
                } else if (!this$isFlightBan.equals(other$isFlightBan)) {
                    return false;
                }

                Object this$transportWay = this.getTransportWay();
                Object other$transportWay = other.getTransportWay();
                if (this$transportWay == null) {
                    if (other$transportWay != null) {
                        return false;
                    }
                } else if (!this$transportWay.equals(other$transportWay)) {
                    return false;
                }

                label74: {
                    Object this$length = this.getLength();
                    Object other$length = other.getLength();
                    if (this$length == null) {
                        if (other$length == null) {
                            break label74;
                        }
                    } else if (this$length.equals(other$length)) {
                        break label74;
                    }

                    return false;
                }

                label67: {
                    Object this$width = this.getWidth();
                    Object other$width = other.getWidth();
                    if (this$width == null) {
                        if (other$width == null) {
                            break label67;
                        }
                    } else if (this$width.equals(other$width)) {
                        break label67;
                    }

                    return false;
                }

                Object this$height = this.getHeight();
                Object other$height = other.getHeight();
                if (this$height == null) {
                    if (other$height != null) {
                        return false;
                    }
                } else if (!this$height.equals(other$height)) {
                    return false;
                }

                Object this$weight = this.getWeight();
                Object other$weight = other.getWeight();
                if (this$weight == null) {
                    if (other$weight != null) {
                        return false;
                    }
                } else if (!this$weight.equals(other$weight)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductLogisticsAttrBean;
    }



    public String toString() {
        return "ProductLogisticsAttrBean(productId=" + this.getProductId() + ", isFlightBan=" + this.getIsFlightBan() + ", transportWay=" + this.getTransportWay() + ", length=" + this.getLength() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", weight=" + this.getWeight() + ")";
    }
}
