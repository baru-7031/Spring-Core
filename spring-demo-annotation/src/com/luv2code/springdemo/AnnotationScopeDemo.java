package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemo {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// Chack both objects are same or not
		boolean check = (theCoach == alphaCoach);
		
		System.out.println("Both object are same or not : " + check);
		System.out.println("\ntheCoach object address is : " + theCoach);
		System.out.println("\nalphaCoach object address is : " + alphaCoach);
		
		
		// close the context
		context.close();
	}

}
