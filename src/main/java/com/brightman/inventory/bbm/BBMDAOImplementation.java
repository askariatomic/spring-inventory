package com.brightman.inventory.bbm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BBMDAOImplementation implements BBMDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<BBMResult> getAllBBM() {
        String sql = "SELECT * FROM as_bbm ORDER BY id ASC";
        List<BBMResult> bBM = jdbcTemplate.query(sql, new BBMMapper());

        return bBM;
    }

    @Override
    public BBMResult getBBMById(int id) {
        String sql = "SELECT * FROM as_bbm WHERE bbmID = ?";
        BBMResult bBM = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BBMMapper());

        return bBM;
    }

    @Override
    public void addBBM(BBM bbm) {
        String sql = "INSERT INTO as_bbm (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, bbm);
    }

    @Override
    public void updateBBM(BBM bbm, int id) {
        String sql = "UPDATE as_bbm SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, bbm);
    }

    @Override
    public void deleteBBM(int id) {
        String sql = "DELETE FROM as_bbm WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_bbm', 'bbmID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
