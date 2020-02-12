package com.brightman.inventory.temp_detail_transfer;

public class TempDetailTransfer {
    private Integer detailID;
    private String transferCode;
    private String transferFaktur;
    private Integer productID;
    private String productName;
    private Integer qty;
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

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode;
    }

    public String getTransferFaktur() {
        return transferFaktur;
    }

    public void setTransferFaktur(String transferFaktur) {
        this.transferFaktur = transferFaktur;
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
