package com.vishnu;

public class UserLogin {
	/**
	 * Returns true if given user-name and password have 10 and 8 characters
	 * respectively else returns false
	 * 
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public static boolean login(String userName, String password) {
		boolean isValidUser = false;

		if (isUsernameValid(userName) && isPasswordValid(password)) {
			isValidUser = true;
			System.out.println("Login Success");
		} else {
			System.out.println("Please enter valid credentials");
		}
		return isValidUser;
	}

	/**
	 * checks if the userName is valid
	 * 
	 * @param username
	 * @return
	 */
	public static boolean isUsernameValid(String username) {
		boolean isValid = false;
		if (username.equals("Admin")) {
			isValid = true;
		}

		return isValid;
	}

	/**
	 * checks if the password is valid
	 * 
	 * @param password
	 * @return
	 */
	public static boolean isPasswordValid(String password) {
		boolean isValid = false;
		if (password.equals("abcd")) {
			isValid = true;
		}
		return isValid;
	}
}
