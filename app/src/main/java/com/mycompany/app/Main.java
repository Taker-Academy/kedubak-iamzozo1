package com.kdb.app;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {
    
    public static void main(String[] args) {
        
        MongoClient client = MongoClients.create("mongodb+srv://iamzozo:Onizuk4!@keduback.fnzrmpl.mongodb.net/?retryWrites=true&w=majority&appName=KeDuBack");

        MongoDatabase db = client.getDatabase("KeDuBack");

        MongoCollection userCol = db.getCollection("users");

        
    }
}
