package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") 		   declear	With Bean ID
@Component		// Default Bean ID
//@Scope("prototype")
public class TennisCoach implements Coach {

	// field injection (java technology name is 'Reflection')
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	// define a default Constructor 
	public TennisCoach() {System.out.println(">>> TennisCoach : inside default Constructor\n");}
	
	
	
	
	
	// define my initialization method
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach : inside of doMyCleanupStuff()");
	}
	
	
	
	
	
	
	
	// define a setter method
	/*
	@Autowired
	public void doCrazyStuff(FortuneService fortuneService) {
		System.out.println("\nTenisCoach : inside setFortuneService() method \n");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/	

	@Override
	public String getDailyWorkout() {
		return "Practice Your backhand Volley";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}
	
	

}
