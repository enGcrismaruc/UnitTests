package com.endava.internship.single.responsability.good;

public class Speedometer {
    private int distance;
    private int time;

    public int calculateSpeed(int distance, int time){
        return distance / time;
    }

    public int getSpeed() {
        return calculateSpeed(distance, time);
    }

    public void printSpeed() {
        System.out.println("Speed = " + getSpeed());
    }
}
