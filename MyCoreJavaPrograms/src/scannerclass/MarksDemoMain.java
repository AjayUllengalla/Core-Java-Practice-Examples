package scannerclass;

import java.util.Scanner;

public class MarksDemoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENter The Marks: ");
int marksMemo = sc.nextInt();
		
		if(marksMemo >= 90) {
			System.out.println("A");
		} else if(marksMemo >= 75) {
			System.out.println("B");
		} else if(marksMemo >= 60) {
			System.out.println("C");
		} else if(marksMemo >= 45) {
			System.out.println("D");
		} else {
			System.out.println("Failed");
		}

	}
}
