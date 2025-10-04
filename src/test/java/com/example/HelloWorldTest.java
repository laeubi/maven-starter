package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for HelloWorld.
 * This demonstrates how to write unit tests with JUnit 5.
 */
public class HelloWorldTest {

    @Test
    public void testGreetWithName() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.greet("Maven");
        assertEquals("Hello, Maven!", result, "Greeting should include the provided name");
    }

    @Test
    public void testGreetWithoutName() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.greet(null);
        assertEquals("Hello, World!", result, "Greeting should be default when name is null");
    }

    @Test
    public void testGreetWithEmptyName() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.greet("  ");
        assertEquals("Hello, World!", result, "Greeting should be default when name is empty");
    }
}
