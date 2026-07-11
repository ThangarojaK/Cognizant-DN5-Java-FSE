package com.cognizant.springlearn.util;

import java.util.Arrays;
import java.util.List;

import com.cognizant.springlearn.model.Country;

public class CountryUtil {

    public static List<Country> getCountries() {

        return Arrays.asList(
                new Country("IN","India"),
                new Country("US","United States"),
                new Country("JP","Japan"),
                new Country("DE","Germany")
        );

    }

}
