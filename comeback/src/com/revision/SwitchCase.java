package com.revision;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the operation you want to perfrom !");
		System.out.println(" Press 1 for addtion .  2 for multiplication   3 for subtraction    4 for division      5 for modulus");
		int n = sc.nextInt();
		
		switch(n) {
		
		case 1 : System.out.println("Enter a Number"); 
				 int a = sc.nextInt();
				 System.out.println("Enter another Number"); 
				 int b = sc.nextInt();
				 System.out.println("The sum of " + a + "a nd " + b + " is : " + (a+b));
				 break;
		case 2 : System.out.println("Enter a Number"); 
		         int c = sc.nextInt();
		         System.out.println("Enter another Number"); 
		         int d = sc.nextInt();
		         System.out.println("The product of " + c + " and " + d + " is : " + (c*d));	
		         break;
		case 3 : System.out.println("Enter a Number"); 
				 int e = sc.nextInt();
				 System.out.println("Enter another Number"); 
				 int f = sc.nextInt();
				 System.out.println("The difference of " + e + " and " + f + " is : " + (e-f));  
				 break;
		case 4 : System.out.println("Enter a Number"); 
		   		 int g = sc.nextInt();
		   		 System.out.println("Enter another Number"); 
		   		 int h = sc.nextInt();
		   		 System.out.println("The quotient of " + g + " and " + h + " is : " + (g/h));	
		   		break;
		case 5 : System.out.println("Enter a Number"); 
  		  		 int i = sc.nextInt();
  		  		 System.out.println("Enter another Number"); 
  		  		 int j = sc.nextInt();
  		  		 System.out.println("The mod of " + i + " and " + j + " is : " + (i%j));  
  		  		 break;
  		default :System.out.println("Entered invalid input");  		 
				 
		
		}
		
	}

}
