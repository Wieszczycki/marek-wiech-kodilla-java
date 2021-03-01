package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void extendLogFile() {
        logger = Logger.INSTANCE;
        logger.log("Rewelacyjny przykład logowania niczego.");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("Rewelacyjny przykład logowania niczego.", result);
    }
}
