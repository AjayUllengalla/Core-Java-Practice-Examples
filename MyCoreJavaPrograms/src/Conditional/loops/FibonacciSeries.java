package Conditional.loops;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0 , num2 = 1 ;
		int result;
		System.out.print(num1 + " "+ num2 + " ");
		for(int i =0 ; i<=10;i++) {
			result = num1 + num2;
			System.out.print(result + " ");
			num1 = num2;
			num2 = result;
			
		}
		
	}

}
