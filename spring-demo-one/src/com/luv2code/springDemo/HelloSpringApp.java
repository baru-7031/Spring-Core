package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach BaseBall = context.getBean("Baseball", Coach.class);
		
		Coach Track = context.getBean("Track",Coach.class);
		
		Coach Cricket = context.getBean("Cricket" , Coach.class);
		
		//call methods on the bean 
		System.out.println("BaseBall Coach : " + BaseBall.getDailyWorkout());
		System.out.println(BaseBall.getDailyFortune());
		System.out.println();
		System.out.println("Track Coach : " + Track.getDailyWorkout());
		System.out.println(Track.getDailyFortune());
		System.out.println();
		System.out.println("Cricket Coach : " + Cricket.getDailyWorkout());
		System.out.println(Cricket.getDailyFortune());
//		System.out.println(Cricket.);
		
		//close the context
		context.close();
	}

}
