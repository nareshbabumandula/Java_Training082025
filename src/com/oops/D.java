package com.oops;

public class D extends A{
	
	void division(){
		int c=b/a;
		System.out.println("Division of a and b is: " +c);
	}

	public static void main(String[] args) {
		D d = new D();
		d.division();
		d.addition();

	}

}
