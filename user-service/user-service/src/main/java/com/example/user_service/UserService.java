package com.example.user_service;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User createUser(User user);

    void deleteUser(String userId);
}