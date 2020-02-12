package com.brightman.inventory.brand;

public class Brand {
    private Integer brandID;
    private String brandName;
    private String status;
    private String createdDate;
    private Integer createdUserID;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getBrandID() {
        return brandID;
    }
    
    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
