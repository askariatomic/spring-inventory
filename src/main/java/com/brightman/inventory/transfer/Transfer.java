package com.brightman.inventory.transfer;

public class Transfer {
    private Integer transferID;
    private String transferCode;
    private String transferFaktur;
    private String ref;
    private String trxDate;
    private String note;
    private Integer transferFrom;
    private Integer transferTo;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getTransferID() {
        return transferID;
    }
    
    public void setTransferID(Integer transferID) {
        this.transferID = transferID;
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

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTrxDate() {
        return trxDate;
    }

    public void setTrxDate(String trxDate) {
        this.trxDate = trxDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom(Integer transferFrom) {
        this.transferFrom = transferFrom;
    }

    public Integer getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(Integer transferTo) {
        this.transferTo = transferTo;
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
