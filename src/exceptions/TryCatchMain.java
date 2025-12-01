package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchMain {
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void add() {
		while(true) {
		try {
			System.out.println("Enter the values");
			int value1 = sc.nextInt();
			int value2=sc.nextInt();
			System.out.println("Sum of Two Numbers "+(value1+value2));
			break;
		} catch (Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}
		}
	}
	
	static void division() {
		
		while(true) {
			try {
				System.out.println("Enter The Values");
				int a = sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a/b);
				break;
			}catch(Exception e) {
				System.out.println("Divisible by Zero not possible");
				sc.nextLine();
			}
		}
	}
	static void polindrome() {
		
		while(true) {
			try {
				System.out.println("Enter the number to check Polindrome");
				int value = sc.nextInt();
				int temp = value;
				int sum =0;
				
				while(temp !=0) {
					int digits= temp % 10;
					sum =(sum*10)+digits; 
					temp = temp /10;
				}
				if(sum == value) {
					System.out.println("Polindrome");
				} else {
					System.out.println("Not Polindrome");
				}
				break;
			} catch(InputMismatchException e) {
				System.out.println("ENter Integers only --InputMissmatchException");
				sc.nextLine();
			}
		}
	}
	public static void main(String[] args) {
		
			division();
			add();
			polindrome();
			
	}

}
