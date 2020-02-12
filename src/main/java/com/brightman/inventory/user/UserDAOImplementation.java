package com.brightman.inventory.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDAOImplementation implements UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public UserResult getUserByUserName(String userName) {
        String sql = "SELECT * FROM as_bbm WHERE bbmID = ?";
        UserResult user = jdbcTemplate.queryForObject(sql, new Object[]{userName}, new UserMapper());
        return user;
    }
}
