package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
    private final List<Continent> continents;

    public World(final List<Continent> continents) {
        this.continents = continents;
    }
    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continents -> continents.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
