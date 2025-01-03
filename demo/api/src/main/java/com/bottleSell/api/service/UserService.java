package com.bottleSell.api.service;

import com.bottleSell.api.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getUsers();
    public User getUserByIdUsers(Integer id);
}
