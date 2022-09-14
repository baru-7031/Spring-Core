package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			int studentId = 1;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			
			myStudent.setFirstName("Subham");
			
			//commit the transaction
			session.getTransaction().commit();
			
			
			// New Code here
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			// update email all students
//			session.createQuery("update Student set email='subham@gmail.com'").executeUpdate();
			
			
			session.getTransaction().commit();
			
			
			// New Code
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			
			//update email where firstName = 'subham'
			System.out.println("\n\nSubham email updated...");
			session.createQuery("update Student s set s.email='omi@luv2code.com' where s.firstName='Omi'").executeUpdate();
			
			session.getTransaction().commit();
			
			System.out.println("Done...");
		}
		finally {
			factory.close();
		}
		
		
	}

}
