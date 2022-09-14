package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			// create student class object
			System.out.println("Student Object Create 3 times...");
			Student tempStudent1 = new Student("Rohan","Roy","rohan@luv2code.com");
			Student tempStudent2 = new Student("Sabita","Gupta","sabita@luv2code.com");
			Student tempStudent3 = new Student("Omi","Gupta","omi@luv2code.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			System.out.println("Saving the Student...");
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done...");
		}
		finally {
			factory.close();
		}
		
	}

}
