package com.rental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rental.entity.Property;
import com.rental.repo.PropertyRepository;

@Service
public class RentalService {
	@Autowired
	private PropertyRepository propertyRepository;
	
	public List<Property> getProperties(){
		return propertyRepository.findAll();
	}
	
	
}
