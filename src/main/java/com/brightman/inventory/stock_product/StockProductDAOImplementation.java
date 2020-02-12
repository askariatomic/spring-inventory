package com.brightman.inventory.stock_product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class StockProductDAOImplementation implements StockProductDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<StockProductResult> getAllStockProduct() {
        String sql = "SELECT * FROM as_stock_products ORDER BY id ASC";
        List<StockProductResult> stockProduct = jdbcTemplate.query(sql, new StockProductMapper());

        return stockProduct;
    }

    @Override
    public StockProductResult getStockProductById(int id) {
        String sql = "SELECT * FROM as_stock_products WHERE bbmID = ?";
        StockProductResult stockProduct = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StockProductMapper());

        return stockProduct;
    }

    @Override
    public void addStockProduct(StockProduct stockProduct) {
        String sql = "INSERT INTO as_stock_products (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, stockProduct);
    }

    @Override
    public void updateStockProduct(StockProduct stockProduct, int id) {
        String sql = "UPDATE as_stock_products SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, stockProduct);
    }

    @Override
    public void deleteStockProductById(int id) {
        String sql = "DELETE FROM as_stock_products WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_stock_products', 'stockProductID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}

