package com.serviceprovider.emailgenerator.service;

import java.util.Random;

import com.serviceprovider.emailgenerator.model.Employee;

public class EmailCredentialServiceImp implements EmailCredentialService {

	@Override
	public String generateEmailAddress(Employee employee, String department) {

		return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + department
				+ ".serviceprovider.com";
	}

	@Override
	public String generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$^&*()+'?/<>+-/*";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();
		String password = "";

		for (int i = 0; i < 8; i++) {
			password += values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	@Override
	public void showCredentials(Employee employee, String department) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows ");
		System.out.println("Email -->  " + generateEmailAddress(employee, department));
		System.out.println("Password --> " + generatePassword());

	}
}
