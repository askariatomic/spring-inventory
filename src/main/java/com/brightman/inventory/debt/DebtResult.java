package com.brightman.inventory.debt;

public class DebtResult {
    private Integer debtID;
    private String debtNo;
    private Integer invoiceID;
    private String invoiceNo;
    private Integer supplierID;
    private String supplierName;
    private String supplierAddress;
    private Float debtTotal;
    private Float incomingTotal;
    private Float reductionTotal;
    private String status;
    private Integer staffID;
    private String staffName;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getDebtID() {
        return debtID;
    }
    
    public void setDebtID(Integer debtID) {
        this.debtID = debtID;
    }

    public String getDebtNo() {
        return debtNo;
    }

    public void setDebtNo(String debtNo) {
        this.debtNo = debtNo;
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

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public Float getDebtTotal() {
        return debtTotal;
    }

    public void setDebtTotal(Float debtTotal) {
        this.debtTotal = debtTotal;
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
