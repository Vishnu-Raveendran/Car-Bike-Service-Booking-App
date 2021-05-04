package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLoginTest {
	/**
	 * This method checks the userName and password 
	 */

	@Test
	public void validTest() {
		boolean isValid = UserLogin.login("Admin", "abcd");
		assertTrue(isValid);
	}

	@Test
	public void invalidTest() {
		boolean isValid = UserLogin.login("vi", "acd");
		assertFalse(isValid);
	}

}
