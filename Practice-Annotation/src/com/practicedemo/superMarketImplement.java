package com.practicedemo;

import org.springframework.stereotype.Component;

@Component
public class superMarketImplement implements superMarket {

	private String pName;
	private int pQuantity;
	
	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	@Override
	public void addValue(String pName, int pQuantity) {
		setpName(pName);
		setpQuantity(pQuantity);
	}

	@Override
	public void printProducts() {
		System.out.println("Product name		: " + pName);
		System.out.println("Product Quantity	: " + pQuantity);

	}

}
