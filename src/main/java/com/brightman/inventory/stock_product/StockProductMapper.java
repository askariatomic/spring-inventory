package com.brightman.inventory.stock_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StockProductMapper implements RowMapper<StockProductResult>{
    @Override
    public StockProductResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        StockProduct stockProduct = new StockProduct();
        stockProduct.setStockProductID(rs.getInt("stockProductID"));
        stockProduct.setProductID(rs.getInt("productID"));
        stockProduct.setFactoryID(rs.getInt("factoryID"));
        stockProduct.setStock(rs.getInt("stock"));
        stockProduct.setCreatedDate(rs.getString("createdDate"));
        stockProduct.setCreatedUserID(rs.getInt("createdUserID"));
        stockProduct.setModifiedDate(rs.getString("modifiedDate"));
        stockProduct.setModifiedUserID(rs.getInt("modifiedUserID"));

        StockProductResult stockProductResult = new StockProductResult();
        stockProductResult.setStockProductID(rs.getInt("stockProductID"));
        stockProductResult.setProductID(rs.getInt("productID"));
        stockProductResult.setFactoryID(rs.getInt("factoryID"));
        stockProductResult.setStock(rs.getInt("stock"));
        stockProductResult.setCreatedDate(rs.getString("createdDate"));
        stockProductResult.setCreatedUserID(rs.getInt("createdUserID"));
        stockProductResult.setModifiedDate(rs.getString("modifiedDate"));
        stockProductResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return stockProductResult;
    }
}
        