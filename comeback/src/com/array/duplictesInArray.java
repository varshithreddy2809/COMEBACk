package com.array;

import java.util.Scanner;

public class duplictesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[10];
		for(int i =0;i<num.length;i++) {
			System.out.println("Enter the "+(i+1)+" element");
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					System.out.print(num[i]+" ");
					flag=true;
					}
			}
			if(!flag) {
				break;
			}
		}
		sc.close();
	}

}
