package com.ehizman.country_city_states.repository;

import com.ehizman.country_city_states.models.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<States, Long> {
    @Query("select s from States s where s.country_id = ?1")
    List<States> findStatesByCountry_id(Long countryId);
}
