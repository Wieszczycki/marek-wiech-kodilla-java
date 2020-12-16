package com.kodilla.testing.collection;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Collection Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Collection Case: end");
        System.out.println();
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Collection SUITE: begin");
        System.out.println();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Collection SUITE: end");
    }

    @DisplayName("When list is empty then OddNumbersExterminator should work ok")
    @Test
    void testCaseEmptyList() {
        //Given
        ArrayList<Integer> l = new ArrayList<Integer>();
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        String result = test.exterminate(l).toString();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("[]", result);
    }

    @DisplayName("When list has odd and even numbers then OddNumbersExterminator should work ok too")
    @Test
    void testCaseCorrectOddNumbers() {
        //Given
        ArrayList<Integer> l = new ArrayList<Integer>();
        OddNumbersExterminator test = new OddNumbersExterminator();
        l.add(3);
        l.add(2);
        l.add(10);
        l.add(1);
        l.add(8);
        String expectedResult = "[2, 10, 8]";

        //When
        String result = test.exterminate(l).toString();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

}
