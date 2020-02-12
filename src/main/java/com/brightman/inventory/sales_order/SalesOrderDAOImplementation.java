package com.brightman.inventory.sales_order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SalesOrderDAOImplementation implements SalesOrderDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SalesOrderResult> getAllSalesOrder() {
        String sql = "SELECT * FROM as_sales_order ORDER BY id ASC";
        List<SalesOrderResult> salesOrder = jdbcTemplate.query(sql, new SalesOrderMapper());

        return salesOrder;
    }

    @Override
    public SalesOrderResult getSalesOrderById(int id) {
        String sql = "SELECT * FROM as_sales_order WHERE bbmID = ?";
        SalesOrderResult salesOrder = jdbcTemplate.queryForObject(sql, new Object[]{id}, new SalesOrderMapper());

        return salesOrder;
    }

    @Override
    public void addSalesOrder(SalesOrder salesOrder) {
        String sql = "INSERT INTO as_sales_order (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, salesOrder);
    }

    @Override
    public void updateSalesOrder(SalesOrder salesOrder, int id) {
        String sql = "UPDATE as_sales_order SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, salesOrder);
    }

    @Override
    public void deleteSalesOrder(int id) {
        String sql = "DELETE FROM as_sales_order WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_sales_order', 'soID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
