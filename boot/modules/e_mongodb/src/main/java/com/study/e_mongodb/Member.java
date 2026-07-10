package com.study.e_mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "member")
public class Member {

    @Id
    private String id;

    private String name;

    private int age;

    public Member() {
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "id : " + id + ", name : " + name + ", age : " + age;
    }
}