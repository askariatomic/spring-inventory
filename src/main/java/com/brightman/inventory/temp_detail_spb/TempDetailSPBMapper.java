package com.brightman.inventory.temp_detail_spb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TempDetailSPBMapper implements RowMapper<TempDetailSPBResult>{
    @Override
    public TempDetailSPBResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        TempDetailSPB tempDetailSPB = new TempDetailSPB();
        tempDetailSPB.setDetailID(rs.getInt("detailID"));
        tempDetailSPB.setSpbNo(rs.getString("spbNo"));
        tempDetailSPB.setSpbFaktur(rs.getString("spbFaktur"));
        tempDetailSPB.setProductID(rs.getInt("productID"));
        tempDetailSPB.setProductName(rs.getString("productName"));
        tempDetailSPB.setPrice(rs.getInt("price"));
        tempDetailSPB.setQty(rs.getInt("qty"));
        tempDetailSPB.setNote(rs.getString("note"));
        tempDetailSPB.setCreatedDate(rs.getString("createdDate"));
        tempDetailSPB.setCreatedUserID(rs.getInt("createdUserID"));
        tempDetailSPB.setModifiedDate(rs.getString("modifiedDate"));
        tempDetailSPB.setModifiedUserID(rs.getInt("modifiedUserID"));

        TempDetailSPBResult tempDetailSPBResult = new TempDetailSPBResult();
        tempDetailSPBResult.setDetailID(rs.getInt("detailID"));
        tempDetailSPBResult.setSpbNo(rs.getString("spbNo"));
        tempDetailSPBResult.setSpbFaktur(rs.getString("spbFaktur"));
        tempDetailSPBResult.setProductID(rs.getInt("productID"));
        tempDetailSPBResult.setProductName(rs.getString("productName"));
        tempDetailSPBResult.setPrice(rs.getInt("price"));
        tempDetailSPBResult.setQty(rs.getInt("qty"));
        tempDetailSPBResult.setNote(rs.getString("note"));
        tempDetailSPBResult.setCreatedDate(rs.getString("createdDate"));
        tempDetailSPBResult.setCreatedUserID(rs.getInt("createdUserID"));
        tempDetailSPBResult.setModifiedDate(rs.getString("modifiedDate"));
        tempDetailSPBResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return tempDetailSPBResult;
    }
}
        