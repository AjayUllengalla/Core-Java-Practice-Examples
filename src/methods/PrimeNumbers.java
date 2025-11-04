package methods;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The value : ");
	int num = sc.nextInt();
		 primeNumbers(num);
		
//		System.out.print(result1);
	}
	
	static void primeNumbers(int num) {
		int flag =0;
		int result = 0;
		for(int i=1; i<= num; i++) {
			flag =0;
			for(int j=1;j<=i; j++) {
				if(i % j == 0) {
					flag++;
				}
			}
			if(flag == 2) {
				System.out.print(i+" ");
			}
			
		}
		
	}

}
