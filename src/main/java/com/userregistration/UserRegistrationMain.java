package com.userregistration;

public class UserRegistrationMain {
    String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";

    public static void main(String[] args) {
        System.out.println("Welcome to User Registrations");
    }

    //Function to check for valid first name
    public boolean checkForValidFirstName(String firstName) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }
}
