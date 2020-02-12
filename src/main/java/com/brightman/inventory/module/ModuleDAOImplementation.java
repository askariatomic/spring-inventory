package com.brightman.inventory.module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class ModuleDAOImplementation implements ModuleDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<ModuleResult> getAllModule() {
        String sql = "SELECT * FROM as_modules ORDER BY id ASC";
        List<ModuleResult> module = jdbcTemplate.query(sql, new ModuleMapper());

        return module;
    }

    @Override
    public ModuleResult getModuleById(int id) {
        String sql = "SELECT * FROM as_modules WHERE bbmID = ?";
        ModuleResult module = jdbcTemplate.queryForObject(sql, new Object[]{id}, new ModuleMapper());

        return module;
    }

    @Override
    public void addModule(Module module) {
        String sql = "INSERT INTO as_modules (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, module);
    }

    @Override
    public void updateModule(Module module, int id) {
        String sql = "UPDATE as_modules SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, module);
    }

    @Override
    public void deleteModule(int id) {
        String sql = "DELETE FROM as_modules WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_modules', 'modulID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
