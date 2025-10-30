package methods;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("ENter the Array Length : ");
		int range = sc.nextInt();
		
		int num[] = new int[range];
		System.out.print("Enter The Array Elements: ");
		for(int i=0; i<range; i++) {
			num[i] =sc.nextInt();
		}
		System.out.println("Array Elements: ");
		arrayMethod(num);
	}

	static void arrayMethod(int num[]) {
		
		for(int i=0; i<num.length; i++) {
			System.out.print( num[i]+ " ");
		}
		
		
		
	}
}
