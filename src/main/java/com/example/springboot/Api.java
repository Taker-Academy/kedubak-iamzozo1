/*
 * This is my first API
 */
package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
class User {
    public String firstName;
    public String lastName;
    public String createdAt;
    public String email;
    public String password;
    public String lastUpVote;
    public String _id;
}

class Comment {
    public String createdAt;
    public int id;
    public String firstName;
    public String content;
}

class Post {
    public String firstName;
    public String title;
    public String createdAt;
    public String content;
    public Comment[] comments;
    public String[] UpVotes;
}

@RestController
public class Api {
    public static void main(String args[]) {
        System.out.println("Hello world");
        SpringApplication.run(Api.class, args);
    }

    @PostMapping("/data")
    public String receiveData(@RequestBody String requestData) {
        // Process the received data
        System.out.println("Received data: " + requestData);

        // Return a response
        return "Data received successfully";
    }
}

