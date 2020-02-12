package com.brightman.inventory.temp_detail_spb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TempDetailSPBDAOImplementation implements TempDetailSPBDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TempDetailSPBResult> getAllTempDetailSPB() {
        String sql = "SELECT * FROM as_temp_detail_spb ORDER BY id ASC";
        List<TempDetailSPBResult> tempDetailSPB = jdbcTemplate.query(sql, new TempDetailSPBMapper());

        return tempDetailSPB;
    }

    @Override
    public TempDetailSPBResult getTempDetailSPBById(int id) {
        String sql = "SELECT * FROM as_temp_detail_spb WHERE bbmID = ?";
        TempDetailSPBResult tempDetailSPB = jdbcTemplate.queryForObject(sql, new Object[]{id}, new TempDetailSPBMapper());

        return tempDetailSPB;
    }

    @Override
    public void addTempDetailSPB(TempDetailSPB tempDetailSPB) {
        String sql = "INSERT INTO as_temp_detail_spb (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, tempDetailSPB);
    }

    @Override
    public void updateTempDetailSPB(TempDetailSPB tempDetailSPB, int id) {
        String sql = "UPDATE as_temp_detail_spb SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, tempDetailSPB);
    }

    @Override
    public void deleteTempDetailSPBById(int id) {
        String sql = "DELETE FROM as_temp_detail_spb WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_temp_detail_spb', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
