package com.arpit.main;

import java.util.Random;

import coreJava.Employee;

public class Credentials {
	

	public char[] generatePassword() {
		
		int length = 6;  //this can be changed as per requirements
		
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      /*password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));*/
	   
	      for(int i = 0; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
				
		
		
	}
	
	public String generateEmailAddress(Employee emp,String dept) {
		
		//return firstName+lastName+"@"+department+"."+company+".com";
		return emp.getFirstname().toLowerCase()+emp.getLastname().toLowerCase()+"@"+dept+".abc.com";
	}
	
	public void showCredentials(Employee emp, String email) {
		//display email id and password
		
		System.out.println("Dear "+emp.getFirstname()+" your generated credentials are as follows");
		
		System.out.println("Email  --> "+email);
		
		System.out.print("Password --> " );
		System.out.println(generatePassword());  
		
	}

}
