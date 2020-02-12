package com.brightman.inventory.retur_supplier;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ReturSupplierMapper implements RowMapper<ReturSupplierResult>{
    @Override
    public ReturSupplierResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        ReturSupplier returSupplier = new ReturSupplier();
        returSupplier.setReturID(rs.getInt("returID"));
        returSupplier.setReturNo(rs.getString("returNo"));
        returSupplier.setReturDate(rs.getString("returDate"));
        returSupplier.setInvoiceNo(rs.getString("invoiceNo"));
        returSupplier.setSupplierID(rs.getInt("supplierID"));
        returSupplier.setSupplierName(rs.getString("supplierName"));
        returSupplier.setSupplierAddress(rs.getString("supplierAddress"));
        returSupplier.setReturType(rs.getString("returType"));
        returSupplier.setSubtotal(rs.getFloat("subtotal"));
        returSupplier.setPpnType(rs.getInt("ppnType"));
        returSupplier.setPpn(rs.getFloat("ppn"));
        returSupplier.setGrandtotal(rs.getFloat("grandtotal"));
        returSupplier.setStaffID(rs.getInt("staffID"));
        returSupplier.setStaffName(rs.getString("staffName"));
        returSupplier.setRef(rs.getString("ref"));
        returSupplier.setNote(rs.getString("note"));
        returSupplier.setCreatedDate(rs.getString("createdDate"));
        returSupplier.setCreatedUserID(rs.getInt("createdUserID"));
        returSupplier.setModifiedDate(rs.getString("modifiedDate"));
        returSupplier.setModifiedUserID(rs.getInt("modifiedUserID"));

        ReturSupplierResult returSupplierResult = new ReturSupplierResult();
        returSupplierResult.setReturID(rs.getInt("returID"));
        returSupplierResult.setReturNo(rs.getString("returNo"));
        returSupplierResult.setReturDate(rs.getString("returDate"));
        returSupplierResult.setInvoiceNo(rs.getString("invoiceNo"));
        returSupplierResult.setSupplierID(rs.getInt("supplierID"));
        returSupplierResult.setSupplierName(rs.getString("supplierName"));
        returSupplierResult.setSupplierAddress(rs.getString("supplierAddress"));
        returSupplierResult.setReturType(rs.getString("returType"));
        returSupplierResult.setSubtotal(rs.getFloat("subtotal"));
        returSupplierResult.setPpnType(rs.getInt("ppnType"));
        returSupplierResult.setPpn(rs.getFloat("ppn"));
        returSupplierResult.setGrandtotal(rs.getFloat("grandtotal"));
        returSupplierResult.setStaffID(rs.getInt("staffID"));
        returSupplierResult.setStaffName(rs.getString("staffName"));
        returSupplierResult.setRef(rs.getString("ref"));
        returSupplierResult.setNote(rs.getString("note"));
        returSupplierResult.setCreatedDate(rs.getString("createdDate"));
        returSupplierResult.setCreatedUserID(rs.getInt("createdUserID"));
        returSupplierResult.setModifiedDate(rs.getString("modifiedDate"));
        returSupplierResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return returSupplierResult;
    }
}
        