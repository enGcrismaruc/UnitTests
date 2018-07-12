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
}
