package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {

    public void FindFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> routes = new HashMap<>();
        boolean airport1exists = false;
        boolean airport2exists = false;

        routes.put("WAW", true);
        routes.put("KRK", true);
        routes.put("GDN", true);
        routes.put("KTW", true);
        routes.put("WRO", true);
        routes.put("WMI", true);
        routes.put("POZ", true);
        routes.put("RZE", true);
        routes.put("SZZ", true);
        routes.put("LUZ", true);
        routes.put("BZG", true);
        routes.put("LCJ", true);
        routes.put("SZY", false);
        routes.put("IEG", false);
        routes.put("RDO", false);

        for (Map.Entry<String, Boolean> entry : routes.entrySet()) {
            if (entry.getKey().equals(flight.getDepartureAirport())) {
                System.out.println(entry);
                if (entry.getValue().equals(true)) {
                    airport1exists = true;
                }
            }
        }
        if (!airport1exists) throw new RouteNotFoundException("UWAGA: Lotnisko " + flight.getDepartureAirport() + " nie istnieje!");

        for (Map.Entry<String,Boolean> entry : routes.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                System.out.println(entry);
                if (entry.getValue().equals(true)) {
                    airport2exists = true;
                }
            }
        }
        if (!airport2exists) throw new RouteNotFoundException("UWAGA: Lotnisko " + flight.getArrivalAirport() + " nie istnieje!");

    }
}
