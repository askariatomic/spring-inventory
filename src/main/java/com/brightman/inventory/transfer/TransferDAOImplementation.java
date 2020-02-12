package com.brightman.inventory.transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TransferDAOImplementation implements TransferDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TransferResult> getAllTransfer() {
        String sql = "SELECT * FROM as_transfers ORDER BY id ASC";
        List<TransferResult> transfer = jdbcTemplate.query(sql, new TransferMapper());

        return transfer;
    }

    @Override
    public TransferResult getTransferById(int id) {
        String sql = "SELECT * FROM as_transfers WHERE bbmID = ?";
        TransferResult transfer = jdbcTemplate.queryForObject(sql, new Object[]{id}, new TransferMapper());

        return transfer;
    }

    @Override
    public void addTransfer(Transfer transfer) {
        String sql = "INSERT INTO as_transfers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, transfer);
    }

    @Override
    public void updateTransfer(Transfer transfer, int id) {
        String sql = "UPDATE as_transfers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, transfer);
    }

    @Override
    public void deleteTransferById(int id) {
        String sql = "DELETE FROM as_transfers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_transfers', 'transferID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
