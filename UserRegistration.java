package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static Scanner sc = new Scanner(System.in);
	public final String firstName = "[A-Z][a-z]{2,}$";
	public final String lastName = "[A-Z][a-z]{2,}$";
	public final String email = "^[a-z0-9]+[-.+_a-z0-9]*@[a-z0-9]+[.][co|com]+[.a-z]*{2}$";
	public final String phNo = "^[0-9]{2}[\\s][0-9]{10}$";
	public final String password = "^(?=.*[~!@#$%^&*-+=()])(?=.*[0-9])(?=.*[A-Z]).{8,}$";

	public static void main(String[] args) throws InvalidUserDetailException {
		UserRegistration user = new UserRegistration();
		System.out.println("Enter your First Name: ");
		String userFirstName = sc.nextLine();
		System.out.println("Enter your Last Name: ");
		String userLastName = sc.nextLine();
		System.out.println("Enter your email id: ");
		String userEmail = sc.nextLine();
		System.out.println("Enter your Phone number: ");
		String userPhNo = sc.nextLine();
		System.out.println("Enter your Password: ");
		String userPassword = sc.nextLine();
		sc.close();

		if (user.firstNameVal(userFirstName)) {
			System.out.println("The First Name entered is Valid.");
		} else {
			System.out.println("First name isInvalid.");
		}
		if (user.lastNameVal(userLastName)) {
			System.out.println("The Last Name entered is Valid.");
		} else {
			System.out.println("Last name is Invalid.");
		}
		if (user.emailVal(userEmail)) {
			System.out.println("The Email entered is Valid.");
		} else {
			System.out.println("Email is Invalid.");
		}
		if (user.phNoVal(userPhNo)) {
			System.out.println("The Phone number entered is Valid.");
		} else {
			System.out.println("Phone number is Invalid.");
		}
		if (user.passwordVal(userPassword)) {
			System.out.println("The Password entered is Valid.");
		} else {
			System.out.println("Password is Invalid.");
		}
	}

	/**
	 * This method is used to match the first name
	 * 
	 * @param userFirstName it is the user input
	 * @return returs boolean
	 */
	public boolean firstNameVal(String userFirstName) throws InvalidUserDetailException {
		Pattern pattern = Pattern.compile(firstName);
		boolean ans = pattern.matches(firstName, userFirstName);
		if (ans) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid");

		}
	}

	/**
	 * This method is used to match the last name
	 * 
	 * @param userLastName it is the user input
	 * @return returns boolean
	 */
	public boolean lastNameVal(String userLastName) throws InvalidUserDetailException {
		Pattern pattern = Pattern.compile(lastName);
		boolean ans = pattern.matches(lastName, userLastName);
		if (ans) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid");
		}
	}

	/**
	 * This method matches the emailaddress
	 * 
	 * @param userEmail is the user input
	 * @return returns boolean
	 */
	public boolean emailVal(String userEmail) throws InvalidUserDetailException {
		Pattern pattern = Pattern.compile(email);
		boolean ans = pattern.matches(email, userEmail);
		if (ans) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid");
		}

	}

	/**
	 * This method matches the Phone number
	 * 
	 * @param userPhNo is the user input
	 * @return returns boolean
	 */

	public boolean phNoVal(String userPhNo) throws InvalidUserDetailException {
		Pattern pattern = Pattern.compile(phNo);
		boolean ans = pattern.matches(phNo, userPhNo);
		if (ans) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid");
		}

	}

	/**
	 * This method matches the Password
	 * 
	 * @param userPassword is the user input
	 * @return returns boolean
	 */

	public boolean passwordVal(String userPassword) throws InvalidUserDetailException {
		Pattern pattern = Pattern.compile(password);
		boolean ans = pattern.matches(password, userPassword);
		if (ans) {
			return true;
		} else {
			throw new InvalidUserDetailException("Invalid");
		}
	}
}
