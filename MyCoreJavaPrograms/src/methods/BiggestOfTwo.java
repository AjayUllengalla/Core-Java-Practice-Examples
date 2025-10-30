package methods;

import java.util.Scanner;

public class BiggestOfTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter input1 value ");
		int input1 = sc.nextInt();
		System.out.print("ENter input2 value ");
		int input2 = sc.nextInt();
		boolean result = bigOfTwo(input1,input2);
		
		if(result == true) {
		System.out.print("The Given Number "+ input1 + " is biggest value ");
		} else {
			System.out.print("The Given Number "+ input2 + " is biggest value ");
		}
	}
	static boolean bigOfTwo(int a, int b) {
		
		if(a > b) {
			return true;
		}
		return false;
	}
}
