package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLoginTest {
	/**
	 * This method checks the userName and password
	 */

	@Test
	public void userAvailabilityTest1() {
		boolean isAvailable = Login.isUserAvailable("Admin01@gmail.com", "Pass#admin01");
		assertTrue(isAvailable);
	}

	@Test
	public void userAvailabilityTest2() {
		boolean isAvailable = Login.isUserAvailable("Adm01@gmail.com", "Pass#admin01");
		assertFalse(isAvailable);
	}

	@Test
	public void userAvailabilityTest3() {
		boolean isAvailable = Login.isUserAvailable("Admi01@gmail.com", "Pass#mn01");
		assertFalse(isAvailable);
	}

	@Test
	public void userNameValidation1() {
		boolean isValid = Login.isUsernameValid("Admin01@gmail.com");
		assertTrue(isValid);
	}

	@Test
	public void userNameValidation2() {
		boolean isValid = Login.isUsernameValid("randomuser&?01@kmail.com");
		assertFalse(isValid);
	}

	@Test
	public void passwordValidation1() {
		boolean isValid = Login.isPasswordValid("Pass#admin20");
		assertTrue(isValid);
	}

	@Test
	public void passwordValidation2() {
		boolean isValid = Login.isPasswordValid(" ");
		assertFalse(isValid);
	}

	@Test
	public void passwordValidation3() {
		boolean isValid = Login.isPasswordValid("0000 ");
		assertFalse(isValid);
	}

	@Test
	public void validLogin() {
		boolean isValid = Login.userLogin("Admin01@gmail.com", "Pass#admin01");
		assertTrue(isValid);
	}

	@Test
	public void invalidUserNameLogin() {
		boolean isValid = Login.userLogin("Admin@gmail.com", "Pass#admin01");
		assertFalse(isValid);
	}

	@Test
	public void invalidPasswordLogin() {
		boolean isValid = Login.userLogin("Admin01@gmail.com", "Pass#min01");
		assertFalse(isValid);
	}

}
