package com.brightman.inventory.stock_opname;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StockOpnameMapper implements RowMapper<StockOpnameResult>{
    @Override
    public StockOpnameResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        StockOpname stockOpname = new StockOpname();
        stockOpname.setSoID(rs.getInt("soID"));
        stockOpname.setSoDate(rs.getString("soDate"));
        stockOpname.setProductID(rs.getInt("productID"));
        stockOpname.setProductName(rs.getString("productName"));
        stockOpname.setFactoryID(rs.getInt("factoryID"));
        stockOpname.setFactoryName(rs.getString("factoryName"));
        stockOpname.setProductStock(rs.getInt("productStock"));
        stockOpname.setRealStock(rs.getInt("realStock"));
        stockOpname.setNote(rs.getString("note"));
        stockOpname.setStaffID(rs.getInt("staffID"));
        stockOpname.setStaffName(rs.getString("staffName"));
        stockOpname.setCreatedDate(rs.getString("createdDate"));
        stockOpname.setCreatedUserID(rs.getInt("createdUserID"));
        stockOpname.setModifiedDate(rs.getString("modifiedDate"));
        stockOpname.setModifiedUserID(rs.getInt("modifiedUserID"));

        StockOpnameResult stockOpnameResult = new StockOpnameResult();
        stockOpnameResult.setSoID(rs.getInt("soID"));
        stockOpnameResult.setSoDate(rs.getString("soDate"));
        stockOpnameResult.setProductID(rs.getInt("productID"));
        stockOpnameResult.setProductName(rs.getString("productName"));
        stockOpnameResult.setFactoryID(rs.getInt("factoryID"));
        stockOpnameResult.setFactoryName(rs.getString("factoryName"));
        stockOpnameResult.setProductStock(rs.getInt("productStock"));
        stockOpnameResult.setRealStock(rs.getInt("realStock"));
        stockOpnameResult.setNote(rs.getString("note"));
        stockOpnameResult.setStaffID(rs.getInt("staffID"));
        stockOpnameResult.setStaffName(rs.getString("staffName"));
        stockOpnameResult.setCreatedDate(rs.getString("createdDate"));
        stockOpnameResult.setCreatedUserID(rs.getInt("createdUserID"));
        stockOpnameResult.setModifiedDate(rs.getString("modifiedDate"));
        stockOpnameResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return stockOpnameResult;
    }
}
        