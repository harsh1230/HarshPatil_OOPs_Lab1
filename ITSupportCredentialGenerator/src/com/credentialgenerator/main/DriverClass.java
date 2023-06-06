package com.credentialgenerator.main;

import java.util.Scanner;

import com.credentialgenerator.interfaces.CredentialManager;
import com.credentialgenerator.model.Employee;
import com.credentialgenerator.services.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Please enter the department from the following: ");
		System.out.println();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		
		sc.close();
		
		Employee e = new Employee(firstName, lastName);
		
		CredentialManager cm = new CredentialService();
		String email = null;
		String password = null;
		
		switch(option) {
		case 1 :
			email = cm.generateEmailAddress(firstName, lastName, "tech");
			password = cm.generatePassword();
			break;
			
		case 2 :
			email = cm.generateEmailAddress(firstName, lastName, "admin");
			password = cm.generatePassword();
			break;
		
		case 3 :
			email = cm.generateEmailAddress(firstName, lastName, "hr");
			password = cm.generatePassword();
			break;
			
		case 4 :
			email = cm.generateEmailAddress(firstName, lastName, "legal");
			password = cm.generatePassword();
			break;
			
		default :
			System.out.println("Enter a valid option!");
		}
		
		e.setEmail(email);
		e.setPassword(password);
		
		cm.showCredentials(e);
	}

}
