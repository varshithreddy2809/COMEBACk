package com.oops;

public class classOne {
	private String studentName;
	private int studentRollNo;
	private String department;
	private String course;
	
	public void setStudentName(String studentName) {
		this.studentName = studentName+"-name";
	}
	public String getStudentName(){
		return studentName;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public int getStudentRollNo(){
		return studentRollNo;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment(){
		return department;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse(){
		return course;
	}
	
}
