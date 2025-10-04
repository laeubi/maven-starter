package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the App class.
 * Demonstrates JUnit 5 testing with Maven.
 */
class AppTest {
    
    @Test
    @DisplayName("Test greeting message")
    void testGreeting() {
        String greeting = App.getGreeting();
        assertNotNull(greeting, "Greeting should not be null");
        assertTrue(greeting.contains("Maven"), "Greeting should contain 'Maven'");
        assertEquals("Hello, Maven 4 World!", greeting, "Greeting should match expected message");
    }
    
    @Test
    @DisplayName("Test greeting is not empty")
    void testGreetingNotEmpty() {
        String greeting = App.getGreeting();
        assertFalse(greeting.isEmpty(), "Greeting should not be empty");
    }
}
