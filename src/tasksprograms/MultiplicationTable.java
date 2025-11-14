package tasksprograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Table Number to Print");
		int value = sc.nextInt();
		int i = 1;
		
		do {
			System.out.println(value + " x "+i+" = "+(value*i));
			i++;
		}while(i<=10);
	}

}
