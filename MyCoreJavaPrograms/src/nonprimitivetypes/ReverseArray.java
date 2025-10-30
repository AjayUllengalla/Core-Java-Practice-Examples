package nonprimitivetypes;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,10,15,25,60};
		int start = 0;
		int end = arr.length - 1;
		int temp = 0;
		
	for( int i = start; i < arr.length; i++) {
		for(int j = end; j >= 0; j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
		
		for( int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + "  " );
		}
		
		
	}

}
