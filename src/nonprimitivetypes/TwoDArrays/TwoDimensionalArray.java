package nonprimitivetypes.TwoDArrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(arr[0][2]);
		System.out.println(arr[1][2]);
		System.out.println(arr[2][2]);
		System.out.println("Array Elements");
		//Iterating array
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		//iterating using single For Loop

		System.out.println("Using Single For Loop");
		int j = 0;
		for(int i=0;i<arr.length;j++) {
			System.out.print(arr[i][j]+ " ");
			
			if(j == 2) {
				i++;
				j=-1;
			}
			
		}
	}

}
