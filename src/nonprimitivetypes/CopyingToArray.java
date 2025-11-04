package nonprimitivetypes;

public class CopyingToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,50,60};
		
		int num[] = new int[arr.length];

		for(int i = 0; i < arr.length; i++) {

				num[i] = arr[i];
			
		}
		
			for(int j = 0 ; j < num.length; j++) {
				System.out.print(num[j]+ " ");
			}
		
	}

}
