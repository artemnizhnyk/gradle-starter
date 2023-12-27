package com.artemnizhnyk.dao;

import com.artemnizhnyk.model.User;

import java.util.List;

public class UserDao {
    public List<User> findAll() {
        return List.of(
                new User(1,"Ivan"),
                new User(2,"Artem"),
                new User(3,"Denis")
        );
    }
}
