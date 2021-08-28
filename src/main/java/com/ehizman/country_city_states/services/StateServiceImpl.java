package com.ehizman.country_city_states.services;

import com.ehizman.country_city_states.models.States;
import com.ehizman.country_city_states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StateServiceImpl implements StateService{
    StateRepository stateRepository;

    @Autowired
    public StateServiceImpl(StateRepository stateRepository){
        this.stateRepository = stateRepository;
    }

    @Override
    public List<String> findStatesInCountryWithThis(Long countryId) {
        List<States> states = stateRepository.findStatesByCountry_id(countryId);
        List<String> listOfStateNames = new ArrayList<>();
        states.forEach(state -> listOfStateNames.add(state.getName()));
        return listOfStateNames;
    }
}
