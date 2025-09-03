package com.casting;

public class A {

	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is: "+c);
	}
	
	void multiplication() {
		int c=a*b;
		System.out.println("Multiplication of a and b is: "+c);
	}
	
	public static void main(String[] args) {
		// Create an instance (Object Reference) for the class A
		A a = new A();
		a.addition();
	}

}
