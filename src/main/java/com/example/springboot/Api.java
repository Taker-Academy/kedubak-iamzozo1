/*
 * This is my first API
 */
package com.example.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;

//import main.java.com.example.springboot.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
public class Api {
    public static void main(String args[]) {
        System.out.println("Hello world");
        SpringApplication.run(Api.class, args);
    }

    private boolean validRequest(User data) {
        if (data.getFirstName() == null)
            return false;
        if (data.getLastName() == null)
            return false;
        if (data.getPassword() == null)
            return false;
        if (data.getEmail() == null)
            return false;
        return true;
    }

    @PostMapping("/register")
    public int registerNewUser(@RequestBody User requestData) {
        
        if (!validRequest(requestData)) {
            return 400; //Bad Request
        }
        System.out.println("The input value is valid");
        // Return a response
        return 201;
    }
}

