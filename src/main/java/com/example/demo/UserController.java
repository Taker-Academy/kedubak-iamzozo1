package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class UserController {
 
    private final UserService userService;

    public List<User> fetchAllUsers() {
        return userService.getAllUsers();
    }
}
