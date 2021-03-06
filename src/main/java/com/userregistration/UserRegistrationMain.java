package com.userregistration;

public class UserRegistrationMain {
    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME_PATTERN = FIRST_NAME_PATTERN;
    private static final String EMAIL_ID_PATTERN = "^[a-zA-Z]{3,}([.-]?[a-zA-Z0-9]+)?[@]{1}[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]?[a-zA-Z]+)?$";
    private static final String PHONE_NUMBER_PATTERN = "^[0-9]{1,3}[ ][1-9]{1}[0-9]{9}$";
    public static final String PASSWORD_PATTERN_RULE_ONE = "^[a-zA-Z0-9]{8,}$";
    public static final String PASSWORD_PATTERN_RULE_TWO = "^(?=.*[A-Z])[a-zA-Z]{8,}$";
    public static final String PASSWORD_PATTERN_RULE_THREE = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
    public static final String PASSWORD_PATTERN_RULE_FOUR = "^((?=[^@#&%\\_]*[@&#%\\_][^@#&%\\_]*$)(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@#%&\\_]{8,})$";

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

    // Function to check for valid email Id
    public boolean checkForValidEmailId(String emailId) {
        return emailId.matches(EMAIL_ID_PATTERN);
    }

    // Function to check for valid phone number
    public boolean checkForValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_PATTERN);
    }

    // Function to check for valid password by rule one
    public boolean checkForValidPassword(String password, String pattern) {
        return password.matches(pattern);
    }
}
