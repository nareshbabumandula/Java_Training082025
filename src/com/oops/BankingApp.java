package com.oops;

public class BankingApp {

	public static void main(String[] args) {
		BankAcccount account = new BankAcccount("068001659912", "Naresh Mandula", 2000);
		System.out.println("Account Holder: " + account.getAccountHolderName());
		System.out.println("Initial Balance: " + account.getBalance());
		
		account.deposit(1500);
		System.out.println("Updated Balance: " + account.getBalance());
		account.deposit(0);
		
		account.withdraw(500);
		System.out.println("Updated Balance post withdrawl: " + account.getBalance());
		account.withdraw(-100);
	}

}
