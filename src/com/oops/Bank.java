package com.oops;

public interface Bank {
	
	enum AccountType  {SAVINGS, CURRENT, FIXED_DEPOSIT}
	
	// abstract methods
    void openAccount(String customerId, AccountType type);
    void deposit(String customerId, double amount);
    void withdraw(String customerId, double amount);
    double getBalance(String customerId);
    double getInterestRate(AccountType type);
       
}
