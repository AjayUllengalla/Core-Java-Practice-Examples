package tasksprograms;

public class SumOfDigits {

	public static void main (String[] args) {

		int num = 536;
		int sum = 0;
		
		do {
			int temp = num % 10;
			sum =sum + temp;
			num = num /10;
		} while(num !=0);
		
		System.out.println("The Sum of Digits "+sum);
	}
}
