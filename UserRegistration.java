package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static Scanner sc = new Scanner(System.in);
	public final String firstName = "[A-Z][a-z]{2,}$";
	public final String lastName = "[A-Z][a-z]{2,}$";
	
	public static void main (String[] args) {
		UserRegistration user= new UserRegistration();
		System.out.println("Enter your First Name: ");
		String userFirstName = sc.next();
		System.out.println("Enter your Last Name: ");
		String userLastName = sc.next();
		if(user.firstName(userFirstName))
		{
			System.out.println("The First Name entered is Valid.");
		}
		else {
			System.out.println("First name isInvalid.");
		}
		if(user.lastName(userLastName))
		{
			System.out.println("The Last Name entered is Valid.");
		}
		else {
			System.out.println("Last name is Invalid.");
		}
		
	}
	
	public boolean firstName(String userFirstName) {
		Pattern pattern = Pattern.compile(firstName);
		return pattern.matches(firstName, userFirstName);
		
	}
	public boolean lastName(String userLastName) {
		Pattern pattern = Pattern.compile(lastName);
		return pattern.matches(lastName, userLastName);
	}
}
