package com.loanApplication;

public class VehicleLoan extends Loan {

	public String vehicleType() {
		System.out.println("Enter your Vechile Type");
		String vt = sc.next();
		return vt;
	}

	public double vehiclePrice() {
		System.out.println("Enter your Vechile Price");
		double vp = sc.nextDouble();
		return vp;
	}

	public String dealerName() {
		System.out.println("Enter your Dealer Name");
		String dn = sc.next();
		return dn;
	}

}
