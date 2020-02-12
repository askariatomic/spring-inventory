package com.brightman.inventory.debt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class DebtDAOImplementation implements DebtDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DebtResult> getAllDebt() {
        String sql = "SELECT * FROM as_debts ORDER BY id ASC";
        List<DebtResult> debt = jdbcTemplate.query(sql, new DebtMapper());

        return debt;
    }

    @Override
    public DebtResult getDebtById(int id) {
        String sql = "SELECT * FROM as_debts WHERE bbmID = ?";
        DebtResult debt = jdbcTemplate.queryForObject(sql, new Object[]{id}, new DebtMapper());

        return debt;
    }

    @Override
    public void addDebt(Debt debt) {
        String sql = "INSERT INTO as_debts (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, debt);
    }

    @Override
    public void updateDebt(Debt debt, int id) {
        String sql = "UPDATE as_debts SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, debt);
    }

    @Override
    public void deleteDebt(int id) {
        String sql = "DELETE FROM as_debts WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_debts', 'debtID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}

