package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
//		Coach theCoach = context.getBean("thatSillyCoach" , Coach.class);     				With Bean ID
		Coach theCoach = context.getBean("tennisCoach" , Coach.class); // Default Bean ID (Class name but first letter is small)
		
		Coach Swim = context.getBean("swimCoach", Coach.class);
		
		Properties prop = context.getBean("needProperties", Properties.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getFortuneService());
		
		System.out.println(">> Properties Interface to class Email: " + prop.getEmail());
		
		System.out.println(">> Properties Interface to class Team: " + prop.getTeam());
		
		
		System.out.println(Swim.getDailyWorkout());
		
//		System.out.println(Swim.getEmail());
		//close the context
		context.close();
	}

}
