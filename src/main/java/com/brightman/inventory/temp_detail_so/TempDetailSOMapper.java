package com.brightman.inventory.temp_detail_so;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TempDetailSOMapper implements RowMapper<TempDetailSOResult>{
    @Override
    public TempDetailSOResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        TempDetailSO tempDetailSO = new TempDetailSO();
        tempDetailSO.setDetailID(rs.getInt("detailID"));
        tempDetailSO.setSoNo(rs.getString("soNo"));
        tempDetailSO.setSoFaktur(rs.getString("soFaktur"));
        tempDetailSO.setProductID(rs.getString("productID"));
        tempDetailSO.setProductName(rs.getString("productName"));
        tempDetailSO.setPrice(rs.getFloat("price"));
        tempDetailSO.setQty(rs.getInt("qty"));
        tempDetailSO.setNote(rs.getString("note"));
        tempDetailSO.setCreatedDate(rs.getString("createdDate"));
        tempDetailSO.setCreatedUserID(rs.getInt("createdUserID"));
        tempDetailSO.setModifiedDate(rs.getString("modifiedDate"));
        tempDetailSO.setModifiedUserID(rs.getInt("modifiedUserID"));

        TempDetailSOResult tempDetailSOResult = new TempDetailSOResult();
        tempDetailSOResult.setDetailID(rs.getInt("detailID"));
        tempDetailSOResult.setSoNo(rs.getString("soNo"));
        tempDetailSOResult.setSoFaktur(rs.getString("soFaktur"));
        tempDetailSOResult.setProductID(rs.getString("productID"));
        tempDetailSOResult.setProductName(rs.getString("productName"));
        tempDetailSOResult.setPrice(rs.getFloat("price"));
        tempDetailSOResult.setQty(rs.getInt("qty"));
        tempDetailSOResult.setNote(rs.getString("note"));
        tempDetailSOResult.setCreatedDate(rs.getString("createdDate"));
        tempDetailSOResult.setCreatedUserID(rs.getInt("createdUserID"));
        tempDetailSOResult.setModifiedDate(rs.getString("modifiedDate"));
        tempDetailSOResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return tempDetailSOResult;
    }
}
        