package com.collections;

public class Student {

	
	
	int id;
	String Name;
	
	Student(int ide,String Nam){
		this.id= ide;
		this.Name=Nam;
	}
	@Override
	public boolean equals(Object obj) {

	    Student s = (Student) obj;

	    return this.id == s.id &&
	           this.Name.equals(s.Name);
	}

}
