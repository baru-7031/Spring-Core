package com.springSubham.practice;

public class CricketCoach implements Coach {
	
	private Coach coach;
	private String team;
	private String emailAdress;
	
	//non-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach class Object Created :-) ");
	}
	
//	public CricketCoach(String team, String emailAdress, Coach coach) {
//		this.team = team;
//		this.emailAdress = emailAdress;
//		this.coach = coach;
//	}

	// set up coach
	public void setCoach(Coach coach) {
		System.out.println("Coach value init \n");
		this.coach = coach;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Team Value init \n");
		this.team = team;
	}


	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("Email Address value init \n");
		this.emailAdress = emailAdress;
	}


	@Override
	public String getDailyWorkout() {
		
		return coach.getDailyWorkout() + " and 2hours batting";
	}

	@Override
	public String getFortuneService() {
		
		return coach.getFortuneService() + " and drive chicken soup";
	}

}
