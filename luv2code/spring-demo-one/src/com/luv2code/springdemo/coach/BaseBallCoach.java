/**
 * 
 */
package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortune.FortuneService;

/**
 * @author hdagar3
 *
 */
public class BaseBallCoach implements Coach {

	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	// Define a constructor for injecting the dependency
	public BaseBallCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins for batting practice";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune 
		return fortuneService.getFortune();
	}
	
	

}
