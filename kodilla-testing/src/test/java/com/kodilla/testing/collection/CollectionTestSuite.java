package com.kodilla.testing.collection;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    private static int testCounter = 0;

    OddNumbersExterminator test = null;

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Collection Case: test #" + testCounter);

        OddNumbersExterminator test = new OddNumbersExterminator();
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

    @Nested
    @DisplayName("Tests for OddNumbersExterminator")
    class OddNumbersExterminatorTestSuite {

        @DisplayName("Testing empty list")
        @Test
        void testOddNumbersExterminatorEmptyList() {
            //Given
            OddNumbersExterminator test = new OddNumbersExterminator();
            ArrayList<Integer> l = new ArrayList<>();

            //When
            ArrayList<Integer> expected = new ArrayList<>();

            //Then
            Assertions.assertEquals(expected, test.exterminate(l));
        }

        @DisplayName("Testing empty list")
        @Test
        void testOddNumbersExterminatorNormalList() {
            //Given
            ArrayList<Integer> input = new ArrayList<>() {{
                add(3);
                add(2);
                add(10);
                add(1);
                add(8);
            }};
            OddNumbersExterminator test = new OddNumbersExterminator();
            List<Integer> expected = List.of(2, 10, 8);

            //When
            List<Integer> result = test.exterminate(input);

            //Then
            Assertions.assertEquals(expected, result);
        }

    }
}
