package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(final String message) {
        System.out.println(message);
    }

}
