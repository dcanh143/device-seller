package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Role;
import com.ducanh.deviceseller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
