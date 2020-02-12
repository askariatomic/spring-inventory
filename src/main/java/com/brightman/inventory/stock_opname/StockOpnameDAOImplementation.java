package com.brightman.inventory.stock_opname;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class StockOpnameDAOImplementation implements StockOpnameDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<StockOpnameResult> getAllStockOpname() {
        String sql = "SELECT * FROM as_stock_opname ORDER BY id ASC";
        List<StockOpnameResult> stockOpname = jdbcTemplate.query(sql, new StockOpnameMapper());

        return stockOpname;
    }

    @Override
    public StockOpnameResult getStockOpnameById(int id) {
        String sql = "SELECT * FROM as_stock_opname WHERE bbmID = ?";
        StockOpnameResult stockOpname = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StockOpnameMapper());

        return stockOpname;
    }

    @Override
    public void addStockOpname(StockOpname stockOpname) {
        String sql = "INSERT INTO as_stock_opname (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, stockOpname);
    }

    @Override
    public void updateStockOpname(StockOpname stockOpname, int id) {
        String sql = "UPDATE as_stock_opname SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, stockOpname);
    }

    @Override
    public void deleteStockOpnameById(int id) {
        String sql = "DELETE FROM as_stock_opname WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_stock_opname', 'soID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
