package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.crud.Products;

public class Read {
	
	SessionFactory factory;
	List<Products> data;

	public Read() {
		
		this.factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Products.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		data = session.createQuery("from Products").getResultList();
	}
	
	
	
	public void printAll() {

		displayProducts(data);
		
	}


	public void printIdName() {
		
		for(Products tempProducts : data) {
			
			System.out.println("\nProducts id : " + tempProducts.getProductId());
			System.out.println("Products name : " + tempProducts.getProductName());
			System.out.println("\n\n");
			
		}
		
	}
	
	public void printNameQuantity() {
		
		for(Products tempProducts : data) {
			System.out.println("\nProducts Name : " + tempProducts.getProductName());
			System.out.println("Products Quantity : " + tempProducts.getProductQuantity());
			
			System.out.println("\n\n");
		}
		
	}
	
	
	

	private void displayProducts(List<Products> data) {
		for(Products tempProducts : data) {
			System.out.println("\nProduct Id : " + tempProducts.getProductId());
			System.out.println("Product Name : " + tempProducts.getProductName());
			System.out.println("Product Price : " + tempProducts.getProductPrice());
			System.out.println("Product Quantity : " + tempProducts.getProductQuantity());
			System.out.println("Product Description : " + tempProducts.getProductDescription());
			
			System.out.println("\n\n");
		}
	}
	
	

}
