package com.rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rental.entity.Property;
import com.rental.service.RentalService;

@RestController
@RequestMapping
public class RentalController {
	@Autowired
	private RentalService rentalService;

	@GetMapping("/properties")
	public List<Property> getProperties() {
		return rentalService.getProperties();
	}
}
