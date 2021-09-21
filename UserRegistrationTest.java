package com.useregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.userregistration.UserRegistration;

public class UserRegistrationTest {
	/**
	 * Test case when its valid
	 */
	@Test
	public void firstNameWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameVal("Bill");
		assertEquals(true, result);
	}

	/**
	 * FirstName should have Starting capital and minimum of 3 characters
	 */
	@Test
	public void firstNameWhenSmallNoIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameVal("kshama3");
		assertEquals(false, result);
	}

	/**
	 * Test case when its valid
	 */
	@Test
	public void lastNameWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.lastNameVal("Williams");
		assertEquals(true, result);
	}

	/**
	 * LastName should have Starting capital and minimum of 3 characters
	 */

	@Test
	public void LastNameWhenSmallNoIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.lastNameVal("williams2");
		assertEquals(false, result);
	}

	/**
	 * Test case when its valid
	 */
	@Test
	public void EmailWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailVal("gvxg@88gmil.com");
		assertEquals(true, result);
	}

	/**
	 * Email has 3 manadatory parts with abc,bl and co with precise @ and .
	 * positions (abc.xyz@bl.co.in) where rest are optional
	 */
	@Test
	public void EmailWhenInputIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailVal("-ab21.yahoo.co.in");
		assertEquals(false, result);
	}

	/**
	 * Test case when its valid
	 */

	@Test
	public void MobileNoWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.phNoVal("91 1234567893");
		assertEquals(true, result);
	}

	/**
	 * Mobile number should have country code followed by space and 10 digits
	 */
	@Test
	public void MobileNoWhenLettersNoSpaceIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.phNoVal("123456782d3");
		assertEquals(false, result);
	}

	/**
	 * Test case is valid
	 */
	@Test
	public void PasswordWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordVal("fh5@Sjkn645gv");
		Assert.assertEquals(true, result);
	}

	/**
	 * Password should have minimum 8 characters atleast 1 number and upper case,
	 * exactly 1 Special character
	 */
	@Test
	public void PasswordWhenNospecialCharacter_NoCapsIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordVal("jhsdbjak");
		assertEquals(false, result);
	}

}