package com.brightman.inventory.detail_retur_staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailReturStaffDAOImplementation implements DetailReturStaffDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailReturStaffResult> getAllDetailReturStaff() {
        String sql = "SELECT * FROM as_detail_retur_staffs ORDER BY id ASC";
        List<DetailReturStaffResult> detailReturStaff = jdbcTemplate.query(sql, new DetailReturStaffMapper());

        return detailReturStaff;
    }

    @Override
    public DetailReturStaffResult getDetailReturStaffById(int id) {
        String sql = "SELECT * FROM as_detail_retur_staffs WHERE bbmID = ?";
        DetailReturStaffResult detailReturStaff = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailReturStaffMapper());

        return detailReturStaff;
    }

    @Override
    public void addDetailReturStaff(DetailReturStaff detailReturStaff) {
        String sql = "INSERT INTO as_detail_retur_staffs (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailReturStaff);
    }

    @Override
    public void updateDetailReturStaff(DetailReturStaff detailReturStaff, int id) {
        String sql = "UPDATE as_detail_retur_staffs SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailReturStaff);
    }

    @Override
    public void deleteDetailReturStaff(int id) {
        String sql = "DELETE FROM as_detail_retur_staffs WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_retur_staffs', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
