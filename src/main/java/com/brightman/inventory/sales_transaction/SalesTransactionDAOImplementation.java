package com.brightman.inventory.sales_transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SalesTransactionDAOImplementation implements SalesTransactionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SalesTransactionResult> getAllSalesTransaction() {
        String sql = "SELECT * FROM as_sales_transactions ORDER BY id ASC";
        List<SalesTransactionResult> salesTransaction = jdbcTemplate.query(sql, new SalesTransactionMapper());

        return salesTransaction;
    }

    @Override
    public SalesTransactionResult getSalesTransactionById(int id) {
        String sql = "SELECT * FROM as_sales_transactions WHERE bbmID = ?";
        SalesTransactionResult salesTransaction = jdbcTemplate.queryForObject(sql, new Object[]{id}, new SalesTransactionMapper());

        return salesTransaction;
    }

    @Override
    public void addSalesTransaction(SalesTransaction salesTransaction) {
        String sql = "INSERT INTO as_sales_transactions (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, salesTransaction);
    }

    @Override
    public void updateSalesTransaction(SalesTransaction salesTransaction, int id) {
        String sql = "UPDATE as_sales_transactions SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, salesTransaction);
    }

    @Override
    public void deleteSalesTransaction(int id) {
        String sql = "DELETE FROM as_sales_transactions WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_sales_transactions', 'invoiceID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
