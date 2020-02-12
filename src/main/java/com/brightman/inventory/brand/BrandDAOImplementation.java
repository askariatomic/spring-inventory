package com.brightman.inventory.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BrandDAOImplementation implements BrandDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<BrandResult> getAllBrand() {
        String sql = "SELECT * FROM as_brands ORDER BY id ASC";
        List<BrandResult> brand = jdbcTemplate.query(sql, new BrandMapper());

        return brand;
    }

    @Override
    public BrandResult getBrandById(int id) {
        String sql = "SELECT * FROM as_brands WHERE bbmID = ?";
        BrandResult brand = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BrandMapper());

        return brand;
    }

    @Override
    public void addBrand(Brand brand) {
        String sql = "INSERT INTO as_brands (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, brand);
    }

    @Override
    public void updateBrand(Brand brand, int id) {
        String sql = "UPDATE as_brands SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, brand);
    }

    @Override
    public void deleteBrandById(int id) {
        String sql = "DELETE FROM as_brands WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_brands', 'brandID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
