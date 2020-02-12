package com.brightman.inventory.detail_retur_supplier;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailReturSupplierMapper implements RowMapper<DetailReturSupplierResult>{
    @Override
    public DetailReturSupplierResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailReturSupplier detailReturSupplier = new DetailReturSupplier();
        detailReturSupplier.setDetailID(rs.getInt("detailID"));
        detailReturSupplier.setReturID(rs.getInt("returID"));
        detailReturSupplier.setReturNo(rs.getString("returNo"));
        detailReturSupplier.setFactoryID(rs.getInt("factoryID"));
        detailReturSupplier.setFactoryName(rs.getString("factoryName"));
        detailReturSupplier.setProductID(rs.getInt("productID"));
        detailReturSupplier.setProductName(rs.getString("productName"));
        detailReturSupplier.setQty(rs.getInt("qty"));
        detailReturSupplier.setUnitPrice(rs.getFloat("unitPrice"));
        detailReturSupplier.setNote(rs.getString("note"));
        detailReturSupplier.setCreatedDate(rs.getString("createdDate"));
        detailReturSupplier.setCreatedUserID(rs.getInt("createdUserID"));
        detailReturSupplier.setModifiedDate(rs.getString("modifiedDate"));
        detailReturSupplier.setModifiedUserID(rs.getInt("modifiedUserID"));

        DetailReturSupplierResult detailReturSupplierResult = new DetailReturSupplierResult();
        detailReturSupplierResult.setDetailID(rs.getInt("detailID"));
        detailReturSupplierResult.setReturID(rs.getInt("returID"));
        detailReturSupplierResult.setReturNo(rs.getString("returNo"));
        detailReturSupplierResult.setFactoryID(rs.getInt("factoryID"));
        detailReturSupplierResult.setFactoryName(rs.getString("factoryName"));
        detailReturSupplierResult.setProductID(rs.getInt("productID"));
        detailReturSupplierResult.setProductName(rs.getString("productName"));
        detailReturSupplierResult.setQty(rs.getInt("qty"));
        detailReturSupplierResult.setUnitPrice(rs.getFloat("unitPrice"));
        detailReturSupplierResult.setNote(rs.getString("note"));
        detailReturSupplierResult.setCreatedDate(rs.getString("createdDate"));
        detailReturSupplierResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailReturSupplierResult.setModifiedDate(rs.getString("modifiedDate"));
        detailReturSupplierResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return detailReturSupplierResult;
    }
}

