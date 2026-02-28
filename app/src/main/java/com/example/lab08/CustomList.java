package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
    // adding a comment for testing
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    // Deletes a City
    public void deleteCity(City city) {
        cities.remove(city);
    }

    // Counts the number of cities
    public int countCities() {
        return cities.size();
    }
}
