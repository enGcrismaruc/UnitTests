package com.endava.internship.single.responsability.good;

public class Speedometer {
    private int distance;
    private int time;

    public int getSpeed() {
        return MathUtils.calculateSpeed(distance, time);
    }

    public void printSpeed() {
        System.out.println("Speed = " + getSpeed());
    }

    public int getDistance() {
        return distance;
    }

    public Speedometer setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public int getTime() {
        return time;
    }

    public Speedometer setTime(int time) {
        this.time = time;
        return this;
    }
}
