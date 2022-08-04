package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterDemo {

	public static void main(String[] args) {
		
		//Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		CricketCoach theCoach = context.getBean("Cricket" , CricketCoach.class);
		
		//call methods on the bean 
		System.out.println();
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//inject literal values
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		
		//close the context
		context.close();
	}

}
