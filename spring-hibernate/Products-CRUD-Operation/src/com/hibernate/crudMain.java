package com.hibernate;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class crudMain {

	public static void main(String[] args) throws Exception {
		
		// Input Classes
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Welcome message
		System.out.println("Welcome To Hibernate Console-base CRUD Operation with MySQL " +((char)2));
		
		// infinity Loop
		while(true) {
			
			// CRUD Operation Objects
			Create input = new Create();
			Read read = new Read();
			Update update = new Update();
			Delete delete = new Delete();
			
			// Try block for Exception 
			try {
				
				// Message for Operations 
				System.out.println("\nEnter 1 For Create Product : ");
				System.out.println("Enter 2 For Read Product : ");
				System.out.println("Enter 3 For Update Product : ");
				System.out.println("Enter 4 For Delete Product : ");
				System.out.println("Enter 5 For 'EXIT' : ");
				System.out.print("Choice Your option : ");
				int num = sc.nextInt();
				
				// Create Data in DataBase
				if(num == 1) {
					input.createData();
				}
				// Read Data From DataBase
				else if(num == 2) {
					System.out.println("\nEnter 1 For Print All product data : ");
					System.out.println("Enter 2 For Print product 'ID' and 'NAME' : ");
					System.out.println("Enter 3 For Print product 'NAME' and 'QUANTITY' : ");
					System.out.println("Enter Your Choice : ");
					int readNum = sc.nextInt();
					
					// Read All Datas
					if(readNum == 1) {
						read.printAll();
					}
					// Read Only Id and Name
					else if(readNum == 2) {
						read.printIdName();
					}
					// Read Only Name and Quantity
					else if(readNum == 3) {
						read.printNameQuantity();
					}
				}
				// Update Data in Data Base
				else if(num == 3) {
					update.inputUser();
				}
				// Delete Data From DataBase
				else if (num == 4) {
					delete.dataDelete();
				}
				// Break Infinity Loop
				else if(num == 5) {
					System.out.println("Thank You for Using Developed by 'Subham Kr Gupta'");
					break;
				}

			}
			// Catch Exceptions 
			catch(Exception e) {
				System.out.println("Wrong Input :-( Try again ");
			}
		}
		
		
	}

}
