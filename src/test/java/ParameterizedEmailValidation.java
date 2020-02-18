package com.userregistration;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedEmailValidation {
    private String emailID;
    private boolean expectedResult;
    private UserRegistrationMain userRegistration;

    public ParameterizedEmailValidation(String emailID, boolean expectedResult){
        super();
        this.emailID=emailID;
        this.expectedResult=expectedResult;
    }

    @Before
    public void initialize() {
        userRegistration = new UserRegistrationMain();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
            {"abc@yahoo.com", true},
            {"abc-100@yahoo.com", true},
            {"abc.100@yahoo.com", true},
            {"abc111@abc.com", true},
            {"abc-100@abc.net", true},
            {"abc.100@abc.com.au", true},
            {"abc@1.com", true},
            {"abc@gmail.com.com", true},
            {"abc-gmail.com", false},
            {"abc@.com.my", false},
            {"abc123@gmail.a", false},
            {"abc123@.com", false},
            {"abc123@.com.com", false},
            {".abc@abc.com", false},
            {"abc()*@gmail.com", false},
            {"abc@%*.com", false},
            {"abc..2002@gmail.com", false},
            {"abc.@gmail.com", false},
            {"abc@abc@gmail.com", false},
            {"abc@gmail.com.1a", false},
            {"abc@gmail.com.aa.au", false}});
    }

    @Test
    public void EmailValidation() {
        Assert.assertEquals(expectedResult, userRegistration.checkForValidEmailId(emailID));
    }
}