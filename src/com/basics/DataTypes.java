package com.basics;

public class DataTypes {

	public static void main(String[] args) {
		/**
		 * Primitive/Important Data Types: byte, short, int, long, float, double, boolean, char
		 * Java is a statically typed (data type declaration is a must) dynamic programming language
		 */
		
		// Default values for the java primitive data types
		byte b=0;
		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		boolean bFlag = false;
		char c = 0;
		
		b = 106;
		s= 12343;
		i = 654356;
		l = 56756;
		f = 13.5f;
		d = 435435.4556756;
		bFlag = true;
		c = 'n';
		System.out.println("byte value of b is: " + b);
		System.out.println("short value of s is: " + s);
		System.out.println("int value of i is: " + i);
		System.out.println("long value of l is: " + l);
		System.out.println("float value of f is: " + f);
		System.out.println("double value of d is: " + d);
		System.out.println("boolean value of bFlag is: " + bFlag);
		System.out.println("char value of c is: " + c);
		
		byte b1 = (byte) 130; // explicit/narrowing data type casting (converting)
		System.out.println(b1);
		
		int i1 = b1; // implicit casting/widening
		System.out.println(b1);
				
		
	}

}
