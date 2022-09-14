package com.hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud.Products;

public class Update {

	private int id;
	private String attribute;
	
	
	SessionFactory factory;
	Read read;
	
	public Update() {
		
		this.factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Products.class).buildSessionFactory();
		read = new Read();
	}
	
	public void inputUser() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		read.printAll();
		
		System.out.print("Enter id which Data you want to update : ");
		id= sc.nextInt();
		int temp;
		while(true) {
			System.out.println("\nEnter 1 to change Name : ");
			System.out.println("Enter 2 to change Price : ");
			System.out.println("Enter 3 to change Quantity : ");
			System.out.println("Enter 4 to change Descrption : ");
			System.out.print("Enter Your Choice : ");
			temp = sc.nextInt();
			
			if(temp == 1) {
				attribute="productName";
				break;
			}
			else if(temp == 2) {
				attribute="productPrice";
				break;
			}
			else if(temp == 3) {
				attribute="productQuantity";
				break;
			}
			else if(temp == 4) {
				attribute="productDescription";
				break;
			}
			else {
				System.out.println("Sorry Wrong Input :-(  try again");
			}
				
		}
		
		Session session = factory.getCurrentSession();
		
		
		
		System.out.print("Enter Value : ");
		try {
			String tempValue=br.readLine();
			if(temp == 1) {
				session.beginTransaction();
				session.createQuery("update Products s set s."+attribute+"='"+tempValue+"' where s.id='"+id+"'").executeUpdate();
			}
			else if(temp == 2) {
				session.beginTransaction();
				int v1 = Integer.parseInt(tempValue);
				session.createQuery("update Products s set s."+attribute+"='"+v1+"' where s.id='"+id+"'").executeUpdate();
			}
			else if(temp == 3) {
				session.beginTransaction();
				int v1 = Integer.parseInt(tempValue);
				session.createQuery("update Products s set s."+attribute+"='"+v1+"' where s.id='"+id+"'").executeUpdate();
			}
			else if(temp == 4) {
				session.beginTransaction();
				session.createQuery("update Products s set s."+attribute+"='"+tempValue+"' where s.id='"+id+"'").executeUpdate();
			}
			else {
				System.out.println("Sorry Wrong Input :-( ");
			}
			
			session.getTransaction().commit();
			
			System.out.println("\n\nDone...");
		}
		catch(Exception e) {
			
		}
		
	}

	
}
