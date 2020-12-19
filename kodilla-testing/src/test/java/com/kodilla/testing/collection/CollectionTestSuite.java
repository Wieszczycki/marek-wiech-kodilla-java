package com.kodilla.testing.collection;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    private static int testCounter = 0;

    ShapeCollector shapeCollector = null;

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Collection Case: test #" + testCounter);

        shapeCollector = new ShapeCollector();
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
    @DisplayName("Tests for shapeCollector")
    class TestShapeCollector {

        @DisplayName("Adding figure should result in 1 figure inside Array")
        @Test
        void testAddFigure() {
            //Given
            //ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Circle c = new Circle("Circle1",10.0);
            shapeCollector.addFigure(c);
            Shape expected = c;

            //Then
            Assertions.assertEquals(expected, shapeCollector.getFigure(0));
        }

        @DisplayName("Removing figure should result in 0 figures inside Array")
        @Test
        void testRemoveFigure() {
            //Given
            //ShapeCollector shapeCollector = new ShapeCollector();
            boolean result;

            //When
            Triangle t = new Triangle("Triangle1",20.0);
            shapeCollector.addFigure(t);
            result = shapeCollector.removeFigure(t);
            int expected = 0;

            //Then
            Assertions.assertEquals(expected, shapeCollector.getFiguresQuantity());
        }

        @DisplayName("Removing non-existing figure should result in false result")
        @Test
        void testRemoveNonexistingFigure() {
            //Given
            //ShapeCollector shapeCollector = new ShapeCollector();
            boolean result;

            //When
            Triangle t = new Triangle("Triangle1",20.0);
            shapeCollector.addFigure(t);
            Square s = new Square("Square1", 30.0);
            result = shapeCollector.removeFigure(s);
            boolean expected = false;

            //Then
            Assertions.assertEquals(expected, result);
        }


        @DisplayName("Getting figure n should result in correct figure in response")
        @Test
        void testGetFigure() {
            //Given
            //ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Circle c = new Circle("Circle1",10.0);
            shapeCollector.addFigure(c);
            Triangle t = new Triangle("Triangle1",20.0);
            shapeCollector.addFigure(t);
            Square s = new Square("Square1", 30.0);
            shapeCollector.addFigure(s);
            Shape expected = t;
            Shape result = shapeCollector.getFigure(1);

            //Then
            Assertions.assertEquals(expected, result);
        }

        @DisplayName("Should display all figures names in 1 String")
        @Test
        void testShowFigures() {
            //Given
            //ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Circle c = new Circle("Circle1",10.0);
            shapeCollector.addFigure(c);
            Triangle t = new Triangle("Triangle1",20.0);
            shapeCollector.addFigure(t);
            Square s = new Square("Square1", 30.0);
            shapeCollector.addFigure(s);
            String expected = "Circle1, Triangle1, Square1";

            String result = shapeCollector.ShowFigures();

            //Then
            Assertions.assertEquals(expected, result);
        }
    }
}
