package com.ehizman.country_city_states.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class States {
    @Id
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Long country_id;
    @NonNull
    private String country_code;
    private String fips_code;
    private String iso2;
    private Float latitude;
    private Float longitude;
    private LocalDateTime created_at;
    @NonNull
    private LocalDateTime updated_at;
    @NonNull
    private Short flag;
//    private String wikiDataId;
}
