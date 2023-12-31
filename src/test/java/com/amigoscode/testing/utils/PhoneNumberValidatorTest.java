package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setUp(){
        underTest = new PhoneNumberValidator();
    }


    @ParameterizedTest
    @CsvSource({
            "+447000000099, true",
            "+447000099000099, false",
            "447000000099, false"
    })
     //We pass the actual input or expected value
    /*We can see that the first value respect the requirements so it must return true,
    * the second and third one does not so they must return false*/
    void ItShouldValidatePhoneNumber(String phoneNumber, Boolean expected){
        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isEqualTo(expected);
    }

   /* @Test
    @DisplayName("Should fail when length is bigger than 13")
    void ItShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThan13(){
        // Given
        String phoneNumber = "+44700000009999";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isFalse();
    }

    @Test
    @DisplayName("Should fail when does not start with +")
    void ItShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign(){
        // Given
        String phoneNumber = "44700000009999";

        // When
        boolean isValid = underTest.test(phoneNumber);

        // Then
        assertThat(isValid).isFalse();
    }*/
}
