package methods;

import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Range Of Array: ");
		int range = sc.nextInt();
		
		System.out.println("Enter The Array Elements: ");
		int arr[] = new int[range];
		
		for(int i=0; i<range; i++) {
			arr[i] = sc.nextInt();
		}
		arraySort(arr);
		
	}

	static void arraySort(int arr[]) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length-1;j++) {
				if(arr[i] > arr[j+1]) {
					temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int value:arr) {
			System.out.print(value+" " );
		}
	}
}
