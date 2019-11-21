package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/* A Simple POJO, which is used for data binding (between view and controller) by Spring MVC 
 * form tags.
 * 
 * We also put the validation on the fields of this POJO class by using "Java's Standard Bean
 * Validation API". One of the implementations of this requirement is "Hibernate Validator" project.
 * We have already included jar files of Hibernate Validator.
 */
public class Customer {
	
	private String firstName;
	
	// If validation fails then this message will be shown in the form.
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	
	/* If validation fails then this message will be shown in the form. Validation will only be
	 * performed if user enters something. In order to make it a mandatory field, add @NotNull
	 * annotation. 
	 * 
	 * From form, free passes field will come as a String only in the controller. But this will
	 * be first trimmed by the StringTrimmerEditor which we registered and then converted into 
	 * the Integer. eg: Integer.parseInt("trimmed string"); */
	@NotNull(message = "is required")
	@Min(value = 0, message = "must be greater than or equal to zero")
	@Max(value = 10, message = "must be less than or equal to 10")
	private Integer freePasses;
	
	/* We can put any type of regex here. So if user is not entering anything then it will not
	 * check the validation but if value is entered then validation will be performed.  */
	@Pattern(regexp = "^[A-Za-z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
