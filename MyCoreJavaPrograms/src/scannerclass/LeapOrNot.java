package scannerclass;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A year ");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("The Given year "+ year +" is A Leap year");
				} else {
					System.out.println("The Give year "+ year + " is not a leap Year");
				}
			} else {
			System.out.print("The Give year is Leap Year");
			}
		}else {
			System.out.println("The Given year "+ year + " is No a Leap year");
		}
		}

}
