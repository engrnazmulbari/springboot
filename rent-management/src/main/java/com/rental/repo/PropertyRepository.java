package com.rental.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rental.entity.Property;

public interface PropertyRepository extends JpaRepository<Property,Integer>{

}
