package com.luv2code.springDemo;

public class MyApp {

	public static void main(String[] args) {

		// Creating BaseballCoach Object 
		Coach theCoach = new CricketCoach();
		
		// Use the Object
		System.out.println(theCoach.getDailyWorkout());
	}

}
