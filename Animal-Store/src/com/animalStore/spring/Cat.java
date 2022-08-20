package com.animalStore.spring;

import org.springframework.stereotype.Component;

@Component
public class Cat implements animal {

	@Override
	public String getAnimalVoice() {
		
		return "Cat Voice 'Meow'";
	}

	@Override
	public String getAnimalEat() {
		
		return "Cat Eat 'Fish' only";
	}

}
