package nonprimitivetypes;

public class AscendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50,45,85,12,1,10};
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length-1; j++) {
				if(arr[i] > arr[j+1]) {
					temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
