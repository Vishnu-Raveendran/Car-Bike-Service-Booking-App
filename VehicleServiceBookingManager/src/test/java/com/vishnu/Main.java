package com.vishnu;

public class Main {

	public static void main(String[] args) {

		boolean isUserValid = UserLogin.isUsernameValid("vishnu"); // returns true
		boolean isPasswordValid = UserLogin.isPasswordValid("abcd"); // returns true
		boolean isLoginSuccess = UserLogin.login("vishnu", "abcd"); // returns true
		System.out.println(isUserValid + " " + isPasswordValid + " " + isLoginSuccess);

		System.out.println(" ");

		VehicleTypeSelector.addVehicleType("auto");
		VehicleTypeSelector.removeVehicleType("auto");
		VehicleTypeSelector.display();
		boolean d = VehicleTypeSelector.isVehicleTypePresent("auto");
		System.out.println(d);

		System.out.println(" ");

		boolean isPresent1 = VehicleBrandSelector.isVehicleBrandPresent("tata");
		boolean isPresent2 = VehicleBrandSelector.isVehicleBrandPresent("toyota");
		boolean isPresent3 = VehicleBrandSelector.isVehicleBrandPresent("yamaha");
		boolean isPresent4 = VehicleBrandSelector.isVehicleBrandPresent("ktm");
		boolean isPresent5 = VehicleBrandSelector.isVehicleBrandPresent("honda");
		System.out.println(isPresent1 + " " + isPresent2 + " " + isPresent3 + " " + isPresent4 + " " + isPresent5);

		VehicleBrandSelector.addBikeBrand("honda");
		VehicleBrandSelector.addCarBrand("hyundai");
		VehicleBrandSelector.bikeBrandDisplay();
		VehicleBrandSelector.carBrandDisplay();
		VehicleBrandSelector.removeBikeBrand("honda");
		VehicleBrandSelector.removeCarBrand("hyundai");
		VehicleBrandSelector.bikeBrandDisplay();
		VehicleBrandSelector.carBrandDisplay();

		System.out.println(" ");

		VehicleServiceTypeSelector.addBikeService("brake fluid check");
		VehicleServiceTypeSelector.addCarService("electronic works");
		VehicleServiceTypeSelector.showCarServices();
		VehicleServiceTypeSelector.showBikeServices();
		VehicleServiceTypeSelector.removeBikeService("brake fluid check");
		VehicleServiceTypeSelector.removeCarService("electronic works");
		VehicleServiceTypeSelector.showCarServices();
		VehicleServiceTypeSelector.showBikeServices();

	}

}
