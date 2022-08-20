package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeedProperties implements Properties {

	@Value("${subham.email}")
	private String email;
	
	@Value("${subham.team}")
	private String team;
	
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return team;
	}

}
