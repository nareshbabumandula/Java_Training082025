package com.oops;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.aml();
		Bank.loans();
	}

	@Override
	public void openAccount(String customerId, AccountType type) {
		if (!verifyKYC(customerId)) {
			throw new IllegalStateException("KYC failed per RBI guidelines");
		}
	}

	@Override
	public void deposit(String customerId, double amount) {
		
		
	}

	@Override
	public void withdraw(String customerId, double amount) {
		
		
	}

	@Override
	public double getBalance(String customerId) {
		
		return 0;
	}

	@Override
	public double getInterestRate(AccountType type) {
		
		return 0;
	}
}
