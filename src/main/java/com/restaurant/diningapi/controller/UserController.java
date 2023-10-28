package com.restaurant.diningapi.controller;

import com.restaurant.diningapi.model.User;
import com.restaurant.diningapi.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Long userId){
        return ResponseEntity.ok(userService.getSingleUser(userId));
    }

}
