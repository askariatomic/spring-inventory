package com.brightman.inventory.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CustomerDAOImplementation implements CustomerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CustomerResult> getAllCustomer() {
        String sql = "SELECT * FROM as_customers ORDER BY id ASC";
        List<CustomerResult> customer = jdbcTemplate.query(sql, new CustomerMapper());

        return customer;
    }
    
    @Override
    public List<CustomerResult> getCustomers(int pageNo, int pageSize, String sortBy) {
        String sql = "SELECT * FROM as_customers ORDER BY ? ASC";
        List<CustomerResult> customer = jdbcTemplate.query(sql, new Object[]{pageNo}, new CustomerMapper());

        return customer;
    }

    @Override
    public CustomerResult getCustomerById(int id) {
        String sql = "SELECT * FROM as_customers WHERE bbmID = ?";
        CustomerResult customer = jdbcTemplate.queryForObject(sql, new Object[]{id}, new CustomerMapper());

        return customer;
    }

    @Override
    public void createCustomer(Customer customer) {
        String sql = "INSERT INTO as_customers (description, is_done, target_date, username) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, customer);
    }

    @Override
    public void updateCustomer(Customer customer, int id) {
        String sql = "UPDATE as_customers SET description=?, is_done=?, target_date=?, username=? WHERE id = ?";
        jdbcTemplate.update(sql, customer);
    }

    @Override
    public void deleteCustomer(int id) {
        String sql = "DELETE FROM as_customers WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public int lastestInput() {
        String sql = "SELECT currval(pg_get_serial_sequence('as_customers', 'customerID'))";
        int id = jdbcTemplate.queryForObject(sql, Integer.class);

        return id;
    }
}
