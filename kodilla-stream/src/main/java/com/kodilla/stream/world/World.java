package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    private final List<Continent> world = new ArrayList<>();

    public List<Continent> getWorld() {
        return world;
    }

    public boolean addContinent(Continent continent) {
        return world.add(continent);
    }

    public boolean removeContinent(Continent continent) {
        return world.remove(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, peopleQuantity) -> sum.add(peopleQuantity));
    }
}
