package nonprimitivetypes;

public class SumOfArray {

	public static void main(String[] args) {


		int arr[] = {20,1,2,3,5,70,80};
		
		int result =0;
		
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println(result);

	}

}
