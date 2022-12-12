package com.userregistrationvalidationprogramtest;

import com.userregistrationvalidationprogram.UserRegistrationValidation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRegistrationValidationTest {
    @Test
    public void whenGivenFirstName_shouldCheckValidOrInvalid() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        String usrFirstName = "Prashik";
        String result = userRegistrationValidation.validateFirstName(usrFirstName);
        assertEquals("Valid", result);
    }
}
