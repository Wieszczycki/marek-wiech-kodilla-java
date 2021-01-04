package com.kodilla.exception.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    double x, y;
    String expected, result;
    SecondChallenge secondChallenge;

    @BeforeEach
    void beforeTest() {
        secondChallenge = new SecondChallenge();
    }

    @Test
    void testXabove2_Ycorrect() {
        //Given
        x = 3.0;
        y = 2.0;
        //When, Then
        assertThrows(Exception.class, () -> result = secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testXunder1_Ycorrect() {
        //Given
        x = 0.5;
        y = 2.0;
        //When, Then
        assertThrows(Exception.class, () -> result = secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testXcorrect_Yequals1_5() {
        //Given
        x = 1.5;
        y = 1.5;
        //When, Then
        assertThrows(Exception.class, () -> result = secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void testAllCorrect() {
        //Given
        x = 1.5;
        y = 2.0;
        //When, Then
        assertDoesNotThrow(() -> result = secondChallenge.probablyIWillThrowException(x, y));
    }
}
