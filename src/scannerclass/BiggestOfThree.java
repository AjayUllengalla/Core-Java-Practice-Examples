package scannerclass;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int first;
		int second;
		int third;
		
		System.out.println("Enter First value: ");
		first =sc. nextInt();
		System.out.println("Enter Second value: ");
		second =sc. nextInt();
		System.out.println("Enter Third value: ");
		third =sc. nextInt();
		
		if(first > second && first > third) {
			System.out.println("The Biggest Number is From Three Number : "+ first);
		}

		else if(second > first && second > third) {
			System.out.println("The Biggest Number is From three Numbers : "+ second);
			
		} else {
			System.out.println("The Biggest Number is From Three Numbers : "+ third);
		}

	}

}
