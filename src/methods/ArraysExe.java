package methods;

import java.util.Scanner;

public class ArraysExe {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.print(arrayExample());
		for(int value:arrayExample()) {
			System.out.print(value+ " ");
		}
		System.out.println(" ");
		for(String strValue:arrayEx2()) {
			System.out.print(strValue + " ");
		}
		System.out.println(" ");
		
		
		System.out.println("Please Enter The Array Length ");
		int len = sc.nextInt();
		System.out.println("Enter The Array Elements ");
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		integerArray(arr);
		System.out.print("Array Sum = "+integerArray(arr));
		
	}
	
	static int[] arrayExample() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Length Of Array ");
		int len = sc.nextInt();
		System.out.println("ENter the Array Elements ");
		int num[] = new int[len];
		for(int i=0; i<len; i++) {
			num[i]=sc.nextInt();
		}
		return num;
	}
	
	static String[] arrayEx2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Array Length");
		int len = sc.nextInt();
		
		String strArray[] = new String[len];
		
		for(int i=0; i<len; i++) {
			strArray[i] = sc.next();	
			}
		
		return strArray;
	}

	
	static int integerArray(int arr[]) {
		int value1 =0;
		for(int value:arr) {
			 value1 += value;
		}
		return value1;
		
	}
}
