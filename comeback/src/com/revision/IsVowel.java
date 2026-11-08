package com.revision;
import java.util.Scanner;

public class IsVowel {
	
	public static boolean isVowelorNot(char d) {
		boolean status = false;
		if(d == 'a' || d=='e' || d=='i' ||d=='o' || d== 'u') {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
			System.out.println("Enter a character :");
			char a = sc.next().charAt(0);
			
			boolean result = isVowelorNot(a);
			if(result) {
				System.out.println("Enteres Char is Vowel ");
			}else {
				System.out.println("Entered char is constant");
			}
			sc.close();
		
		
	}

}
