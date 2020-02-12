package com.brightman.inventory.retur_staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ReturStaffDAOImplementation implements ReturStaffDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ReturStaffResult> getAllReturStaff() {
        String sql = "SELECT * FROM as_retur_staffs ORDER BY id ASC";
        List<ReturStaffResult> returStaff = jdbcTemplate.query(sql, new ReturStaffMapper());

        return returStaff;
    }

    @Override
    public ReturStaffResult getReturStaffById(int id) {
        String sql = "SELECT * FROM as_retur_staffs WHERE bbmID = ?";
        ReturStaffResult returStaff = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ReturStaffMapper());

        return returStaff;
    }

    @Override
    public void addReturStaff(ReturStaff returStaff) {
        String sql = "INSERT INTO as_retur_staffs (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, returStaff);
    }

    @Override
    public void updateReturStaff(ReturStaff returStaff, int id) {
        String sql = "UPDATE as_retur_staffs SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, returStaff);
    }

    @Override
    public void deleteReturStaff(int id) {
        String sql = "DELETE FROM as_retur_staffs WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_retur_staffs', 'returID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
