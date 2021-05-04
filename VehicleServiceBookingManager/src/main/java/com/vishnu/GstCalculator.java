package com.vishnu;

//import java.util.HashMap;

public class GstCalculator {

	final static int GST_FOR_CAR = 18;
	final static int GST_FOR_BIKE = 13;
	
//	static HashMap<String, Integer> GstMap = new HashMap<String, Integer>();
//	
//	static {
//		GstMap.put("CAR", 18);
//		GstMap.put("BIKE", 13);
//		}

	/**
	 * accepts the service charge for car and returns the GST amount(18%)
	 * 
	 * @param totalAmount
	 * @return
	 */
	public static int getGstForCar(int totalAmount) {
		int gstAmount = 0;
		gstAmount = (totalAmount * GST_FOR_CAR) / 100;
		return gstAmount;

	}

	/**
	 * accepts the service charge for bike and returns the GST amount(13%)
	 * 
	 * @param totalAmount
	 * @return
	 */
	public static int getGstForBike(int totalAmount) {
		int gstAmount = 0;
		gstAmount = (totalAmount * GST_FOR_BIKE) / 100;
		return gstAmount;
	}

}
