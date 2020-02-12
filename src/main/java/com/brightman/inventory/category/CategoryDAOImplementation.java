package com.brightman.inventory.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CategoryDAOImplementation implements CategoryDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CategoryResult> getAllCategory() {
        String sql = "SELECT * FROM as_categories ORDER BY id ASC";
        List<CategoryResult> category = jdbcTemplate.query(sql, new CategoryMapper());

        return category;
    }

    @Override
    public CategoryResult getCategoryById(int id) {
        String sql = "SELECT * FROM as_categories WHERE bbmID = ?";
        CategoryResult category = jdbcTemplate.queryForObject(sql, new Object[]{id}, new CategoryMapper());

        return category;
    }

    @Override
    public void addCategory(Category category) {
        String sql = "INSERT INTO as_categories (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, category);
    }

    @Override
    public void updateCategory(Category category, int id) {
        String sql = "UPDATE as_categories SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, category);
    }

    @Override
    public void deleteCategory(int id) {
        String sql = "DELETE FROM as_categories WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_categories', 'categoryID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
