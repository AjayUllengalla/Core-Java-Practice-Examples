package Expressions;

import java.util.Scanner;

public class ExpressionMenu {

	static Scanner sc = new Scanner(System.in);
	
	static int userChoice = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(userChoice !=6) {
			
			switch(userChoice) {
			
			case 1: {
				int index =0;
				System.out.println("Enter the length of Expression: ");
				int length =sc.nextInt();
				System.out.println("Enter the Numaerator: ");
				int numa = sc.nextInt();
				System.out.println("Enter the Denominator: ");
				int denom = sc.nextInt();
				System.out.println("Enter the no.of operators: ");
				int len =sc.nextInt();
				String[] oper = new String[len];
				System.out.println("Enter the operators: ");
				for(int i =0;i<len;i++) {
					oper[i]=sc.next();
				}
				sequence(length,numa,denom,len,oper);
				break;
			}
			case 2: {
				int index =0;
				System.out.println("Enter the length of Expression: ");
				int length =sc.nextInt();
				System.out.println("Enter the Numaerator: ");
				int numa = sc.nextInt();
//				System.out.println("Enter the Denominator: ");
//				int denom = sc.nextInt();
				System.out.println("Enter the no.of operators: ");
				int len =sc.nextInt();
				String[] oper = new String[len];
				System.out.println("Enter the operators: ");
				for(int i =0;i<len;i++) {
					oper[i]=sc.next();
				}
				even(length,numa,len,oper);
				break;
			}
			case 3: {
				int index =0;
				System.out.println("Enter the length of Expression: ");
				int length =sc.nextInt();
				System.out.println("Enter the Numaerator: ");
				int numa = sc.nextInt();
				System.out.println("Enter the no.of operators: ");
				int len =sc.nextInt();
				String[] oper = new String[len];
				System.out.println("Enter the operators: ");
				for(int i =0;i<len;i++) {
					oper[i]=sc.next();
				}
				odd(length,numa,len,oper);
				break;
			}
			case 4: {
				int index =0;
				System.out.println("Enter the length of Expression: ");
				int length =sc.nextInt();
				System.out.println("Enter the Numaerator: ");
				int numa = sc.nextInt();
//				System.out.println("Enter the Denominator: ");
//				int denom = sc.nextInt();
				System.out.println("Enter the no.of operators: ");
				int len =sc.nextInt();
				String[] oper = new String[len];
				System.out.println("Enter the operators: ");
				for(int i =0;i<len;i++) {
					oper[i]=sc.next();
				}
				prime(length,numa,len,oper);
				break;
			}
			case 5: {
				menuItems();
				break;
			}
			
			}
		}
		
		
		
	}
	
	static void menuItems() {
		System.out.println("1.For Sequence");
		System.out.println("2.For Even");
		System.out.println("3.For Odd");
		System.out.println("4.For Prime");
		 userChoice = sc.nextInt();
		
	}
	static void sequence(int length,int numa,int denom,int len,String[] oper) {
		int index=0;
		for(int i=1; i<=length;i++) {
			if(denom == length) {
				System.out.print(numa+"/"+ denom);
			} else {
				System.out.print(numa+"/"+ denom+" "+oper[index]+" ");
			}
			if(index != oper.length-1) {
				index++;
			} else {
				index=0;
			}
			denom++;
		}
		System.out.println(" ");
		menuItems();
		
	}
	static void even(int length,int numa,int len,String[] oper) {
		int index =0;
		for (int i = 1; i <= length; i++) {

			if (i % 2 == 0) {
				System.out.print(numa + "/" + i + " ");

				if (i + 2 <= length) {
					System.out.print(oper[index] + " ");
					index++;
					if (index == oper.length) {
						index = 0;
					}
				}

			}

		}
		System.out.println(" ");
		menuItems();
		
	}
	static void  odd(int length,int numa,int len,String[] oper) {
	
		int index =0;
		for (int i = 1; i <= length; i++) {

			if (i % 2 == 0) {
				System.out.print(numa + "/" + i + " ");

				if (i + 2 <= length) {
					System.out.print(oper[index] + " ");
					index++;
					if (index == oper.length) {
						index = 0;
					}
				}

			}

		}
		System.out.println(" ");
		menuItems();
		
	}
	static void prime(int length,int numa,int len,String[] oper) {
		
		int index=0;
		int count =0;
		for(int i=1;i<=length;i++) {
			count =0;
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					count++;
				}
				
			}
			if(count == 2) {
				System.out.print(numa + "/" + i + " ");
				if (i  <= length) {
					System.out.print(oper[index] + " ");
					index++;
					if (index == oper.length) {
						index = 0;
					}
				}
			}
		}
		System.out.println(" ");
		menuItems();
	}

}
