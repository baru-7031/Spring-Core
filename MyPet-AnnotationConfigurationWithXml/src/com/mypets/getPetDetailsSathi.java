package com.mypets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class getPetDetailsSathi implements PetDetailsInterface {

	
	@Value("${sathi.caretaker}")
	private String careTaker;
	
	@Value("${sathi.name}")
	private String name;
	
	@Value("${sathi.color}")
	private String color;
	
	@Value("${sathi.petType}")
	private String petType;
	
	@Value("${sathi.type}")
	private String type;
	
	@Value("${sathi.food}")
	private String food;
	
	@Value("${sathi.DOB}")
	private String DOB;
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return petType;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String getDOB() {
		// TODO Auto-generated method stub
		return DOB;
	}

	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return food;
	}

	@Override
	public String getCaretaker() {
		// TODO Auto-generated method stub
		return careTaker;
	}

}
