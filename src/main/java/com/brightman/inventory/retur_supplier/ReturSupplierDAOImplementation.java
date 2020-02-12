package com.brightman.inventory.retur_supplier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ReturSupplierDAOImplementation implements ReturSupplierDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ReturSupplierResult> getAllReturSupplier() {
        String sql = "SELECT * FROM as_retur_suppliers ORDER BY id ASC";
        List<ReturSupplierResult> returSupplier = jdbcTemplate.query(sql, new ReturSupplierMapper());

        return returSupplier;
    }

    @Override
    public ReturSupplierResult getReturSupplierById(int id) {
        String sql = "SELECT * FROM as_retur_suppliers WHERE bbmID = ?";
        ReturSupplierResult returSupplier = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ReturSupplierMapper());

        return returSupplier;
    }

    @Override
    public void addReturSupplier(ReturSupplier returSupplier) {
        String sql = "INSERT INTO as_retur_suppliers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, returSupplier);
    }

    @Override
    public void updateReturSupplier(ReturSupplier returSupplier, int id) {
        String sql = "UPDATE as_retur_suppliers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, returSupplier);
    }

    @Override
    public void deleteReturSupplier(int id) {
        String sql = "DELETE FROM as_retur_suppliers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_retur_suppliers', 'returID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
