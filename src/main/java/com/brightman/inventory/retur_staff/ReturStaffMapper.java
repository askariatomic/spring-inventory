package com.brightman.inventory.retur_staff;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ReturStaffMapper implements RowMapper<ReturStaffResult>{
    @Override
    public ReturStaffResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        ReturStaff returStaff = new ReturStaff();
        returStaff.setReturID(rs.getInt("returID"));
        returStaff.setReturNo(rs.getString("returNo"));
        returStaff.setReturDate(rs.getString("returDate"));
        returStaff.setInvoiceNo(rs.getString("invoiceNo"));
        returStaff.setCustomerID(rs.getInt("customerID"));
        returStaff.setCustomerName(rs.getString("customerName"));
        returStaff.setCustomerAddress(rs.getString("customerAddress"));
        returStaff.setReturType(rs.getString("returType"));
        returStaff.setSubtotal(rs.getFloat("subtotal"));
        returStaff.setPpnType(rs.getInt("ppnType"));
        returStaff.setPpn(rs.getFloat("ppn"));
        returStaff.setGrandtotal(rs.getFloat("grandtotal"));
        returStaff.setStaffID(rs.getInt("staffID"));
        returStaff.setStaffName(rs.getString("staffName"));
        returStaff.setRef(rs.getString("ref"));
        returStaff.setNote(rs.getString("note"));
        returStaff.setCreatedDate(rs.getString("createdDate"));
        returStaff.setCreatedUserID(rs.getInt("createdUserID"));
        returStaff.setModifiedDate(rs.getString("modifiedDate"));
        returStaff.setModifiedUserID(rs.getInt("modifiedUserID"));

        ReturStaffResult returStaffResult = new ReturStaffResult();
        returStaffResult.setReturID(rs.getInt("returID"));
        returStaffResult.setReturNo(rs.getString("returNo"));
        returStaffResult.setReturDate(rs.getString("returDate"));
        returStaffResult.setInvoiceNo(rs.getString("invoiceNo"));
        returStaffResult.setCustomerID(rs.getInt("customerID"));
        returStaffResult.setCustomerName(rs.getString("customerName"));
        returStaffResult.setCustomerAddress(rs.getString("customerAddress"));
        returStaffResult.setReturType(rs.getString("returType"));
        returStaffResult.setSubtotal(rs.getFloat("subtotal"));
        returStaffResult.setPpnType(rs.getInt("ppnType"));
        returStaffResult.setPpn(rs.getFloat("ppn"));
        returStaffResult.setGrandtotal(rs.getFloat("grandtotal"));
        returStaffResult.setStaffID(rs.getInt("staffID"));
        returStaffResult.setStaffName(rs.getString("staffName"));
        returStaffResult.setRef(rs.getString("ref"));
        returStaffResult.setNote(rs.getString("note"));
        returStaffResult.setCreatedDate(rs.getString("createdDate"));
        returStaffResult.setCreatedUserID(rs.getInt("createdUserID"));
        returStaffResult.setModifiedDate(rs.getString("modifiedDate"));
        returStaffResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return returStaffResult;
    }
}
        