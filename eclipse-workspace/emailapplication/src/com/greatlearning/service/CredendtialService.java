package com.greatlearning.service;
import java.util.Random;

import Model.*;

public class CredendtialService {
	
	public String generateEmailAddress(Employee emp) {
		
		return emp.getFirstName()+emp.getLastName()+"@" +emp.getDepartment()+ "abc.com";
		
	}
public String generatePasswarod() 
{
	
	Random random = new Random();
	
	
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>)";
	
	String allowedChars = capitalLetters+smallLetters+numbers+specialCharacters;
	
	char[] password = new char[8];
	
	for(int i = 0;i<8;i++) {
		int idx = random.nextInt(allowedChars.length());
		password[i] = allowedChars.charAt(idx);
	}
	// Generate 8 digit random password
	
	return new String(password);
}



public void showCredentials(Employee emp,String email,String password) {
	// display credentials
	System.out.println("Dear " + emp.getFirstName() + "- here are your credentials");
	System.out.println("Email Address--> "+email);
	System.out.println("Pasword--> "+password);
}
}

