package scannerclass;

import java.util.Scanner;

public class PersonEligibleOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Age : ");
		int age = sc.nextInt();
		
		System.out.print("Enter The Course : ");
		String  dept = sc.next();
		
		if( age >= 21 && dept.equals("BTech")) {
			
				System.out.println("Eligible for the Job");
		} else {
			System.out.println("Not Eligible For The Job");
		}

	}

}
