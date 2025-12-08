package exceptions.thowthrows;

import java.util.Scanner;

public class ThrowThrowsUsage {
static Scanner sc = new Scanner(System.in);
	 void validation() throws ThrowThrowsExample {
		 System.out.println("Enter The Age");
		int age = sc.nextInt();
		
		if(age < 18) {
			throw new ThrowThrowsExample("Age must be grater than 18 ");
		} else {
			System.out.println("Excuted");
		}
	}
	 
	 void division() throws ThrowThrowsExample{
		 System.out.println("Entr the Numarator");
		int numa =sc.nextInt();
		System.out.println("Enter The Denominataor");
		 int denom=sc.nextInt();
		 if(denom == 0) {
			 throw new ThrowThrowsExample("Denominator should greater than 0");
		 }
	 }
	 
}
