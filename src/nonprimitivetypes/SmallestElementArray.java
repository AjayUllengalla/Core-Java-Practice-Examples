package nonprimitivetypes;

public class SmallestElementArray {

	public static void main(String[] args) {


		int arr[] = {12,13,6,14,2,52};
		int result = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] < result) {
				result = arr[i];
			}
		}
	
		
		System.out.println("The Smallest Element in the Array is : "+result);

	}

}
