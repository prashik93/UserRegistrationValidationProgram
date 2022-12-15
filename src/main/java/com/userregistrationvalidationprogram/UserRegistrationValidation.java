package com.userregistrationvalidationprogram;

import com.userregistrationvalidationprogram.custom.MyUserRegistrationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    public String validateFirstName(String firstName) {
        try {
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
            Matcher matcher = pattern.matcher(firstName);
            boolean result = matcher.find();
            if (result == false) {
                throw new MyUserRegistrationException("FirstName is Invalid");
            }
        } catch (MyUserRegistrationException e) {
            return e.getMessage();
        }
        return "Valid";
    }

    public String validateLastName(String lastName) {
        try {
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
            Matcher matcher = pattern.matcher(lastName);
            boolean result = matcher.find();
            if (result == false) {
                throw new MyUserRegistrationException("LastName is Invalid");
            }
        }catch (MyUserRegistrationException e) {
            return e.getMessage();
        }
        return "Valid";
    }

    public String validateEmail(String email){
        try {
            Pattern pattern = Pattern.compile("^((([a-z]{3})|([a-z]{3}[.][a-z]{3}))[@][bl]{2}[.]([co]{2}|[co]{2}[.][in]{2}))$");
            Matcher matcher = pattern.matcher(email);
            boolean result = matcher.find();
            if (result == false) {
                throw new MyUserRegistrationException("Email is Invalid");
            }
        } catch (MyUserRegistrationException e) {
            return e.getMessage();
        }
        return "Valid";
    }

    public String validateMobileFormat(String mobileNumber) {
        try {
            Pattern pattern = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
            Matcher matcher = pattern.matcher(mobileNumber);
            boolean result = matcher.find();
            if (result == false) {
                throw new MyUserRegistrationException("MobileNumber is Invalid");
            }
        } catch (MyUserRegistrationException e) {
            return e.getMessage();
        }
        return "Valid";
    }

    public String validatePassword(String password) {
        try {
            Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*]([^!@#$%^&*])*$)([a-zA-Z0-9(!@#$%^&*)]){8,}$");
            Matcher matcher = pattern.matcher(password);
            boolean result = matcher.find();
            if (result == false) {
                throw new MyUserRegistrationException("Password is Invalid");
            }
        } catch (MyUserRegistrationException e) {
            return e.getMessage();
        }
        return "Valid";
    }

    public static String validateAllEmailSamples(String email) {
        try {
            Pattern pattern = Pattern.compile("^([a-z 0-9]{3,}|[a-z 0-9]{3,}[-|+|-|.][a-z 0-9]{1,})[@][a-z 0-9]{1,}[.]([com|net|co]{2,3}|[com|net|co]{2,3}[.][au|in|com]{2,3})$");
            Matcher matcher = pattern.matcher(email);
            boolean result = matcher.find();
            if (result == false) {
                throw new MyUserRegistrationException("Email is Invalid");
            }
        } catch (MyUserRegistrationException e) {
            return e.getMessage();
        }
        return "Valid";
    }
}
