package com.mypets;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AnimalImplement implements Animal {

	@Autowired
	@Qualifier("getPetDetailsSubham")
	private PetDetailsInterface details;
	
	/*
	 * @PostConstruct public void Start() {
	 * System.out.println(">> Subham Pet Deatils  : \n"); }
	 */
	
	@Override
	public void getPetDeatils() {
		System.out.println("\n-------Your Pet Details-------\n");
		System.out.println("Pet name : " + details.getName());
		System.out.println("Pet Color : " + details.getColor());
		System.out.println("Pet Type : " + details.getPetType());
		System.out.println("Pet Whcih bried : " + details.getType());
		System.out.println("Pet Ownner name : " + details.getCaretaker());
		System.out.println("Pet Date of Birth : " + details.getDOB());
		System.out.println("Pet Eat Foods are : " + details.getFood());
		
	}

	@Override
	public String ownner() {
		
		return details.getCaretaker();
	}
}
