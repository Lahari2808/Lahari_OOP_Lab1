package com.serviceprovider.emailgenerator.service;

import com.serviceprovider.emailgenerator.model.Employee;

public interface EmailCredentialService {
	
	public String generateEmailAddress(Employee employee, String department);
	
	public String generatePassword();
	
	public void showCredentials(Employee employee, String department);

}
