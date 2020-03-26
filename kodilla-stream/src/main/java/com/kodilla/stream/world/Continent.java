package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
        private final String continentName;
        private List<Country> countries = new ArrayList<>();

        public Continent(final String continentName, List<Country> countries) {
            this.continentName = continentName;
            this.countries = countries;
        }
        public String getContinentName()
        {
            return continentName;
        }
        //public void addCountry(Country country) {
        //    countries.add(country);
        //}

        public List<Country> getCountries() {

            return countries;
        }



}
