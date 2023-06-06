package com.credentialgenerator.interfaces;

import com.credentialgenerator.model.Employee;

public interface CredentialManager {
	
	public String generateEmailAddress(String firstName, String lastName, String department);
	public String generatePassword();
	public void showCredentials(Employee e);

}
