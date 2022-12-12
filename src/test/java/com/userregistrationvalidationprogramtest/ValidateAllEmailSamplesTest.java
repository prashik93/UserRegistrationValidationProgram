package com.userregistrationvalidationprogramtest;

import com.userregistrationvalidationprogram.UserRegistrationValidation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ValidateAllEmailSamplesTest {
    private String email;
    private String expectedResult;

    private UserRegistrationValidation userRegistrationValidation;

    public ValidateAllEmailSamplesTest(String email, String expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        userRegistrationValidation = new UserRegistrationValidation();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{ {"abc@yahoo.com", "Valid"}, {"abc-100@yahoo.com", "Valid"}, {"abc.100@yahoo.com", "Valid"},
                                             {"abc111@abc.com", "Valid"}, {"abc-100@abc.net", "Valid"}, {"abc.100@abc.com.au", "Valid"},
                                             {"abc@1.com", "Valid"}, {"abc@gmail.com.com", "Valid"}, {"abc+100@gmail.com", "Valid"},
                                             {"abc", "Invalid"}, {"abc@.com.my", "Invalid"}, {"abc123@gmail.a", "Invalid"},
                                             {"abc123@.com", "Invalid"}, {"abc123@.com.com", "Invalid"}, {".abc@abc.com", "Invalid"},
                                             {"abc()*@gmail.com", "Invalid"}, {"abc@%*.com", "Invalid"}, {"abc..2002@gmail.com", "Invalid"},
                                             {"abc.@gmail.com", "Invalid"}, {"abc@abc@gmail.com", "Invalid"}, {"abc@gmail.com.1a", "Invalid"},
                                             {"abc@gmail.com.aa.au", "Invalid"} });
    }

    @Test
    public void validateAllEmailSamplesTest() {
        System.out.println("Valid expected : " + expectedResult);
        assertEquals(expectedResult, UserRegistrationValidation.validateAllEmailSamples(email));
    }
}
