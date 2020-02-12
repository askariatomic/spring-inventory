package com.brightman.inventory.delivery_order;

public class DeliveryOrder {
    private Integer doID;
    private String doNo;
    private String doFaktur;
    private Integer soID;
    private String soNo;
    private Integer customerID;
    private String customerName;
    private String customerAddress;
    private Integer staffID;
    private String staffName;
    private String deliveredDate;
    private String orderDate;
    private Integer needDate;
    private Float total;
    private String note;
    private String createdDate;
    private Integer createdUserID;
    private Float modifiedDate;
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

    public Integer getSoID() {
        return soID;
    }

    public void setSoID(Integer soID) {
        this.soID = soID;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
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

    public String getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(String deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getNeedDate() {
        return needDate;
    }

    public void setNeedDate(Integer needDate) {
        this.needDate = needDate;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
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

    public Float getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Float modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedUserID() {
        return modifiedUserID;
    }

    public void setModifiedUserID(Integer modifiedUserID) {
        this.modifiedUserID = modifiedUserID;
    }
}
