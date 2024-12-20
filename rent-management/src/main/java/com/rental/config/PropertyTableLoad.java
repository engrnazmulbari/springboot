package com.rental.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.rental.entity.Property;
import com.rental.repo.PropertyRepository;

@Configuration
public class PropertyTableLoad {
	
	@Bean
	CommandLineRunner initPropertyTable(PropertyRepository propertyRipository) {
		return args -> {
            System.out.println("Preloading " + propertyRipository.save(new Property("1234 Abc Street", "Johnson","TX", "89345")));
            System.out.println("Preloading " + propertyRipository.save(new Property("7654 Davis Rd", "Alono", "AZ","43526")));
        };
	}
}
