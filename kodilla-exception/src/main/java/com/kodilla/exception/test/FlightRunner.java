package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {

        FlightLogic flightLogic = new FlightLogic();

        Flight flight1 = new Flight("WAW", "GDN");
        Flight flight2 = new Flight("WRO", "UPS");
        Flight flight3 = new Flight("UUK", "HIK");
        Flight flight4 = new Flight("GDN", "ERR");

        System.out.println("Test 1: WAW-GDN");
        try {
            flightLogic.FindFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Co najmniej jedno z lotnisk nie istnieje.");
        }
        System.out.println();

        System.out.println("Test 2: WRO-UPS");
        try {
            flightLogic.FindFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("Co najmniej jedno z lotnisk nie istnieje.");
        }
        System.out.println();

        System.out.println("Test 3: UUK-HIK");
        try {
            flightLogic.FindFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("Co najmniej jedno z lotnisk nie istnieje.");
        }
        System.out.println();

        System.out.println("Test 4: GDN-ERR");
        try {
            flightLogic.FindFlight(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println("Co najmniej jedno z lotnisk nie istnieje.");
        }
        System.out.println();
    }
}
