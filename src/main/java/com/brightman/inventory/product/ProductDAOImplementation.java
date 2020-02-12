package com.brightman.inventory.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ProductDAOImplementation implements ProductDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ProductResult> getAllProduct() {
        String sql = "SELECT * FROM as_products ORDER BY id ASC";
        List<ProductResult> product = jdbcTemplate.query(sql, new ProductMapper());

        return product;
    }

    @Override
    public ProductResult getProductById(int id) {
        String sql = "SELECT * FROM as_products WHERE bbmID = ?";
        ProductResult product = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ProductMapper());

        return product;
    }

    @Override
    public void addProduct(Product product) {
        String sql = "INSERT INTO as_products (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, product);
    }

    @Override
    public void updateProduct(Product product, int id) {
        String sql = "UPDATE as_products SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, product);
    }

    @Override
    public void deleteProduct(int id) {
        String sql = "DELETE FROM as_products WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_products', 'productID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
