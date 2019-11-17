package com.luv2code.springdemo;

import com.luv2code.springdemo.coach.BaseBallCoach;
import com.luv2code.springdemo.coach.Coach;
import com.luv2code.springdemo.fortune.FortuneService;
import com.luv2code.springdemo.fortune.HappyFortuneService;

public class MyApp {
	
	public static void main(String[] args) {
		
		// Fortune Service
		FortuneService theFortuneService = new HappyFortuneService();
		
		// Create object
		Coach theCoach = new BaseBallCoach(theFortuneService);
		
		// Call functionality
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
