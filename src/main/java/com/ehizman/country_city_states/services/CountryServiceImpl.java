package com.ehizman.country_city_states.services;

import com.ehizman.country_city_states.models.Countries;
import com.ehizman.country_city_states.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Countries> getAllCountries() {
        return countryRepository.findAll();
    }
}
