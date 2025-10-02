package com.theBestBikeShop;

public class Bicycle {
	private int gear;
	private int speed;
	private boolean lightstatus;

	public void setGear(int newValue) {
		gear=newValue;
	}

	public void applyBrake(int decrement) {
		speed-=decrement;
	}

	public void speedUp(int increment) {
		speed+=increment;
	}
}
