package com.oops;

/**
 * Method Overriding: Methods are overridden when there is a at least one identical method between the classes with IS-A relationship 
 * then the sub class reference will override the super class method at runtime. Hence it is also called as run-time/dynamic polymorphism
 *
 */
public class MethodOverridingTest extends MethodOverloadingTest{
	
	int a=10; 
	int b=20;

    void addition(){
		int c=a+b;
		System.out.println("Addition of a and b in subclass is: " +c);
	}
    
    void modulus(){
		int c=b%a;
		System.out.println("Modulus of a and b is: " +c);
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
			
		// Upcasting is a type of object typecasting in which a child object is typecasted to a parent class object
		MethodOverloadingTest overload = new MethodOverridingTest();
		
	}

}
