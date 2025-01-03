package com.bottleSell.api.service.impl;

import com.bottleSell.api.models.User;
import com.bottleSell.api.repository.UserRepository;
import com.bottleSell.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository repository;

    @Autowired //Dependency injection
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserByIdUsers(Integer id) {
        return repository.getUserById(id);
    }
}
