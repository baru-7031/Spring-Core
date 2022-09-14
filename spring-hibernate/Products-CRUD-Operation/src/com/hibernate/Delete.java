package com.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud.Products;

public class Delete {
	
	private int id;
	Read read;
	
	SessionFactory factory;
	
	public Delete() {
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Products.class).buildSessionFactory();
		read = new Read();
	}
	
	public void dataDelete() {
		Scanner sc =new Scanner(System.in);
		
		read.printAll();
		
		System.out.print("Enter id Which Data you want to delete : ");
		id = sc.nextInt();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		System.out.println("\nDelete Product data id=" + id);
		
		session.createQuery("delete from Products where id="+id).executeUpdate();
		
		session.getTransaction().commit();
		
		System.out.println("\nDone...");
	}
	
}
