package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/* Once controller level mapping is added in the URL then for all the future requests, that 
 * mapping will be there. If you want to make URL right from root directory of web app then
 * make use of "pageContext.request.contextPath".  */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// need a controller method to read form data and add data to the model
	// These arguments would be sent by the FrontController automatically.
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model) {

		/* @RequestParam("studentName") will read the HTTP request param i.e "studentName" 
		 * automatically and bind it to the "theName". Spring is doing below thing for us behind
		 * the scenes:
		 * 	// read the request parameter from the HTML form
			String theName = request.getParameter("studentName"); */
		
		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Hey My Friend from v3! " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
