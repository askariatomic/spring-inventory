package com.brightman.inventory.sales_payments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SalesPaymentDAOImplementation implements SalesPaymentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SalesPaymentResult> getAllSalesPayment() {
        String sql = "SELECT * FROM as_sales_payments ORDER BY id ASC";
        List<SalesPaymentResult> salesPayment = jdbcTemplate.query(sql, new SalesPaymentMapper());

        return salesPayment;
    }

    @Override
    public SalesPaymentResult getSalesPaymentById(int id) {
        String sql = "SELECT * FROM as_sales_payments WHERE bbmID = ?";
        SalesPaymentResult salesPayment = jdbcTemplate.queryForObject(sql, new Object[]{id}, new SalesPaymentMapper());

        return salesPayment;
    }

    @Override
    public void addSalesPayment(SalesPayment salesPayment) {
        String sql = "INSERT INTO as_sales_payments (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, salesPayment);
    }

    @Override
    public void updateSalesPayment(SalesPayment salesPayment, int id) {
        String sql = "UPDATE as_sales_payments SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, salesPayment);
    }

    @Override
    public void deleteSalesPayment(int id) {
        String sql = "DELETE FROM as_sales_payments WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_sales_payments', 'paymentID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
