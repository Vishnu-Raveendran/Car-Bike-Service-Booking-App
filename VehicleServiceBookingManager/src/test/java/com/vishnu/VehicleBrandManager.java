package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleBrandManager {

	/**
	 * This method checks the test cases for vehicle brand
	 */

	@Test
	public void isVehiclebrandPresentTest2() {
		String vehicleBrandString = "yamaha";
		boolean vehicleBrand = VehicleBrandSelector.isVehicleBrandPresent(vehicleBrandString);
		assertTrue(vehicleBrand);
	}

	@Test
	public void isVehicleBrandPresentTest3() {
		String vehicleBrandString = "mahindra";
		boolean vehicleBrand = VehicleBrandSelector.isVehicleBrandPresent(vehicleBrandString);
		assertFalse(vehicleBrand);
	}

	@Test
	public void addCarBrandTest() {
		boolean isAdded = VehicleBrandSelector.addCarBrand("renault");
		assertTrue(isAdded);
	}

	@Test
	public void carBrandRemovalTest1() {
		boolean isBrandAdded = VehicleBrandSelector.removeCarBrand("mahindra");
		assertFalse(isBrandAdded);
	}

	@Test
	public void carBrandRemovalTest2() {
		boolean isBrandAdded = VehicleBrandSelector.removeCarBrand("tata");
		assertTrue(isBrandAdded);
	}

	@Test
	public void bikeBrandRemovalTest1() {
		boolean isBrandAdded = VehicleBrandSelector.removeBikeBrand("tvs");
		assertFalse(isBrandAdded);
	}

	@Test
	public void bikeBrandRemovalTest2() {
		boolean isBrandAdded = VehicleBrandSelector.removeBikeBrand("yamaha");
		assertTrue(isBrandAdded);
	}

	@Test
	public void displayBikeBrandTest() {
		VehicleBrandSelector.bikeBrandDisplay();
	}

	@Test
	public void displayCarBrandTest() {
		VehicleBrandSelector.carBrandDisplay();
	}

}
