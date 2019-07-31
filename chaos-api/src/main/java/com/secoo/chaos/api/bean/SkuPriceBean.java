package com.secoo.chaos.api.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:41
 * @desc
 */
public class SkuPriceBean implements Serializable {

    private BigDecimal secooPrice;
    private BigDecimal marketPrice;
    private BigDecimal settlePrice;
    private BigDecimal originalSettlePrice;
    private BigDecimal localSettlePrice;
    private BigDecimal localSecooPrice;
    private BigDecimal localMarketPrice;

    public SkuPriceBean() {
    }

    public BigDecimal getSecooPrice() {
        return this.secooPrice;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public BigDecimal getSettlePrice() {
        return this.settlePrice;
    }

    public BigDecimal getOriginalSettlePrice() {
        return this.originalSettlePrice;
    }

    public BigDecimal getLocalSettlePrice() {
        return this.localSettlePrice;
    }

    public BigDecimal getLocalSecooPrice() {
        return this.localSecooPrice;
    }

    public BigDecimal getLocalMarketPrice() {
        return this.localMarketPrice;
    }

    public void setSecooPrice(BigDecimal secooPrice) {
        this.secooPrice = secooPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = settlePrice;
    }

    public void setOriginalSettlePrice(BigDecimal originalSettlePrice) {
        this.originalSettlePrice = originalSettlePrice;
    }

    public void setLocalSettlePrice(BigDecimal localSettlePrice) {
        this.localSettlePrice = localSettlePrice;
    }

    public void setLocalSecooPrice(BigDecimal localSecooPrice) {
        this.localSecooPrice = localSecooPrice;
    }

    public void setLocalMarketPrice(BigDecimal localMarketPrice) {
        this.localMarketPrice = localMarketPrice;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SkuPriceBean)) {
            return false;
        } else {
            SkuPriceBean other = (SkuPriceBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label95: {
                    Object this$secooPrice = this.getSecooPrice();
                    Object other$secooPrice = other.getSecooPrice();
                    if (this$secooPrice == null) {
                        if (other$secooPrice == null) {
                            break label95;
                        }
                    } else if (this$secooPrice.equals(other$secooPrice)) {
                        break label95;
                    }

                    return false;
                }

                Object this$marketPrice = this.getMarketPrice();
                Object other$marketPrice = other.getMarketPrice();
                if (this$marketPrice == null) {
                    if (other$marketPrice != null) {
                        return false;
                    }
                } else if (!this$marketPrice.equals(other$marketPrice)) {
                    return false;
                }

                Object this$settlePrice = this.getSettlePrice();
                Object other$settlePrice = other.getSettlePrice();
                if (this$settlePrice == null) {
                    if (other$settlePrice != null) {
                        return false;
                    }
                } else if (!this$settlePrice.equals(other$settlePrice)) {
                    return false;
                }

                label74: {
                    Object this$originalSettlePrice = this.getOriginalSettlePrice();
                    Object other$originalSettlePrice = other.getOriginalSettlePrice();
                    if (this$originalSettlePrice == null) {
                        if (other$originalSettlePrice == null) {
                            break label74;
                        }
                    } else if (this$originalSettlePrice.equals(other$originalSettlePrice)) {
                        break label74;
                    }

                    return false;
                }

                label67: {
                    Object this$localSettlePrice = this.getLocalSettlePrice();
                    Object other$localSettlePrice = other.getLocalSettlePrice();
                    if (this$localSettlePrice == null) {
                        if (other$localSettlePrice == null) {
                            break label67;
                        }
                    } else if (this$localSettlePrice.equals(other$localSettlePrice)) {
                        break label67;
                    }

                    return false;
                }

                Object this$localSecooPrice = this.getLocalSecooPrice();
                Object other$localSecooPrice = other.getLocalSecooPrice();
                if (this$localSecooPrice == null) {
                    if (other$localSecooPrice != null) {
                        return false;
                    }
                } else if (!this$localSecooPrice.equals(other$localSecooPrice)) {
                    return false;
                }

                Object this$localMarketPrice = this.getLocalMarketPrice();
                Object other$localMarketPrice = other.getLocalMarketPrice();
                if (this$localMarketPrice == null) {
                    if (other$localMarketPrice != null) {
                        return false;
                    }
                } else if (!this$localMarketPrice.equals(other$localMarketPrice)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuPriceBean;
    }


    public String toString() {
        return "SkuPriceBean(secooPrice=" + this.getSecooPrice() + ", marketPrice=" + this.getMarketPrice() + ", settlePrice=" + this.getSettlePrice() + ", originalSettlePrice=" + this.getOriginalSettlePrice() + ", localSettlePrice=" + this.getLocalSettlePrice() + ", localSecooPrice=" + this.getLocalSecooPrice() + ", localMarketPrice=" + this.getLocalMarketPrice() + ")";
    }
}
