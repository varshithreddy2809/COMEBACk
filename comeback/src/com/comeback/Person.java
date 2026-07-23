package com.comeback;

public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public static void main(String[] args) {
		System.out.println("Min method Started");
		Person p = new Person("Varshith",21);
		p.info();
		Person p1 = new Person("Kumar",22);
		p1.info();
		Person p2 = new Person("Reddy",23);
		p2.info();
		System.out.println("Main method ended");
		
			
	}
	void info(){
		System.out.println("Name of the Person :" + name);
		System.out.println(" age of the Person :" + age);
	}
	}

