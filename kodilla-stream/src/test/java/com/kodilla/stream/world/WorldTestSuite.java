package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static  org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("37000000"));
        Country germany = new Country(new BigDecimal("88000000"));
        Country france = new Country(new BigDecimal("64000000"));
        Country china = new Country(new BigDecimal("1500000000"));
        Country thailand = new Country(new BigDecimal("90000000"));
        Country malaysia = new Country(new BigDecimal("72000000"));
        Country kenya = new Country(new BigDecimal("30000000"));
        Country morocco = new Country(new BigDecimal("110000000"));

        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        World world = new World();

        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        asia.addCountry(china);
        asia.addCountry(thailand);
        asia.addCountry(malaysia);
        africa.addCountry(kenya);
        africa.addCountry(morocco);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //Then
        BigDecimal expectedQuantity = new BigDecimal("1991000000");
        assertEquals(expectedQuantity, world.getPeopleQuantity());
    }
}
