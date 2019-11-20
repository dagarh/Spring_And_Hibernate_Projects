package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

/* A Simple POJO, which is used for data binding (between view and controller) by Spring MVC 
 * form tags. 
 * 
 * We can also put the validation on the fields of this POJO class by using "Java's Standard Bean
 * Validation API". One of the implementations of this requirement is "Hibernate-Validator" project.
 */
public class Student {
	
	private String firstName;
	
	private String lastName;
	
	// Will be selected from drop-down menu by user
	private String country;

	/* Since we are populating this from properties file now. So entry has been put inside
	 * student controller bean class, so that we can make use of annotation to inject values 
	 * from properties file. 
	// LinkedHashMap will preserve the order of insertion.
	private LinkedHashMap<String, String> countryOptions; */
	
	private String favoriteLanguage;
	
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String[] operatingSystems;
	
	public Student() {
		
		/* populate countryOptions: used ISO country code. We could have populated it from 
		 * "database" or "web-service" or "file-system" easily. */
		
		/*
		 *  All of these below values now will come from properties file. countryOptions field has 
		 *  been moved to StudentController bean class.
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America"); */
		/* Mapping from key/code to value/label. label is what user will see in the form.  
		 * code is what will be passed in the country field. */
		
		/* We could have populated these values from properties file, by moving this field also to
		 * the StudentController bean class.
		 * "Key" will be passed to favoriteLanguage but "Value" will be shown in the form. */
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");
		
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
	 * drop-down list.
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	} */
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
