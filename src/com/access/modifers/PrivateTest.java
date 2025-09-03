package com.access.modifers;

public class PrivateTest {
	
	// private variables
	private String username = "testuser";
	
	
	// private method
	private void login() {
		System.out.println("Executing public method..!");
		System.out.println("Sucessfully logged in with userID: " + username);
	}
	
	public PrivateTest() {
		System.out.println("This is a private constructor..!");
	}
	

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.username);
		pt.login();
		
	}

}
