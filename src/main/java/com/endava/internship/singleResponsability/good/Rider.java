package com.endava.internship.singleResponsability.good;


public class Rider {

    private String name;
    private int age;
    private String nationality;

    public void shiftGear(Bike bike) {
        if(bike.getType().equals(BikeType.MOUNTAIN)) {
            System.out.println("Mountain bike: gears shifting...");
        } else {
            if(bike.getType().equals(BikeType.CITY)) {
                System.out.println("You cannot shift gears.");
            } else {
                if(bike.getSpeedometer().getSpeed() > 30) {
                    System.out.println("Speed too high to shift gears.");
                } else {
                    System.out.println("Road bike: gears shifting...");
                }
            }
        }
    }

    public void applyBreaks(Bike bike) {
        System.out.println("Applying breaks...");
    }

    public void ride(Bike bike) {
        System.out.println("Riding bike..." + bike.getType());
    }

    public String getName() {
        return name;
    }

    public Rider setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Rider setAge(int age) {
        this.age = age;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Rider setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
}
