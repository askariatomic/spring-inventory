package com.brightman.inventory.temp_detail_so;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TempDetailSODAOImplementation implements TempDetailSODAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TempDetailSOResult> getAllTempDetailSO() {
        String sql = "SELECT * FROM as_temp_detail_so ORDER BY id ASC";
        List<TempDetailSOResult> tempDetailSO = jdbcTemplate.query(sql, new TempDetailSOMapper());

        return tempDetailSO;
    }

    @Override
    public TempDetailSOResult getTempDetailSOById(int id) {
        String sql = "SELECT * FROM as_temp_detail_so WHERE bbmID = ?";
        TempDetailSOResult tempDetailSO = jdbcTemplate.queryForObject(sql, new Object[]{id}, new TempDetailSOMapper());

        return tempDetailSO;
    }

    @Override
    public void addTempDetailSO(TempDetailSO tempDetailSO) {
        String sql = "INSERT INTO as_temp_detail_so (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, tempDetailSO);
    }

    @Override
    public void updateTempDetailSO(TempDetailSO tempDetailSO, int id) {
        String sql = "UPDATE as_temp_detail_so SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, tempDetailSO);
    }

    @Override
    public void deleteTempDetailSOById(int id) {
        String sql = "DELETE FROM as_temp_detail_so WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_temp_detail_so', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
