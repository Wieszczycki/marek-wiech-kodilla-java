package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        //Given
        //When
        double result = calculator.add(5, 3);
        //Then
        assertEquals(8, result);
    }

    @Test
    public void testSub() {
        //Given
        //When
        double result = calculator.sub(5, 3);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void testMul() {
        //Given
        //When
        double result = calculator.mul(5, 3);
        //Then
        assertEquals(15, result);
    }

    @Test
    public void testDiv() {
        //Given
        //When
        double result = calculator.div(10, 2);
        //Then
        assertEquals(5, result);
    }

}
