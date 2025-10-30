package scannerclass;

import java.util.Scanner;

public class DivideByBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Num value: ");
		int num = sc.nextInt();
		
		if(num % 5 == 0 && num % 11 == 0) {
			System.out.println("The Given Number Divided By Both");
		} else {
			System.out.println("The Given Number Not Divided By both");
		}
		
		
	}

}
