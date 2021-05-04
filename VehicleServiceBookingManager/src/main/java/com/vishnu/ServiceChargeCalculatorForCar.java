package com.vishnu;

import java.util.ArrayList;

public class ServiceChargeCalculatorForCar {

	final static int CAR_STANDARD_SERVICE_CHARGE = 4000;
	final static int CAR_AC_SERVICE_CHARGE = 2000;

	static ArrayList<String> carStandardServiceList = new ArrayList<String>();
	static ArrayList<String> carAcServicesList = new ArrayList<String>();

	static {
		carStandardServiceList.add("Engine oil change");
		carStandardServiceList.add("Oil filter change");
		carStandardServiceList.add("Air filter change");
		carStandardServiceList.add("Coolant topup");

		carAcServicesList.add("Blower and vent Cleaning");
		carAcServicesList.add("Ac gas Pressure Checking");
		carAcServicesList.add("Ac gas Leak Checking");
		carAcServicesList.add("Dust Removal");
	}

	/**
	 * displays all services included in Standard Services for car
	 */
	public static void showCarStandardServices() {
		System.out.println("Car Standard Service includes: ");

		for (String services : carStandardServiceList) {
			System.out.println(services);
		}
	}

	/**
	 * displays services included in AC services for car
	 */
	public static void showCarAcServices() {
		System.out.println(" Car Ac Services Includes: ");

		for (String services : carAcServicesList) {
			System.out.println(services);
		}

	}

	/**
	 * Accepts the service type for car and returns the total amount with GST
	 * 
	 * @param serviceType
	 * @return
	 */
	public static int carServiceTotalPrice(String serviceType) {
		int serviceCharge = 0;
		int gst = 0;
		if (serviceType.equalsIgnoreCase("standard services")) {
			serviceCharge = CAR_STANDARD_SERVICE_CHARGE;
			gst = GstCalculator.getGstForCar(serviceCharge);
			System.out.println("Service charge + GST(18%) = " + (serviceCharge + gst) + " Rs");
		} else {
			serviceCharge = CAR_AC_SERVICE_CHARGE;
			gst = GstCalculator.getGstForCar(serviceCharge);
			System.out.println("Service charge + GST(18%) = " + (serviceCharge + gst) + " Rs");
		}

		int totalServiceCharge = serviceCharge + gst;
		return totalServiceCharge;
	}
}
