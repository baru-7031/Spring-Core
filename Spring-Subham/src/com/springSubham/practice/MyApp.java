package com.springSubham.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach Cricket = context.getBean("Cricket" , CricketCoach.class);
		
		System.out.println("Cricket Daily Workout : " + Cricket.getDailyWorkout());
		System.out.println("Cricket Fortune : " + Cricket.getFortuneService());
		System.out.println(Cricket.getEmailAdress());
		System.out.println(Cricket.getTeam());

	}

}
