package com.oops;

public class A {

	int a=10;
	int b=20;
	
	void addition(){
	       int c=a+b;
	       System.out.println("Addition of a and b is: " +c);
	}
	public A() {
		   System.out.println("Executing A class constructor..!");
	}
	public static void main(String[] args) {
		// How to create an instance or object reference for this class A
		// Syntax:  Classname objRef = new Constructor();
       
		A a = new A();
		a.addition();

	}

}
