package com.oops;

/**
 * 
 * Encapsulation is the process of wrapping data (variables) and code that operates on the data (methods) into a single unit, and restricting direct access 
 * to that data from outside the class.
	In Java, this is achieved using private fields with public getters and setters.
	Data Hiding – Fields are private so no outside class can change them directly.
	Controlled Access – Only deposit() and withdraw() can change the balance.
	Validation – Methods enforce business rules (e.g., preventing negative deposits or overdrafts).
	Maintainability – If rules change (e.g., adding transaction fees), only methods need to be updated, not the calling code.
 *
 */
public class BankAcccount {
	
	private String accountNumber;
	private double balance;
	private String accountHolderName;
	
	public BankAcccount(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited: " + amount);
		}else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) { 
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn: " + amount);
		}else {
			System.out.println("Invalid withdrawl amount or insuffient balance!");
		}
	}
	
}
