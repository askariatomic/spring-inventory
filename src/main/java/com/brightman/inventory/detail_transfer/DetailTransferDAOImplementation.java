package com.brightman.inventory.detail_transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailTransferDAOImplementation implements DetailTransferDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailTransferResult> getAllDetailTransfer() {
        String sql = "SELECT * FROM as_detail_transfers ORDER BY id ASC";
        List<DetailTransferResult> detailTransfer = jdbcTemplate.query(sql, new DetailTransferMapper());

        return detailTransfer;
    }

    @Override
    public DetailTransferResult getDetailTransferById(int id) {
        String sql = "SELECT * FROM as_detail_transfers WHERE bbmID = ?";
        DetailTransferResult detailTransfer = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailTransferMapper());

        return detailTransfer;
    }

    @Override
    public void addDetailTransfer(DetailTransfer detailTransfer) {
        String sql = "INSERT INTO as_detail_transfers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailTransfer);
    }

    @Override
    public void updateDetailTransfer(DetailTransfer detailTransfer, int id) {
        String sql = "UPDATE as_detail_transfers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailTransfer);
    }

    @Override
    public void deleteDetailTransfer(int id) {
        String sql = "DELETE FROM as_detail_transfers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_transfers', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
