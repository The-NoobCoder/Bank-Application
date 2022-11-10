package bankapp;

import java.util.Scanner;

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid ){
		customerName = cname;
		customerId = cid;
	}
	
	public BankAccount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name :");
		customerName = sc.nextLine();
		
		System.out.println("Enter Your Id :");
		customerId = sc.nextLine();
	
	}

	void deposite(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction () {
		if(previousTransaction > 0) {
			System.out.println("Deposited : " +previousTransaction);
		}
		
		else if(previousTransaction < 0) {
			System.out.println("Withdrawn :" +Math.abs(previousTransaction));
		}
		
		else {
			System.out.println("No Transaction Occured .");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welome "+customerName);
		System.out.println("Your Id : "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance :" );
		System.out.println("B. Deposite :");
		System.out.println("C. Withdraw :");
		System.out.println("D. Previous Transaction :");
		System.out.println("E . EXIT ");
		System.out.println("\n");

		
		do {
			System.out.println("========================================================================================");
			System.out.println("Enter Your Option");
			System.out.println("========================================================================================");
			option = sc.next().charAt(0);
			
			switch(option) {
			case 'A' : 
				System.out.println("--------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("--------------------------------");
				break;
				
			case 'B' : 
				System.out.println("--------------------------------");
				System.out.println("Enter Amount to Deposite :");
				System.out.println("--------------------------------");
				int amount = sc.nextInt();
				deposite(amount);
				break;
				
			case 'C' : 
				System.out.println("---------------------------------");
				System.out.println("Enter Amount to Withdraw :");
				System.out.println("---------------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				break;
				
			case 'D' : 
				System.out.println("---------------------------------");
				getPreviousTransaction();
				System.out.println("---------------------------------");
				break;
				
			case 'E' :
				System.out.println("**********************************************************************************");
				break;
				
				
			default :
				System.out.println("Invalid Option!!. Plz Enter Again");
				break;
			}
			
		}while(option != 'E');
		
		System.out.println("Thank You for using our Services.....");
		
		
	}

}


public class BankApplication {

	public static void main(String[] args) {

		BankAccount obj1 = new BankAccount();
		obj1.showMenu();
		
	}

}

