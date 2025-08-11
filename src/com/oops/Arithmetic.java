package com.oops;

public class Arithmetic {

	// state or characteristics
	// instance variable
	int a=10; 
	int b=20;

	//behavior or methods
	void addition(){
		int c=a+b;
		System.out.println("Addition of a and b is: " +c);
	}

	void subtraction(){
		int c=a-b;
		System.out.println("Subtraction of a and b is: " +c);
	}

	void multiplication(){
		int c=a*b;
		System.out.println("Multiplication of a and b is: " +c);
	}

	void division(){
		int c=b/a;
		System.out.println("Division of a and b is: " +c);
	}

	void modulus(){
		int c=b%a;
		System.out.println("Modulus of a and b is: " +c);
	}

	// No argument constructor
	public Arithmetic() {
		System.out.println("Executing Arithmetic cosntructor..!");
	}


	public static void main(String[] args) {
		// How to create an instance or object reference for a class
		// Syntax:  Classname objRef = new Constructor();
		Arithmetic arth = new Arithmetic();
		System.out.println(arth.a);
		System.out.println(arth.b);
		
		arth.addition();
		arth.subtraction();
		arth.multiplication();
		arth.division();
		arth.modulus();
	}

}
