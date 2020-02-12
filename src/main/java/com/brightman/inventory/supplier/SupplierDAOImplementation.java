package com.brightman.inventory.supplier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class SupplierDAOImplementation implements SupplierDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<SupplierResult> getAllSupplier() {
        String sql = "SELECT * FROM as_suppliers ORDER BY id ASC";
        List<SupplierResult> supplier = jdbcTemplate.query(sql, new SupplierMapper());

        return supplier;
    }

    @Override
    public SupplierResult getSupplierById(int id) {
        String sql = "SELECT * FROM as_suppliers WHERE bbmID = ?";
        SupplierResult supplier = jdbcTemplate.queryForObject(sql, new Object[]{id}, new SupplierMapper());

        return supplier;
    }

    @Override
    public void addSupplier(Supplier supplier) {
        String sql = "INSERT INTO as_suppliers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, supplier);
    }

    @Override
    public void updateSupplier(Supplier supplier, int id) {
        String sql = "UPDATE as_suppliers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, supplier);
    }

    @Override
    public void deleteSupplierById(int id) {
        String sql = "DELETE FROM as_suppliers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_suppliers', 'supplierID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
