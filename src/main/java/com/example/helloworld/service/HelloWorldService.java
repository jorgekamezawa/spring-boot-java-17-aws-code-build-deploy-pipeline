package com.example.helloworld.service;

import com.example.helloworld.model.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld("Hello", "World Teste");
    }
}
