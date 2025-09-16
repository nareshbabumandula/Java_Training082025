package com.exceptions;

/**
 * Not checked by the compiler.
   Program compiles fine, but fails at runtime if the error happens.
 * 
 * Example: You're dividing your pizza among friends. If 0 friends show up and still try to divide --> crash at runtime
 *
 */
public class UncheckedExceptionTest {

	public static void main(String[] args) {
		int friends=0;
		try {
			int pizzaPerFriend=10/friends; // division by zero
			System.out.println("Pizza per friend : " + pizzaPerFriend);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cannot divide pizza amoung 0 friends!");
		}
	}

}
