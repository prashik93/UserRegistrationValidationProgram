package com.userregistrationvalidationprogramtest;

import com.userregistrationvalidationprogram.UserRegistrationValidation;
import com.userregistrationvalidationprogram.custom.MyUserRegistrationException;
import org.junit.Test;

public class UserRegistrationValidationTest {
    UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();

    @Test
    public void whenGivenFirstName_ShouldCheckValid() {
        String usrFirstName = "Prashik";
        try {
            userRegistrationValidation.validateFirstName(usrFirstName);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenFirstName_ShouldCheckInvalid() {
        String usrFirstName = "rashik";
        try {
            userRegistrationValidation.validateFirstName(usrFirstName);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenLastName_ShouldCheckValid() {
        String usrLastName = "Kamble";
        try {
            userRegistrationValidation.validateLastName(usrLastName);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenLastName_ShouldCheckInvalid() {
        String usrLastName = "amble";
        try {
            userRegistrationValidation.validateLastName(usrLastName);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenEmail_ShouldCheckValid() {
        String usrEmail = "abc.xyz@bl.co.in";
        try {
            userRegistrationValidation.validateEmail(usrEmail);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenEmail_ShouldCheckInvalid() {
        String usrEmail = "abc.xyzbl.co.in";
        try {
            userRegistrationValidation.validateEmail(usrEmail);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenMobileNumber_ShouldCheckValid() {
        String usrMobileNumber = "91 9919819801";
        try {
            userRegistrationValidation.validateMobileFormat(usrMobileNumber);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenMobileNumber_ShouldCheckInvalid() {
        String usrMobileNumber = "91 991981";
        try{
            userRegistrationValidation.validateMobileFormat(usrMobileNumber);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenPassword_ShouldCheckValid() {
        String usrPassword = "a1CDe4$h";
        try {
            userRegistrationValidation.validatePassword(usrPassword);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenGivenPassword_ShouldCheckInvalid() {
        String usrPassword = "a1$h";
        try {
           userRegistrationValidation.validatePassword(usrPassword);
        } catch (MyUserRegistrationException e) {
            e.printStackTrace();
        }
    }
}
