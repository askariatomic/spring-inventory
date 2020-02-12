package com.brightman.inventory.detail_retur_supplier;

public class DetailReturSupplier {
    private Integer detailID;
    private Integer returID;
    private String returNo;
    private Integer factoryID;
    private String factoryName;
    private Integer productID;
    private String productName;
    private Integer qty;
    private Float unitPrice;
    private String note;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getDetailID() {
        return detailID;
    }
    
    public void setDetailID(Integer detailID) {
        this.detailID = detailID;
    }

    public Integer getReturID() {
        return returID;
    }

    public void setReturID(Integer returID) {
        this.returID = returID;
    }

    public String getReturNo() {
        return returNo;
    }

    public void setReturNo(String returNo) {
        this.returNo = returNo;
    }

    public Integer getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(Integer factoryID) {
        this.factoryID = factoryID;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
