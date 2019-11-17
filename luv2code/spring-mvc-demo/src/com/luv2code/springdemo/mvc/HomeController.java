package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* @Controller inherits from @Component. So, it is specialized type of @Component. 
 * This will be picked up by the Spring IOC container in component scanning.  */
@Controller
public class HomeController {

	// This will handle all the types of HTTP requests.
	@RequestMapping("/")
	public String showPage() {
		/* This is not a complete name of the page. DispatcherServlet, in Spring, will 
		 * make use of the ViewResolver for finding the exact path. */
		return "main-menu";
	}
}
