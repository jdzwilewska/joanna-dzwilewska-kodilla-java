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
        List<Country> europe = new ArrayList<>();
        europe.add(new Country("Poland", new BigDecimal("30000000")));
        europe.add(new Country("Germany", new BigDecimal("120000000")));
        europe.add(new Country("Sweden", new BigDecimal("115600000")));
        europe.add(new Country("Greece", new BigDecimal("112450346")));

        List<Country> asia = new ArrayList<>();
        asia.add(new Country("Russia", new BigDecimal("456784340")));
        asia.add(new Country("Turkey", new BigDecimal("98342789")));
        asia.add(new Country("China", new BigDecimal("12000000000")));
        asia.add(new Country("India", new BigDecimal("11500000000")));

        List<Country> northAmerica = new ArrayList<>();
        northAmerica.add(new Country("Canada", new BigDecimal("600673200")));
        northAmerica.add(new Country("United States", new BigDecimal("897678564")));
        northAmerica.add(new Country("Mexico", new BigDecimal("275450231")));

        //When
        Continent europeCont = new Continent("Europe", europe);
        Continent asiaCont = new Continent("Asia", asia);
        Continent northAmericaCont = new Continent("North America", northAmerica);
        World world = new World();
        world.addContinent(europeCont);
        world.addContinent(asiaCont);
        world.addContinent(northAmericaCont);

        BigDecimal realSum = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("20000000000");
        Assert.assertEquals(expectedQuantityPeople, realSum);
    }
}
