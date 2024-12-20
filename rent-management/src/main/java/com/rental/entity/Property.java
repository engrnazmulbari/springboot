package com.rental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Property {
	@Id
	@GeneratedValue
	private Integer propertyId;
	private String street;
	private String city;
	private String state;
	private String zip;
	
//	public Property() {
//		super();
//	}
	
	public Property(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
//
//	public Integer getPropertyId() {
//		return propertyId;
//	}
//
//	public void setPropertyId(Integer propertyId) {
//		this.propertyId = propertyId;
//	}
//
//	public String getStreet() {
//		return street;
//	}
//
//	public void setStreet(String street) {
//		this.street = street;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getZip() {
//		return zip;
//	}
//
//	public void setZip(String zip) {
//		this.zip = zip;
//	}
//	
	
	
}
