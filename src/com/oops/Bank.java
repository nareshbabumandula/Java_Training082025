package com.oops;

/**
 * interface: interface is a contract or a blueprint through which we can achieve 100% abstraction
 * 
 * 1. In Java interface is used to achieve 100% abstraction (it means interface allows only abstract methods followed by
 * static and default methods)
 * 2. interface is declared with interface keyword
 * 3. interface can't be extended, it needs to implemented
 * 4. By default all the methods are final and abstract in an interface (we don't have to use abstract keyword explicitly
 *    for any method in an interface)
 * 5. By default all the variables of an interface are final (it means they are treated as constants which can't be overridden)
 * 6. interface can't be instantiated because it has unimplemented methods for which memory allocation can't be done. interface 
 *    in java provides only method signatures (contracts) but does not have any implementation for those methods (unless they are
 *    static or default methods). Since the JVM
 *    doesn't know how the abstract methods should behave, it cannot allocate memory for them.
 */

public interface Bank {
	
	enum AccountType  {SAVINGS, CURRENT, FIXED_DEPOSIT}
	
	double minDeposit=1000.00;
	
	// by default abstract methods

	// abstract methods
    void openAccount(String customerId, AccountType type);
    void deposit(String customerId, double amount);
    void withdraw(String customerId, double amount);
    double getBalance(String customerId);
    double getInterestRate(AccountType type);
    
    static void loans() {
    	System.out.println("Loans is a static method");
    }
    
    default void aml() {
    	System.out.println("AML is a default method");
    }
       
    public static void main(String[] args) {
    	// Bank bank = new Bank();
    	loans();
    	Bank.loans();
    }
       
}
