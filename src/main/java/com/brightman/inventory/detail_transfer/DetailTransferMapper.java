package com.brightman.inventory.detail_transfer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailTransferMapper implements RowMapper<DetailTransferResult>{
    @Override
    public DetailTransferResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailTransfer detailTransfer = new DetailTransfer();
        detailTransfer.setDetailID(rs.getInt("detailID"));
        detailTransfer.setTransferCode(rs.getString("transferCode"));
        detailTransfer.setTransferFaktur(rs.getString("transferFaktur"));
        detailTransfer.setProductID(rs.getInt("productID"));
        detailTransfer.setProductName(rs.getString("productName"));
        detailTransfer.setQty(rs.getInt("qty"));
        detailTransfer.setNote(rs.getString("note"));
        detailTransfer.setCreatedDate(rs.getString("createdDate"));
        detailTransfer.setCreatedUserID(rs.getInt("createdUserID"));
        detailTransfer.setModifiedDate(rs.getString("modifiedDate"));
        detailTransfer.setModifiedUserID(rs.getInt("modifiedUserID"));

        DetailTransferResult detailTransferResult = new DetailTransferResult();
        detailTransferResult.setDetailID(rs.getInt("detailID"));
        detailTransferResult.setTransferCode(rs.getString("transferCode"));
        detailTransferResult.setTransferFaktur(rs.getString("transferFaktur"));
        detailTransferResult.setProductID(rs.getInt("productID"));
        detailTransferResult.setProductName(rs.getString("productName"));
        detailTransferResult.setQty(rs.getInt("qty"));
        detailTransferResult.setNote(rs.getString("note"));
        detailTransferResult.setCreatedDate(rs.getString("createdDate"));
        detailTransferResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailTransferResult.setModifiedDate(rs.getString("modifiedDate"));
        detailTransferResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return detailTransferResult;
    }
}
