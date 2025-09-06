package com.example.taskmanager.service;

import org.springframework.stereotype.Service;
import com.example.taskmanager.repository.HelloRepository;
@Service
public class HelloService {

    private final HelloRepository helloRepository;

    // constructor injection
    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    // only ONE method with this name
    public String getHelloMessage() {
        return helloRepository.fetchMessage();
    }
}
