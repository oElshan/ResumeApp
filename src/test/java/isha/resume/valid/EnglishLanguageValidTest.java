package isha.resume.valid;

import org.junit.*;

import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class EnglishLanguageValidTest {

    private ConstraintValidatorContext mockCVC;
    private StringBuilder testText = new StringBuilder("ABC");

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before EnglishLanguageValidTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After SEnglishLanguageValidTest.class");
    }


    @Before
    public void initialize() {
        mockCVC = mock(ConstraintValidatorContext.class);
    }

    @Test
    public void isValidTestOnlyLetters() {
        EnglishLanguageValid englishLanguageValid = new EnglishLanguageValid();
        assertTrue(englishLanguageValid.isValid(testText.toString(), mockCVC));
    }

    @Test
    public void isValidTestLettersWithNumbers() {
        EnglishLanguageValid englishLanguageValid = new EnglishLanguageValid();
        englishLanguageValid.setWithNumbers(true);
        assertTrue(englishLanguageValid.isValid(testText.append("12").toString(), mockCVC));
    }

    @Test
    public void isValidTestLettersWithNumbersAndSymbols() {
        EnglishLanguageValid englishLanguageValid = new EnglishLanguageValid();
        englishLanguageValid.setWithNumbers(true);
        englishLanguageValid.setWithSymbols(true);
        assertTrue(englishLanguageValid.isValid(testText.append("12").append("/<,%?!").toString(), mockCVC));
    }
}