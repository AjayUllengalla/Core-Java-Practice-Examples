package scannerclass;

import java.util.Scanner;

public class ScannerDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		System.out.println("The Sum of "+ a + " + "+ b + " = "+(a+b));
		System.out.println("The Sum of "+ a + " - "+ b + " = "+(a-b));
		System.out.println("The Sum of "+ a + " * "+ b + " = "+(a*b));
		System.out.println("The Sum of "+ a + " / "+ b + " = "+(a/b));
	}

}
