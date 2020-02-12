package com.brightman.inventory.transfer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TransferMapper implements RowMapper<TransferResult>{
    @Override
    public TransferResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Transfer transfer = new Transfer();
        transfer.setTransferID(rs.getInt("transferID"));
        transfer.setTransferCode(rs.getString("transferCode"));
        transfer.setTransferFaktur(rs.getString("transferFaktur"));
        transfer.setRef(rs.getString("ref"));
        transfer.setTrxDate(rs.getString("trxDate"));
        transfer.setNote(rs.getString("note"));
        transfer.setTransferFrom(rs.getInt("transferFrom"));
        transfer.setTransferTo(rs.getInt("transferTo"));
        transfer.setCreatedDate(rs.getString("createdDate"));
        transfer.setCreatedUserID(rs.getInt("createdUserID"));
        transfer.setModifiedDate(rs.getString("modifiedDate"));
        transfer.setModifiedUserID(rs.getInt("modifiedUserID"));

        TransferResult transferResult = new TransferResult();
        transferResult.setTransferID(rs.getInt("transferID"));
        transferResult.setTransferCode(rs.getString("transferCode"));
        transferResult.setTransferFaktur(rs.getString("transferFaktur"));
        transferResult.setRef(rs.getString("ref"));
        transferResult.setTrxDate(rs.getString("trxDate"));
        transferResult.setNote(rs.getString("note"));
        transferResult.setTransferFrom(rs.getInt("transferFrom"));
        transferResult.setTransferTo(rs.getInt("transferTo"));
        transferResult.setCreatedDate(rs.getString("createdDate"));
        transferResult.setCreatedUserID(rs.getInt("createdUserID"));
        transferResult.setModifiedDate(rs.getString("modifiedDate"));
        transferResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return transferResult;
    }
}
        