package com.brightman.inventory.detail_spb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailSPBDAOImplementation implements DetailSPBDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailSPBResult> getAllDetailSPB() {
        String sql = "SELECT * FROM as_detail_spb ORDER BY id ASC";
        List<DetailSPBResult> detailSPB = jdbcTemplate.query(sql, new DetailSPBMapper());

        return detailSPB;
    }

    @Override
    public DetailSPBResult getDetailSPBById(int id) {
        String sql = "SELECT * FROM as_detail_spb WHERE bbmID = ?";
        DetailSPBResult detailSPB = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailSPBMapper());

        return detailSPB;
    }

    @Override
    public void addDetailSPB(DetailSPB detailSPB) {
        String sql = "INSERT INTO as_detail_spb (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailSPB);
    }

    @Override
    public void updateDetailSPB(DetailSPB detailSPB, int id) {
        String sql = "UPDATE as_detail_spb SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailSPB);
    }

    @Override
    public void deleteDetailSPB(int id) {
        String sql = "DELETE FROM as_detail_spb WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_spb', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
