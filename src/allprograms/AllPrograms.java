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
			case 5: {
				mainMenu();
			}
			}
		}
	}
	static void mainMenu() {
		System.out.println("1.For Reverse an integer");
		System.out.println("1.For To Check Polindrome");
		System.out.println("1.For Reverse an integer");
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
		System.out.println(" ");
		subMenu();
	}
	static void polindrom() {
		
	}
}
