package exceptions.trycatch;

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
				System.out.println("Enter The Values for division");
				int a = sc.nextInt();
				int b=sc.nextInt();
				System.out.println(a/b);
				break;
			}catch(InputMismatchException inputMismatch) {
				System.out.println("InputMismatchException --Please enter the Number values");
				sc.nextLine();
			}catch(ArithmeticException arthimeticException) {
				arthimeticException.printStackTrace();
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
	static void arrayIndex() {
		int arr[] = {12,6,3,4,8};
		
		while(true) {
			try {
				System.out.println("Enter the index number");
				int index = sc.nextInt();
				System.out.println(arr[index]);
				break;
			} catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBound) {
				System.out.println("Array index not found and give low number");
				sc.nextLine();
			}catch(InputMismatchException inputMismatch) {
				inputMismatch.printStackTrace();
			}
		}
	}
	
	static void evenOrOdd() {
		
		while(true) {
			try {
				System.out.println("Enter The Number to check Even Or Odd");
				int n =sc.nextInt();
				if(n % 2 ==0) {
					System.out.println("Even Number");
				} else {
					System.out.println("Not a Even Number");
				}
				break;
			} catch(Exception e) {
				System.out.println("InputMisMatchException occured Please Enter a Number");
				sc.nextLine();
			}
		}
	}
	
	static void stringItem() {
		System.out.println("Enter The String");
		while(true) {
			try {
				String str = sc.nextLine();
				System.out.println("Enter The Index number");
				int index = sc.nextInt();
				System.out.println(str.charAt(index));
				break;
			} catch(InputMismatchException e) {
				e.printStackTrace();
				sc.nextLine();
			}catch(StringIndexOutOfBoundsException stringIndexBound) {
				System.out.println("StingIndexBoundsException");
				sc.nextLine();
			}
			
		}
	}
	public static void main(String[] args) {
		try {
			stringItem();
			division();
			add();
			polindrome();
			arrayIndex();
			evenOrOdd();
		}finally {
			sc.close();
		}
	}

}
