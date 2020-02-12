package com.brightman.inventory.detail_spb;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailSPBMapper implements RowMapper<DetailSPBResult>{
    @Override
    public DetailSPBResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailSPB detailSPB = new DetailSPB();
        detailSPB.setDetailID(rs.getInt("detailID"));
        detailSPB.setSpbNo(rs.getString("spbNo"));
        detailSPB.setSpbFaktur(rs.getString("spbFaktur"));
        detailSPB.setProductID(rs.getInt("productID"));
        detailSPB.setProductName(rs.getString("productName"));
        detailSPB.setPrice(rs.getInt("price"));
        detailSPB.setQty(rs.getInt("qty"));
        detailSPB.setNote(rs.getString("note"));
        detailSPB.setCreatedDate(rs.getString("createdDate"));
        detailSPB.setCreatedUserID(rs.getInt("createdUserID"));
        detailSPB.setModifiedDate(rs.getString("modifiedDate"));
        detailSPB.setModifiedUserID(rs.getInt("modifiedUserID"));

        DetailSPBResult detailSPBResult = new DetailSPBResult();
        detailSPBResult.setDetailID(rs.getInt("detailID"));
        detailSPBResult.setSpbNo(rs.getString("spbNo"));
        detailSPBResult.setSpbFaktur(rs.getString("spbFaktur"));
        detailSPBResult.setProductID(rs.getInt("productID"));
        detailSPBResult.setProductName(rs.getString("productName"));
        detailSPBResult.setPrice(rs.getInt("price"));
        detailSPBResult.setQty(rs.getInt("qty"));
        detailSPBResult.setNote(rs.getString("note"));
        detailSPBResult.setCreatedDate(rs.getString("createdDate"));
        detailSPBResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailSPBResult.setModifiedDate(rs.getString("modifiedDate"));
        detailSPBResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return detailSPBResult;
    }
}
        