package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String []args) {
		String firstName="[A-Z][a-z]{2,}";
		String pattern = "Kshama";
		System.out.println(Pattern.matches(firstName, pattern));
	}
}
