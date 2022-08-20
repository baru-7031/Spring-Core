package com.annotationAutowired.constructor;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImplement implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is Your Lucky Day Enjoy! :)";
	}

}
