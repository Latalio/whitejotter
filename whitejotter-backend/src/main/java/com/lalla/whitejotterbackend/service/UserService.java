package com.lalla.whitejotterbackend.service;

import com.lalla.whitejotterbackend.dao.UserDAO;
import com.lalla.whitejotterbackend.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public boolean isExist(String username) {
        User user = getByName(username);
        return null != user;
    }

    public User get(String username, String password) {
        if (userDAO == null) System.out.println("Dao is null");
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}
