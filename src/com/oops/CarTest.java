package com.oops;

/**
 * A Class is a blueprint or template for creating objects. It defines what data (variables) 
 * and what operations (methods) the objects will have.
 * 
 * Think of Car as a blueprint for manufacturing cars. It defines:
 * What properties a car should have (brand, color, speed, fuelType, etc.)
 * What actions it can perform (start, accelerate, brake)
 *
 * Object: Any entity which has state/properties and behavior/action is called as an object (e.g Car, Pen, Dog, Lion etc)
 */
class Car {
	
	// properties/state of a Car
	String brand;
	String color;
	int speed;
	
	// Parameterized Constructor
	public Car(String brand, String color, int speed) {
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}

	// class variable (shared by all objects (e.g. Honda, Benz, Fortuner, BMW, MG-Hector)
	static String vehicleType="4-Wheeler";
	
	// Instance method
	public void displayInfo() {
		System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed);
	}
	
	// static method
	public static void showVehicleType() {
		System.out.println("Vehicle Type: " + vehicleType);
	}
	
	public static void main(String[] args) {
		System.out.println("Car class");
	}
		
}


class CarTest {

	/**
	 * * Memory Breakdown:
	 * Stack Memory:
		Stores local variables like localCounter
		Stores references like car1, car2 (these point to actual objects in the Heap)
		
		Heap Memory:
		Stores object instances created using new keyword (e.g., new Car(...))
		Each object has its own copy of instance variables
		
		Static/class variables are stored in the Method Area / MetaSpace, not heap
	 */
	public static void main(String[] args) {
		// Local variable
		int localCounter = 0;
		
		System.out.println("CarTest class");
		
		// How to create an instance or object reference for a class
		// Syntax:  Classname objRef = new Constructor();
		
		// Object creation - memory allocation happens in HEAP
	    Car car1 = new Car("Honda", "Red", 120);
	    Car car2 = new Car("MG-Hector", "Blue", 140);
	    
	    car1.displayInfo();
	    car2.displayInfo();
	    
	}

}
