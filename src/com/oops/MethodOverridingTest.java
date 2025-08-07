package com.oops;

public class MethodOverridingTest extends MethodOverloadingTest{
	
	int a=10; 
	int b=20;

	void addition(){
		int c=a+b;
		System.out.println("Addition of a and b in subclass is: " +c);
	}
	
	void demo() {
		super.addition(); // explicitly calling parent class method
		this.addition(); // calls the current class method
		addition();
	}
	

	public static void main(String[] args) {
		MethodOverridingTest mot = new MethodOverridingTest();
		mot.addition();
		mot.demo();
		
	}

}
