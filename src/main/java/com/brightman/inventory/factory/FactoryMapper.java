package com.brightman.inventory.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FactoryMapper implements RowMapper<FactoryResult>{
    @Override
    public FactoryResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Factory factory = new Factory();
        factory.setFactoryID(rs.getInt("factoryID"));
        factory.setFactoryCode(rs.getString("factoryCode"));
        factory.setFactoryName(rs.getString("factoryName"));
        factory.setFactoryType(rs.getString("factoryType"));
        factory.setStatus(rs.getString("status"));
        factory.setNote(rs.getString("note"));
        factory.setCreatedDate(rs.getString("createdDate"));
        factory.setCreatedUserID(rs.getInt("createdUserID"));
        factory.setModifiedDate(rs.getString("modifiedDate"));
        factory.setModifiedUserID(rs.getInt("modifiedUserID"));

        FactoryResult factoryResult = new FactoryResult();
        factoryResult.setFactoryID(rs.getInt("factoryID"));
        factoryResult.setFactoryCode(rs.getString("factoryCode"));
        factoryResult.setFactoryName(rs.getString("factoryName"));
        factoryResult.setFactoryType(rs.getString("factoryType"));
        factoryResult.setStatus(rs.getString("status"));
        factoryResult.setNote(rs.getString("note"));
        factoryResult.setCreatedDate(rs.getString("createdDate"));
        factoryResult.setCreatedUserID(rs.getInt("createdUserID"));
        factoryResult.setModifiedDate(rs.getString("modifiedDate"));
        factoryResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return factoryResult;
    }
}
   