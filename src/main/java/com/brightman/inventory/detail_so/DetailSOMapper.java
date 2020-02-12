package com.brightman.inventory.detail_so;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailSOMapper implements RowMapper<DetailSOResult>{
    @Override
    public DetailSOResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailSO detailSO = new DetailSO();
        detailSO.setDetailID(rs.getInt("detailID"));
        detailSO.setSoNo(rs.getString("soNo"));
        detailSO.setSoFaktur(rs.getString("soFaktur"));
        detailSO.setProductID(rs.getInt("productID"));
        detailSO.setProductName(rs.getString("productName"));
        detailSO.setPrice(rs.getInt("price"));
        detailSO.setQty(rs.getInt("qty"));
        detailSO.setNote(rs.getString("note"));
        detailSO.setCreatedDate(rs.getString("createdDate"));
        detailSO.setCreatedUserID(rs.getInt("createdUserID"));
        detailSO.setModifiedDate(rs.getString("modifiedDate"));
        detailSO.setModifiedUserID(rs.getInt("modifiedUserID"));

        DetailSOResult detailSOResult = new DetailSOResult();
        detailSOResult.setDetailID(rs.getInt("detailID"));
        detailSOResult.setSoNo(rs.getString("soNo"));
        detailSOResult.setSoFaktur(rs.getString("soFaktur"));
        detailSOResult.setProductID(rs.getInt("productID"));
        detailSOResult.setProductName(rs.getString("productName"));
        detailSOResult.setPrice(rs.getInt("price"));
        detailSOResult.setQty(rs.getInt("qty"));
        detailSOResult.setNote(rs.getString("note"));
        detailSOResult.setCreatedDate(rs.getString("createdDate"));
        detailSOResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailSOResult.setModifiedDate(rs.getString("modifiedDate"));
        detailSOResult.setModifiedUserID(rs.getInt("modifiedUserID"));
        
        return detailSOResult;
    }
}

