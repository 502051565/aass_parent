package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:38
 * @desc
 */
public class ProductBrandBean implements Serializable {
    private Long id;
    private String enName;
    private String chName;

    public ProductBrandBean() {
    }

    public Long getId() {
        return this.id;
    }

    public String getEnName() {
        return this.enName;
    }

    public String getChName() {
        return this.chName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ProductBrandBean)) {
            return false;
        } else {
            ProductBrandBean other = (ProductBrandBean)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label47;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label47;
                    }

                    return false;
                }

                Object this$enName = this.getEnName();
                Object other$enName = other.getEnName();
                if (this$enName == null) {
                    if (other$enName != null) {
                        return false;
                    }
                } else if (!this$enName.equals(other$enName)) {
                    return false;
                }

                Object this$chName = this.getChName();
                Object other$chName = other.getChName();
                if (this$chName == null) {
                    if (other$chName != null) {
                        return false;
                    }
                } else if (!this$chName.equals(other$chName)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductBrandBean;
    }



    public String toString() {
        return "ProductBrandBean(id=" + this.getId() + ", enName=" + this.getEnName() + ", chName=" + this.getChName() + ")";
    }

}
