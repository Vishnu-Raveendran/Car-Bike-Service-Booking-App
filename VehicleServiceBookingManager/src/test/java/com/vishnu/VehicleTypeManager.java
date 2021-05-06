package com.vishnu;

import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTypeManager {

	/**
	 * This method checks test case for vehicle type
	 */	
	
	@Test
	public void displayVehicleTypeTest() {
		VehicleTypeSelector.display();
	}

	@Test
	public void isVehiclePresentTest1() {
		String vehicleTypeString = "bike";
		boolean vehicleType = VehicleTypeSelector.isVehicleTypePresent(vehicleTypeString);
		assertTrue(vehicleType);
	}

	@Test
	public void isVehiclePresentTest2() {
		String vehicleTypeString = "car";
		boolean vehicleType = VehicleTypeSelector.isVehicleTypePresent(vehicleTypeString);
		assertTrue(vehicleType);
	}

	@Test
	public void isVehicleTypePresentTest3() {
		String vehicleTypeString = "random";
		boolean vehicleType = VehicleTypeSelector.isVehicleTypePresent(vehicleTypeString);
		assertFalse(vehicleType);
	}

	@Test
	public void addVehicleTypeTest1() {
		boolean isAdded = VehicleTypeSelector.addVehicleType("bicycle");
		assertTrue(isAdded);
	}

	@Test
	public void addVehicleTypeTest2() {
		boolean isAdded = VehicleTypeSelector.addVehicleType("bike");
		assertFalse(isAdded);
	}


	@Test
	public void removeVehicleTypeTest() {
		String vehicleType = "bicycle";
		boolean isRemoved = VehicleTypeSelector.removeVehicleType(vehicleType);
		assertTrue(isRemoved);
	}
	
	@Test
	public void removeRandomVehicleTypeTest() {
		String vehicleType = "random";
		boolean isRemoved = VehicleTypeSelector.removeVehicleType(vehicleType);
		assertFalse(isRemoved);
	}

}
