package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query the students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudent(theStudents);
			
			// query students: lastName = "gupta"
			theStudents = session.createQuery("from Student s where s.lastName = 'gupta'").getResultList();
			
			// display after query student
			System.out.println("\n\nStudents who have lastName gupta : ");
			displayStudent(theStudents);
			
			
			
			// query student who's lastName = gupta and firstName = omi
			theStudents = session.createQuery("from Student s where s.lastName='gupta' OR firstName='omi'").getResultList();
			
			// display after query
			System.out.println("\n\nStudents who's lastName Gupta or firstName Omi : ");
			displayStudent(theStudents);
			
			
			
			
			// query student who's lastName = gupta and firstName = omi
			theStudents = session.createQuery("from Student s where s.lastName='gupta' AND firstName='omi'").getResultList();
			
			// display after query
			System.out.println("\n\nStudents who's lastName Gupta and firstName Omi : ");
			displayStudent(theStudents);
			
			
			
			// query Student where email like '%luv2code.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").getResultList();
			
			// display after query
			System.out.println("\n\nStudents who's email end with luv2code.com : ");
			displayStudent(theStudents);
			
			
			
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done...");
		}
		finally {
			factory.close();
		}
		
		
	}

	private static void displayStudent(List<Student> theStudent) {
		for(Student tempStudent : theStudent) {
			
			System.out.println(tempStudent);
			
		}
	}

}
