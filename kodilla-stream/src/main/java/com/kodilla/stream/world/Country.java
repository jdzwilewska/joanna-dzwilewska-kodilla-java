package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleStorage{

    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("326625791563399");
        return peopleQuantity;
    }
}
