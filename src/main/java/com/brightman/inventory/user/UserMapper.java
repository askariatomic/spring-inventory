package com.brightman.inventory.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserResult>{
    @Override
    public UserResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUserId(rs.getInt("userId"));
        user.setUserName(rs.getString("userName"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));

        UserResult userResult = new UserResult();
        userResult.setUserId(rs.getInt("userId"));
        userResult.setUserName(rs.getString("userName"));
        userResult.setEmail(rs.getString("email"));
        userResult.setPassword(rs.getString("password"));
        
        return userResult;
    }
}