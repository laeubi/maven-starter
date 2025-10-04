package com.example;

/**
 * A simple Hello World class for Maven beginners.
 * This demonstrates a basic Java application with a main method.
 */
public class HelloWorld {

    /**
     * Returns a greeting message.
     *
     * @param name the name to greet
     * @return a greeting message
     */
    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    /**
     * Main method - entry point of the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        
        if (args.length > 0) {
            System.out.println(helloWorld.greet(args[0]));
        } else {
            System.out.println(helloWorld.greet(null));
        }
    }
}
