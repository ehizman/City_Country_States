package com.ehizman.country_city_states.services;

import com.ehizman.country_city_states.models.Countries;
import com.ehizman.country_city_states.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Override
    public List<String> getAllCountries() {
        List<Countries> listOfCountries = countryRepository.findAll();
        List<String> namesOfCountries = new ArrayList<>();
        listOfCountries.forEach(countries -> namesOfCountries.add(countries.getName()));
        return namesOfCountries;
    }

    @Override
    public Long getCountryId(String countryName) {
        Countries country = countryRepository.findCountriesByName(countryName);
        return country.getId();
    }
}
