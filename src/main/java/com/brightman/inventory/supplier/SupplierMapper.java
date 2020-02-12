package com.brightman.inventory.supplier;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SupplierMapper implements RowMapper<SupplierResult>{
    @Override
    public SupplierResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Supplier supplier = new Supplier();
        supplier.setSupplierID(rs.getInt("supplierID"));
        supplier.setSupplierCode(rs.getString("supplierCode"));
        supplier.setSupplierName(rs.getString("supplierName"));
        supplier.setAddress(rs.getString("address"));
        supplier.setCity(rs.getString("city"));
        supplier.setPhone(rs.getString("phone"));
        supplier.setFax(rs.getString("fax"));
        supplier.setContactPerson(rs.getString("contactPerson"));
        supplier.setEmail(rs.getString("email"));
        supplier.setBalance(rs.getFloat("balance"));
        supplier.setCreatedDate(rs.getString("createdDate"));
        supplier.setCreatedUserID(rs.getInt("createdUserID"));
        supplier.setModifiedDate(rs.getString("modifiedDate"));
        supplier.setModifiedUserID(rs.getInt("modifiedUserID"));

        SupplierResult supplierResult = new SupplierResult();
        supplierResult.setSupplierID(rs.getInt("supplierID"));
        supplierResult.setSupplierCode(rs.getString("supplierCode"));
        supplierResult.setSupplierName(rs.getString("supplierName"));
        supplierResult.setAddress(rs.getString("address"));
        supplierResult.setCity(rs.getString("city"));
        supplierResult.setPhone(rs.getString("phone"));
        supplierResult.setFax(rs.getString("fax"));
        supplierResult.setContactPerson(rs.getString("contactPerson"));
        supplierResult.setEmail(rs.getString("email"));
        supplierResult.setBalance(rs.getFloat("balance"));
        supplierResult.setCreatedDate(rs.getString("createdDate"));
        supplierResult.setCreatedUserID(rs.getInt("createdUserID"));
        supplierResult.setModifiedDate(rs.getString("modifiedDate"));
        supplierResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return supplierResult;
    }
}
