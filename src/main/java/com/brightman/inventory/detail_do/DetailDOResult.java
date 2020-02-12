package com.brightman.inventory.detail_do;

public class DetailDOResult {
    private Integer doID;
    private String doNo;
    private String doFaktur;
    private Integer productID;
    private String productName;
    private Float price;
    private Integer qty;
    private Integer deliveredQty;
    private String deliveredStatus;
    private Integer factoryID;
    private String factoryName;
    private String note;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getDoID() {
        return doID;
    }
    
    public void setDoID(Integer doID) {
        this.doID = doID;
    }

    public String getDoNo() {
        return doNo;
    }

    public void setDoNo(String doNo) {
        this.doNo = doNo;
    }

    public String getDoFaktur() {
        return doFaktur;
    }

    public void setDoFaktur(String doFaktur) {
        this.doFaktur = doFaktur;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getDeliveredQty() {
        return deliveredQty;
    }

    public void setDeliveredQty(Integer deliveredQty) {
        this.deliveredQty = deliveredQty;
    }

    public String getDeliveredStatus() {
        return deliveredStatus;
    }

    public void setDeliveredStatus(String deliveredStatus) {
        this.deliveredStatus = deliveredStatus;
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
