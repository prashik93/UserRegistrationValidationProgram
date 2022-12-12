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

    public String validateLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.find();
        if(result) {
            System.out.println("Last Name is Valid");
            return "Valid";
        }
        System.out.println("Invalid, Last Name should Start with UpperCase letter and has minimum 3 characters");
        return "Invalid";
    }

    public String validateEmail(String email) {
        Pattern pattern = Pattern.compile("^((([a-z]{3})|([a-z]{3}[.][a-z]{3}))[@][bl]{2}[.]([co]{2}|[co]{2}[.][in]{2}))$");
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.find();
        if(result) {
            System.out.println("Email is Valid");
            return "Valid";
        }
        return "Invalid";
    }

    public String validateMobileFormat(String mobileNumber) {
        Pattern pattern = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result = matcher.find();
        if(result) {
            System.out.println("Mobile Format is Valid");
            return "Valid";
        }
        return "Invalid";
    }

    public String validatePassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*]([^!@#$%^&*])*$)([a-zA-Z0-9(!@#$%^&*)]){8,}$");
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.find();
        if(result) {
            System.out.println("Password is Valid");
            return "Valid";
        }
        System.out.print("""
                          \nPassword should contain minimum 8 characters.
                          Password should contain at least One UpperCase Letter.
                          Password should contain at least One Numeric Number.
                          Password should contain exactly One Special Character.""");
        return "Invalid";
    }

    public static String validateAllEmailSamples(String email) {
        Pattern pattern = Pattern.compile("^([a-z 0-9]{3,}|[a-z 0-9]{3,}[-|+|-|.][a-z 0-9]{1,})[@][a-z 0-9]{1,}[.]([com|net|co]{2,3}|[com|net|co]{2,3}[.][au|in|com]{2,3})$");
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.find();
        if(result) {
            System.out.println("Email is Valid");
            return "Valid";
        }
        return "Invalid";
    }
}
