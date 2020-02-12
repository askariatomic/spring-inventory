package com.brightman.inventory.receivable;

public class Receivable {
    private Integer receiveID;
    private String receiveNo;
    private Integer invoiceID;
    private String invoiceNo;
    private Integer customerID;
    private String customerName;
    private String customerAddress;
    private Float receiveTotal;
    private Float incomingTotal;
    private Float reductionTotal;
    private String status;
    private Integer staffID;
    private String staffName;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getReceiveID() {
        return receiveID;
    }
    
    public void setReceiveID(Integer receiveID) {
        this.receiveID = receiveID;
    }

    public String getReceiveNo() {
        return receiveNo;
    }

    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo;
    }

    public Integer getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Float getReceiveTotal() {
        return receiveTotal;
    }

    public void setReceiveTotal(Float receiveTotal) {
        this.receiveTotal = receiveTotal;
    }

    public Float getIncomingTotal() {
        return incomingTotal;
    }

    public void setIncomingTotal(Float incomingTotal) {
        this.incomingTotal = incomingTotal;
    }

    public Float getReductionTotal() {
        return reductionTotal;
    }

    public void setReductionTotal(Float reductionTotal) {
        this.reductionTotal = reductionTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
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
