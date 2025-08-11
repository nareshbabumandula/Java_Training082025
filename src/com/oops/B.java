package com.oops;

public class B extends A {

	public B() {
		System.out.println("Executing B class constructor..!");
	}
	
	void subtraction(){
		int c=a-b;
		System.out.println("Subtraction of a and b is: " +c);
	}
	
	public static void main(String[] args) {
	  B b = new B();
	  b.subtraction();
	  b.addition();
	  System.out.println(b.a);
	  System.out.println(b.b);
	  
	}

}
