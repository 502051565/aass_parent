package com.secoo.chaos.api.bean;

import java.io.Serializable;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 14:38
 * @desc
 */
public class ProductBean implements Serializable {

    private Long id;
    private String name;
    private String imageUrl;
    private String details;

    public ProductBean() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getDetails() {
        return this.details;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ProductBean)) {
            return false;
        } else {
            ProductBean other = (ProductBean)o;
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

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$imageUrl = this.getImageUrl();
                Object other$imageUrl = other.getImageUrl();
                if (this$imageUrl == null) {
                    if (other$imageUrl != null) {
                        return false;
                    }
                } else if (!this$imageUrl.equals(other$imageUrl)) {
                    return false;
                }

                Object this$details = this.getDetails();
                Object other$details = other.getDetails();
                if (this$details == null) {
                    if (other$details != null) {
                        return false;
                    }
                } else if (!this$details.equals(other$details)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductBean;
    }


    public String toString() {
        return "ProductBean(id=" + this.getId() + ", name=" + this.getName() + ", imageUrl=" + this.getImageUrl() + ", details=" + this.getDetails() + ")";
    }
}
