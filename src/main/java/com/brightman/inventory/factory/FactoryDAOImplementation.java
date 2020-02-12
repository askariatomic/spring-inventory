package com.brightman.inventory.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class FactoryDAOImplementation implements FactoryDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<FactoryResult> getAllFactory() {
        String sql = "SELECT * FROM as_factories ORDER BY id ASC";
        List<FactoryResult> factory = jdbcTemplate.query(sql, new FactoryMapper());

        return factory;
    }

    @Override
    public FactoryResult getFactoryById(int id) {
        String sql = "SELECT * FROM as_factories WHERE bbmID = ?";
        FactoryResult factory = jdbcTemplate.queryForObject(sql, new Object[]{id}, new FactoryMapper());

        return factory;
    }

    @Override
    public void addFactory(Factory factory) {
        String sql = "INSERT INTO as_factories (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, factory);
    }

    @Override
    public void updateFactory(Factory factory, int id) {
        String sql = "UPDATE as_factories SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, factory);
    }

    @Override
    public void deleteFactory(int id) {
        String sql = "DELETE FROM as_factories WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_factories', 'factoryID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
