package com.oops;

/**
 * Abstraction/Hiding: Showing only the functionality (method name with signature and return type) to the end users by hiding the implementation (method body)
 * is called as abstraction 
 * e.g. whatsapp, facebook, ac remote, mobile features (messaging, wifi connection, hotspot etc), tv remote etc
 * 
 * 1. An abstract class can have only abstract methods, only non abstract methods and a mix and match of both
 * 2. To achieve 0 to 100% abstraction we can prefer an abstract class
 * 3. We cannot instantiate/create an instance for an abstract class
 *
 */
public abstract class Theatre {
	
	int minTicketPrice=100; // instance variable
	static String soundSystem = "Dolby Digital";
	final String washrooms="available";
	
	// abstract method or method without body or method without implementation or bodyless method
	abstract void parking(); 
	abstract void caferia(); 
	abstract void fireandSafety();
	
	// java concrete method with body or non-abstract method
	void onlineTicketbooking(String isOnlineBooking) {
		// method body
		System.out.println("Online ticket booking facility is " + isOnlineBooking);
	}
	
	public Theatre() {
		System.out.println("Executing Theatre class constructor..!");
	}

	public static void main(String[] args) {
		//Theatre theatre = new Theatre();
	}

}
