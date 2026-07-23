package com.comeback;
import java.util.Scanner;

public class projectOne {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number fro below value");
		System.out.println("1.Pizza 2.Burger 3.Drinks");
		int itemNum =sc.nextInt();
		switch(itemNum) {
		case 1:
			System.out.println("This is Pizza menu");
			System.out.println("Slect what you want");
			System.out.println("1.Veg Pizza 2.Chicken Pizza");
			int pizza = sc.nextInt();
			switch(pizza) {
			case 1:
				System.out.println("Veg Pizza");
				break;
			case 2:
				System.out.println("Chicken Pizza");
				break;
				default :
					System.out.println("entered item is not in menu");
			}
			break;
		case 2:
			System.out.println("This is Burgers menu");
			System.out.println("Slect what you want");
			System.out.println("1.Veg burger 2.cheese burgeer");
			int burger = sc.nextInt();
			switch(burger) {
			case 1:
				System.out.println("Veg burger");
				break;
			case 2:
				System.out.println("cheese burgeer");
				break;
			default :
				System.out.println("entered item is not in menu");
			}
			break;
		case 3:
			System.out.println("This is Drinks menu");
			System.out.println("Slect what you want");
			System.out.println("1.Coke 2. Juice");
			int drinks = sc.nextInt();
			switch(drinks) {
			case 1:
				System.out.println("Coke");
				break;
			case 2:
				System.out.println("Juice");
				break;
			default :
				System.out.println("entered item is not in menu");
			}
			break;
		default :
			System.out.println("entered item is not in menu");
			
		}
		sc.close();
	}

}
