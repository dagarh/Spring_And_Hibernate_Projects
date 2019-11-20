package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	/* @InitBinder annotation works as a pre-processor. It will pre-process each web request which
	 * is coming to our controller. (It is resolving the issue for our validation). */
	/* We will use it to trim whitespace from input fields or Strings i.e to remove leading and
	 * trailing white space. If String only has white spaces ... trim it to null.
	 * 
	 * This method will be called for each and every web request which is coming to this controller. */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		/* removes whitespace - leading and trailing. It is defined in Spring API. true means 
		 * trim to null if it's all whitespace. */ 
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		/* Register StringTrimmerEditor as a custom editor to dataBinder. "String.class" means 
		 * pre-process every String form data. */
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer, 
			BindingResult theBindingResult) {
		
		/* When performing Spring MVC validation, the location of the BindingResult parameter is very 
		 * important. In the method signature, the BindingResult parameter must appear immediately 
		 * after the model attribute. 
		 * 
		 * If you place it in any other location, Spring MVC validation will not work as desired. 
		 * In fact, your validation rules will be ignored 
		 * 
		 * The Errors or BindingResult parameters have to follow the model object, that is being 
		 * bound, immediately ...*/
		
		/* @Valid annotation tells spring to do the actual validation on the customer model attribute
		 * , based on the annotation which we have applied to the fields of a customer POJO class.
		 * 
		 * And after validation, spring will store results of validation in BindingResult object. */
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
		
	}
	
	
}
