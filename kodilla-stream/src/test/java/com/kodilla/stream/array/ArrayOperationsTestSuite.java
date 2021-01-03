package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] table = new int[20];
        for (int i = 0; i < 20; i++) {
            table[i] = (i + 1) * 2;
        }

        //When
        double average = ArrayOperations.getAverage(table);

        //Then
        assertEquals(21.0, average);
    }
}
