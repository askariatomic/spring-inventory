package com.brightman.inventory.category;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoryMapper implements RowMapper<CategoryResult>{
    @Override
    public CategoryResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();
        category.setCategoryID(rs.getInt("categoryID"));
        category.setCategoryName(rs.getString("categoryName"));
        category.setStatus(rs.getString("status"));
        category.setCreatedDate(rs.getString("createdDate"));
        category.setCreatedUserID(rs.getInt("createdUserID"));
        category.setModifiedDate(rs.getString("modifiedDate"));
        category.setModifiedUserID(rs.getInt("modifiedUserID"));

        CategoryResult categoryResult = new CategoryResult();
        categoryResult.setCategoryID(rs.getInt("categoryID"));
        categoryResult.setCategoryName(rs.getString("categoryName"));
        categoryResult.setStatus(rs.getString("status"));
        categoryResult.setCreatedDate(rs.getString("createdDate"));
        categoryResult.setCreatedUserID(rs.getInt("createdUserID"));
        categoryResult.setModifiedDate(rs.getString("modifiedDate"));
        categoryResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return categoryResult;
    }
}
        