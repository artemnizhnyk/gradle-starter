package com.artemnizhnyk.service;

import com.artemnizhnyk.dao.UserDao;
import com.artemnizhnyk.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private final UserService userService = new UserService();

    @Test
    void getAll() {
        List<User> actual = userService.getAll();
        assertEquals(3, actual.size());
    }
}