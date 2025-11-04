package nonprimitivetypes;

public class MegeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,40,50};
		int arr1[] = {60,70,80,90};
		
		int nums[] = new int[arr.length + arr1.length];
		
		for(int i = 0; i < arr.length; i++) {
			nums[i] = arr[i];
		}
		for(int j = 0; j < arr1.length; j++) {
			nums[arr.length+j] = arr1[j];
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
