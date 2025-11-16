package allprograms;

import java.util.Scanner;

public class AllPrograms {

	static Scanner sc = new Scanner(System.in);
	static int choice = 7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//				reverseInteger();
//				
//				polindrom();
//			
//				factorial();
//			
//				evenOrOdd();
//			
//				fibnacciNumber();
//				System.out.println("Enter The Number to check postive or Negative");
//				int n = sc.nextInt();
//				System.out.println(checkPostiveOrNegative(n));
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				swapWithoutTemp( a,b) ;
//		System.out.println("To Check the number is Strong or Not");
//				int value = sc.nextInt();
//				
//				System.out.println(strongNumber(value));
//				System.out.println("Enter The Number to get factorial");
//				int fact = sc.nextInt();
//				System.out.println(factorial(fact));
//				factorial(value);
//				mainMenu();
				System.out.println("Enter 3 Digit number for check ArmStrong or not");
				int armStrong = sc.nextInt();
				armstrong(armStrong);
	}
	
//	static void mainMenu() {
//		System.out.println("1.For Reverse an integer");
//		System.out.println("2.For To Check Polindrome");
//		System.out.println("3.For Reverse an integer");
//		System.out.println("4.For Reverse an integer");
//		System.out.println("5.For Reverse an integer");
//		
//		choice = sc.nextInt();
//	}
	
	//submenu to call previous method or redirect to menu method
//	static void subMenu() {
//		System.out.println("To Test More Enter the: "+ choice);
//		System.out.println("7.For Main Menu");
//		System.out.println("9.Exit");
//		choice = sc.nextInt();
//	}
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
//		subMenu();
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
//		subMenu();
	}
	static void factorial() {
		System.out.println("Enter The Number To Find Factorial:");
		int number = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=number;i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of Given Number is : "+fact);
		System.out.println();
//		subMenu();
	}
	
	static void evenOrOdd() {
		System.out.println("1.For Specific Number for Even Or Odd ");
		System.out.println("2.To Print Even Numbers in Range ");
		int subChoice = sc.nextInt();
		
		if(subChoice == 1) { //Used to check to Number
			System.out.println("Ente The Number To Check Even Or Odd");
			int num = sc.nextInt();
			if( num % 2 ==0) {
				System.out.println("The Given Number is Even NUmber");
			} else {
				System.out.println("The Given Number is Odd Number");
			}
		} else { // It prints even numbers in range
			System.out.println("Ente The Number To Check Even Or Odd in range");
			int num = sc.nextInt();
			System.out.println("Even Numbers: ");
			for(int i=1;i<=num;i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		
		System.out.println();
//		subMenu();
	}
	
	static void fibnacciNumber() {
		int initialValue =0;
		int currentValue =1;
		
		System.out.println("Enter the range to print fibonacci series");
		int range = sc.nextInt();
		
		System.out.print(initialValue+","+currentValue+", ");
		int result = 0;
		for(int i=1;i<=range;i++) {
			result = initialValue + currentValue;
			initialValue = currentValue;
			currentValue = result;
			if(i == range) {
				System.out.print(result);
			} else {
				System.out.print(result+", ");
			}
		}
		System.out.println();
//		subMenu();
	}
	
	static String checkPostiveOrNegative(int n) {
		String result =" ";
		
		if(n >0) {
			result ="Postive";
		} else {
			result = "Negative";
		}
		return result;
	}
	
	static void swapWithoutTemp(int a,int b) {
		System.out.println("The Value Of a  before Swap :"+ a);
		System.out.println("The Value Of b before Swap: "+ b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The Value Of a  after Swap :"+ a);
		System.out.println("The Value Of b after Swap: "+ b);
		
	}
	static boolean strongNumber(int value) {
		int temp = value;
		int fact =0;
		int res =0;
		boolean flag = false;
		while(temp !=0) {
			fact = temp % 10;
			res = res + (int)factorial(fact);
			temp = temp /10;
		}
		if(res == value) {
			flag = true;
		} else {
			flag=false;
		}
		return flag;
	}
	
	static int factorial(int n) {
		
		if(n == 1)
			return 1;
		
		return n*factorial(n-1);
	}
	static void armstrong(int value) {
		int temp= value;
		int resValue=0;
		while(temp !=0) {
			int digit = temp %10;
			resValue = resValue + (digit * digit *digit);
			temp = temp /10;
		}
		if(resValue == value) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not a ArmStrong Number");
		}
	}
}
