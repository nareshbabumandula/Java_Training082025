package com.oops;

public class PVR extends Theatre{

	public static void main(String[] args) {
		PVR pvr = new PVR();
		pvr.parking();
		pvr.onlineTicketbooking("available");
		pvr.caferia();
		pvr.fireandSafety();
	}

	void parking() {
		System.out.println("Parking facility is available to park 100 cars and 400 bikes");
	}

	void caferia() {
		System.out.println("Cafeteria facility is available");
	}

	void fireandSafety() {
		System.out.println("Fire and safety precautions were taken care..!");
	}
}
