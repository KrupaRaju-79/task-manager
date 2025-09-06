package com.example.taskmanager.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String fetchMessage() {
        return "Hello from Repository (DB layer)";
    }
}
