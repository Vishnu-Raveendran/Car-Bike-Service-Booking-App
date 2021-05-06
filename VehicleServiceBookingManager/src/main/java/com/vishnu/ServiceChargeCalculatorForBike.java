package com.vishnu;

import java.util.ArrayList;

public class ServiceChargeCalculatorForBike {
	
	final static int BIKE_STANDARD_SERVICE_CHARGE = 1400;
	final static int BIKE_WASH_SERVICE_CHARGE = 800;
	
	private static ArrayList<String> bikeStandardServiceList = new ArrayList<String>();

	/**
	 * displays all standard bike services
	 */
	static {
		bikeStandardServiceList.add("Engine oil Change");
		bikeStandardServiceList.add("Oil Filter Change");
		bikeStandardServiceList.add("Air Filter Change");
		bikeStandardServiceList.add("Break Cleaning");
		bikeStandardServiceList.add("Chain Sprocket Testing");
	}
	
	public static void showBikeStandardServices() {
		System.out.println("Bike Standard Services includes:");
		
		for (String service : bikeStandardServiceList) {
			System.out.println(service);
		}
	}

	/**
	 * accepts the serviceType for bike and returns the total amount with GST
	 * 
	 * @param serviceType
	 * @return
	 */
	public static int bikeServiceTotalPrice(String serviceType) {
		int serviceCharge = 0;
		int gst = 0;
		if (serviceType.equalsIgnoreCase("standard services")) {
			serviceCharge = BIKE_STANDARD_SERVICE_CHARGE;
			gst = GstCalculator.getGstForBike(serviceCharge);
			System.out.println("Service charge + GST(13%) = " + (serviceCharge + gst) + " Rs");
		} else {
			System.out.println("Bike Wash");
			System.out.println("-->Foam Wash");
			serviceCharge = BIKE_WASH_SERVICE_CHARGE;
			gst = GstCalculator.getGstForBike(serviceCharge);
			System.out.println("Service charge + GST(13%) = " + (serviceCharge + gst) + " Rs");
		}

		int totalServiceCharge = serviceCharge + gst;
		return totalServiceCharge;
	}

}
