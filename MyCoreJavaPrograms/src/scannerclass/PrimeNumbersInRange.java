package scannerclass;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int flag =0;
		System.out.print("Enter The Range : ");
		int range = sc.nextInt();
		
		for( int i=1;i<=range;i++) {
			flag = 0;
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					flag++;
				}

			}
			if(flag == 2) {
				System.out.println("Prime Numbers:" +i);
			}
					
		}
		

	}

}
