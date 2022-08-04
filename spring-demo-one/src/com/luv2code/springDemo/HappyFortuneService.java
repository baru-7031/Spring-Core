package com.luv2code.springDemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "Today is Your Lucky Day!";
	}

}
