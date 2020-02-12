package com.brightman.inventory.product;

public class Product {
    private Integer productID;
    private String productCode;
    private String productName;
    private Integer categoryID;
    private Integer brandID;
    private Integer unit;
    private Float unitPrice1;
    private Float unitPrice2;
    private Float unitPrice3;
    private Float hpp;
    private Float purchasePrice;
    private String note;
    private Integer stockAmount;
    private String image;
    private Integer minimumStock;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getProductID() {
        return productID;
    }
    
    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Float getUnitPrice1() {
        return unitPrice1;
    }

    public void setUnitPrice1(Float unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }

    public Float getUnitPrice2() {
        return unitPrice2;
    }

    public void setUnitPrice2(Float unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    public Float getUnitPrice3() {
        return unitPrice3;
    }

    public void setUnitPrice3(Float unitPrice3) {
        this.unitPrice3 = unitPrice3;
    }

    public Float getHpp() {
        return hpp;
    }

    public void setHpp(Float hpp) {
        this.hpp = hpp;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(Integer minimumStock) {
        this.minimumStock = minimumStock;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedUserID() {
        return createdUserID;
    }

    public void setCreatedUserID(Integer createdUserID) {
        this.createdUserID = createdUserID;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedUserID() {
        return modifiedUserID;
    }

    public void setModifiedUserID(Integer modifiedUserID) {
        this.modifiedUserID = modifiedUserID;
    }
}
