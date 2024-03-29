package com.example.helloworld.service;

import com.example.helloworld.model.HelloWorld;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldServiceTest {

    private HelloWorldService service;

    @BeforeEach
    void setup() {
        service = new HelloWorldService();
    }

    @Test
    void testGetHelloWorld() {
        // Given
        HelloWorld expectedHelloWorld = new HelloWorld("Hello", "World Teste 6");

        // When
        HelloWorld actualHelloWorld = service.getHelloWorld();

        // Then
        assertEquals(expectedHelloWorld, actualHelloWorld);
    }
}