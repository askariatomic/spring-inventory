package com.brightman.inventory.detail_do;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailDOMapper implements RowMapper<DetailDOResult>{
    @Override
    public DetailDOResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailDO detailDO = new DetailDO();
        detailDO.setDoID(rs.getInt("doID"));
        detailDO.setDoNo(rs.getString("doNo"));
        detailDO.setDoFaktur(rs.getString("doFaktur"));
        detailDO.setProductID(rs.getInt("productID"));
        detailDO.setProductName(rs.getString("productName"));
        detailDO.setPrice(rs.getFloat("price"));
        detailDO.setQty(rs.getInt("qty"));
        detailDO.setDeliveredQty(rs.getInt("deliveredQty"));
        detailDO.setDeliveredStatus(rs.getString("deliveredStatus"));
        detailDO.setFactoryID(rs.getInt("factoryID"));
        detailDO.setFactoryName(rs.getString("factoryName"));
        detailDO.setNote(rs.getString("note"));
        detailDO.setCreatedDate(rs.getString("createdDate"));
        detailDO.setCreatedUserID(rs.getInt("createdUserID"));
        detailDO.setModifiedDate(rs.getString("modifiedDate"));
        detailDO.setModifiedUserID(rs.getInt("modifiedUserID"));
        
        DetailDOResult detailDOResult = new DetailDOResult();
        detailDOResult.setDoID(rs.getInt("doID"));
        detailDOResult.setDoNo(rs.getString("doNo"));
        detailDOResult.setDoFaktur(rs.getString("doFaktur"));
        detailDOResult.setProductID(rs.getInt("productID"));
        detailDOResult.setProductName(rs.getString("productName"));
        detailDOResult.setPrice(rs.getFloat("price"));
        detailDOResult.setQty(rs.getInt("qty"));
        detailDOResult.setDeliveredQty(rs.getInt("deliveredQty"));
        detailDOResult.setDeliveredStatus(rs.getString("deliveredStatus"));
        detailDOResult.setFactoryID(rs.getInt("factoryID"));
        detailDOResult.setFactoryName(rs.getString("factoryName"));
        detailDOResult.setNote(rs.getString("note"));
        detailDOResult.setCreatedDate(rs.getString("createdDate"));
        detailDOResult.setCreatedUserID(rs.getInt("createdUserID"));
        detailDOResult.setModifiedDate(rs.getString("modifiedDate"));
        detailDOResult.setModifiedUserID(rs.getInt("modifiedUserID"));
        
        return detailDOResult;
    }
}
