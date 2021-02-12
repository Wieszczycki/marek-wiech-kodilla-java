package com.kodilla.good.patterns.flighthunt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class FlightHunter {
    private final FlightsDatabase flightsDatabase = new FlightsDatabase();

    public List searchDeparture(String departureAirport) {
        return flightsDatabase.getConnections().stream()
                .filter(airport -> airport.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List searchArrival(String arrivalAirport) {
        return flightsDatabase.getConnections().stream()
                .filter(airport -> airport.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List searchWithChange(String departureAirport, String changeAirport, String arrivalAirport) {
        List departureChange = flightsDatabase.getConnections().stream()
                .filter((airport -> airport.getDepartureAirport().equals(departureAirport)))
                .filter((airport -> airport.getArrivalAirport().equals(changeAirport)))
                .collect(Collectors.toList());
        List changeArrival = flightsDatabase.getConnections().stream()
                .filter(airport -> airport.getDepartureAirport().equals(changeAirport))
                .filter(airport -> airport.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        List change = new ArrayList<>(departureChange);
        change.addAll(changeArrival);
        System.out.println(change);
        return change;
    }
}
