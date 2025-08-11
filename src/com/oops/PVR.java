package com.oops;

public class PVR extends Theatre{

	public static void main(String[] args) {
		PVR pvr = new PVR();
		pvr.parking();
		pvr.onlineTicketbooking("available");
		pvr.caferia();
		pvr.fireandSafety();
	}

	@Override
	void parking() {
		System.out.println("Parking facility is available to park 100 cars and 400 bikes");
	}

	@Override
	void caferia() {
		System.out.println("Cafeteria facility is available");
	}

	@Override
	void fireandSafety() {
		System.out.println("Fire and safety precautions were taken care");
	}

}
