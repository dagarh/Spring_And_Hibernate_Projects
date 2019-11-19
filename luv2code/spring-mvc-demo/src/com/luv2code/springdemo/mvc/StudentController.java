package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	/* Since this class is annotated with @Controller(child of @Component), it will be picked
	 * up by the Spring IOC container in component scanning and registered as a bean. So, 
	 * construction and management of this bean would be handled by the WebApplicationContext
	 * IOC container. This IOC container is part of DispatcherServlet [DispatcherServlet is 
	 * also called as Front Controller in Spring MVC world]. This IOC container is loading,
	 * {spring-mvc-demo}-servlet.xml file. And we have provided properties file entry inside
	 * {spring-mvc-demo}-servlet.xml file with bean id as "countryOptions".   */
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {	
		// create a new student object
		Student theStudent = new Student();
		
		// add student object to the model.
		theModel.addAttribute("student", theStudent);
		
		// add the country options to the model
		theModel.addAttribute("theCountryOptions", countryOptions);
		
		/* Since we will be using "Spring MVC Form Tags" inside "student-form.jsp". So form will
		 * use Student POJO as a model attribute for filling up the form and at the time of 
		 * submitting the form, automatically setting up the corresponding fields. So, data 
		 * binding becomes easy. */
		
		return "student-form";
	}
	
	/* Spring MVC will automatically bind the student model attribute to this. */
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}
