package com.userregistrationvalidationprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    public String validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.find();
        if(result) {
            System.out.println("First Name is Valid");
            return "Valid";
        }
        System.out.println("Invalid, First Name should Start with UpperCase letter and has minimum 3 characters");
        return "Invalid";
    }

}
