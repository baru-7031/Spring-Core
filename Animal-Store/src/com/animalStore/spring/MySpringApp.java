package com.animalStore.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Cat theCat = context.getBean("cat" , Cat.class);
		
		// call a method on the bean
		System.out.println(theCat.getAnimalVoice());
		System.out.println(theCat.getAnimalEat());

		// close the context
		context.close();
	}

}
