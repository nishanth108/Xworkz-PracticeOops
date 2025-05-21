package com.xworkz.exceptionHandling.internal;

public class UserInputValidator {

    public static void main(String[] args) {
        String userInput = null;

        try {
            // Simulate processing user input
            processInput(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Input validation completed.");
        }
    }

    public static void processInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }

        System.out.println("Processing input: " + input);
    }
}

