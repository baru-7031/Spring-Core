package com.luv2code.springDemo;

public class BaseballCoach implements Coach{
	
	//Define a private field for the dependency 
	private FortuneService fortuneservice;
	
	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneservice = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 Minutes in batting practice";
	}

	@Override
	public String getDailyFortune() {

		//use my Fortune to get a fortune
		return fortuneservice.getFortune();
	}
}
