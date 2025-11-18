package oops;

import java.util.Scanner;

public class BankAccount {
	
	static Scanner sc = new Scanner(System.in);
	static int choice = 5;
	static void mainMenu() {
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		choice = sc.nextInt();
		
	}
	static void withdraw(Bank bank) {
		System.out.print("Enter Amount: ");
		double withdrawBalance = sc.nextDouble();
		if(withdrawBalance <= bank.getCurrentBalance()) {
		bank.setCurrentBalance(bank.getCurrentBalance() - withdrawBalance);
		System.out.println("Withdraw Successful");
		} else {
			System.out.println("Insufficient Balance");
		}
		System.out.println();
	}
	static void checkBalance(Bank bank) {
		System.out.println("Available Balance:"+bank.getCurrentBalance());
	}
	static void deposit(Bank bank) {
		System.out.print("Enter Amount: ");
		double depositBalance = sc.nextDouble();
		bank.setCurrentBalance(bank.getCurrentBalance() + depositBalance);
		System.out.println("deposit Succesfull");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bk = new Bank();
		 bk.setCurrentBalance(0);
		 
		 do {
			 mainMenu();
			 switch(choice) {
			 case 1: {
				 checkBalance(bk);
				 break;
			 } 
			 case 2: {
				 deposit(bk);
				 break;
			 }
			 case 3: {
				 withdraw(bk);
				 break;
			 }
			 case 4 : {
				 System.out.println("Successful");
			 }
			 }
		 } while(choice !=4);
	}

}
