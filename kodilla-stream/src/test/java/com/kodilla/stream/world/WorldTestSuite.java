package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity () {
        //Given
        List<Country> countries = new ArrayList<>();
        List<Continent> continents = new ArrayList<>();

        countries.add(new Country("Poland", new BigDecimal("38400000")));

        continents.add(new Continent("Europe", "Poland", new BigDecimal("38400000")));
        //When
        BigDecimal totalQuantity = BigDecimal.ZERO;
        for (Country country : countries){
            totalQuantity = totalQuantity.add(country.getPeopleQuantity());
        }
        //Then
        BigDecimal expectedQuantity = new BigDecimal("");
        Assert.assertEquals(expectedQuantity, totalQuantity);
    }
}
