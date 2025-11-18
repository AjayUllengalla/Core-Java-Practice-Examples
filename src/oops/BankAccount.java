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
		double withdrawBalance =  bank.getWidthdrawMoney();
		double currentBalance = bank.getCurrentBalance();
		withdrawBalance = currentBalance - withdrawBalance;
		bank.setCurrentBalance(withdrawBalance);
	}
	static void checkBalance(Bank bank) {
		System.out.println("Available Balance:"+bank.getCurrentBalance());
	}
	static void deposit(Bank bank) {
		double currentBalance = bank.getDepositMoney();
		currentBalance = currentBalance + bank.getCurrentBalance();
		bank.setCurrentBalance(currentBalance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bk = new Bank();
		
		while(choice !=4) {
			switch(choice){
			case 1 : {
				checkBalance(bk);
			}
			case 2: {
				bk.setDepositMoney(1000);
				deposit(bk);
			}
			case 3: {
				bk.setWidthdrawMoney(200);
				withdraw(bk);
			}
			case 5: {
				mainMenu();
			}
			}
		}
	}

}
