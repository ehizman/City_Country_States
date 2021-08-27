package com.ehizman.country_city_states.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Countries {
    @Id
    private Long id;
    @NonNull
    private String name;
    private String numeric_code;
    private String iso2;
    private String phonecode;
    private String capital;
    private String currency;
    private String currency_symbol;
    private String tld;
    @Column(name = "native")
    private String _native;
    private String region;
    private String subregion;
    private String timezones;
    private String translations;
    private Float latitude;
    private Float longitude;
    private String emoji;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private Short flag;
//    @Column(name = "wikiDataId")
//    private String wikiDataId;
}
