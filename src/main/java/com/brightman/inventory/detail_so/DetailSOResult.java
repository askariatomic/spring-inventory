package com.brightman.inventory.detail_so;

public class DetailSOResult {
    private Integer detailID;
    private String soNo;
    private String soFaktur;
    private Integer productID;
    private String productName;
    private Integer price;
    private Integer qty;
    private String note;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public String getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getDetailID() {
        return detailID;
    }

    public void setDetailID(Integer detailID) {
        this.detailID = detailID;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getSoFaktur() {
        return soFaktur;
    }

    public void setSoFaktur(String soFaktur) {
        this.soFaktur = soFaktur;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
