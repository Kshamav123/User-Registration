package com.useregistrationtest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.userregistration.UserRegistration;

@RunWith(Parameterized.class)

public class ParamaterisedTest {
	private String email;
	private UserRegistration user;
	private boolean result;
	
	/**
	 * Constructor to initialise
	 */
	public ParamaterisedTest(String email, boolean result) {
		super();
		this.email = email;
		this.result = result;
	}
	@Before
	public void initialise() {
		user = new UserRegistration();
	}
	/**
	 * Method which returns all the emails to validate
	 * @return
	 */
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", false },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
			    { "abc@%*.com", false },
				{ "abc.@gmail.com ", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				});
	}
	@Test
	public void EmailTesting_ChecksValidity() {
		Assert.assertEquals(result, user.emailVal(email));
	}
	
}
