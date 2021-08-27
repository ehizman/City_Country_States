package com.ehizman.country_city_states.repository;

import com.ehizman.country_city_states.models.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Countries, Long> {

}
