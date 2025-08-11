package com.oops;

/**
 * Abstraction/Hiding: Showing only the functionality to the end users by hiding the implementation is called as abstraction 
 * e.g. whatsapp, facebook, mobile features (messaging, wifi connection, hotspot etc), tv remote etc
 *
 */
public abstract class Theatre {
	
	// abstract method or method without body or method without implementation or bodyless method
	abstract void parking();
	abstract void caferia();
	abstract void fireandSafety();
	
	// java concrete method with body or non-abstract method
	void onlineTicketbooking(String isOnlineBooking) {
		// method body
		System.out.println("Online ticket booking facility is " + isOnlineBooking);
	}

	public static void main(String[] args) {
		// Theatre theatre = new Theatre();
	}

}
