package methods;

import java.util.Scanner;

public class LargestElementArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The range: ");
		int range = sc.nextInt();
		int arr[] = new int[range];
		System.out.println("Enter The Array Elements: ");
		for(int i=0; i<range;i++) {
			arr[i]=sc.nextInt();
		}
		int result = largestElement(arr);
		System.out.println("The Largest Element is : "+ result);
	}
	static int largestElement(int nums[]) {
		int largestValue = 0;
		int temp = 0;
		for(int i=0; i<nums.length; i++) {
			for(int j=1; j<nums.length; j++) {
				if(nums[i] > nums[j] && nums[i] > temp) {
					largestValue = nums[i];
				}
			}
		}
		return largestValue;
		
	}
}
