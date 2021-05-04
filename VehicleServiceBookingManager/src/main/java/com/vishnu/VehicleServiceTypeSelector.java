package com.vishnu;

import java.util.ArrayList;

public class VehicleServiceTypeSelector {

	static ArrayList<String> carServicesList = new ArrayList<String>();
	static ArrayList<String> bikeServicesList = new ArrayList<String>();

	static {
		carServicesList.add("standard services");
		carServicesList.add("Ac Services");

		bikeServicesList.add("standard services");
		bikeServicesList.add("bike wash");
	}

	/**
	 * displays the available car services
	 */
	public static void showCarServices() {
		System.out.println("List of available car services");
		for (String carServices : carServicesList) {
			System.out.println("->" + carServices);
		}
	}

	/**
	 * displays the available bike services
	 */
	public static void showBikeServices() {
		System.out.println("List of available bike services");
		for (String bikeServices : bikeServicesList) {
			System.out.println("->" + bikeServices);
		}
	}

	/**
	 * adds new car service to the list
	 * 
	 * @param carServiceName
	 */
	public static boolean addCarService(String carServiceName) {
		boolean isDone = false;		
		if (isServicePresent(carServiceName)) {
			isDone= false;
			System.out.println("Service already available");

		} else {
			carServicesList.add(carServiceName);
			isDone =true;
			System.out.println(carServiceName + " is added");
		}
		return isDone;
	}

	/**
	 * adds new bike service to the list
	 * 
	 * @param bikeServiceName
	 */
	public static boolean addBikeService(String bikeServiceName) {
		boolean isDone = true;
		if (isServicePresent(bikeServiceName)) {
			isDone = false;
			System.out.println("Service already available");
		} else {
			bikeServicesList.add(bikeServiceName);
			isDone = true;
			System.out.println(bikeServiceName + " is added");
		}
		return isDone;
	}

	/**
	 * accepts service name checks if it is present in list then returns true if
	 * present else returns false
	 * 
	 * @param serviceName
	 * @return
	 */
	public static boolean isServicePresent(String serviceName) {
		boolean isPresent = false;
		if (carServicesList.contains(serviceName)) {
			isPresent = true;
		} else if (bikeServicesList.contains(serviceName)) {
			isPresent = true;
		} else {
			isPresent = false;
		}
		return isPresent;
	}

	/**
	 * removes the car service from the list
	 * 
	 * @param carServiceName
	 */
	public static boolean removeCarService(String carServiceName) {
		boolean isDone = false;
		if (isServicePresent(carServiceName)) {
			int indexOfCarServiceName = carServicesList.indexOf(carServiceName);
			carServicesList.remove(indexOfCarServiceName);
			isDone = true;
		} else {
			isDone = false;
			System.out.println(carServiceName + "is not available");
		}return isDone;
	}

	/**
	 * removes the bike service from the list
	 * 
	 * @param bikeServiceName
	 */
	public static boolean removeBikeService(String bikeServiceName) {
		boolean isDone = false;
		if (isServicePresent(bikeServiceName)) {
			int indexOfBikeServiceName = bikeServicesList.indexOf(bikeServiceName);
			bikeServicesList.remove(indexOfBikeServiceName);
			isDone = true;
		} else {
			System.out.println(bikeServiceName + " is not available");
			isDone = false;
		}
		return isDone;
	}

}
