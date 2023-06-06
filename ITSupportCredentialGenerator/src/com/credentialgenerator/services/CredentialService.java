package com.credentialgenerator.services;

import java.util.Random;

import com.credentialgenerator.interfaces.CredentialManager;
import com.credentialgenerator.model.Employee;

public class CredentialService implements CredentialManager {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + department + "." + "greatlearning.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String password = "";
		String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String combinedString = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int index = rand.nextInt(combinedString.length());
			char c = combinedString.charAt(index);
			password = password + String.valueOf(c);
		}
		
		return password;
	}

	@Override
	public void showCredentials(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + emp.getFirstName() + " " + emp.getLastName() + "," + " your generated credentials are as follows :");
		System.out.println("Email --->  " + emp.getEmail());
		System.out.println("Password --> " + emp.getPassword());
		
	}

}
