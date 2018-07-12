package com.endava.internship.singleResponsability.good;

public class Bike {

    private BikeType type;
    private Speedometer speedometer;

    public Speedometer getSpeedometer() {
        return speedometer;
    }

    public Bike setSpeedometer(Speedometer speedometer) {
        this.speedometer = speedometer;
        return this;
    }

    public BikeType getType() {
        return type;
    }

    public Bike setType(BikeType type) {
        this.type = type;
        return this;
    }
}
