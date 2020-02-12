package com.brightman.inventory.detail_so;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailSODAOImplementation implements DetailSODAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailSOResult> getAllDetailSO() {
        String sql = "SELECT * FROM as_detail_so ORDER BY id ASC";
        List<DetailSOResult> detailSO = jdbcTemplate.query(sql, new DetailSOMapper());

        return detailSO;
    }

    @Override
    public DetailSOResult getDetailSOById(int id) {
        String sql = "SELECT * FROM as_detail_so WHERE bbmID = ?";
        DetailSOResult detailSO = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailSOMapper());

        return detailSO;
    }

    @Override
    public void addDetailSO(DetailSO detailSO) {
        String sql = "INSERT INTO as_detail_so (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailSO);
    }

    @Override
    public void updateDetailSO(DetailSO detailSO, int id) {
        String sql = "UPDATE as_detail_so SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailSO);
    }

    @Override
    public void deleteDetailSO(int id) {
        String sql = "DELETE FROM as_detail_so WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_so', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
