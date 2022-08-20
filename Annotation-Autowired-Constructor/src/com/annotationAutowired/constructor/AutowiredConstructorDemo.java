package com.annotationAutowired.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredConstructorDemo {

	public static void main(String[] args) {
		
		// read Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach" , Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortuneService());
		
		// close the context
		context.close();
	}

}
