package exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemoMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num =0;
		System.out.println("Enter a Number");
		try {
			num = sc.nextInt();
			String str = null;
			System.out.println(str.equals("test"));
			
		}
		catch(InputMismatchException inputMissmatchException) {
			System.out.println(inputMissmatchException.getMessage());
			System.out.println("Enter a Number value inputMissmatchException");
			inputMissmatchException.printStackTrace();
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("String as null value-NullPointerException");
			
		}
		System.out.println(num);
	}

}
