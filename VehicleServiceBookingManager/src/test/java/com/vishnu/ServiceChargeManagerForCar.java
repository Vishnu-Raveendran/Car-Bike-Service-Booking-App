package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceChargeManagerForCar {

	/**
	 * This method checks test case for Service charge for car
	 */

	@Test
	public void carServiceTotalChargeTest1() {
		int totalAmount = ServiceChargeCalculatorForCar.carServiceTotalPrice("standard services");
		assertEquals(4720, totalAmount);
	}

	@Test
	public void carServiceTotalChargeTest2() {
		int totalAmount = ServiceChargeCalculatorForCar.carServiceTotalPrice("Ac service");
		assertEquals(2360, totalAmount);
	}

	@Test
	public void displayCarStandardServices() {
		ServiceChargeCalculatorForCar.showCarStandardServices();
	}

	@Test
	public void displayCarAcServices() {
		ServiceChargeCalculatorForCar.showCarAcServices();
	}

}
