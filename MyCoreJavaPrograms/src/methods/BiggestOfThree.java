package methods;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Valu1 : ");
		int value1 = sc.nextInt();
		System.out.print("Enter the Valu2 : ");
		int value2 = sc.nextInt();
		System.out.print("Enter the Valu3 : ");
		int value3 = sc.nextInt();
		
		biggestOfThree(value1,value2,value3);
	}
	
	static void biggestOfThree(int value1,int value2,int value3) {
		
		if(value1 > value2 && value1 > value3) {
			System.out.println("The Value1 is Greatest among three numbers");
		} else if(value2 > value1 && value2 > value3) {
			System.out.println("The Given Value2 is Greatest Number ");
		} else {
			System.out.println("The Given Value3 is Greatest Number");
		}
	}

}
