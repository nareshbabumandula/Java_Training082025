package com.oops;

public interface RBI extends Bank{

	// Regulatory baselines
	double MIN_SAVINGS_INTEREST = 3.00;    
	double MIN_KYC_SCORE        = 70.0;
	double DAILY_CASH_WITHDRAWAL_LIMIT = 50_000; 

	// Default behaviors a regulator might enforce
	default boolean verifyKYC(String customerId) {
		// imagine calling a central KYC registry; we mock it here
		return kycScore(customerId) >= MIN_KYC_SCORE;
	}

	default double kycScore(String customerId) {
		// stubbed—banks may override with real checks
		return 80.0;
	}

}
