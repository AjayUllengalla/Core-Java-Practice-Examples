package Conditional.loops;

public class SumOfDigitsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int digit = 84563, result = 0;
		
		while(digit != 0) {
			
			result += digit % 10;
			digit = digit / 10;
			
		}
		System.out.println("The Sum Of Digits : "+result);

	}

}
