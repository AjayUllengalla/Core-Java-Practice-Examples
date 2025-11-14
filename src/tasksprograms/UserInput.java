package tasksprograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int userInput;
		
		do {
			System.out.println("Enter The Number to exit");
			 userInput = sc.nextInt();
		} while(userInput !=0);
	}

}
