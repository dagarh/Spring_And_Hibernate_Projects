/**
 * 
 */
package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortune.FortuneService;

/**
 * @author hdagar3
 *
 */
public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	{
		System.out.println("TrackCoach: inside instance block");
	}
	
	// define a constructor for injecting the dependency
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("Inside Track Coach Constructor!!!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard for 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	/* add an init method. It's access modifier could be anything. You can take any return type which you want
	 * but void is most commonly used because you would not be able to capture returned value :P. It should be
	 * a no-arg method. */ 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	/* add a destroy method. It's access modifier could be anything. You can take any return type which you want
	 * but void is most commonly used because you would not be able to capture returned value :P. It should be
	 * a no-arg method. 
	 * 
	 * Spring IOC container does not manage complete life cycle of beans whose scope is prototype. So you will not 
	 * get callback in this, if bean's scope is prototype. So in case of prototype beans, you have to free up the
	 * resources explicitly in any other method and then calling it explicitly. */
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("TrackCoach: inside finalize method!!!");
	}
}
