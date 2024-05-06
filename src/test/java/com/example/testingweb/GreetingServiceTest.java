package com.example.testingweb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    @Test
    void testGreet() {
        GreetingService service = new GreetingService();
        assertEquals("Hola, soy Rodrigo Orellana", service.greet());
    }
}
