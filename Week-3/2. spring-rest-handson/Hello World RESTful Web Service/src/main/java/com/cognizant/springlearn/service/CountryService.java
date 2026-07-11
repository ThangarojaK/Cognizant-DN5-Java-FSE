package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;
import com.cognizant.springlearn.util.CountryUtil;

@Service
public class CountryService {

    public List<Country> getAllCountries() {
        return CountryUtil.getCountries();
    }

    public Country getCountry(String code) {

        return CountryUtil.getCountries()
                .stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(CountryNotFoundException::new);

    }

}
