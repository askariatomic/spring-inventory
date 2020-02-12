package com.brightman.inventory.detail_bbm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailBBMDAOImplementation implements DetailBBMDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailBBMResult> getAllDetailBBM() {
        String sql = "SELECT * FROM as_detail_bbm ORDER BY id ASC";
        List<DetailBBMResult> detailBBM = jdbcTemplate.query(sql, new DetailBBMMapper());

        return detailBBM;
    }

    @Override
    public DetailBBMResult getDetailBBMById(int id) {
        String sql = "SELECT * FROM as_detail_bbm WHERE bbmID = ?";
        DetailBBMResult detailBBM = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailBBMMapper());

        return detailBBM;
    }

    @Override
    public void addDetailBBM(DetailBBM detailBBM) {
        String sql = "INSERT INTO as_detail_bbm (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailBBM);
    }

    @Override
    public void updateDetailBBM(DetailBBM detailBBM, int id) {
        String sql = "UPDATE as_detail_bbm SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailBBM);
    }

    @Override
    public void deleteDetailBBM(int id) {
        String sql = "DELETE FROM as_detail_bbm WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_bbm', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
