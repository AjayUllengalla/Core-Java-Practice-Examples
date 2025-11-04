package nonprimitivetypes;

public class LargestElementArray {

	public static void main(String[] args) {
		
		int arr[] = {20,2,5,11,13,15,60,90};
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
			if(arr[i] > arr[j] && arr[i] > result) {
				result = arr[i];
			}
		}
		}
		System.out.println("The Largest Element in the Array is : "+result);
	}

}
