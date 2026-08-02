package com.loanApplication;

public class EducationLoan extends Loan {

	public String collegeName() {
		System.out.println("Enter your Collage Name");
		String cn = sc.nextLine();
		return cn;
	}
	public String courseName() {
		System.out.println("Enter your course name");
		String con = sc.nextLine();
		return con;
	}
	public String countryName(){
		System.out.println("Enter the country name you want to study in");
		String coun = sc.next();
		return coun;
	}
	public double courseFee() {
		System.out.println("Enetr the Fee required for the Course :");
		double couf = sc.nextDouble();
		return couf;
	}
}
