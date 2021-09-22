package com.useregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.userregistration.InvalidUserDetailException;
import com.userregistration.UserRegistration;

public class UserRegistrationTest {
	/**
	 * Test case when its valid
	 */
	@Test
	public void firstNameWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.firstNameVal("Bill");
			Assert.assertEquals(true,result);	
		}
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}	
	}

	/**
	 * FirstName should have Starting capital and minimum of 3 characters
	 * Therefore its invalid
	 */
	@Test
	public void firstNameWhenSmallNoIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.firstNameVal("bi");
			Assert.assertEquals(false,result);	
		}
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test case when its valid
	 */
	@Test
	public void lastNameWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.lastNameVal("John");
			Assert.assertEquals(true,result);
		}
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * LastName should have Starting capital and minimum of 3 characters
	 * Therefore its invalid
	 */

	@Test
	public void LastNameWhenSmallNoIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.lastNameVal("john");
			Assert.assertEquals(false,result);	
		}
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test case when its valid
	 */
	@Test
	public void EmailWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.emailVal("kshama857@gmail.com");
			Assert.assertEquals(true,result);
		}	
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Email has 3 manadatory parts with abc,bl and co with precise @ and .
	 * positions (abc.xyz@bl.co.in) where rest are optional
	 * Therefore its invalid
	 */
	@Test
	public void EmailWhenInputIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.emailVal("gfdtv@1.gmail.in.com");
			Assert.assertEquals(false,result);
		}
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test case when its valid
	 */

	@Test
	public void MobileNoWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.phNoVal("91 1237567890");
			Assert.assertEquals(true,result);	
		}
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Mobile number should have country code followed by space and 10 digits
	 * Therefore its invalid
	 */
	@Test
	public void MobileNoWhenLettersNoSpaceIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.phNoVal("123456789X");
			Assert.assertEquals(false,result);
		}	
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test case is valid
	 */
	@Test
	public void PasswordWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.passwordVal("hsbT32na3$");
			Assert.assertEquals(true,result);
		}	
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Password should have minimum 8 characters atleast 1 number and upper case,
	 * exactly 1 Special character
	 * Therefore its invalid
	 */
	@Test
	public void PasswordWhenNospecialCharacter_NoCapsIsInvalid() {
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.passwordVal("sjdhbjak");
			Assert.assertEquals(false,result);	
		}		
		catch(InvalidUserDetailException e)
		{
			System.out.println(e.getMessage());
		}
	}

}