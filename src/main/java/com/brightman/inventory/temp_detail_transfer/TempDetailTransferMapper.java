package com.brightman.inventory.temp_detail_transfer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TempDetailTransferMapper implements RowMapper<TempDetailTransferResult>{
    @Override
    public TempDetailTransferResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        TempDetailTransfer tempDetailTransfer = new TempDetailTransfer();
        tempDetailTransfer.setDetailID(rs.getInt("detailID"));
        tempDetailTransfer.setTransferCode(rs.getString("transferCode"));
        tempDetailTransfer.setTransferFaktur(rs.getString("transferFaktur"));
        tempDetailTransfer.setProductID(rs.getInt("productID"));
        tempDetailTransfer.setProductName(rs.getString("productName"));
        tempDetailTransfer.setQty(rs.getInt("qty"));
        tempDetailTransfer.setNote(rs.getString("note"));
        tempDetailTransfer.setCreatedDate(rs.getString("createdDate"));
        tempDetailTransfer.setCreatedUserID(rs.getInt("createdUserID"));
        tempDetailTransfer.setModifiedDate(rs.getString("modifiedDate"));
        tempDetailTransfer.setModifiedUserID(rs.getInt("modifiedUserID"));

        TempDetailTransferResult tempDetailTransferResult = new TempDetailTransferResult();
        tempDetailTransferResult.setDetailID(rs.getInt("detailID"));
        tempDetailTransferResult.setTransferCode(rs.getString("transferCode"));
        tempDetailTransferResult.setTransferFaktur(rs.getString("transferFaktur"));
        tempDetailTransferResult.setProductID(rs.getInt("productID"));
        tempDetailTransferResult.setProductName(rs.getString("productName"));
        tempDetailTransferResult.setQty(rs.getInt("qty"));
        tempDetailTransferResult.setNote(rs.getString("note"));
        tempDetailTransferResult.setCreatedDate(rs.getString("createdDate"));
        tempDetailTransferResult.setCreatedUserID(rs.getInt("createdUserID"));
        tempDetailTransferResult.setModifiedDate(rs.getString("modifiedDate"));
        tempDetailTransferResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return tempDetailTransferResult;
    }
}
        