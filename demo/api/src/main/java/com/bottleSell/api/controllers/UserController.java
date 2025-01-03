package com.bottleSell.api.controllers;

import com.bottleSell.api.models.User;
import com.bottleSell.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    private UserService service;
    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers(){

        return ResponseEntity.ok(service.getUsers());
    }


    @GetMapping("users/{id}")
    public ResponseEntity<User> getUserByIdUsers(@PathVariable("id") int id){

        return ResponseEntity.ok(service.getUserByIdUsers(id));
    }

}
