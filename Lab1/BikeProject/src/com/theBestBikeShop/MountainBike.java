package com.theBestBikeShop;

public class MountainBike extends Bicycle {
    private final boolean hasFrontSuspension;
    private final boolean hasRearSuspension;

    public MountainBike(int gear, int speed, boolean lightstatus, boolean hasFrontSuspension, boolean hasRearSuspension) {
        super(gear, speed, lightstatus);
        this.hasFrontSuspension = hasFrontSuspension;
        this.hasRearSuspension = hasRearSuspension;
    }

    public boolean isFullSuspension() {
        return hasFrontSuspension && hasRearSuspension;
    }
}
