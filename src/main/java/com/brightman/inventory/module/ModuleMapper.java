package com.brightman.inventory.module;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ModuleMapper implements RowMapper<ModuleResult>{
    @Override
    public ModuleResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Module module = new Module();
        module.setModulID(rs.getInt("modulID"));
        module.setModulName(rs.getString("modulName"));
        module.setAuthorize(rs.getString("authorize"));
        module.setStatus(rs.getString("status"));
        module.setModifiedDate(rs.getString("modifiedDate"));
        module.setModifiedUserID(rs.getInt("modifiedUserID"));

        ModuleResult moduleResult = new ModuleResult();
        moduleResult.setModulID(rs.getInt("modulID"));
        moduleResult.setModulName(rs.getString("modulName"));
        moduleResult.setAuthorize(rs.getString("authorize"));
        moduleResult.setStatus(rs.getString("status"));
        moduleResult.setModifiedDate(rs.getString("modifiedDate"));
        moduleResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return moduleResult;
    }
}
      