package com.brightman.inventory.detail_do;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailDODAOImplementation implements DetailDODAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailDOResult> getAllDetailDO() {
        String sql = "SELECT * FROM as_detail_do ORDER BY id ASC";
        List<DetailDOResult> detailDO = jdbcTemplate.query(sql, new DetailDOMapper());

        return detailDO;
    }

    @Override
    public DetailDOResult getDetailDOById(int id) {
        String sql = "SELECT * FROM as_detail_do WHERE bbmID = ?";
        DetailDOResult detailDO = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailDOMapper());

        return detailDO;
    }

    @Override
    public void addDetailDO(DetailDO detailDO) {
        String sql = "INSERT INTO as_detail_do (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailDO);
    }

    @Override
    public void updateDetailDO(DetailDO detailDO, int id) {
        String sql = "UPDATE as_detail_do SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailDO);
    }

    @Override
    public void deleteDetailDO(int id) {
        String sql = "DELETE FROM as_detail_do WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_do', 'doID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
