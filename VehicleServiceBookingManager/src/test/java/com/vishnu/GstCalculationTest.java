package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class GstCalculationTest {
	
	/**
	 * This method checks if the GST is calculated 
	 */

	@Test
	public void test1() {
		int gst = GstCalculator.getGstForBike(2000);
		assertEquals(260, gst);
	}
	
	@Test
	public void test2() {
		int gst = GstCalculator.getGstForCar(4000);
		assertEquals(720, gst);
	}
}
