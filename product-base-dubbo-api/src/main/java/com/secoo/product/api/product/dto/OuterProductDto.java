package com.secoo.product.api.product.dto;

import com.secoo.product.api.product.common.SpuBizSrcEnum;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author monkey_lwy@163.com
 * @date 2019-07-31 15:57
 * @desc
 */
public class OuterProductDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Long vendorId;
    private Long brandId;
    private Long categoryId;
    private String orgCode;
    private Integer areaType;
    /** @deprecated */
    @Deprecated
    private BigDecimal price;
    private BigDecimal secooPrice;
    private BigDecimal settlePrice;
    private Long inventory;
    private String imageUrl;
    private String model;
    private String productNum;
    private String keyword;
    private String fitting;
    private Integer status;
    private Integer editStatus;
    private Integer sellStatus;
    private Integer saleMode;
    private Integer sendType;
    private Integer sendTime;
    private Integer isCod;
    private Integer isExchange;
    private Integer storePickFlag;
    private String level;
    private Integer isMultiSpec;
    private Integer currencyType;
    private Integer settleType;
    private SpuBizSrcEnum bizSrc;
    private String operator;

    public OuterProductDto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public Integer getAreaType() {
        return this.areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    /** @deprecated */
    @Deprecated
    public BigDecimal getPrice() {
        return this.price;
    }

    /** @deprecated */
    @Deprecated
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getInventory() {
        return this.inventory;
    }

    public void setInventory(Long inventory) {
        this.inventory = inventory;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductNum() {
        return this.productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getFitting() {
        return this.fitting;
    }

    public void setFitting(String fitting) {
        this.fitting = fitting;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEditStatus() {
        return this.editStatus;
    }

    public void setEditStatus(Integer editStatus) {
        this.editStatus = editStatus;
    }

    public Integer getSellStatus() {
        return this.sellStatus;
    }

    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }

    public Integer getSaleMode() {
        return this.saleMode;
    }

    public void setSaleMode(Integer saleMode) {
        this.saleMode = saleMode;
    }

    public Integer getSendType() {
        return this.sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public Integer getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getIsCod() {
        return this.isCod;
    }

    public void setIsCod(Integer isCod) {
        this.isCod = isCod;
    }

    public Integer getIsExchange() {
        return this.isExchange;
    }

    public void setIsExchange(Integer isExchange) {
        this.isExchange = isExchange;
    }

    public Integer getStorePickFlag() {
        return this.storePickFlag;
    }

    public void setStorePickFlag(Integer storePickFlag) {
        this.storePickFlag = storePickFlag;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getIsMultiSpec() {
        return this.isMultiSpec;
    }

    public void setIsMultiSpec(Integer isMultiSpec) {
        this.isMultiSpec = isMultiSpec;
    }

    public Integer getCurrencyType() {
        return this.currencyType;
    }

    public void setCurrencyType(Integer currencyType) {
        this.currencyType = currencyType;
    }

    public Integer getSettleType() {
        return this.settleType;
    }

    public void setSettleType(Integer settleType) {
        this.settleType = settleType;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public SpuBizSrcEnum getBizSrc() {
        return this.bizSrc;
    }

    public void setBizSrc(SpuBizSrcEnum bizSrc) {
        this.bizSrc = bizSrc;
    }

    public BigDecimal getSecooPrice() {
        return this.secooPrice;
    }

    public void setSecooPrice(BigDecimal secooPrice) {
        this.secooPrice = secooPrice;
    }

    public BigDecimal getSettlePrice() {
        return this.settlePrice;
    }

    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = settlePrice;
    }

}
