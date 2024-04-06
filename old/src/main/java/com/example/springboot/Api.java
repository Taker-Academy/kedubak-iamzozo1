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

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

@SpringBootApplication  
@RestController
public class Api {

    private static final String URI = "mongodb+srv://iamzozo:Onizuk4!@keduback.fnzrmpl.mongodb.net/?retryWrites=true&w=majority&appName=KeDuBack";
    private static MongoDatabase database;

    public Api() {
        try {
            MongoClient mongoClient = MongoClients.create(URI);
            database = mongoClient.getDatabase("db_kdb");
        } catch (Exception a) {
            System.err.println("An error as occured while connecting to database:" + a.getMessage());
        }
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
        try {
            // Create a Document from the User object
            Document userDoc = new Document();
            userDoc.put("firstName", requestData.getFirstName());
            userDoc.put("lastName", requestData.getLastName());
            userDoc.put("password", requestData.getPassword());
            userDoc.put("email", requestData.getEmail());
    
            database.getCollection("users").insertOne(userDoc);
            System.out.println("Value inserted successfully");
        } catch (Exception e) {
            // Handle MongoException specifically
            System.err.println("Error inserting user: " + e.getMessage());
            return 500; // Internal server error
        }
        return 201;
    }

    @SpringBootApplication  

    public static void main(String args[]) {
        System.out.println("Hello world");
        SpringApplication.run(Api.class, args);
    }
}

