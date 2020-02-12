package com.brightman.inventory.receivable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ReceivableDAOImplementation implements ReceivableDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ReceivableResult> getAllReceivable() {
        String sql = "SELECT * FROM as_receivables ORDER BY id ASC";
        List<ReceivableResult> receivable = jdbcTemplate.query(sql, new ReceivableMapper());

        return receivable;
    }

    @Override
    public ReceivableResult getReceivableById(int id) {
        String sql = "SELECT * FROM as_receivables WHERE bbmID = ?";
        ReceivableResult receivable = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ReceivableMapper());

        return receivable;
    }

    @Override
    public void addReceivable(Receivable receivable) {
        String sql = "INSERT INTO as_receivables (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, receivable);
    }

    @Override
    public void updateReceivable(Receivable receivable, int id) {
        String sql = "UPDATE as_receivables SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, receivable);
    }

    @Override
    public void deleteReceivable(int id) {
        String sql = "DELETE FROM as_receivables WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_receivables', 'receiveID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
