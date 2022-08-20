package com.animalStore.spring;

import org.springframework.stereotype.Component;

@Component
public class Lion implements animal {

	@Override
	public String getAnimalVoice() {
		
		return "Lion voice 'Roar'";
	}

	@Override
	public String getAnimalEat() {
		
		return "Lion Eat All type of 'Meat' only";
	}

}
