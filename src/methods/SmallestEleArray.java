package methods;

import java.util.Scanner;

public class SmallestEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	int smallest = 0;
	int temp = nums[0];
	for(int i=0; i<nums.length; i++) {
		
			if(nums[i] < temp) {
				temp = nums[i];
			}
			smallest = temp;
	
	}
	return smallest;
	
}
}
