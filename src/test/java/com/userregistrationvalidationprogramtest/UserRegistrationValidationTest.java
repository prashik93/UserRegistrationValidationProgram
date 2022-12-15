package com.userregistrationvalidationprogramtest;

import com.userregistrationvalidationprogram.UserRegistrationValidation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRegistrationValidationTest {
    UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();

    @Test
    public void whenGivenFirstName_shouldCheckValid() {
        String usrFirstName = "Prashik";
        String result = userRegistrationValidation.validateFirstName(usrFirstName);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenFirstName_shouldCheckInvalid() {
        String usrFirstName = "rashik";
        String result = userRegistrationValidation.validateFirstName(usrFirstName);
        assertEquals("FirstName is Invalid", result);
    }

    @Test
    public void whenGivenLastName_shouldCheckValid() {
        String usrLastName = "Kamble";
        String result = userRegistrationValidation.validateLastName(usrLastName);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenLastName_shouldCheckInvalid() {
        String usrLastName = "amble";
        String result = userRegistrationValidation.validateLastName(usrLastName);
        assertEquals("LastName is Invalid", result);
    }

    @Test
    public void whenGivenEmail_shouldCheckValid() {
        String usrEmail = "abc.xyz@bl.co.in";
        String result = userRegistrationValidation.validateEmail(usrEmail);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenEmail_shouldCheckInvalid() {
        String usrEmail = "abc.xyzbl.co.in";
        String result = userRegistrationValidation.validateEmail(usrEmail);
        assertEquals("Email is Invalid", result);
    }

    @Test
    public void whenGivenMobileNumber_shouldCheckValid() {
        String usrMobileNumber = "91 9919819801";
        String result = userRegistrationValidation.validateMobileFormat(usrMobileNumber);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenMobileNumber_shouldCheckInvalid() {
        String usrMobileNumber = "91 991981";
        String result = userRegistrationValidation.validateMobileFormat(usrMobileNumber);
        assertEquals("MobileNumber is Invalid", result);
    }

    @Test
    public void whenGivenPassword_shouldCheckItContainsMinimumEightCharacters() {
        String usrPassword = "a1C!efgh";
        String result = userRegistrationValidation.validatePassword(usrPassword);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenPassword_shouldCheckItContainsAtLeastOneUpperCaseLetter() {
        String usrPassword = "abCD@3gh";
        String result = userRegistrationValidation.validatePassword(usrPassword);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenPassword_shouldCheckItContainsAtLeastOneNumericNumber() {
        String usrPassword = "a1CD#4gh";
        String result = userRegistrationValidation.validatePassword(usrPassword);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenPassword_shouldCheckItContainsExactlyOneSpecialCharacter() {
        String usrPassword = "a1CDe4$h";
        String result = userRegistrationValidation.validatePassword(usrPassword);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenPassword_shouldCheckItContainsExactlyOneSpecialCharacter_ReturnEmailIsInvalid() {
        String usrPassword = "a1$h";
        String result = userRegistrationValidation.validatePassword(usrPassword);
        assertEquals("Password is Invalid", result);
    }
}
