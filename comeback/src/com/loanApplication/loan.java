package com.loanApplication;

import java.util.Scanner;

public class loan {

	Scanner sc = new Scanner(System.in);

	public String getCustomerName() {
		System.out.println("Enter your Name :");
		String customerName = sc.next();
		return customerName;
	}

	public int getCibilScore() {
		System.out.println("Enter your cibil Score ");
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
		loan l1 = new loan();
		System.out.println("Welcome to Loan Bank !");
		System.out.println(l1.getCustomerName());
		System.out.println(l1.getmail());
	}
}
