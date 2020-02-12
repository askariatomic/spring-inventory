package com.brightman.inventory.temp_detail_transfer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TempDetailTransferDAOImplementation implements TempDetailTransferDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TempDetailTransferResult> getAllTempDetailTransfer() {
        String sql = "SELECT * FROM as_temp_detail_transfers ORDER BY id ASC";
        List<TempDetailTransferResult> tempDetailTransfer = jdbcTemplate.query(sql, new TempDetailTransferMapper());

        return tempDetailTransfer;
    }

    @Override
    public TempDetailTransferResult getTempDetailTransferById(int id) {
        String sql = "SELECT * FROM as_temp_detail_transfers WHERE bbmID = ?";
        TempDetailTransferResult tempDetailTransfer = jdbcTemplate.queryForObject(sql, new Object[]{id}, new TempDetailTransferMapper());

        return tempDetailTransfer;
    }

    @Override
    public void addTempDetailTransfer(TempDetailTransfer tempDetailTransfer) {
        String sql = "INSERT INTO as_temp_detail_transfers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, tempDetailTransfer);
    }

    @Override
    public void updateTempDetailTransfer(TempDetailTransfer tempDetailTransfer, int id) {
        String sql = "UPDATE as_temp_detail_transfers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, tempDetailTransfer);
    }

    @Override
    public void deleteTempDetailTransferById(int id) {
        String sql = "DELETE FROM as_temp_detail_transfers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_temp_detail_transfers', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
