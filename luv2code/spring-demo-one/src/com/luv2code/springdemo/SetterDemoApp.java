package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.coach.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Try with resources, in this case you don't need to close context explicitly. It is AutoClosable
		// load the spring configuration file
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			// retrieve bean from spring container
			CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
			
			// call methods on the bean
			System.out.println(theCoach.getDailyWorkout());
			
			System.out.println(theCoach.getDailyFortune());
			
			// call our new methods to get the literal values
			System.out.println(theCoach.getEmailAddress());
			System.out.println(theCoach.getTeam());
			
		}
			
	}

}
