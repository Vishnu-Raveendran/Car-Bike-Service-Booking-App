package com.vishnu;

import java.util.ArrayList;

public class VehicleBrandSelector {

	static ArrayList<String> carBrandList = new ArrayList<String>();
	static ArrayList<String> bikeBrandList = new ArrayList<String>();

	static {
		carBrandList.add("tata");
		carBrandList.add("toyota");

		bikeBrandList.add("yamaha");
		bikeBrandList.add("ktm");
	}
	
	/**
	 * Returns true if the given brand is present in the
	 * arrayList else returns false
	 * 
	 * @param vehicleType
	 * @param vehicleBrandString
	 * @return
	 */
	public static boolean isVehicleBrandPresent(String vehicleBrandString) {
		boolean isVehicleBrandPresent = false;
			if (carBrandList.contains(vehicleBrandString)) {
				isVehicleBrandPresent = true;
			}
	        else if(bikeBrandList.contains(vehicleBrandString)) {
				isVehicleBrandPresent = true;
			}
	        else {
				isVehicleBrandPresent = false;
			}
		return isVehicleBrandPresent;
	}


	/**
	 * accepts a car brand String and adds the string to the car brand list
	 * returns true if the car is added
	 * 
	 * @param carBrand
	 */
	public static boolean addCarBrand(String carBrand) {
		boolean isDone = false;
		if(isVehicleBrandPresent(carBrand)) {
			isDone = false;
			System.out.println("");
		}
		else {
			carBrandList.add(carBrand);
			isDone = true;
			System.out.println(carBrand + " is added");
		}
		return isDone;
	}

	/**
	 * accepts a bike brand and adds the string to the bike brand list
	 * returns true if added
	 * 
	 * @param bikeBrand
	 */
	public static boolean addBikeBrand(String bikeBrand) {
		boolean isDone = false;
		if(isVehicleBrandPresent(bikeBrand)) {
			System.out.println("Bike brand already available");
		}
		else {
			bikeBrandList.add(bikeBrand);
			isDone = true;
			System.out.println(bikeBrand + " is added");
		}
		return isDone;
	}

	/**
	 * accepts a carBrand and removes the car brand from car barnd list if it exists
	 * 
	 * @param carBrand
	 */
	public static boolean removeCarBrand(String carBrand) {
		boolean isDone =false;
		if(isVehicleBrandPresent(carBrand)) {
			carBrandList.remove(carBrand);
			isDone = true;
			System.out.println(carBrand + " is removed");
		}
		else {
			System.out.println("The given car brand is not present");
		}
		return isDone;
	}

	/**
	 * accepts a bikeBrand and removes the bike brand from the list
	 * 
	 * @param bikeBrand
	 */
	public static boolean removeBikeBrand(String bikeBrand) {
		boolean isDone =false;
		if(isVehicleBrandPresent(bikeBrand)) {
			bikeBrandList.remove(bikeBrand);
			isDone = true;
			System.out.println(bikeBrand + " is removed");
		}
		else {
			isDone=false;
			System.out.println("The given Bike brand is not present");
		}
		return isDone;
			
	}

	
	/**
	 * this method displays the list of bike brands present in the list
	 */
	public static void bikeBrandDisplay() {
		System.out.println("List of Bike Brands");
		for (String bike : bikeBrandList) {
			System.out.println("->" + bike);
		}
	}

	/**
	 * this method displays the list of car brands present in the list
	 */
	public static void carBrandDisplay() {
		System.out.println("List of Car Brands");
		for (String car : carBrandList) {
			System.out.println("->" + car);
		}
	}
}
