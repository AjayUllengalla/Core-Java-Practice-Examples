package tasksprograms;

import java.util.Scanner;

public class FactorialRecursive {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number to print Foctorial of a number");
		int userInput = sc.nextInt();
		
		System.out.println(factorial(userInput));
		
	}

	static int factorial(int value) {
		
		
		if(value == 1)
			return 1;
		return value * factorial(value-1);
		
	}
}
