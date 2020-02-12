package com.brightman.inventory.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplementation implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserResult getUserByUserName(String userName) {
        return userDAO.getUserByUserName(userName);
    }     
}
