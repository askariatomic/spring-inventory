package com.brightman.inventory.detail_retur_staff;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailReturStaffMapper implements RowMapper<DetailReturStaffResult>{
    @Override
    public DetailReturStaffResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailReturStaff detailReturStaff = new DetailReturStaff();
        detailReturStaff.setDetailID(rs.getInt("detailID"));
        detailReturStaff.setReturID(rs.getInt("returID"));
        detailReturStaff.setReturNo(rs.getString("returNo"));
        detailReturStaff.setFactoryID(rs.getInt("factoryID"));
        detailReturStaff.setFactoryName(rs.getString("factoryName"));
        detailReturStaff.setProductID(rs.getInt("productID"));
        detailReturStaff.setProductName(rs.getString("productName"));
        detailReturStaff.setQty(rs.getInt("qty"));
        detailReturStaff.setUnitPrice(rs.getFloat("unitPrice"));
        detailReturStaff.setNote(rs.getString("note"));
        detailReturStaff.setCreatedDate(rs.getString("createdDate"));
        detailReturStaff.setCreatedUserID(rs.getInt("createdUserID"));
        detailReturStaff.setModifiedDate(rs.getString("modifiedDate"));
        detailReturStaff.setModifiedUserID(rs.getInt("modifiedUserID"));
        
        DetailReturStaffResult detailReturStaffResult = new DetailReturStaffResult();
        detailReturStaffResult.setDetailID(rs.getInt("detailID"));
        detailReturStaffResult.setReturID(rs.getInt("returID"));
        detailReturStaffResult.setReturNo(rs.getString("returNo"));
        detailReturStaffResult.setFactoryID(rs.getInt("factoryID"));
        detailReturStaffResult.setFactoryName(rs.getString("factoryName"));
        detailReturStaffResult.setProductID(rs.getInt("productID"));
        detailReturStaffResult.setProductName(rs.getString("productName"));
        detailReturStaffResult.setQty(rs.getInt("qty"));
        detailReturStaffResult.setUnitPrice(rs.getFloat("unitPrice"));
        detailReturStaffResult.setNote(rs.getString("note"));
        detailReturStaffResult.setCreatedDate(rs.getString("createdDate"));
        detailReturStaffResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailReturStaffResult.setModifiedDate(rs.getString("modifiedDate"));
        detailReturStaffResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return detailReturStaffResult;        
    }
}
