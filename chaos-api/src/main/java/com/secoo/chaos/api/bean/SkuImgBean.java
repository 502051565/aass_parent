package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:41
 * @desc
 */
public class SkuImgBean implements Serializable {

    private Long skuId;
    private String url;

    public Long getSkuId() {
        return this.skuId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SkuImgBean)) {
            return false;
        } else {
            SkuImgBean other = (SkuImgBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$skuId = this.getSkuId();
                Object other$skuId = other.getSkuId();
                if (this$skuId == null) {
                    if (other$skuId != null) {
                        return false;
                    }
                } else if (!this$skuId.equals(other$skuId)) {
                    return false;
                }

                Object this$url = this.getUrl();
                Object other$url = other.getUrl();
                if (this$url == null) {
                    if (other$url != null) {
                        return false;
                    }
                } else if (!this$url.equals(other$url)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuImgBean;
    }

    public String toString() {
        return "SkuImgBean(skuId=" + this.getSkuId() + ", url=" + this.getUrl() + ")";
    }

    public SkuImgBean() {
    }
}
