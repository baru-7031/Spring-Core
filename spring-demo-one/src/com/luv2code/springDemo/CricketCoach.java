package com.luv2code.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneservice;
	
	//Private values EmaillAdress and Team
	private String EmailAdress;
	
	private String Team;
	
	//Create a non-arg Constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor");
	}
	
//	public CricketCoach(FortuneService fortuneservice) {
//		this.fortuneservice = fortuneservice;
//	}

	public String getEmailAdress() {
		return EmailAdress;
	}


	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method - setEmailAdress");
		EmailAdress = emailAdress;
	}


	public String getTeam() {
		return Team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		Team = team;
	}


	//Our Setter method
	public void setFortuneService(FortuneService fortuneservice) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneservice = fortuneservice;
	}



	@Override
	public String getDailyWorkout() {
		
		return "3hour bating pratice";
	}

	@Override
	public String getDailyFortune() {
		
		return "Cricket Fortune : " + this.fortuneservice.getFortune();
	}

}