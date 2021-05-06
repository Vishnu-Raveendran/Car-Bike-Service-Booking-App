package com.vishnu;

import java.util.HashMap;
import java.util.regex.*;

public class Login {

	static HashMap<String, String> credentials = new HashMap<String, String>();

	static {
		credentials.put("Admin01@gmail.com", "Pass#admin01");
	}

	/**
	 * Returns true if given user-name and password have 10 and 8 characters
	 * respectively else returns false
	 * 
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public static boolean userLogin(String userName, String password) {
		boolean isValidUser = false;

		if (isUsernameValid(userName) && isPasswordValid(password) && isUserAvailable(userName, password)) {
			isValidUser = true;
			System.out.println("Login Success");
		} else {
			System.out.println("Please enter valid credentials");
		}
		return isValidUser;
	}

	/**
	 * checks if the userName and password in hashMap
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public static boolean isUserAvailable(String userName, String password) {
		boolean isAvailable = false;
		if (credentials.containsKey(userName)) {
			String passwordValue = credentials.get(userName);
			if (passwordValue.equals(password)) {
				isAvailable = true;
			}
		} else {
			System.out.println("User not available");
			isAvailable = false;
		}
		return isAvailable;

	}

	/**
	 * checks if the userName is valid
	 * 
	 * @param username
	 * @return
	 */
	public static boolean isUsernameValid(String userName) {
		String regex = "^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+$";
		Pattern userNamePattern = Pattern.compile(regex);
		Matcher matchUserName = userNamePattern.matcher(userName);
		return matchUserName.matches();
	}

	/**
	 * checks if the password is valid
	 * 
	 * @param password
	 * @return
	 */
	public static boolean isPasswordValid(String password) {
		boolean isValid = false;
		if (password.trim().length() >= 8 && password != "") {
			isValid = true;
		}
		return isValid;
	}
}
