package com.hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud.Products;

public class Create {
	
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String description;
	
	SessionFactory factory;
	
	public Create() {
		System.out.print("Session Factory Object Created...");
		this.factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Products.class)
				.buildSessionFactory();
	}
	
	
	// user input method
	public void inputUser() throws Exception {
		// Input Classes 
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// User Input variables 
		try {
			System.out.print("Enter Product Name(String Type) : ");
			name=br.readLine();
			System.out.print("Enter Product Price(Integer Type) : ");
			price=sc.nextInt();
			System.out.print("Enter Product Quantity(Integer Type) : ");
			quantity=sc.nextInt();
			System.out.print("Enter Product Description(String Type) : ");
			description=br.readLine();
		}
		catch(Exception e) {
			System.out.println("Wrong Input try again");
		}
		
	}
	
	// create row in database
	public void createData() throws Exception {
		
		inputUser();
		
		// session object create
		Session session = this.factory.getCurrentSession();
		try {
			// product object create
			Products product = new Products(price,quantity,name,description);
			
			session.beginTransaction();
			
			session.save(product);
			
			session.getTransaction().commit();
			System.out.println("Done...");
			
		}
		finally {
			factory.close();
		}
	}
	
	
}
