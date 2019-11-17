package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortune.FortuneService;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	// no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = theFortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	// setter for emailAddress
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
	// setter for team
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowling very hard";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
