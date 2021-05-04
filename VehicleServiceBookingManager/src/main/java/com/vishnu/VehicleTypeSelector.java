package com.vishnu;

import java.util.ArrayList;

public class VehicleTypeSelector {

	static ArrayList<String> vehicleTypeList = new ArrayList<String>();

	static {
		vehicleTypeList.add("car");
		vehicleTypeList.add("bike");
	}

	/**
	 * returns true if the given vehicle type is present else returns false
	 * 
	 * @param vehicleTypeString
	 * @return
	 */
	public static boolean isVehicleTypePresent(String vehicleTypeString) {
		boolean isPresentOrNot = vehicleTypeList.contains(vehicleTypeString);
		return isPresentOrNot;
	}

	/**
	 * Returns true and adds new vehicle type to the vehicleTypeList if the vehicle
	 * type is already available then returns false
	 * 
	 * @param vehicleType
	 */
	public static boolean addVehicleType(String vehicleType) {
		boolean isDone = false;
		if (isVehicleTypePresent(vehicleType)) {
			System.out.println("Vehicle type already avilable");
			isDone = false;
		} else {
			vehicleTypeList.add(vehicleType);
			isDone = true;
			System.out.println(vehicleType + " is added");
		}
		return isDone;

	}

	/**
	 * removes the vehicle type from the arrayList if it exists else returns false
	 * 
	 * @param vehicleType
	 */
	public static boolean removeVehicleType(String vehicleType) {
		// Check whether exists , if exists then remove
		boolean isDone = false;
		if (isVehicleTypePresent(vehicleType)) {
			vehicleTypeList.remove(vehicleType);
			isDone = true;
			System.out.println(vehicleType + " is removed");
		} else {
			isDone = false;
			System.out.println("The given vehicle type is not present");
		}
		return isDone;

	}

	/**
	 * displays the vehicle type in vehicleTypeList
	 */
	public static void display() {
		System.out.println("List of Vehicle Type");
		for (String vehicle : vehicleTypeList) {
			System.out.println("->" + vehicle);
		}
	}
}
