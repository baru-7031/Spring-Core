package com.practicedemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSuperMarket {
	
	public static void main(String[] args) {
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		superMarket theSuper = context.getBean("superMarketImplement", superMarket.class);
		// call a method on the bean
		theSuper.addValue("oil", 12);
		theSuper.addValue("shampoo", 10);

		theSuper.addValue("soup", 5);

		theSuper.addValue("masala", 50);

		theSuper.printProducts();
		//close the context
		context.close();
	}
}
