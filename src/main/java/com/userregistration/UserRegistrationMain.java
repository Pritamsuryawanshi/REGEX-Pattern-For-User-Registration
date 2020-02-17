package com.userregistration;

public class UserRegistrationMain {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = FIRST_NAME_PATTERN;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registrations");
    }

    // Function to check for valid first name
    public boolean checkForValidFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }

    // Function to check for valid last name
    public boolean checkForValidLastName(String lastName) {
        return lastName.matches(LAST_NAME_PATTERN);
    }
}
