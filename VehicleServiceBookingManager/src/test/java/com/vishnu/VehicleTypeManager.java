package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTypeManager {

	/**
	 * This method checks test case for vehicle type
	 */

	@Test
	public void isBikePresentTest() {
		String vehicleTypeString = "bike";
		boolean vehicleType = VehicleTypeSelector.isVehicleTypePresent(vehicleTypeString);
		assertTrue(vehicleType);
	}

	@Test
	public void isCarPresentTest() {
		String vehicleTypeString = "car";
		boolean vehicleType = VehicleTypeSelector.isVehicleTypePresent(vehicleTypeString);
		assertTrue(vehicleType);
	}

	@Test
	public void isVehicleTypeAvailableTest() {
		String vehicleTypeString = "random";
		boolean vehicleType = VehicleTypeSelector.isVehicleTypePresent(vehicleTypeString);
		assertFalse(vehicleType);
	}

	@Test
	public void addVehicleTypeTest() {
		boolean isAdded = VehicleTypeSelector.addVehicleType("bicycle");
		assertTrue(isAdded);
	}

	@Test
	public void addBikeTest() {
		boolean isAdded = VehicleTypeSelector.addVehicleType("bike");
		assertFalse(isAdded);
	}

	@Test
	public void displayTest() {
		VehicleTypeSelector.display();
	}

	@Test
	public void removeVehicleTypeTest() {
		String vehicleType = "12wwdaw";
		boolean isRemoved = VehicleTypeSelector.removeVehicleType(vehicleType);
		assertFalse(isRemoved);
	}

	@Test
	public void removeExistingVehicleTypeTest() {
		String vehicleType = "bike";
		boolean isRemoved = VehicleTypeSelector.removeVehicleType(vehicleType);
		assertTrue(isRemoved);
	}

}
