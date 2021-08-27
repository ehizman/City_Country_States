package com.ehizman.country_city_states.services;

import com.ehizman.country_city_states.models.Countries;
import com.ehizman.country_city_states.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CountryService {

    List<Countries> getAllCountries();
}
