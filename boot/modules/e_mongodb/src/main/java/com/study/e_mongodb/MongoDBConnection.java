package com.study.e_mongodb;

import org.springframework.stereotype.Component;

@Component
public class MongoDBConnection {

    public void connectionTest() {
        System.out.println("MongoDB connection test");
    }

}
