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
                                             {"abc", "Email is Invalid"}, {"abc@.com.my", "Email is Invalid"}, {"abc123@gmail.a", "Email is Invalid"},
                                             {"abc123@.com", "Email is Invalid"}, {"abc123@.com.com", "Email is Invalid"}, {".abc@abc.com", "Email is Invalid"},
                                             {"abc()*@gmail.com", "Email is Invalid"}, {"abc@%*.com", "Email is Invalid"}, {"abc..2002@gmail.com", "Email is Invalid"},
                                             {"abc.@gmail.com", "Email is Invalid"}, {"abc@abc@gmail.com", "Email is Invalid"}, {"abc@gmail.com.1a", "Email is Invalid"},
                                             {"abc@gmail.com.aa.au", "Email is Invalid"} });
    }

    @Test
    public void validateAllEmailSamplesTest() {
        System.out.println("Valid expected : " + expectedResult);
        assertEquals(expectedResult, UserRegistrationValidation.validateAllEmailSamples(email));
    }
}
