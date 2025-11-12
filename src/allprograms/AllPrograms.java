package allprograms;

import java.util.Scanner;

public class AllPrograms {

	static Scanner sc = new Scanner(System.in);
	static int choice = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(choice !=6) {
			switch(choice) {
			case 1: {
				reverseInteger();
			}
			case 2 : {
				polindrom();
			}
			case 3: {
				factorial();
			}
			case 5: {
				mainMenu();
			}
			}
		}
	}
	static void mainMenu() {
		System.out.println("1.For Reverse an integer");
		System.out.println("2.For To Check Polindrome");
		System.out.println("3.For Reverse an integer");
		System.out.println("1.For Reverse an integer");
		
		choice = sc.nextInt();
	}
	//submenu to call previous method or redirect to menu method
	static void subMenu() {
		System.out.println("To Test More Enter the: "+ choice);
		System.out.println("5.For Main Menu");
		System.out.println("6.Exit");
		choice = sc.nextInt();
	}
	static void reverseInteger() {
		
		System.out.println("Enter the Integer to Reverse");
		int value =  sc.nextInt();
		int lastDigit =0;
		int reversed = 0;
		while(value !=0) {
			lastDigit = value % 10;
			reversed = (reversed * 10)+lastDigit;
			value = value / 10;
		}
		System.out.println("The Reversed Number is : "+reversed);
		System.out.println();
		subMenu();
	}
	static void polindrom() {
		System.out.println("Enter the Integer to Check Polindrome :");
		int value = sc.nextInt();
		int originalValue = value;
		int resultNumber =0;
		
		while(value != 0) {
			int lastDig = value % 10;
			resultNumber = (resultNumber * 10)+lastDig;
			value = value /10;
		}
		if(resultNumber == originalValue) {
			System.out.println("The Give Number "+ originalValue + " is Polindrome");
		} else {
			System.out.println("Not a Polindrome");
		}
		System.out.println();
		subMenu();
	}
	static void factorial() {
		System.out.println("Enter The Number To Find Factorial:");
		int number = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		System.out.println();
		subMenu();
	}
}
