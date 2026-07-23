package com.comeback;

public class Constructors2 {
	
	int age;
	String name;
	long number;
	int section;
	
	Constructors2(int age,String name,long number,int section){
		this.age=age;
		this.name=name;
		this.number=number;
		this.section=section;
		System.out.println("this is parameterized constructor");
	}

	public static void main(String[] args) {
		Constructors2 c1 = new Constructors2(21,"Varshith",9963925514L,2);
		c1.show();
		Constructors2 c2 = new Constructors2(22,"Varshi",99639254L,3);
		c1.show();
		Constructors2 c3 = new Constructors2(23,"Kumar",99639214L,4);
		c1.show();
	}
	void show(){
		System.out.println( age );
		System.out.println(name);
		System.out.println(number);
		System.out.println(section);
	}

}
