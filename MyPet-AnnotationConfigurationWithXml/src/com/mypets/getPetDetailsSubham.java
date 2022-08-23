package com.mypets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class getPetDetailsSubham implements PetDetailsInterface {
	
	// Value Annotations to map with petDetails.properties file

	@Value("${subham.caretaker}")
	private String careTaker;
	
	@Value("${subham.name}")
	private String name;
	
	@Value("${subham.color}")
	private String color;
	
	@Value("${subham.petType}")
	private String petType;
	
	@Value("${subham.type}")
	private String type;
	
	@Value("${subham.food}")
	private String food;
	
	@Value("${subham.DOB}")
	private String DOB;
	
	
	// Fix: field values get methods
	
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
