package com.brightman.inventory.spb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SPBMapper implements RowMapper<SPBResult>{
    @Override
    public SPBResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        SPB spb = new SPB();
        spb.setSpbID(rs.getInt("spbID"));
        spb.setSpbNo(rs.getString("spbNo"));
        spb.setSpbFaktur(rs.getString("spbFaktur"));
        spb.setSupplierID(rs.getInt("supplierID"));
        spb.setSupplierName(rs.getString("supplierName"));
        spb.setSupplierAddress(rs.getString("supplierAddress"));
        spb.setStaffID(rs.getInt("staffID"));
        spb.setStaffName(rs.getString("staffName"));
        spb.setOrderDate(rs.getString("orderDate"));
        spb.setNeedDate(rs.getString("needDate"));
        spb.setNote(rs.getString("note"));
        spb.setStatus(rs.getInt("status"));
        spb.setCreatedDate(rs.getString("createdDate"));
        spb.setCreatedUserID(rs.getInt("createdUserID"));
        spb.setModifiedDate(rs.getString("modifiedDate"));
        spb.setModifiedUserID(rs.getInt("modifiedUserID"));

        SPBResult spbResult = new SPBResult();
        spbResult.setSpbID(rs.getInt("spbID"));
        spbResult.setSpbNo(rs.getString("spbNo"));
        spbResult.setSpbFaktur(rs.getString("spbFaktur"));
        spbResult.setSupplierID(rs.getInt("supplierID"));
        spbResult.setSupplierName(rs.getString("supplierName"));
        spbResult.setSupplierAddress(rs.getString("supplierAddress"));
        spbResult.setStaffID(rs.getInt("staffID"));
        spbResult.setStaffName(rs.getString("staffName"));
        spbResult.setOrderDate(rs.getString("orderDate"));
        spbResult.setNeedDate(rs.getString("needDate"));
        spbResult.setNote(rs.getString("note"));
        spbResult.setStatus(rs.getInt("status"));
        spbResult.setCreatedDate(rs.getString("createdDate"));
        spbResult.setCreatedUserID(rs.getInt("createdUserID"));
        spbResult.setModifiedDate(rs.getString("modifiedDate"));
        spbResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return spbResult;
    }
}
