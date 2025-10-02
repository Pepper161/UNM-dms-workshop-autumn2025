package com.theBestBikeShop;

public class BikeApp {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2, 100, true);
        bicycle.currentState();

        MountainBike trailBike = new MountainBike(3, 80, false, true, false);
        MountainBike downhillBike = new MountainBike(6, 40, true, true, true);

        System.out.println("Trail bike state:");
        trailBike.currentState();
        System.out.println("Full suspension? " + trailBike.isFullSuspension());

        System.out.println("Downhill bike state:");
        downhillBike.currentState();
        System.out.println("Full suspension? " + downhillBike.isFullSuspension());
    }
}
