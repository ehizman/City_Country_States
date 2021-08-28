package com.ehizman.country_city_states.services;

import java.util.List;

public interface StateService {
    List<String> findStatesInCountryWithThis(Long countryId);
}
