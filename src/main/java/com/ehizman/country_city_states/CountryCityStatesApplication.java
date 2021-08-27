package com.ehizman.country_city_states;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.ehizman.country_city_states.repository")
@EntityScan("com.ehizman.country_city_states.models")
@SpringBootApplication

public class CountryCityStatesApplication {

    public static void main(String[] args) {

        SpringApplication.run(CountryCityStatesApplication.class, args);
        System.out.println("Server started");
    }

}
