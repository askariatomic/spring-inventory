package com.brightman.inventory.module;

public class ModuleResult {
    private Integer modulID;
    private String modulName;
    private String authorize;
    private String status;
    private String modifiedDate;
    private Integer modifiedUserID;
    
    public Integer getModulID() {
        return modulID;
    }
    
    public void setModulID(Integer modulID) {
        this.modulID = modulID;
    }

    public String getModulName() {
        return modulName;
    }

    public void setModulName(String modulName) {
        this.modulName = modulName;
    }

    public String getAuthorize() {
        return authorize;
    }

    public void setAuthorize(String authorize) {
        this.authorize = authorize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
