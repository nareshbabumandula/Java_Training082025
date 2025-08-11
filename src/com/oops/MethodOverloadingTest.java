package com.oops;

/**
 * Method Overloading: Methods are overloaded when there are more than one method with same name but with different signature/parameters
 * Hence it is also called as compile-time/static polymorphism
 */
public class MethodOverloadingTest {
	
	int a=10; 
	int b=20;
		
	void addition(){
		int c=a+b;
		System.out.println("Addition of a and b is: " +c);
	}
	
	void addition(int a, int b){
		int c=a+b;
		System.out.println("Addition of a and b with parameters is: " +c);
	}
	
	void addition(int a, int b, int c){
		int d=a+b+c;
		System.out.println("Addition of a,b and c with parameters is: " +d);
	}

	void addition(double a, double b){
		double c=a+b;
		System.out.println("Addition of double a and b with parameters is: " +c);
	}

	public static void main(String[] args) {
		MethodOverloadingTest mot = new MethodOverloadingTest();
		mot.addition();
		mot.addition(100, 300);
		mot.addition(40, 50, 60);
		mot.addition(134.4354, 5674.4647);
		
	}

}
