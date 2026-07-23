package com.comeback;

public class Constuctors {
	
	int age;
	String name;
	long phoneNumber;
	int section;
	void show(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(phoneNumber);
		System.out.println(section);
	}

	Constuctors(){
		System.out.println("This is  No Arg constuctor ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constuctors c1 = new Constuctors();
		c1.age=21;
		c1.name="varshith";
		c1.phoneNumber=9963925514L;
		c1.section=2;
		c1.show();
		
		Constuctors c2 = new Constuctors();
		c2.age=22;
		c2.name="Kumar";
		c2.phoneNumber=9963934567L;
		c2.section=4;
		c2.show();
	}
}
