package com.nonprimitivetypes;


import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length of array");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter The Array Elements: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		int result = secondLargest(arr);
		System.out.println("The Second Largest Element is array: "+ result);
		
		result = sortArray(arr);
		System.out.println("Using sort method:"+ result);
	}
	static int secondLargest(int[] arr) {
		int secondLargest =0;
		int temp=0;
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i] > arr[j] && arr[i] > temp) {
					temp = arr[i];
				} if(arr[i]<arr[j] && secondLargest < temp) {
					secondLargest = arr[j];
				}
			}
		}
		return secondLargest;
	}
	
	static int sortArray(int[] arr) {
		int secondLargest =0;
		Arrays.sort(arr);
		secondLargest = arr.length-1;
		return secondLargest;
	}

}
