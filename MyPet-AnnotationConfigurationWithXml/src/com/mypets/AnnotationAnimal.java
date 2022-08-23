package com.mypets;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read Spring configuration file 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get subham implement bean
		Animal theSubham = context.getBean("animalImplement", Animal.class);
		
		// get sathi implement bean
		Animal thSathi = context.getBean("animalImplementSathi", Animal.class);
		
		// get Pet Ownner name 
		String name1 = theSubham.ownner();
		String name2 = thSathi.ownner();
		
		// Scanner class for input
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> Welcome to Spring-Core project This project use Annotation Bean with Console-base Project\n");
		
		// Input Your choice
		System.out.println("We have 2 Ownner Details");
		System.out.println("1. " + name1);
		System.out.println("2. " + name2);
		System.out.print("Which pet details you want to see ENTER Ownner first Nmae : ");
		String collected = sc.next().toLowerCase();
		
		if(collected.equals("subham")) {
			theSubham.getPetDeatils();			
		}
		else if(collected.equals("sathi")) {
			thSathi.getPetDeatils();
		}
		else {
			System.out.println("SORRY Wrong Input");
		}

		System.out.println("\n>> Thank You for Using Spring-Core Console-base Projects");
		
	}

}
