package com.brightman.inventory.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<ProductResult>{
    @Override
    public ProductResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductID(rs.getInt("productID"));
        product.setProductCode(rs.getString("productCode"));
        product.setProductName(rs.getString("productName"));
        product.setCategoryID(rs.getInt("categoryID"));
        product.setBrandID(rs.getInt("brandID"));
        product.setUnit(rs.getInt("unit"));
        product.setUnitPrice1(rs.getFloat("unitPrice1"));
        product.setUnitPrice2(rs.getFloat("unitPrice2"));
        product.setUnitPrice3(rs.getFloat("unitPrice3"));
        product.setHpp(rs.getFloat("hpp"));
        product.setPurchasePrice(rs.getFloat("purchasePrice"));
        product.setNote(rs.getString("note"));
        product.setStockAmount(rs.getInt("stockAmount"));
        product.setImage(rs.getString("image"));
        product.setMinimumStock(rs.getInt("minimumStock"));
        product.setCreatedDate(rs.getString("createdDate"));
        product.setCreatedUserID(rs.getInt("createdUserID"));
        product.setModifiedDate(rs.getString("modifiedDate"));
        product.setModifiedUserID(rs.getInt("modifiedUserID"));

        ProductResult productResult = new ProductResult();
        productResult.setProductID(rs.getInt("productID"));
        productResult.setProductCode(rs.getString("productCode"));
        productResult.setProductName(rs.getString("productName"));
        productResult.setCategoryID(rs.getInt("categoryID"));
        productResult.setBrandID(rs.getInt("brandID"));
        productResult.setUnit(rs.getInt("unit"));
        productResult.setUnitPrice1(rs.getFloat("unitPrice1"));
        productResult.setUnitPrice2(rs.getFloat("unitPrice2"));
        productResult.setUnitPrice3(rs.getFloat("unitPrice3"));
        productResult.setHpp(rs.getFloat("hpp"));
        productResult.setPurchasePrice(rs.getFloat("purchasePrice"));
        productResult.setNote(rs.getString("note"));
        productResult.setStockAmount(rs.getInt("stockAmount"));
        productResult.setImage(rs.getString("image"));
        productResult.setMinimumStock(rs.getInt("minimumStock"));
        productResult.setCreatedDate(rs.getString("createdDate"));
        productResult.setCreatedUserID(rs.getInt("createdUserID"));
        productResult.setModifiedDate(rs.getString("modifiedDate"));
        productResult.setModifiedUserID(rs.getInt("modifiedUserID"));

        return productResult;
    }
}
        