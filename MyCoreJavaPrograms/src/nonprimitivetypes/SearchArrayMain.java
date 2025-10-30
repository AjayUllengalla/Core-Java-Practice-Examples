package nonprimitivetypes;

public class SearchArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {15,20,40,60,1,2,3,90};
		int searchElement = 1;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == searchElement) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element Not Found");
		}

	}

}
