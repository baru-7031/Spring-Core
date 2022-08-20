package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of String
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	// create a random number generator 
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random String from the array  
		int index = myRandom.nextInt(data.length);	
		
		String res = data[index];
		
		return res;
	}

}
