package com.loanApplication;

public class HomeLoan extends Loan {

	public double propertyValue() {
		System.out.println("Enter the value for the property");
		double pv = sc.nextDouble();
		return pv;
	}

	public double downPayment() {
		System.out.println("Enter the amount your are willing to pay now :");
		double dp = sc.nextDouble();
		return dp;
	}

	public String propertyLocation() {
		System.out.println("Enter the location of the property :");
		String pl = sc.nextLine();
		return pl;
	}

}
