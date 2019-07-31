package com.secoo.product.api.query.dict.dto;

import java.util.Date;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:40
 * @desc
 */
public class ProductBrandDto extends SimpleBrandDto {
    private static final long serialVersionUID = 6524778083487729553L;
    private Long id;
    private String enName;
    private String chName;
    private String initial;
    private Long priority;
    private Integer enabled;
    private Integer isShow;
    private Integer isDel;
    private Date createDate;
    private String creator;
    private Date modifyDate;
    private String modify;
    private Long version;

    public ProductBrandDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getChName() {
        return this.chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getInitial() {
        return this.initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public Long getPriority() {
        return this.priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Integer getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getIsShow() {
        return this.isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModify() {
        return this.modify;
    }

    public void setModify(String modify) {
        this.modify = modify;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
