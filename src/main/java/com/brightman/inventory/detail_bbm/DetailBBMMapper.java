package com.brightman.inventory.detail_bbm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailBBMMapper implements RowMapper<DetailBBMResult>{
    @Override
    public DetailBBMResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailBBM detailBBM = new DetailBBM();
        detailBBM.setDetailID(rs.getInt("detailID"));
        detailBBM.setBbmNo(rs.getString("bbmNo"));
        detailBBM.setBbmFaktur(rs.getString("bbmFaktur"));
        detailBBM.setProductID(rs.getInt("productID"));
        detailBBM.setProductName(rs.getString("productName"));
        detailBBM.setPrice(rs.getFloat("price"));
        detailBBM.setQty(rs.getInt("qty"));
        detailBBM.setReceiveQty(rs.getInt("receiveQty"));
        detailBBM.setReceiveStatus(rs.getString("receiveStatus"));
        detailBBM.setFactoryID(rs.getInt("factoryID"));
        detailBBM.setFactoryName(rs.getString("factoryName"));
        detailBBM.setNote(rs.getString("note"));
        detailBBM.setCreatedDate(rs.getString("createdDate"));
        detailBBM.setCreatedUserID(rs.getInt("createdUserID"));
        detailBBM.setModifiedDate(rs.getString("modifiedDate"));
        detailBBM.setModifiedUserID(rs.getInt("modifiedUserID"));
        
        DetailBBMResult detailBBMResult = new DetailBBMResult();
        detailBBMResult.setDetailID(rs.getInt("detailID"));
        detailBBMResult.setBbmNo(rs.getString("bbmNo"));
        detailBBMResult.setBbmFaktur(rs.getString("bbmFaktur"));
        detailBBMResult.setProductID(rs.getInt("productID"));
        detailBBMResult.setProductName(rs.getString("productName"));
        detailBBMResult.setPrice(rs.getFloat("price"));
        detailBBMResult.setQty(rs.getInt("qty"));
        detailBBMResult.setReceiveQty(rs.getInt("receiveQty"));
        detailBBMResult.setReceiveStatus(rs.getString("receiveStatus"));
        detailBBMResult.setFactoryID(rs.getInt("factoryID"));
        detailBBMResult.setFactoryName(rs.getString("factoryName"));
        detailBBMResult.setNote(rs.getString("note"));
        detailBBMResult.setCreatedDate(rs.getString("createdDate"));
        detailBBMResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailBBMResult.setModifiedDate(rs.getString("modifiedDate"));
        detailBBMResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return detailBBMResult;
    }
}
