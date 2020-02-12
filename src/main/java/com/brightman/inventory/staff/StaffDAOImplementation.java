package com.brightman.inventory.staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class StaffDAOImplementation implements StaffDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<StaffResult> getAllStaff() {
        String sql = "SELECT * FROM as_staffs ORDER BY id ASC";
        List<StaffResult> staff = jdbcTemplate.query(sql, new StaffMapper());

        return staff;
    }

    @Override
    public StaffResult getStaffById(int id) {
        String sql = "SELECT * FROM as_staffs WHERE bbmID = ?";
        StaffResult staff = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StaffMapper());

        return staff;
    }

    @Override
    public void addStaff(Staff staff) {
        String sql = "INSERT INTO as_staffs (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, staff);
    }

    @Override
    public void updateStaff(Staff staff, int id) {
        String sql = "UPDATE as_staffs SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, staff);
    }

    @Override
    public void deleteStaff(int id) {
        String sql = "DELETE FROM as_staffs WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_staffs', 'staffID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
