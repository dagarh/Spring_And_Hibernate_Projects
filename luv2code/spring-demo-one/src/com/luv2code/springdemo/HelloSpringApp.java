package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.CricketCoach;

// Driver class for stand-alone application.
public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring (bean) configuration file / loading the spring IOC container
		/* ApplicationContext instantiates beans at the time of server startup while reading through the 
		 * configuration file, if bean's scope is singleton. If you want lazy loading of singleton beans then either 
		 * use BeanFactory instead of ApplicationContext or add [lazy-init = "true"] property in a singleton bean. 
		 * In these 2 cases, it will instantiate bean at the time of user request.
		 * So there is no option of pre-loading of a bean in case of BeanFactory. So ApplicationContext is super
		 * set of BeanFactory. */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring IOC container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());

		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
