package com.useregistrationtest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.userregistration.UserRegistration;

public class UserRegistrationTest {
 @Test
 public void firstNameWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameVal("Bill");
		assertEquals(true,result);		
	}
 @Test
 public void firstNameWhenSmallNoIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.firstNameVal("kshama");
		assertEquals(true,result);	
	}
 @Test
 public void lastNameWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.lastNameVal("Williams");
		assertEquals(true,result);	
	}
 @Test
 public void LastNameWhenSmallNoIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.lastNameVal("williams2");
		assertEquals(true,result);	
	}
 @Test
 public void EmailWhenInputIsValid() {
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailVal("gvxg@88gmil.com");
		assertEquals(true,result);
}
 @Test
 public void EmailWhenInputIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.emailVal("-ab21.yahoo.co.in");
		assertEquals(true,result);	
	}
 @Test
 public void MobileNoWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.phNoVal("91 1234567893");
		assertEquals(true,result);	
	}
 @Test
 public void MobileNoWhenLettersNoSpaceIsInvalid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.phNoVal("123456782d3");
		assertEquals(true,result);	
	}
@Test
 public void PasswordWhenInputIsValid() 
	{
		UserRegistration obj = new UserRegistration();
		boolean result = obj.passwordVal("fh5@Sjkn645gv");
		Assert.assertEquals( true,result);
	}
@Test
public void PasswordWhenNospecialCharacter_NoCapsIsInvalid() 
{
	UserRegistration obj = new UserRegistration();
	boolean result = obj.passwordVal("jhsdbjak");
	assertEquals(true,result);	
}

}