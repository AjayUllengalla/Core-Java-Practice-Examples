package Conditional.loops;

public class PatternsMain {

	public static void main(String[] args) {
		
		int row = 5;
		int columns = 5;
		
		
		for(int i = 1; i <= row; i++){
		    for(int j = i; j <= columns; j++){
		        System.out.print(" ");
		    }
		    for(int k = 1; k <= i -1; k++){
		        System.out.print("*");
		    }
		    for(int l = 1; l <= i; l++){
		        System.out.print("*");
		    }
		  System.out.println();
		}
		

	}

}
