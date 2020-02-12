package com.brightman.inventory.buy_payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BuyPaymentDAOImplementation implements BuyPaymentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<BuyPaymentResult> getAllBuyPayment() {
        String sql = "SELECT * FROM as_buy_payments ORDER BY id ASC";
        List<BuyPaymentResult> buyPayment = jdbcTemplate.query(sql, new BuyPaymentMapper());

        return buyPayment;
    }

    @Override
    public BuyPaymentResult getBuyPaymentById(int id) {
        String sql = "SELECT * FROM as_buy_payments WHERE bbmID = ?";
        BuyPaymentResult buyPayment = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BuyPaymentMapper());

        return buyPayment;
    }

    @Override
    public void addBuyPayment(BuyPayment buyPayment) {
        String sql = "INSERT INTO as_buy_payments (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, buyPayment);
    }

    @Override
    public void updateBuyPayment(BuyPayment buyPayment, int id) {
        String sql = "UPDATE as_buy_payments SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, buyPayment);
    }

    @Override
    public void deleteBuyPayment(int id) {
        String sql = "DELETE FROM as_buy_payments WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_buy_payments', 'paymentID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
