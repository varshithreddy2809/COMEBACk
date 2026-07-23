package com.oops;


public class vehicleDisplay {

	public static void main(String[]args) {
		vehicleRegistration v1 = new vehicleRegistration();
		v1.setVehicleNo("TG33A7337");
		v1.setVehicleType("BIKE");
		v1.setOwnerName("VARSHITH");
		System.out.println(v1.getVehicleNo());
		System.out.println(v1.getVehicleType());
		System.out.println(v1.getOwnerName());
	}

}
