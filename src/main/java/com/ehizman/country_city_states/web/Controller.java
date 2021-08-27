package com.ehizman.country_city_states.web;

import com.ehizman.country_city_states.models.Countries;
import com.ehizman.country_city_states.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final CountryService countryService;

    @Autowired
    public Controller(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping("api/countries")
    public List<Countries> getAllCountries(){
        return countryService.getAllCountries();
    }
}
