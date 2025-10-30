package scannerclass;

import java.util.Scanner;

public class EvenOrodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Value ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("The Given Number is Even");
		} else {
			System.out.println("The Given Number is Odd");
		}
		System.out.println("");
		
		
		System.out.print("Enter Another Value " );
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("The Given Number is Even");
		} else {
			System.out.println("The Given Number is Odd");
		}
	}

}
