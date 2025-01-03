package com.bottleSell.api.controllers;

import com.bottleSell.api.models.Bag;
import com.bottleSell.api.service.BagService;
import com.bottleSell.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BagController {
    private BagService service;
    private UserService userService;
    @Autowired
    public BagController(BagService service, UserService userService) {
        this.service = service;
        this.userService = userService;
    }

    @GetMapping("bags/{id}")
    public ResponseEntity<List<Bag>> getBagsByUser(@PathVariable("id") int id){

        return ResponseEntity.ok(service.getBagByUser(userService.getUserByIdUsers(id)));
    }
    @PostMapping("bags")
    public ResponseEntity<> createBag(@PathVariable("id") int id){

        return ResponseEntity.ok(service.getBagByUser(userService.getUserByIdUsers(id)));
    }

}
