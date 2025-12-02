package exceptions.trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplicationMain {

	  static Scanner sc = new Scanner(System.in);
	  static int userChoice =0;
	  
	static void mainMenu() {
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdrawal");
		System.out.println("4.Exit");
		System.out.println();
		userChoice =sc.nextInt();
	}
	//deposit Method
  static void deposit( BankApplicationSetUp bank) {
	  while(true) {
	  try {
		  System.out.println("Enter The Amout :");
	  double depositAmount = sc.nextDouble();
	  bank.setCurrentBalance(bank.getCurrentBalance()+ depositAmount);
	  System.out.println("Deposit Successful");
	  break;
	  }catch(InputMismatchException inputMismatch) {
		  System.out.println("Enter the Amount in Numbers Only-- Please Provide");
		  sc.nextLine();
	  }
	  }
  }
  static void withdrawal(BankApplicationSetUp bank) {
	  while(true) {
	  try {
		 System.out.println("Enter The Amount To Withdrawal");
		 double amount = sc.nextDouble();
		 if(amount > bank.getCurrentBalance()) {
			 System.out.println("Insufficient Balance");
		 } else {
			 bank.setCurrentBalance(bank.getCurrentBalance()-amount);
			 System.out.println("Successfully Withdrawal");
		 }
		 break;
	  }catch(InputMismatchException inputMismatch) {
		  System.out.println("Please Provide Amount in Numbers Only ---");
		  sc.nextLine();
		  
	  }
	  }
  }
  static void checkBalance(BankApplicationSetUp bank) {
	  System.out.println("The Balance:"+bank.getCurrentBalance());
	  
  }
	
	public static void main(String[] args) {
		
		BankApplicationSetUp bankRun = new BankApplicationSetUp();
		try {
		do {
			mainMenu();
			switch(userChoice) {
			
			case 1: {
				checkBalance(bankRun);
				break;
			}
			case 2 : {
				deposit(bankRun);
				break;
			}
			case 3: {
				withdrawal(bankRun);
				break;
			}
			default: System.out.println("Thank You For Using Our Services Vist Again!!");
			}
		}while(userChoice !=4);
		
		}finally {
			sc.close();
		}
	}

}
