package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

// A Simple POJO, which will hold data.
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	// Will be selected from drop-down menu by user
	private String country;

	// LinkedHashMap will preserve the order of insertion.
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		
		/* populate countryOptions: used ISO country code. We could have populated it from 
		 * "database" or "web-service" or "file-system" easily. */
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");
		/* Mapping from key/code to value/label. label is what user will see in the form.  
		 * code is what will be passed in the country field. */
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

	/* When the "student-form" is loaded, this getter method would be called to generate 
	 * drop-down list. */
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
}
