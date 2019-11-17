package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

// A Simple POJO 
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	// Will be selected from drop-down menu by user
	private String country;

	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		/* populate country options: used ISO country code. We could have populated it from 
		 * database or web-service or file-system easily. */
		
		countryOptions = new LinkedHashMap<>();		
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
