package IVRMENUEXAMPLES;

import java.util.Scanner;

public class IvrMenuMain {

	static Scanner sc = new Scanner(System.in);
	static int subChoice=8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(subChoice != 7) {
			switch(subChoice) {
			case 1: {
				add();
				break;
				
			}
			case 2: {
				evenOrOdd();
				break;
				
			}
			case 3: {
				
			}
			case 4: {
				
			}
			case 5: {
				
			}
			case 6: {
				
			}
			case 7: {
				System.out.println("Thank You For Using Services");
			}
			case 8: {
				mainMenu();
			}
			}
			
//			if(subChoice == 1) {
//				add();
//			}
//			else if(subChoice == 2) {
//				evenOrOdd();
//			}
//			else if(subChoice == 3) {
//				mainMenu();
//			}
		}
	}

	static void mainMenu() {
		System.out.println("1 for Artimatic Operations");
		System.out.println("2 for EvenOrOdd");
		System.out.println("3 for LeapYear");
		System.out.println("4 for PrimeNumbers");
		System.out.println("5 for Fibanacii");
		
		 subChoice = sc.nextInt();
		
	}
	static void subMenu() {
		System.out.println();
		
		System.out.println( "for More Check enter : "+ subChoice);
		System.out.println("7 for Exit");
		System.out.println(" for MainMenu");
		subChoice  = sc.nextInt();
	}
	static void add() {
		System.out.println("Enter Two Integers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The Sum of Given two integers = "+ (a+b));
		System.out.println("The Subtraction of Given two integers = "+ (a-b));
		System.out.println("The Multiplication of Given two integers = "+ (a*b));
		System.out.println("The Division of Given two integers = "+ (a/b));
		System.out.println("The Modular of Given two integers = "+ (a%b));
		subMenu();
		
	}
	static void evenOrOdd() {
		System.out.println("Enter The range to Find the EvenOrOdd Numbers");
		int range = sc.nextInt();
		for(int i=1; i<=range; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		subMenu();
		}
	static void leapYear() {
		System.out.println("Enter the Year To Check whether it is Leap Or Not: ");
		subChoice = sc.nextInt();
	}
}
