package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Checked Exceptions (Compile-time exceptions)
   These are checked by the compiler.
 * Java forces you to handle them with try-catch or throws keyword
 * Example: You're booking a movie ticket --> you must check seat availability before booking. If not available
 * compiler won't let you proceed with the ticket booking.
 */
public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("data1.txt"); // file might not exist
			System.out.println("File found..!");
			BufferedReader reader = new BufferedReader(file);
			System.out.println(reader.readLine());
		} catch (Exception e) {
			System.out.println("File not found! Please check the file name.");
		}

	}

}
