package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static Scanner sc = new Scanner(System.in);
	public final String firstName = "[A-Z][a-z]{2,}$";
	public final String lastName = "[A-Z][a-z]{2,}$";
	public final String email = "^[a-z0-9]+[-.+_a-z0-9]*@[a-z0-9]+[.][co|com]+[.a-z]*{2}$";
	public final String phNo = "^[0-9]{2}[\\s][0-9]{10}$";
	public final String password =  "^(?=.*[~!@#$%^&*-+=()])(?=.*[0-9])(?=.*[A-Z]).{8,}$";
			                     
			                 
	
	
	public static void main (String[] args) {
		UserRegistration user= new UserRegistration();
		System.out.println("Enter your First Name: ");
		String userFirstName = sc.nextLine();
		System.out.println("Enter your Last Name: ");
		String userLastName = sc.nextLine();
		System.out.println("Enter your email id: ");
		String userEmail = sc.nextLine();
	// final String userPhNo = "91 2342678464";
		System.out.println("Enter your Phone number: ");
		String userPhNo = sc.nextLine();
		System.out.println("Enter your Password: ");
		String userPassword = sc.nextLine();
		sc.close();
		
		if(user.firstNameVal(userFirstName))
		{
			System.out.println("The First Name entered is Valid.");
		}
		else {
			System.out.println("First name isInvalid.");
		}
		if(user.lastNameVal(userLastName))
		{
			System.out.println("The Last Name entered is Valid.");
		}
		else {
			System.out.println("Last name is Invalid.");
		}
		if(user.emailVal(userEmail))
		{
			System.out.println("The Email entered is Valid.");
		}
		else {
			System.out.println("Email is Invalid.");
		}
		if(user.phNoVal(userPhNo))
		{
			System.out.println("The Phone number entered is Valid.");
		}
		else {
			System.out.println(userPhNo);
			System.out.println("Phone number is Invalid.");
		}
		if(user.passwordVal(userPassword))
		{
			System.out.println("The Password entered is Valid.");
		}
		else {
			System.out.println(userPassword);
			System.out.println("Password is Invalid.");
		}
	}
	
	public boolean firstNameVal(String userFirstName) {
		Pattern pattern = Pattern.compile(firstName);
		return pattern.matches(firstName, userFirstName);
		
	}
	public boolean lastNameVal(String userLastName) {
		Pattern pattern = Pattern.compile(lastName);
		return pattern.matches(lastName, userLastName);
	}
	public boolean emailVal(String userEmail) {
		Pattern pattern = Pattern.compile(email);
		return pattern.matches(email, userEmail);
	}
	public boolean phNoVal(String userPhNo) {
		Pattern pattern = Pattern.compile(phNo);
		return pattern.matches(phNo, userPhNo);
	}
	public boolean passwordVal(String userPassword) {
		Pattern pattern = Pattern.compile(password);
		return pattern.matches(password, userPassword);
	}
}
