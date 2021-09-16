package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static Scanner sc = new Scanner(System.in);
	public final String firstName = "[A-Z][a-z]{2,}$";
	public final String lastName = "[A-Z][a-z]{2,}$";
	public final String email = "[a-z0-9_]*[.a-z0-9_]*?@[a-z]*.(co|com)(.[a-z])?$";
	public final String phNo = "^[0-9]{2}\\s[0-9]{10}$";
	
	public static void main (String[] args) {
		UserRegistration user= new UserRegistration();
		System.out.println("Enter your First Name: ");
		String userFirstName = sc.next();
		System.out.println("Enter your Last Name: ");
		String userLastName = sc.next();
		System.out.println("Enter your email id: ");
		String userEmail = sc.next();
		System.out.println("Enter your Phone number: ");
		String userPhNo = sc.nextLine();
		
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
		if(user.email(userEmail))
		{
			System.out.println("The Email entered is Valid.");
		}
		else {
			System.out.println("Email is Invalid.");
		}
		if(user.phNo(userPhNo))
		{
			System.out.println("The Phone number entered is Valid.");
		}
		else {
			System.out.println(userPhNo);
			System.out.println("Phone number is Invalid.");
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
	public boolean email(String userEmail) {
		Pattern pattern = Pattern.compile(email);
		return pattern.matches(email, userEmail);
	}
	public boolean phNo(String userPhNo) {
		Pattern pattern = Pattern.compile(phNo);
		return pattern.matches(phNo, userPhNo);
	}
}
