package com.loanApplication;

public class PersonalLoan extends Loan {

	public double loanAmount() {
		System.out.println("Enter Hoe much amount you want :");
		double la = sc.nextDouble();
		return la;
	}

	public int loanDuration() {
		System.out.println("Enter the no of months :");
		int ld = sc.nextInt();
		return ld;
	}

	public String reasonForLoan() {
		System.out.println("Enter the reason for loan :");
		String rfl = sc.next();
		return rfl;
	}
}
