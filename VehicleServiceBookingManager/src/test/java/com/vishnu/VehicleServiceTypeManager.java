package com.vishnu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VehicleServiceTypeManager {

	/**
	 * this method checks the test case for Vehicle service type
	 */

	@Test
	public void displayBikeServiceTest() {
		VehicleServiceTypeSelector.showBikeServices();
	}

	@Test
	public void displayCarServiceTest() {
		VehicleServiceTypeSelector.showCarServices();
	}

	@Test
	public void addCarServiceTypeTest() {
		boolean isAdded = VehicleServiceTypeSelector.addCarService("Battery replacement");
		assertTrue(isAdded);
	}

	@Test
	public void addCarServiceTypeTest1() {
		boolean isAdded = VehicleServiceTypeSelector.addCarService("standard services");
		assertFalse(isAdded);
	}

	@Test
	public void addBikeServiceTypeTest() {
		boolean isAdded = VehicleServiceTypeSelector.addBikeService("Tyre replacement");
		assertTrue(isAdded);
	}

	@Test
	public void addBikeServiceTypeTest1() {
		boolean isAdded = VehicleServiceTypeSelector.addBikeService("bike wash");
		assertFalse(isAdded);
	}

	@Test
	public void isCarServiceAvailable() {
		boolean isPresent = VehicleServiceTypeSelector.isServicePresent("standard services");
		assertTrue(isPresent);
	}

	@Test
	public void isBikeServiceAvailableTest1() {
		boolean isPresent = VehicleServiceTypeSelector.isServicePresent("bike wash");
		assertTrue(isPresent);
	}

	@Test
	public void isBikeServiceAvailableTest2() {
		boolean isPresent = VehicleServiceTypeSelector.isServicePresent("random test");
		assertFalse(isPresent);
	}

	@Test
	public void removeBikeServiceTest() {
		boolean isRemoved = VehicleServiceTypeSelector.removeBikeService("bike wash");
		assertTrue(isRemoved);
	}

	@Test
	public void removeCarServiceTest() {
		boolean isRemoved = VehicleServiceTypeSelector.removeCarService("random test");
		assertFalse(isRemoved);
	}

}
