package exceptions.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int number =0;
		String str = "Hjs";
		int a =12,b=0;
		try {
			number = sc.nextInt();
			System.out.println(str.equals("Test"));
			System.out.println(a/b);
		}catch(InputMismatchException inputMissmatch) {
			System.out.println("Input miss match Excception");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Heloo");
	}

}
