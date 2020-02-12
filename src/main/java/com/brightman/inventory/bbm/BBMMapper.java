package com.brightman.inventory.bbm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BBMMapper implements RowMapper<BBMResult>{
    @Override
    public BBMResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        BBM bbm = new BBM();
        bbm.setBbmID(rs.getInt("bbmID"));
        bbm.setBbmFaktur(rs.getString("bbmFaktur"));
        bbm.setBbmNo(rs.getString("bbmNo"));
        bbm.setSpbID(rs.getInt("spbID"));
        bbm.setSpbNo(rs.getString("spbNo"));
        bbm.setSupplierID(rs.getInt("supplierID"));
        bbm.setSupplierName(rs.getString("supplierName"));
        bbm.setSupplierAddress(rs.getString("supplierAddress"));
        bbm.setStaffID(rs.getInt("staffID"));
        bbm.setStaffName(rs.getString("staffName"));
        bbm.setReceiveDate(rs.getString("receiveDate"));
        bbm.setOrderDate(rs.getString("orderDate"));
        bbm.setNeedDate(rs.getString("needDate"));
        bbm.setTotal(rs.getFloat("total"));
        bbm.setNote(rs.getString("note"));
        bbm.setCreatedDate(rs.getString("createdDate"));
        bbm.setCreatedUserID(rs.getInt("createdUserID"));
        bbm.setModifiedDate(rs.getString("modifiedDate"));
        bbm.setModifiedUserID(rs.getInt("modifiedUserID"));

        BBMResult bbmResult = new BBMResult();
        bbmResult.setBbmID(rs.getInt("bbmID"));
        bbmResult.setBbmFaktur(rs.getString("bbmFaktur"));
        bbmResult.setBbmNo(rs.getString("bbmNo"));
        bbmResult.setSpbID(rs.getInt("spbID"));
        bbmResult.setSpbNo(rs.getString("spbNo"));
        bbmResult.setSupplierID(rs.getInt("supplierID"));
        bbmResult.setSupplierName(rs.getString("supplierName"));
        bbmResult.setSupplierAddress(rs.getString("supplierAddress"));
        bbmResult.setStaffID(rs.getInt("staffID"));
        bbmResult.setStaffName(rs.getString("staffName"));
        bbmResult.setReceiveDate(rs.getString("receiveDate"));
        bbmResult.setOrderDate(rs.getString("orderDate"));
        bbmResult.setNeedDate(rs.getString("needDate"));
        bbmResult.setTotal(rs.getFloat("total"));
        bbmResult.setNote(rs.getString("note"));
        bbmResult.setCreatedDate(rs.getString("createdDate"));
        bbmResult.setCreatedUserID(rs.getInt("createdUserID"));
        bbmResult.setModifiedDate(rs.getString("modifiedDate"));
        bbmResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return bbmResult;
    }
}        