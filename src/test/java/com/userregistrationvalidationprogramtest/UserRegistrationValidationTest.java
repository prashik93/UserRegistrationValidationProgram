package com.userregistrationvalidationprogramtest;

import com.userregistrationvalidationprogram.UserRegistrationValidation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRegistrationValidationTest {
    UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
    @Test
    public void whenGivenFirstName_shouldCheckValidOrInvalid() {
        String usrFirstName = "Prashik";
        String result = userRegistrationValidation.validateFirstName(usrFirstName);
        assertEquals("Valid", result);
    }

    @Test
    public void whenGivenLastName_shouldCheckValidOrInvalid() {
        String usrLastName = "Kamble";
        String result = userRegistrationValidation.validateLastName(usrLastName);
        assertEquals("Valid", result);
    }
}
