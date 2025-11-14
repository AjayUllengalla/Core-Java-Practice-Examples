package tasksprograms;

import java.util.Scanner;

public class NaturalNumbersDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The range");
		int n = sc.nextInt();
		int naturalNumbers =1;
		
		do {
			if(naturalNumbers == n) {
				System.out.print(naturalNumbers);
			} else {
				System.out.print(naturalNumbers+", ");
			}
			naturalNumbers++;
		} while(naturalNumbers <= n);
	}

}
