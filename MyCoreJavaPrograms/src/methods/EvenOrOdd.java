package methods;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value ");
		int num = sc.nextInt();
		
		boolean result = evenOrOdd(num);
		
		if(result == true) {
			System.out.println("The Given numbber is Even");
		} else {
			System.out.println("The Given Number is Odd");
		}
	}
	
	static boolean evenOrOdd(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}

}
