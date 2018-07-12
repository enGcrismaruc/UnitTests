package com.endava.internship.single.responsability.bad;

public class Bike {
    private enum BikeType {
        ROAD, CITY, MOUNTAIN
    }

    private BikeType type;
    private int distance;
    private int time;
    private String name;
    private int age;
    private String nationality;

    public void start() {
        System.out.println("Start...");
    }

    public void stop() {
        System.out.println("Stop...");
    }

    public void shiftGear() {
        if(type.equals(BikeType.MOUNTAIN)) {
            System.out.println("Mountain bike: gears shifting...");
        } else {
            if(type.equals(BikeType.CITY)) {
                System.out.println("You cannot shift gears.");
            } else {
                if(calculateSpeed(distance, time) > 30) {
                    System.out.println("Speed too high to shift gears.");
                } else {
                    System.out.println("Road bike: gears shifting...");
                }
            }
        }
    }

    private int calculateSpeed(int distance, int time){
        return distance / time;
    }

    public void printSpeed() {
        System.out.println(calculateSpeed(distance, time));
    }

    public void applyBreaks() {
        System.out.println("Applying breaks...");
    }

    public void wash() {
        System.out.println("Washing..." + type);
    }

    public void ride() {
        System.out.println("Riding..." + type);
    }
}
