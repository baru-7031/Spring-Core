package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		// check if they are the same
		if(theCoach.equals(alphaCoach))
			System.out.println("\nPointing to the same object" + true);
		else
			System.out.println("\nPointing to the same object " + false);
		
		System.out.println("\nMemory location for theCoach : " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach " + alphaCoach);
		
		// close the context
		context.close();

	}

}
