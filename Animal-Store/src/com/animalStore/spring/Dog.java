package com.animalStore.spring;

import org.springframework.stereotype.Component;

@Component
public class Dog implements animal {

	@Override
	public String getAnimalVoice() {
		
		return "Dog Voice 'Bark'";
	}

	@Override
	public String getAnimalEat() {
		
		return "Dog Eat 'Veg and Meat'";
	}

}
