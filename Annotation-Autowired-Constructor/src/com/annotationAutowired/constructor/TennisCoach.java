package com.annotationAutowired.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneservice;

	@Autowired
	public TennisCoach(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Your Left Hand smash short 1hour";
	}

	@Override
	public String getFortuneService() {
		
		return fortuneservice.getFortune();
	}

}
