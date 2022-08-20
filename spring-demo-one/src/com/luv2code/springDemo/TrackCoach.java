package com.luv2code.springDemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it men : " + fortuneservice.getFortune();
	}
	
	
	// add an init method (custom Hook)
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartupStuff()");
	}
	
	// add an destroy method (custom hook)
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach : inside method doMyCleanupStuffYoYo()");
	}

}






