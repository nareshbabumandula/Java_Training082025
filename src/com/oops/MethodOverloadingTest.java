package com.oops;

public class MethodOverloadingTest {
	
	int a = 10;
	int b = 20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is: " +c);
	}

	void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of a and b with parameters is :" +c);
		
	}
	void addition(int a,int b,int c) {
		int d=a+b+c;
		System.out.println("Addition of a,b and c with parameters is :" +d);
	}
	
	void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition of double a and b with parameters is :" +c);
	}
	
	public static void main(String[] args) {
		MethodOverloadingTest mot = new MethodOverloadingTest();
		mot.addition();
		mot.addition(200, 400);
		mot.addition(100, 150, 200);
		mot.addition(124.356, 436.245);

	}

}
