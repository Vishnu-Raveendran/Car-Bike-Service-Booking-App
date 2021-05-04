package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceChargeManagerForBike {
	
	/**
	 * This method calculates the Service charge for bike
	 */

	@Test
	public void ServiceChargeForBikeTest1(){
		int total = ServiceChargeCalculatorForBike.bikeServiceTotalPrice("standard services");
		assertEquals(1582,total);
	}
	
	@Test
	public void ServiceChargeForBikeTest2(){
		int total = ServiceChargeCalculatorForBike.bikeServiceTotalPrice("bike wash");
		assertEquals(904,total);
	}
	
	@Test
	public void displayBikeStandardService(){
		ServiceChargeCalculatorForBike.showBikeStandardServices();
		
	}
	

}
