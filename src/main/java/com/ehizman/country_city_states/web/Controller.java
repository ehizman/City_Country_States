package com.ehizman.country_city_states.web;

import com.ehizman.country_city_states.models.Countries;
import com.ehizman.country_city_states.services.CountryService;
import com.ehizman.country_city_states.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final CountryService countryService;
    private final StateService stateService;

    @Autowired
    public Controller(CountryService countryService, StateService stateService){

        this.countryService = countryService;
        this.stateService = stateService;
    }

    @GetMapping("api/countries")
    public List<String> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("api/getAllStatesIn/{countryName}")
    public List<String> getAllStatesIn(@PathVariable("countryName") String countryName){
        Long countryId = countryService.getCountryId(countryName);
        return stateService.findStatesInCountryWithThis(countryId);
    }
}
