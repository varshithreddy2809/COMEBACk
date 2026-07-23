package com.oops;

public class classTwo {
	public static void main(String[] args) {
		classOne c1 = new classOne();
		c1.setStudentName("Varshith");
		c1.setStudentRollNo(22);
		c1.setDepartment("CSE");
		c1.setCourse("B.Tech");
		classOne c2 = new classOne();
		c2.setStudentName("Kumar");
		c2.setStudentRollNo(21);
		c2.setDepartment("D");
		c2.setCourse("B.Pram");
		System.out.println(c1.getStudentName());
		System.out.println(c1.getStudentRollNo());
		System.out.println(c1.getDepartment());
		System.out.println(c1.getCourse());
		System.out.println(c2.getStudentName());
		System.out.println(c2.getStudentRollNo());
		System.out.println(c2.getDepartment());
		System.out.println(c2.getCourse());
	}
}