package com.brightman.inventory.spb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SPBDAOImplementation implements SPBDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SPBResult> getAllSPB() {
        String sql = "SELECT * FROM as_spb ORDER BY id ASC";
        List<SPBResult> sPB = jdbcTemplate.query(sql, new SPBMapper());

        return sPB;
    }

    @Override
    public SPBResult getSPBById(int id) {
        String sql = "SELECT * FROM as_spb WHERE bbmID = ?";
        SPBResult sPB = jdbcTemplate.queryForObject(sql, new Object[]{id}, new SPBMapper());

        return sPB;
    }

    @Override
    public void addSPB(SPB spb) {
        String sql = "INSERT INTO as_spb (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, spb);
    }

    @Override
    public void updateSPB(SPB spb, int id) {
        String sql = "UPDATE as_spb SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, spb);
    }

    @Override
    public void deleteSPB(int id) {
        String sql = "DELETE FROM as_spb WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_spb', 'spbID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
