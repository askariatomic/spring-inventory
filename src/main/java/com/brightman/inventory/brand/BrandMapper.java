package com.brightman.inventory.brand;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BrandMapper implements RowMapper<BrandResult>{
    @Override
    public BrandResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Brand brand = new Brand();
        brand.setBrandID(rs.getInt("brandID"));
        brand.setBrandName(rs.getString("brandName"));
        brand.setStatus(rs.getString("status"));
        brand.setCreatedDate(rs.getString("createdDate"));
        brand.setCreatedUserID(rs.getInt("createdUserID"));
        brand.setModifiedDate(rs.getString("modifiedDate"));
        brand.setModifiedUserID(rs.getInt("modifiedUserID"));

        BrandResult brandResult = new BrandResult();
        brandResult.setBrandID(rs.getInt("brandID"));
        brandResult.setBrandName(rs.getString("brandName"));
        brandResult.setStatus(rs.getString("status"));
        brandResult.setCreatedDate(rs.getString("createdDate"));
        brandResult.setCreatedUserID(rs.getInt("createdUserID"));
        brandResult.setModifiedDate(rs.getString("modifiedDate"));
        brandResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return brandResult;
    }
}
