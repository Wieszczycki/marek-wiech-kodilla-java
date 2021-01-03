package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> listOfCountries = new ArrayList<>();

    public Continent() {
    }

    public List<Country> getCountries() {
        return listOfCountries;
    }

    public boolean addCountry(Country country) {
        return listOfCountries.add(country);
    }

    public boolean removeCountry(Country country) {
        return listOfCountries.remove(country);
    }
}
