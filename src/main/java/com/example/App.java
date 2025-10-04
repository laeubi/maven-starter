package com.example;

/**
 * A simple Hello World application for Maven starter project.
 * This demonstrates the basic structure of a Java application with Maven.
 */
public class App {
    
    /**
     * Main entry point of the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String greeting = getGreeting();
        System.out.println(greeting);
        
        if (args.length > 0) {
            System.out.println("Arguments received: " + String.join(", ", args));
        }
    }
    
    /**
     * Returns a greeting message.
     * 
     * @return The greeting string
     */
    public static String getGreeting() {
        return "Hello, Maven 4 World!";
    }
}
