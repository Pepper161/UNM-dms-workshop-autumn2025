package com.theBestBikeShop;

public class Bicycle {
    private int gear;
    private int speed;
    private boolean lightstatus;

    public Bicycle(int gear, int speed, boolean lightstatus) {
        this.gear = gear;
        this.speed = speed;
        this.lightstatus = lightstatus;
    }



    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void switchLight() {
        lightstatus = !lightstatus;
    }

    public void currentState() {
        System.out.println("Gear: " + gear + " Speed: " + speed + " Light status: " + lightstatus);
    }
}
