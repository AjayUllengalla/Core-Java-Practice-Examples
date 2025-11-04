package methods;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Year: ");
		int num = sc.nextInt();
		
		boolean result = leapYearCheck(num);
		if(result == true) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}
	}
	
	static boolean leapYearCheck(int num) {
		if(num % 4 == 0) {
			if(num % 100 == 0) {
				if(num % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

}

