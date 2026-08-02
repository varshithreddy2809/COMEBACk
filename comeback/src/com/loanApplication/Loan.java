package com.loanApplication;

import java.util.Scanner;

public class Loan {

	Scanner sc = new Scanner(System.in);

	public String getCustomerName() {
		System.out.println("Enter your Name :");
		String customerName = sc.next();
		return customerName;
	}

	public int getCibilScore() {
		System.out.println("Enter your cibil Score :");
		int cibilScore = sc.nextInt();
		return cibilScore;
	}

	public int getage() {
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		return age;
	}

	public String getgender() {
		System.out.println("Enter your Gender :");
		String gender = sc.next();
		return gender;
	}

	public String getmail() {
		System.out.println("Enter your g-mail :");
		String mail = sc.next();
		return mail + "@gmail.com";
	}

	public String getpanNumber() {
		System.out.println("Enter your Pan number :");
		String panNo = sc.next();
		return panNo;
	}

	public long getaadharNumber() {
		System.out.println("Enter your aadhar number :");
		long aadharNo = sc.nextLong();
		return aadharNo;
	}

	public String getoccupation() {
		System.out.println("Enter your Occupation :");
		String occ = sc.next();
		return occ;
	}

	public double getincome() {
		System.out.println("Enter your Income per annum :");
		double Income = sc.nextDouble();
		return Income;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Loan l1 = new Loan();
		System.out.println("Welcome to Loan Bank !");
		String customerName = l1.getCustomerName();
		int age = l1.getage();
		double Income = l1.getincome();
		int cibilScore = l1.getCibilScore();

		if (age > 18 && Income > 100000.00 && cibilScore > 300 && cibilScore < 900) {
			System.out.println("Congratulations " + customerName + " your eligible for loan");
			System.out.println(l1.getaadharNumber());
			System.out.println(l1.getpanNumber());
			System.out.println(l1.getgender());
			System.out.println(l1.getoccupation());
			System.out.println(l1.getmail());
		} else {
			System.out.println("Not Eligible for loan");
		}

		System.out.println(
				"Enter the Type of loan you requried(for Education press 1,for Home press 2,for persnnal press 3,for vehicle loan press 4)");
		int loanType = sc.nextInt();
		if (loanType == 1) {
			EducationLoan el = new EducationLoan();
			el.collegeName();
			el.countryName();
			el.courseName();
			el.courseFee();

		} else if (loanType == 2) {
			HomeLoan hl = new HomeLoan();
			hl.downPayment();
			hl.propertyLocation();
			hl.propertyValue();
		} else if (loanType == 3) {
			PersonalLoan pl = new PersonalLoan();
			pl.loanAmount();
			pl.loanDuration();
			pl.reasonForLoan();
		} else if (loanType == 4) {
			VehicleLoan vla = new VehicleLoan();
			vla.vehicleType();
			vla.vehicleType();
			vla.dealerName();
		} else {
			System.out.println("Entered Invalid in put");
		}
		sc.close();
	}

}
