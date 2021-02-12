package com.kodilla.good.patterns.flighthunt;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightHunterTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Collection SUITE: begin");
        System.out.println();
    }

    @BeforeEach
    public void before() {
        testCounter++;
        System.out.println("Collection Case: test #" + testCounter);
    }

    @AfterEach
    public void after() {
        System.out.println("Collection Case: end");
        System.out.println();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Collection SUITE: end");
    }

    @Test
    void testAllDepartureAirportConnectionsTrue(){
        //GIVEN
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("WAW", "KRK"));
        expected.add(new Flight("WAW", "WRO"));
        expected.add(new Flight("WAW", "POZ"));
        expected.add(new Flight("WAW", "GDN"));

        //WHEN
        FlightHunter flightHunter = new FlightHunter();
        List<Flight> result = new ArrayList<>();
        result = flightHunter.searchDeparture("WAW");

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testAllDepartureAirportConnectionsFalse(){
        //GIVEN
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("WAW", "KRK"));
        expected.add(new Flight("WAW", "WRO"));
        expected.add(new Flight("WAW", "POZ"));
        expected.add(new Flight("WAW", "GDN"));

        //WHEN
        FlightHunter flightHunter = new FlightHunter();
        List<Flight> result = new ArrayList<>();
        result = flightHunter.searchDeparture("WRO");

        //THEN
        Assertions.assertNotEquals(expected, result);
    }

    @Test
    void testAllArrivalAirportConnectionsTrue(){
        //GIVEN
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("WAW", "WRO"));
        expected.add(new Flight("KRK", "WRO"));
        expected.add(new Flight("GDN", "WRO"));

        //WHEN
        FlightHunter flightHunter = new FlightHunter();
        List<Flight> result = new ArrayList<>();
        result = flightHunter.searchArrival("WRO");

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testAllArrivalAirportConnectionsFalse(){
        //GIVEN
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("WAW", "WRO"));
        expected.add(new Flight("KRK", "WRO"));
        expected.add(new Flight("GDN", "WRO"));

        //WHEN
        FlightHunter flightHunter = new FlightHunter();
        List<Flight> result = new ArrayList<>();
        result = flightHunter.searchDeparture("KRK");

        //THEN
        Assertions.assertNotEquals(expected, result);
    }

    @Test
    void testChangeTrue(){
        //GIVEN
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("WAW", "KRK"));
        expected.add(new Flight("KRK", "WRO"));

        //WHEN
        FlightHunter flightHunter = new FlightHunter();
        List<Flight> result = new ArrayList<>();
        result = flightHunter.searchWithChange("WAW", "KRK", "WRO");

        //THEN
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testChangeFalse(){
        //GIVEN
        List<Flight> expected = new ArrayList<>();
        expected.add(new Flight("WAW", "POZ"));
        expected.add(new Flight("POZ", "WRO"));

        //WHEN
        FlightHunter flightHunter = new FlightHunter();
        List<Flight> result = new ArrayList<>();
        result = flightHunter.searchWithChange("WAW", "POZ", "WRO");

        //THEN
        Assertions.assertNotEquals(expected, result);
    }
}
