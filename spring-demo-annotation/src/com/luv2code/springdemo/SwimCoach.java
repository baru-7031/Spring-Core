package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	
	@Value("${subham.email}")
	private String email;
	
	@Value("${subham.team}")
	private String team;
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		System.out.println("Email id : " + email);
		System.out.println("Team name : " + team);
		
		return "1 hour Swimming in pool";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
