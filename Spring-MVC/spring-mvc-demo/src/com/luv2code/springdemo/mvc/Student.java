package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	private LinkedHashMap<String,String> countryOptions;
	private LinkedHashMap<String,String> favoriteLanguageOptions;
	private LinkedHashMap<String,String> operatingSystemOptions;
	
	public Student() {
		
		countryOptions = new LinkedHashMap<>();
		favoriteLanguageOptions = new LinkedHashMap<>();
		operatingSystemOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("INR","India");
		countryOptions.put("NP","Nepal");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
		countryOptions.put("USA","United State Of America");
		countryOptions.put("JP","Japan");
		
		
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("JavaScript", "JavaScript");
		favoriteLanguageOptions.put("C++", "C++");
		favoriteLanguageOptions.put("Python", "Python");
		
		
		operatingSystemOptions.put("Linex", "Linex");
		operatingSystemOptions.put("Windows", "Windows");
		operatingSystemOptions.put("Mac", "Mac");
		
	}

	// Operating System Options With Linked Hash Map
	public LinkedHashMap<String, String> getOperatingSystemOptions() {
		return operatingSystemOptions;
	}

	// Favorite Language Options with Linked Hash Map
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	// Country Options with Linked Hash MAp
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	// firstName Methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// lastName methods
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// country methods
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Favorite Language getter and setter
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	// Favorite Language
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	// Operating System methods
	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
	
}
