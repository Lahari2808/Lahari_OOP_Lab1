package com.serviceprovider.emailgenerator.main;

import java.util.Scanner;

import com.serviceprovider.emailgenerator.model.Employee;
import com.serviceprovider.emailgenerator.service.EmailCredentialService;
import com.serviceprovider.emailgenerator.service.EmailCredentialServiceImp;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your First Name");
		String fn = sc.next();
		System.out.println("Enter Last Name");
		String ln = sc.next();
		
		EmailCredentialService service = new EmailCredentialServiceImp();
		
		Employee employee = new Employee(fn,ln);
		
		System.out.println("Plese Enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		String department = null;
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			department = "tech";
			break;
		case 2 : 
			department = "admin";
			break;
		case 3 : 
			department = "hr";
			break;
		case 4 : 
			department = "legal";
			break;
		default : 
			System.out.println("Please Enter valid option");
		}

		service.showCredentials(employee, department);
		sc.close();
		
		

	}

}
