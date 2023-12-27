package com.artemnizhnyk.service;

import com.artemnizhnyk.dao.UserDao;
import com.artemnizhnyk.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
