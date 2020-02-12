package com.brightman.inventory.buy_transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BuyTransactionDAOImplementation implements BuyTransactionDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<BuyTransactionResult> getAllBuyTransaction() {
        String sql = "SELECT * FROM as_buy_transactions ORDER BY id ASC";
        List<BuyTransactionResult> buyTransaction = jdbcTemplate.query(sql, new BuyTransactionMapper());

        return buyTransaction;
    }

    @Override
    public BuyTransactionResult getBuyTransactionById(int id) {
        String sql = "SELECT * FROM as_buy_transactions WHERE bbmID = ?";
        BuyTransactionResult buyTransaction = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BuyTransactionMapper());

        return buyTransaction;
    }

    @Override
    public void addBuyTransaction(BuyTransaction buyTransaction) {
        String sql = "INSERT INTO as_buy_transactions (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, buyTransaction);
    }

    @Override
    public void updateBuyTransaction(BuyTransaction buyTransaction, int id) {
        String sql = "UPDATE as_buy_transactions SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, buyTransaction);
    }

    @Override
    public void deleteBuyTransaction(int id) {
        String sql = "DELETE FROM as_buy_transactions WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_buy_transactions', 'invoiceID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
