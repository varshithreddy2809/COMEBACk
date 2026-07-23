package com.oops;

public class employeeTwo {

	public static void main(String[] args) {
		employee e1 = new employee() ;
			e1.setEmployeeName("Reddy");
			e1.setEmployeeId(1);
			e1.setSalary(100000);
			e1.setDepartment("Salesman");
		
			System.out.println(e1.getEmployeeName());
			System.out.println(e1.getEmployeeId());
			System.out.println(e1.getSalary());
			System.out.println(e1.getDepartment());
			
		
	}

}
