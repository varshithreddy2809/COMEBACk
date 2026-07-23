package com.comeback;

public class Construtors3 {
	 int id;
	 String name;
	 public Construtors3() {
		 this(101,"Varshith");	
	}
	 
	 Construtors3(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("this is parameterized constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Construtors3 c = new Construtors3();
		c.display();
		System.out.println("main method ended");


	}
 void display() {
	 System.out.println(" id :" + id );
	 System.out.println(" name :" + name );
 }
}
