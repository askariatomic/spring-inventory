package com.brightman.inventory.detail_retur_supplier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DetailReturSupplierDAOImplementation implements DetailReturSupplierDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DetailReturSupplierResult> getAllDetailReturSupplier() {
        String sql = "SELECT * FROM as_detail_retur_suppliers ORDER BY id ASC";
        List<DetailReturSupplierResult> detailReturSupplier = jdbcTemplate.query(sql, new DetailReturSupplierMapper());

        return detailReturSupplier;
    }

    @Override
    public DetailReturSupplierResult getDetailReturSupplierById(int id) {
        String sql = "SELECT * FROM as_detail_retur_suppliers WHERE bbmID = ?";
        DetailReturSupplierResult detailReturSupplier = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DetailReturSupplierMapper());

        return detailReturSupplier;
    }

    @Override
    public void addDetailReturSupplier(DetailReturSupplier detailReturSupplier) {
        String sql = "INSERT INTO as_detail_retur_suppliers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, detailReturSupplier);
    }

    @Override
    public void updateDetailReturSupplier(DetailReturSupplier detailReturSupplier, int id) {
        String sql = "UPDATE as_detail_retur_suppliers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, detailReturSupplier);
    }

    @Override
    public void deleteDetailReturSupplier(int id) {
        String sql = "DELETE FROM as_detail_retur_suppliers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_detail_retur_suppliers', 'detailID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
